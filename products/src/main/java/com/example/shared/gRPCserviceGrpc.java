package com.example.shared;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.66.0)",
    comments = "Source: service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class gRPCserviceGrpc {

  private gRPCserviceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "com.example.shared.gRPCservice";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.example.shared.Service.SaveOneImageRequest,
      com.example.shared.Service.SaveOneImageResponse> getSaveOneImageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "saveOneImage",
      requestType = com.example.shared.Service.SaveOneImageRequest.class,
      responseType = com.example.shared.Service.SaveOneImageResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.shared.Service.SaveOneImageRequest,
      com.example.shared.Service.SaveOneImageResponse> getSaveOneImageMethod() {
    io.grpc.MethodDescriptor<com.example.shared.Service.SaveOneImageRequest, com.example.shared.Service.SaveOneImageResponse> getSaveOneImageMethod;
    if ((getSaveOneImageMethod = gRPCserviceGrpc.getSaveOneImageMethod) == null) {
      synchronized (gRPCserviceGrpc.class) {
        if ((getSaveOneImageMethod = gRPCserviceGrpc.getSaveOneImageMethod) == null) {
          gRPCserviceGrpc.getSaveOneImageMethod = getSaveOneImageMethod =
              io.grpc.MethodDescriptor.<com.example.shared.Service.SaveOneImageRequest, com.example.shared.Service.SaveOneImageResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "saveOneImage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.shared.Service.SaveOneImageRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.shared.Service.SaveOneImageResponse.getDefaultInstance()))
              .setSchemaDescriptor(new gRPCserviceMethodDescriptorSupplier("saveOneImage"))
              .build();
        }
      }
    }
    return getSaveOneImageMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.shared.Service.SaveListImageRequest,
      com.example.shared.Service.SaveListImageResponse> getSaveListImagesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "saveListImages",
      requestType = com.example.shared.Service.SaveListImageRequest.class,
      responseType = com.example.shared.Service.SaveListImageResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.shared.Service.SaveListImageRequest,
      com.example.shared.Service.SaveListImageResponse> getSaveListImagesMethod() {
    io.grpc.MethodDescriptor<com.example.shared.Service.SaveListImageRequest, com.example.shared.Service.SaveListImageResponse> getSaveListImagesMethod;
    if ((getSaveListImagesMethod = gRPCserviceGrpc.getSaveListImagesMethod) == null) {
      synchronized (gRPCserviceGrpc.class) {
        if ((getSaveListImagesMethod = gRPCserviceGrpc.getSaveListImagesMethod) == null) {
          gRPCserviceGrpc.getSaveListImagesMethod = getSaveListImagesMethod =
              io.grpc.MethodDescriptor.<com.example.shared.Service.SaveListImageRequest, com.example.shared.Service.SaveListImageResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "saveListImages"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.shared.Service.SaveListImageRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.shared.Service.SaveListImageResponse.getDefaultInstance()))
              .setSchemaDescriptor(new gRPCserviceMethodDescriptorSupplier("saveListImages"))
              .build();
        }
      }
    }
    return getSaveListImagesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.shared.Service.DeleteOneImageRequest,
      com.example.shared.Service.DeleteOneImageResponse> getDeleteOneImageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteOneImage",
      requestType = com.example.shared.Service.DeleteOneImageRequest.class,
      responseType = com.example.shared.Service.DeleteOneImageResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.shared.Service.DeleteOneImageRequest,
      com.example.shared.Service.DeleteOneImageResponse> getDeleteOneImageMethod() {
    io.grpc.MethodDescriptor<com.example.shared.Service.DeleteOneImageRequest, com.example.shared.Service.DeleteOneImageResponse> getDeleteOneImageMethod;
    if ((getDeleteOneImageMethod = gRPCserviceGrpc.getDeleteOneImageMethod) == null) {
      synchronized (gRPCserviceGrpc.class) {
        if ((getDeleteOneImageMethod = gRPCserviceGrpc.getDeleteOneImageMethod) == null) {
          gRPCserviceGrpc.getDeleteOneImageMethod = getDeleteOneImageMethod =
              io.grpc.MethodDescriptor.<com.example.shared.Service.DeleteOneImageRequest, com.example.shared.Service.DeleteOneImageResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "deleteOneImage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.shared.Service.DeleteOneImageRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.shared.Service.DeleteOneImageResponse.getDefaultInstance()))
              .setSchemaDescriptor(new gRPCserviceMethodDescriptorSupplier("deleteOneImage"))
              .build();
        }
      }
    }
    return getDeleteOneImageMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.shared.Service.DeleteListImagesRequest,
      com.example.shared.Service.DeleteListImagesResponse> getDeleteListImagesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteListImages",
      requestType = com.example.shared.Service.DeleteListImagesRequest.class,
      responseType = com.example.shared.Service.DeleteListImagesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.shared.Service.DeleteListImagesRequest,
      com.example.shared.Service.DeleteListImagesResponse> getDeleteListImagesMethod() {
    io.grpc.MethodDescriptor<com.example.shared.Service.DeleteListImagesRequest, com.example.shared.Service.DeleteListImagesResponse> getDeleteListImagesMethod;
    if ((getDeleteListImagesMethod = gRPCserviceGrpc.getDeleteListImagesMethod) == null) {
      synchronized (gRPCserviceGrpc.class) {
        if ((getDeleteListImagesMethod = gRPCserviceGrpc.getDeleteListImagesMethod) == null) {
          gRPCserviceGrpc.getDeleteListImagesMethod = getDeleteListImagesMethod =
              io.grpc.MethodDescriptor.<com.example.shared.Service.DeleteListImagesRequest, com.example.shared.Service.DeleteListImagesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "deleteListImages"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.shared.Service.DeleteListImagesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.shared.Service.DeleteListImagesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new gRPCserviceMethodDescriptorSupplier("deleteListImages"))
              .build();
        }
      }
    }
    return getDeleteListImagesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static gRPCserviceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<gRPCserviceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<gRPCserviceStub>() {
        @java.lang.Override
        public gRPCserviceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new gRPCserviceStub(channel, callOptions);
        }
      };
    return gRPCserviceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static gRPCserviceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<gRPCserviceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<gRPCserviceBlockingStub>() {
        @java.lang.Override
        public gRPCserviceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new gRPCserviceBlockingStub(channel, callOptions);
        }
      };
    return gRPCserviceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static gRPCserviceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<gRPCserviceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<gRPCserviceFutureStub>() {
        @java.lang.Override
        public gRPCserviceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new gRPCserviceFutureStub(channel, callOptions);
        }
      };
    return gRPCserviceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void saveOneImage(com.example.shared.Service.SaveOneImageRequest request,
        io.grpc.stub.StreamObserver<com.example.shared.Service.SaveOneImageResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSaveOneImageMethod(), responseObserver);
    }

    /**
     */
    default void saveListImages(com.example.shared.Service.SaveListImageRequest request,
        io.grpc.stub.StreamObserver<com.example.shared.Service.SaveListImageResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSaveListImagesMethod(), responseObserver);
    }

    /**
     */
    default void deleteOneImage(com.example.shared.Service.DeleteOneImageRequest request,
        io.grpc.stub.StreamObserver<com.example.shared.Service.DeleteOneImageResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteOneImageMethod(), responseObserver);
    }

    /**
     */
    default void deleteListImages(com.example.shared.Service.DeleteListImagesRequest request,
        io.grpc.stub.StreamObserver<com.example.shared.Service.DeleteListImagesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteListImagesMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service gRPCservice.
   */
  public static abstract class gRPCserviceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return gRPCserviceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service gRPCservice.
   */
  public static final class gRPCserviceStub
      extends io.grpc.stub.AbstractAsyncStub<gRPCserviceStub> {
    private gRPCserviceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected gRPCserviceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new gRPCserviceStub(channel, callOptions);
    }

    /**
     */
    public void saveOneImage(com.example.shared.Service.SaveOneImageRequest request,
        io.grpc.stub.StreamObserver<com.example.shared.Service.SaveOneImageResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSaveOneImageMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void saveListImages(com.example.shared.Service.SaveListImageRequest request,
        io.grpc.stub.StreamObserver<com.example.shared.Service.SaveListImageResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSaveListImagesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteOneImage(com.example.shared.Service.DeleteOneImageRequest request,
        io.grpc.stub.StreamObserver<com.example.shared.Service.DeleteOneImageResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteOneImageMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteListImages(com.example.shared.Service.DeleteListImagesRequest request,
        io.grpc.stub.StreamObserver<com.example.shared.Service.DeleteListImagesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteListImagesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service gRPCservice.
   */
  public static final class gRPCserviceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<gRPCserviceBlockingStub> {
    private gRPCserviceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected gRPCserviceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new gRPCserviceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.example.shared.Service.SaveOneImageResponse saveOneImage(com.example.shared.Service.SaveOneImageRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSaveOneImageMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.shared.Service.SaveListImageResponse saveListImages(com.example.shared.Service.SaveListImageRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSaveListImagesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.shared.Service.DeleteOneImageResponse deleteOneImage(com.example.shared.Service.DeleteOneImageRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteOneImageMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.shared.Service.DeleteListImagesResponse deleteListImages(com.example.shared.Service.DeleteListImagesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteListImagesMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service gRPCservice.
   */
  public static final class gRPCserviceFutureStub
      extends io.grpc.stub.AbstractFutureStub<gRPCserviceFutureStub> {
    private gRPCserviceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected gRPCserviceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new gRPCserviceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.shared.Service.SaveOneImageResponse> saveOneImage(
        com.example.shared.Service.SaveOneImageRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSaveOneImageMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.shared.Service.SaveListImageResponse> saveListImages(
        com.example.shared.Service.SaveListImageRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSaveListImagesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.shared.Service.DeleteOneImageResponse> deleteOneImage(
        com.example.shared.Service.DeleteOneImageRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteOneImageMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.shared.Service.DeleteListImagesResponse> deleteListImages(
        com.example.shared.Service.DeleteListImagesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteListImagesMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SAVE_ONE_IMAGE = 0;
  private static final int METHODID_SAVE_LIST_IMAGES = 1;
  private static final int METHODID_DELETE_ONE_IMAGE = 2;
  private static final int METHODID_DELETE_LIST_IMAGES = 3;

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
        case METHODID_SAVE_ONE_IMAGE:
          serviceImpl.saveOneImage((com.example.shared.Service.SaveOneImageRequest) request,
              (io.grpc.stub.StreamObserver<com.example.shared.Service.SaveOneImageResponse>) responseObserver);
          break;
        case METHODID_SAVE_LIST_IMAGES:
          serviceImpl.saveListImages((com.example.shared.Service.SaveListImageRequest) request,
              (io.grpc.stub.StreamObserver<com.example.shared.Service.SaveListImageResponse>) responseObserver);
          break;
        case METHODID_DELETE_ONE_IMAGE:
          serviceImpl.deleteOneImage((com.example.shared.Service.DeleteOneImageRequest) request,
              (io.grpc.stub.StreamObserver<com.example.shared.Service.DeleteOneImageResponse>) responseObserver);
          break;
        case METHODID_DELETE_LIST_IMAGES:
          serviceImpl.deleteListImages((com.example.shared.Service.DeleteListImagesRequest) request,
              (io.grpc.stub.StreamObserver<com.example.shared.Service.DeleteListImagesResponse>) responseObserver);
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
          getSaveOneImageMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.example.shared.Service.SaveOneImageRequest,
              com.example.shared.Service.SaveOneImageResponse>(
                service, METHODID_SAVE_ONE_IMAGE)))
        .addMethod(
          getSaveListImagesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.example.shared.Service.SaveListImageRequest,
              com.example.shared.Service.SaveListImageResponse>(
                service, METHODID_SAVE_LIST_IMAGES)))
        .addMethod(
          getDeleteOneImageMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.example.shared.Service.DeleteOneImageRequest,
              com.example.shared.Service.DeleteOneImageResponse>(
                service, METHODID_DELETE_ONE_IMAGE)))
        .addMethod(
          getDeleteListImagesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.example.shared.Service.DeleteListImagesRequest,
              com.example.shared.Service.DeleteListImagesResponse>(
                service, METHODID_DELETE_LIST_IMAGES)))
        .build();
  }

  private static abstract class gRPCserviceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    gRPCserviceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.example.shared.Service.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("gRPCservice");
    }
  }

  private static final class gRPCserviceFileDescriptorSupplier
      extends gRPCserviceBaseDescriptorSupplier {
    gRPCserviceFileDescriptorSupplier() {}
  }

  private static final class gRPCserviceMethodDescriptorSupplier
      extends gRPCserviceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    gRPCserviceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (gRPCserviceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new gRPCserviceFileDescriptorSupplier())
              .addMethod(getSaveOneImageMethod())
              .addMethod(getSaveListImagesMethod())
              .addMethod(getDeleteOneImageMethod())
              .addMethod(getDeleteListImagesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
