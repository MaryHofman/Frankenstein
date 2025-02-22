package com.example.shared;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.66.0)",
    comments = "Source: service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ShopServiceGrpc {

  private ShopServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "com.example.shared.ShopService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.example.shared.Service.Request,
      com.example.shared.Service.Response> getAddInCartMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "addInCart",
      requestType = com.example.shared.Service.Request.class,
      responseType = com.example.shared.Service.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.shared.Service.Request,
      com.example.shared.Service.Response> getAddInCartMethod() {
    io.grpc.MethodDescriptor<com.example.shared.Service.Request, com.example.shared.Service.Response> getAddInCartMethod;
    if ((getAddInCartMethod = ShopServiceGrpc.getAddInCartMethod) == null) {
      synchronized (ShopServiceGrpc.class) {
        if ((getAddInCartMethod = ShopServiceGrpc.getAddInCartMethod) == null) {
          ShopServiceGrpc.getAddInCartMethod = getAddInCartMethod =
              io.grpc.MethodDescriptor.<com.example.shared.Service.Request, com.example.shared.Service.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "addInCart"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.shared.Service.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.shared.Service.Response.getDefaultInstance()))
              .setSchemaDescriptor(new ShopServiceMethodDescriptorSupplier("addInCart"))
              .build();
        }
      }
    }
    return getAddInCartMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ShopServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ShopServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ShopServiceStub>() {
        @java.lang.Override
        public ShopServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ShopServiceStub(channel, callOptions);
        }
      };
    return ShopServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ShopServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ShopServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ShopServiceBlockingStub>() {
        @java.lang.Override
        public ShopServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ShopServiceBlockingStub(channel, callOptions);
        }
      };
    return ShopServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ShopServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ShopServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ShopServiceFutureStub>() {
        @java.lang.Override
        public ShopServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ShopServiceFutureStub(channel, callOptions);
        }
      };
    return ShopServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void addInCart(com.example.shared.Service.Request request,
        io.grpc.stub.StreamObserver<com.example.shared.Service.Response> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddInCartMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service ShopService.
   */
  public static abstract class ShopServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return ShopServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service ShopService.
   */
  public static final class ShopServiceStub
      extends io.grpc.stub.AbstractAsyncStub<ShopServiceStub> {
    private ShopServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ShopServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ShopServiceStub(channel, callOptions);
    }

    /**
     */
    public void addInCart(com.example.shared.Service.Request request,
        io.grpc.stub.StreamObserver<com.example.shared.Service.Response> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddInCartMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service ShopService.
   */
  public static final class ShopServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ShopServiceBlockingStub> {
    private ShopServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ShopServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ShopServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.example.shared.Service.Response addInCart(com.example.shared.Service.Request request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddInCartMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service ShopService.
   */
  public static final class ShopServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<ShopServiceFutureStub> {
    private ShopServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ShopServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ShopServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.shared.Service.Response> addInCart(
        com.example.shared.Service.Request request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddInCartMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ADD_IN_CART = 0;

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
        case METHODID_ADD_IN_CART:
          serviceImpl.addInCart((com.example.shared.Service.Request) request,
              (io.grpc.stub.StreamObserver<com.example.shared.Service.Response>) responseObserver);
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
          getAddInCartMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.example.shared.Service.Request,
              com.example.shared.Service.Response>(
                service, METHODID_ADD_IN_CART)))
        .build();
  }

  private static abstract class ShopServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ShopServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.example.shared.Service.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ShopService");
    }
  }

  private static final class ShopServiceFileDescriptorSupplier
      extends ShopServiceBaseDescriptorSupplier {
    ShopServiceFileDescriptorSupplier() {}
  }

  private static final class ShopServiceMethodDescriptorSupplier
      extends ShopServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    ShopServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (ShopServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ShopServiceFileDescriptorSupplier())
              .addMethod(getAddInCartMethod())
              .build();
        }
      }
    }
    return result;
  }
}
