package com.example.pointservice.stub;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.51.0)",
    comments = "Source: userpointservice/point-service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class PointServiceGrpc {

  private PointServiceGrpc() {}

  public static final String SERVICE_NAME = "PointService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.example.pointservice.stub.IncreasePointRequestBody,
      com.example.pointservice.stub.IncreasePointResponseBody> getIncreasePointMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "increasePoint",
      requestType = com.example.pointservice.stub.IncreasePointRequestBody.class,
      responseType = com.example.pointservice.stub.IncreasePointResponseBody.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.pointservice.stub.IncreasePointRequestBody,
      com.example.pointservice.stub.IncreasePointResponseBody> getIncreasePointMethod() {
    io.grpc.MethodDescriptor<com.example.pointservice.stub.IncreasePointRequestBody, com.example.pointservice.stub.IncreasePointResponseBody> getIncreasePointMethod;
    if ((getIncreasePointMethod = PointServiceGrpc.getIncreasePointMethod) == null) {
      synchronized (PointServiceGrpc.class) {
        if ((getIncreasePointMethod = PointServiceGrpc.getIncreasePointMethod) == null) {
          PointServiceGrpc.getIncreasePointMethod = getIncreasePointMethod =
              io.grpc.MethodDescriptor.<com.example.pointservice.stub.IncreasePointRequestBody, com.example.pointservice.stub.IncreasePointResponseBody>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "increasePoint"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.pointservice.stub.IncreasePointRequestBody.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.pointservice.stub.IncreasePointResponseBody.getDefaultInstance()))
              .setSchemaDescriptor(new PointServiceMethodDescriptorSupplier("increasePoint"))
              .build();
        }
      }
    }
    return getIncreasePointMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.pointservice.stub.GetPointRequestBody,
      com.example.pointservice.stub.GetPointResponseBody> getGetPointsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getPoints",
      requestType = com.example.pointservice.stub.GetPointRequestBody.class,
      responseType = com.example.pointservice.stub.GetPointResponseBody.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.pointservice.stub.GetPointRequestBody,
      com.example.pointservice.stub.GetPointResponseBody> getGetPointsMethod() {
    io.grpc.MethodDescriptor<com.example.pointservice.stub.GetPointRequestBody, com.example.pointservice.stub.GetPointResponseBody> getGetPointsMethod;
    if ((getGetPointsMethod = PointServiceGrpc.getGetPointsMethod) == null) {
      synchronized (PointServiceGrpc.class) {
        if ((getGetPointsMethod = PointServiceGrpc.getGetPointsMethod) == null) {
          PointServiceGrpc.getGetPointsMethod = getGetPointsMethod =
              io.grpc.MethodDescriptor.<com.example.pointservice.stub.GetPointRequestBody, com.example.pointservice.stub.GetPointResponseBody>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getPoints"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.pointservice.stub.GetPointRequestBody.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.pointservice.stub.GetPointResponseBody.getDefaultInstance()))
              .setSchemaDescriptor(new PointServiceMethodDescriptorSupplier("getPoints"))
              .build();
        }
      }
    }
    return getGetPointsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PointServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PointServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PointServiceStub>() {
        @java.lang.Override
        public PointServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PointServiceStub(channel, callOptions);
        }
      };
    return PointServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PointServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PointServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PointServiceBlockingStub>() {
        @java.lang.Override
        public PointServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PointServiceBlockingStub(channel, callOptions);
        }
      };
    return PointServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PointServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PointServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PointServiceFutureStub>() {
        @java.lang.Override
        public PointServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PointServiceFutureStub(channel, callOptions);
        }
      };
    return PointServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class PointServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void increasePoint(com.example.pointservice.stub.IncreasePointRequestBody request,
        io.grpc.stub.StreamObserver<com.example.pointservice.stub.IncreasePointResponseBody> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getIncreasePointMethod(), responseObserver);
    }

    /**
     */
    public void getPoints(com.example.pointservice.stub.GetPointRequestBody request,
        io.grpc.stub.StreamObserver<com.example.pointservice.stub.GetPointResponseBody> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPointsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getIncreasePointMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.example.pointservice.stub.IncreasePointRequestBody,
                com.example.pointservice.stub.IncreasePointResponseBody>(
                  this, METHODID_INCREASE_POINT)))
          .addMethod(
            getGetPointsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.example.pointservice.stub.GetPointRequestBody,
                com.example.pointservice.stub.GetPointResponseBody>(
                  this, METHODID_GET_POINTS)))
          .build();
    }
  }

  /**
   */
  public static final class PointServiceStub extends io.grpc.stub.AbstractAsyncStub<PointServiceStub> {
    private PointServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PointServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PointServiceStub(channel, callOptions);
    }

    /**
     */
    public void increasePoint(com.example.pointservice.stub.IncreasePointRequestBody request,
        io.grpc.stub.StreamObserver<com.example.pointservice.stub.IncreasePointResponseBody> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getIncreasePointMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getPoints(com.example.pointservice.stub.GetPointRequestBody request,
        io.grpc.stub.StreamObserver<com.example.pointservice.stub.GetPointResponseBody> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetPointsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class PointServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<PointServiceBlockingStub> {
    private PointServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PointServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PointServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.example.pointservice.stub.IncreasePointResponseBody increasePoint(com.example.pointservice.stub.IncreasePointRequestBody request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getIncreasePointMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.pointservice.stub.GetPointResponseBody getPoints(com.example.pointservice.stub.GetPointRequestBody request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetPointsMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class PointServiceFutureStub extends io.grpc.stub.AbstractFutureStub<PointServiceFutureStub> {
    private PointServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PointServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PointServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.pointservice.stub.IncreasePointResponseBody> increasePoint(
        com.example.pointservice.stub.IncreasePointRequestBody request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getIncreasePointMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.pointservice.stub.GetPointResponseBody> getPoints(
        com.example.pointservice.stub.GetPointRequestBody request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetPointsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_INCREASE_POINT = 0;
  private static final int METHODID_GET_POINTS = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final PointServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(PointServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_INCREASE_POINT:
          serviceImpl.increasePoint((com.example.pointservice.stub.IncreasePointRequestBody) request,
              (io.grpc.stub.StreamObserver<com.example.pointservice.stub.IncreasePointResponseBody>) responseObserver);
          break;
        case METHODID_GET_POINTS:
          serviceImpl.getPoints((com.example.pointservice.stub.GetPointRequestBody) request,
              (io.grpc.stub.StreamObserver<com.example.pointservice.stub.GetPointResponseBody>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class PointServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PointServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.example.pointservice.stub.PointServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("PointService");
    }
  }

  private static final class PointServiceFileDescriptorSupplier
      extends PointServiceBaseDescriptorSupplier {
    PointServiceFileDescriptorSupplier() {}
  }

  private static final class PointServiceMethodDescriptorSupplier
      extends PointServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    PointServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (PointServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PointServiceFileDescriptorSupplier())
              .addMethod(getIncreasePointMethod())
              .addMethod(getGetPointsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
