package com.example.service.service;


import com.example.pointservice.stub.*;
import com.example.service.document.PointUpdateState;
import com.example.service.document.UserPoint;
import com.example.service.document.UserPointHistory;
import com.example.service.exception.IncreaseFailedException;
import com.example.service.repository.UserPointHistoryRepository;
import com.example.service.repository.UserPointRepository;
import io.grpc.Status;
import io.grpc.StatusRuntimeException;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.transaction.annotation.Transactional;

@GrpcService
public class UserPointService extends PointServiceGrpc.PointServiceImplBase {
    private final UserPointRepository userPointRepository;
    private final UserPointHistoryRepository userPointHistoryRepository;
    @Value("${grpc.server.port}")
    private String port;
    @Value("${info.app.host_name}")
    private String hostName;

    public UserPointService(UserPointRepository userPointRepository, UserPointHistoryRepository userPointHistoryRepository) {
        this.userPointRepository = userPointRepository;
        this.userPointHistoryRepository = userPointHistoryRepository;
    }


    @Override
    @Transactional
    public void increasePoint(IncreasePointRequestBody request,
                              StreamObserver<IncreasePointResponseBody> responseObserver
    ) {
        System.out.println("UserPointService.increasePoint");

        try {
            UserPoint userPoint = this.userPointRepository
                    .findByUsername(request.getUsername())
                    .orElseGet(() -> this.userPointRepository.save(
                            UserPoint.builder()
                                    .username(request.getUsername())
                                    .points(0)
                                    .build()
                    ));
            Long isUpdated = this.userPointRepository.increasePoint(
                    request.getUsername(),
                    request.getAmount()
            );
            if (isUpdated == 0) {
                throw new IncreaseFailedException();
            }

            this.userPointHistoryRepository.save(
                    UserPointHistory.builder()
                            ._id(null)
                            .userPointId(userPoint.get_id())
                            .pointUpdateState(PointUpdateState.INCREASED)
                            .changedBy(request.getAmount())
                            .reason(request.getReason().name())
                            .build()
            );
            int lastPoints = this.userPointRepository.findByUsername(request.getUsername()).get().getPoints();
            String lastp = lastPoints + " from [server:" + port + ",host:" + hostName + "]";
            responseObserver.onNext(
                    IncreasePointResponseBody.newBuilder()
                            .setLastUpdatedPoint(lastp)
                            .build()
            );
            responseObserver.onCompleted();
        } catch (RuntimeException e) {
            e.printStackTrace();
            StatusRuntimeException statusRuntimeException = Status.INTERNAL.asRuntimeException();
            responseObserver.onError(statusRuntimeException);
        }
    }

    @Override
    public void getPoints(GetPointRequestBody request, StreamObserver<GetPointResponseBody> responseObserver) {
        try {
            UserPoint userPoint = this.userPointRepository
                    .findByUsername(request.getUsername())
                    .orElseThrow(() -> new RuntimeException("user not found."));
            responseObserver.onNext(
                    GetPointResponseBody.newBuilder()
                            .setLastUpdatedPoint(userPoint.getPoints())
                            .build()
            );
            responseObserver.onCompleted();
        } catch (RuntimeException e) {
            responseObserver.onError(Status.NOT_FOUND.asRuntimeException());
        }

    }
}
