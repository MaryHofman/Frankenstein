package com.example.shared;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.66.0)",
    comments = "Source: service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ConfirmationOfAvailabilityGrpc {

  private ConfirmationOfAvailabilityGrpc() {}

  public static final java.lang.String SERVICE_NAME = "com.example.shared.ConfirmationOfAvailability";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.example.shared.Service.ConfirmationOfAvailabilityRequest,
      com.example.shared.Service.ConfirmationOfAvailabilityResponse> getCheckMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "check",
      requestType = com.example.shared.Service.ConfirmationOfAvailabilityRequest.class,
      responseType = com.example.shared.Service.ConfirmationOfAvailabilityResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.shared.Service.ConfirmationOfAvailabilityRequest,
      com.example.shared.Service.ConfirmationOfAvailabilityResponse> getCheckMethod() {
    io.grpc.MethodDescriptor<com.example.shared.Service.ConfirmationOfAvailabilityRequest, com.example.shared.Service.ConfirmationOfAvailabilityResponse> getCheckMethod;
    if ((getCheckMethod = ConfirmationOfAvailabilityGrpc.getCheckMethod) == null) {
      synchronized (ConfirmationOfAvailabilityGrpc.class) {
        if ((getCheckMethod = ConfirmationOfAvailabilityGrpc.getCheckMethod) == null) {
          ConfirmationOfAvailabilityGrpc.getCheckMethod = getCheckMethod =
              io.grpc.MethodDescriptor.<com.example.shared.Service.ConfirmationOfAvailabilityRequest, com.example.shared.Service.ConfirmationOfAvailabilityResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "check"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.shared.Service.ConfirmationOfAvailabilityRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.shared.Service.ConfirmationOfAvailabilityResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ConfirmationOfAvailabilityMethodDescriptorSupplier("check"))
              .build();
        }
      }
    }
    return getCheckMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.shared.Service.ProductDeletedRequest,
      com.example.shared.Service.ProductDeletedResponse> getMarkProductAsUnavailableMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MarkProductAsUnavailable",
      requestType = com.example.shared.Service.ProductDeletedRequest.class,
      responseType = com.example.shared.Service.ProductDeletedResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.shared.Service.ProductDeletedRequest,
      com.example.shared.Service.ProductDeletedResponse> getMarkProductAsUnavailableMethod() {
    io.grpc.MethodDescriptor<com.example.shared.Service.ProductDeletedRequest, com.example.shared.Service.ProductDeletedResponse> getMarkProductAsUnavailableMethod;
    if ((getMarkProductAsUnavailableMethod = ConfirmationOfAvailabilityGrpc.getMarkProductAsUnavailableMethod) == null) {
      synchronized (ConfirmationOfAvailabilityGrpc.class) {
        if ((getMarkProductAsUnavailableMethod = ConfirmationOfAvailabilityGrpc.getMarkProductAsUnavailableMethod) == null) {
          ConfirmationOfAvailabilityGrpc.getMarkProductAsUnavailableMethod = getMarkProductAsUnavailableMethod =
              io.grpc.MethodDescriptor.<com.example.shared.Service.ProductDeletedRequest, com.example.shared.Service.ProductDeletedResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MarkProductAsUnavailable"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.shared.Service.ProductDeletedRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.shared.Service.ProductDeletedResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ConfirmationOfAvailabilityMethodDescriptorSupplier("MarkProductAsUnavailable"))
              .build();
        }
      }
    }
    return getMarkProductAsUnavailableMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ConfirmationOfAvailabilityStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ConfirmationOfAvailabilityStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ConfirmationOfAvailabilityStub>() {
        @java.lang.Override
        public ConfirmationOfAvailabilityStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ConfirmationOfAvailabilityStub(channel, callOptions);
        }
      };
    return ConfirmationOfAvailabilityStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ConfirmationOfAvailabilityBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ConfirmationOfAvailabilityBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ConfirmationOfAvailabilityBlockingStub>() {
        @java.lang.Override
        public ConfirmationOfAvailabilityBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ConfirmationOfAvailabilityBlockingStub(channel, callOptions);
        }
      };
    return ConfirmationOfAvailabilityBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ConfirmationOfAvailabilityFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ConfirmationOfAvailabilityFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ConfirmationOfAvailabilityFutureStub>() {
        @java.lang.Override
        public ConfirmationOfAvailabilityFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ConfirmationOfAvailabilityFutureStub(channel, callOptions);
        }
      };
    return ConfirmationOfAvailabilityFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void check(com.example.shared.Service.ConfirmationOfAvailabilityRequest request,
        io.grpc.stub.StreamObserver<com.example.shared.Service.ConfirmationOfAvailabilityResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCheckMethod(), responseObserver);
    }

    /**
     */
    default void markProductAsUnavailable(com.example.shared.Service.ProductDeletedRequest request,
        io.grpc.stub.StreamObserver<com.example.shared.Service.ProductDeletedResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMarkProductAsUnavailableMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service ConfirmationOfAvailability.
   */
  public static abstract class ConfirmationOfAvailabilityImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return ConfirmationOfAvailabilityGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service ConfirmationOfAvailability.
   */
  public static final class ConfirmationOfAvailabilityStub
      extends io.grpc.stub.AbstractAsyncStub<ConfirmationOfAvailabilityStub> {
    private ConfirmationOfAvailabilityStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ConfirmationOfAvailabilityStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ConfirmationOfAvailabilityStub(channel, callOptions);
    }

    /**
     */
    public void check(com.example.shared.Service.ConfirmationOfAvailabilityRequest request,
        io.grpc.stub.StreamObserver<com.example.shared.Service.ConfirmationOfAvailabilityResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCheckMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void markProductAsUnavailable(com.example.shared.Service.ProductDeletedRequest request,
        io.grpc.stub.StreamObserver<com.example.shared.Service.ProductDeletedResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMarkProductAsUnavailableMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service ConfirmationOfAvailability.
   */
  public static final class ConfirmationOfAvailabilityBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ConfirmationOfAvailabilityBlockingStub> {
    private ConfirmationOfAvailabilityBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ConfirmationOfAvailabilityBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ConfirmationOfAvailabilityBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.example.shared.Service.ConfirmationOfAvailabilityResponse check(com.example.shared.Service.ConfirmationOfAvailabilityRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCheckMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.shared.Service.ProductDeletedResponse markProductAsUnavailable(com.example.shared.Service.ProductDeletedRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMarkProductAsUnavailableMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service ConfirmationOfAvailability.
   */
  public static final class ConfirmationOfAvailabilityFutureStub
      extends io.grpc.stub.AbstractFutureStub<ConfirmationOfAvailabilityFutureStub> {
    private ConfirmationOfAvailabilityFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ConfirmationOfAvailabilityFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ConfirmationOfAvailabilityFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.shared.Service.ConfirmationOfAvailabilityResponse> check(
        com.example.shared.Service.ConfirmationOfAvailabilityRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCheckMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.shared.Service.ProductDeletedResponse> markProductAsUnavailable(
        com.example.shared.Service.ProductDeletedRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMarkProductAsUnavailableMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CHECK = 0;
  private static final int METHODID_MARK_PRODUCT_AS_UNAVAILABLE = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CHECK:
          serviceImpl.check((com.example.shared.Service.ConfirmationOfAvailabilityRequest) request,
              (io.grpc.stub.StreamObserver<com.example.shared.Service.ConfirmationOfAvailabilityResponse>) responseObserver);
          break;
        case METHODID_MARK_PRODUCT_AS_UNAVAILABLE:
          serviceImpl.markProductAsUnavailable((com.example.shared.Service.ProductDeletedRequest) request,
              (io.grpc.stub.StreamObserver<com.example.shared.Service.ProductDeletedResponse>) responseObserver);
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

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getCheckMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.example.shared.Service.ConfirmationOfAvailabilityRequest,
              com.example.shared.Service.ConfirmationOfAvailabilityResponse>(
                service, METHODID_CHECK)))
        .addMethod(
          getMarkProductAsUnavailableMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.example.shared.Service.ProductDeletedRequest,
              com.example.shared.Service.ProductDeletedResponse>(
                service, METHODID_MARK_PRODUCT_AS_UNAVAILABLE)))
        .build();
  }

  private static abstract class ConfirmationOfAvailabilityBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ConfirmationOfAvailabilityBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.example.shared.Service.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ConfirmationOfAvailability");
    }
  }

  private static final class ConfirmationOfAvailabilityFileDescriptorSupplier
      extends ConfirmationOfAvailabilityBaseDescriptorSupplier {
    ConfirmationOfAvailabilityFileDescriptorSupplier() {}
  }

  private static final class ConfirmationOfAvailabilityMethodDescriptorSupplier
      extends ConfirmationOfAvailabilityBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    ConfirmationOfAvailabilityMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (ConfirmationOfAvailabilityGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ConfirmationOfAvailabilityFileDescriptorSupplier())
              .addMethod(getCheckMethod())
              .addMethod(getMarkProductAsUnavailableMethod())
              .build();
        }
      }
    }
    return result;
  }
}
