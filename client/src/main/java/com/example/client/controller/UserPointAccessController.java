package com.example.client.controller;

import com.example.client.IncreasePointRequestBodyDTO;
import com.example.pointservice.stub.IncreasePointRequestBody;
import com.example.pointservice.stub.IncreasePointResponseBody;
import com.example.pointservice.stub.PointServiceGrpc;
import com.example.pointservice.stub.enums.Reason;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserPointAccessController {

    @GrpcClient("grpc-server")
    private PointServiceGrpc.PointServiceBlockingStub pointServiceBlockingStub;
    @Value("${info.app.host_name}")
    private String hostName;


    @PostMapping("/points")
    public Object test(@RequestBody IncreasePointRequestBodyDTO dto) {
        System.out.println("hostName = " + hostName);
        IncreasePointResponseBody increasePointResponseBody = pointServiceBlockingStub.increasePoint(
                IncreasePointRequestBody.newBuilder()
                        .setUsername(dto.getUsername())
                        .setAmount(dto.getAmount())
                        .setReason(Reason.valueOf(dto.getReason()))
                        .build()
        );
        return increasePointResponseBody.getLastUpdatedPoint() + "[client:" + this.hostName + "]";
    }
}
