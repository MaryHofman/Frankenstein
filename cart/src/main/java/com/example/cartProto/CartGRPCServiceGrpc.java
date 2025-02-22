package com.example.cartProto;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.66.0)",
    comments = "Source: cartProto.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class CartGRPCServiceGrpc {

  private CartGRPCServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "com.example.cartProto.CartGRPCService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.example.cartProto.CartProto.CartRequest,
      com.example.cartProto.CartProto.CartResponse> getCleanCartMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "cleanCart",
      requestType = com.example.cartProto.CartProto.CartRequest.class,
      responseType = com.example.cartProto.CartProto.CartResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.cartProto.CartProto.CartRequest,
      com.example.cartProto.CartProto.CartResponse> getCleanCartMethod() {
    io.grpc.MethodDescriptor<com.example.cartProto.CartProto.CartRequest, com.example.cartProto.CartProto.CartResponse> getCleanCartMethod;
    if ((getCleanCartMethod = CartGRPCServiceGrpc.getCleanCartMethod) == null) {
      synchronized (CartGRPCServiceGrpc.class) {
        if ((getCleanCartMethod = CartGRPCServiceGrpc.getCleanCartMethod) == null) {
          CartGRPCServiceGrpc.getCleanCartMethod = getCleanCartMethod =
              io.grpc.MethodDescriptor.<com.example.cartProto.CartProto.CartRequest, com.example.cartProto.CartProto.CartResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "cleanCart"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.cartProto.CartProto.CartRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.cartProto.CartProto.CartResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CartGRPCServiceMethodDescriptorSupplier("cleanCart"))
              .build();
        }
      }
    }
    return getCleanCartMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.cartProto.CartProto.Request,
      com.example.cartProto.CartProto.Response> getAddInCartMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "addInCart",
      requestType = com.example.cartProto.CartProto.Request.class,
      responseType = com.example.cartProto.CartProto.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.cartProto.CartProto.Request,
      com.example.cartProto.CartProto.Response> getAddInCartMethod() {
    io.grpc.MethodDescriptor<com.example.cartProto.CartProto.Request, com.example.cartProto.CartProto.Response> getAddInCartMethod;
    if ((getAddInCartMethod = CartGRPCServiceGrpc.getAddInCartMethod) == null) {
      synchronized (CartGRPCServiceGrpc.class) {
        if ((getAddInCartMethod = CartGRPCServiceGrpc.getAddInCartMethod) == null) {
          CartGRPCServiceGrpc.getAddInCartMethod = getAddInCartMethod =
              io.grpc.MethodDescriptor.<com.example.cartProto.CartProto.Request, com.example.cartProto.CartProto.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "addInCart"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.cartProto.CartProto.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.cartProto.CartProto.Response.getDefaultInstance()))
              .setSchemaDescriptor(new CartGRPCServiceMethodDescriptorSupplier("addInCart"))
              .build();
        }
      }
    }
    return getAddInCartMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.cartProto.CartProto.GetCartRequest,
      com.example.cartProto.CartProto.GetCartResponce> getGetCartOfUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getCartOfUser",
      requestType = com.example.cartProto.CartProto.GetCartRequest.class,
      responseType = com.example.cartProto.CartProto.GetCartResponce.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.cartProto.CartProto.GetCartRequest,
      com.example.cartProto.CartProto.GetCartResponce> getGetCartOfUserMethod() {
    io.grpc.MethodDescriptor<com.example.cartProto.CartProto.GetCartRequest, com.example.cartProto.CartProto.GetCartResponce> getGetCartOfUserMethod;
    if ((getGetCartOfUserMethod = CartGRPCServiceGrpc.getGetCartOfUserMethod) == null) {
      synchronized (CartGRPCServiceGrpc.class) {
        if ((getGetCartOfUserMethod = CartGRPCServiceGrpc.getGetCartOfUserMethod) == null) {
          CartGRPCServiceGrpc.getGetCartOfUserMethod = getGetCartOfUserMethod =
              io.grpc.MethodDescriptor.<com.example.cartProto.CartProto.GetCartRequest, com.example.cartProto.CartProto.GetCartResponce>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getCartOfUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.cartProto.CartProto.GetCartRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.cartProto.CartProto.GetCartResponce.getDefaultInstance()))
              .setSchemaDescriptor(new CartGRPCServiceMethodDescriptorSupplier("getCartOfUser"))
              .build();
        }
      }
    }
    return getGetCartOfUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.cartProto.CartProto.GetIdProductsRequest,
      com.example.cartProto.CartProto.GetIdProductsResponse> getGetIdProductsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getIdProducts",
      requestType = com.example.cartProto.CartProto.GetIdProductsRequest.class,
      responseType = com.example.cartProto.CartProto.GetIdProductsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.cartProto.CartProto.GetIdProductsRequest,
      com.example.cartProto.CartProto.GetIdProductsResponse> getGetIdProductsMethod() {
    io.grpc.MethodDescriptor<com.example.cartProto.CartProto.GetIdProductsRequest, com.example.cartProto.CartProto.GetIdProductsResponse> getGetIdProductsMethod;
    if ((getGetIdProductsMethod = CartGRPCServiceGrpc.getGetIdProductsMethod) == null) {
      synchronized (CartGRPCServiceGrpc.class) {
        if ((getGetIdProductsMethod = CartGRPCServiceGrpc.getGetIdProductsMethod) == null) {
          CartGRPCServiceGrpc.getGetIdProductsMethod = getGetIdProductsMethod =
              io.grpc.MethodDescriptor.<com.example.cartProto.CartProto.GetIdProductsRequest, com.example.cartProto.CartProto.GetIdProductsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getIdProducts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.cartProto.CartProto.GetIdProductsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.cartProto.CartProto.GetIdProductsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CartGRPCServiceMethodDescriptorSupplier("getIdProducts"))
              .build();
        }
      }
    }
    return getGetIdProductsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.cartProto.CartProto.OrderRequest,
      com.example.cartProto.CartProto.OrderResponce> getGetOrderOfUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getOrderOfUser",
      requestType = com.example.cartProto.CartProto.OrderRequest.class,
      responseType = com.example.cartProto.CartProto.OrderResponce.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.cartProto.CartProto.OrderRequest,
      com.example.cartProto.CartProto.OrderResponce> getGetOrderOfUserMethod() {
    io.grpc.MethodDescriptor<com.example.cartProto.CartProto.OrderRequest, com.example.cartProto.CartProto.OrderResponce> getGetOrderOfUserMethod;
    if ((getGetOrderOfUserMethod = CartGRPCServiceGrpc.getGetOrderOfUserMethod) == null) {
      synchronized (CartGRPCServiceGrpc.class) {
        if ((getGetOrderOfUserMethod = CartGRPCServiceGrpc.getGetOrderOfUserMethod) == null) {
          CartGRPCServiceGrpc.getGetOrderOfUserMethod = getGetOrderOfUserMethod =
              io.grpc.MethodDescriptor.<com.example.cartProto.CartProto.OrderRequest, com.example.cartProto.CartProto.OrderResponce>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getOrderOfUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.cartProto.CartProto.OrderRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.cartProto.CartProto.OrderResponce.getDefaultInstance()))
              .setSchemaDescriptor(new CartGRPCServiceMethodDescriptorSupplier("getOrderOfUser"))
              .build();
        }
      }
    }
    return getGetOrderOfUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.cartProto.CartProto.SetAddress,
      com.example.cartProto.CartProto.SetAddressResponce> getSetAddressMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "setAddress",
      requestType = com.example.cartProto.CartProto.SetAddress.class,
      responseType = com.example.cartProto.CartProto.SetAddressResponce.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.cartProto.CartProto.SetAddress,
      com.example.cartProto.CartProto.SetAddressResponce> getSetAddressMethod() {
    io.grpc.MethodDescriptor<com.example.cartProto.CartProto.SetAddress, com.example.cartProto.CartProto.SetAddressResponce> getSetAddressMethod;
    if ((getSetAddressMethod = CartGRPCServiceGrpc.getSetAddressMethod) == null) {
      synchronized (CartGRPCServiceGrpc.class) {
        if ((getSetAddressMethod = CartGRPCServiceGrpc.getSetAddressMethod) == null) {
          CartGRPCServiceGrpc.getSetAddressMethod = getSetAddressMethod =
              io.grpc.MethodDescriptor.<com.example.cartProto.CartProto.SetAddress, com.example.cartProto.CartProto.SetAddressResponce>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "setAddress"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.cartProto.CartProto.SetAddress.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.cartProto.CartProto.SetAddressResponce.getDefaultInstance()))
              .setSchemaDescriptor(new CartGRPCServiceMethodDescriptorSupplier("setAddress"))
              .build();
        }
      }
    }
    return getSetAddressMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.cartProto.CartProto.DeleteRequest,
      com.example.cartProto.CartProto.DeleteResponce> getDeleteByProductIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteByProductId",
      requestType = com.example.cartProto.CartProto.DeleteRequest.class,
      responseType = com.example.cartProto.CartProto.DeleteResponce.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.cartProto.CartProto.DeleteRequest,
      com.example.cartProto.CartProto.DeleteResponce> getDeleteByProductIdMethod() {
    io.grpc.MethodDescriptor<com.example.cartProto.CartProto.DeleteRequest, com.example.cartProto.CartProto.DeleteResponce> getDeleteByProductIdMethod;
    if ((getDeleteByProductIdMethod = CartGRPCServiceGrpc.getDeleteByProductIdMethod) == null) {
      synchronized (CartGRPCServiceGrpc.class) {
        if ((getDeleteByProductIdMethod = CartGRPCServiceGrpc.getDeleteByProductIdMethod) == null) {
          CartGRPCServiceGrpc.getDeleteByProductIdMethod = getDeleteByProductIdMethod =
              io.grpc.MethodDescriptor.<com.example.cartProto.CartProto.DeleteRequest, com.example.cartProto.CartProto.DeleteResponce>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "deleteByProductId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.cartProto.CartProto.DeleteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.cartProto.CartProto.DeleteResponce.getDefaultInstance()))
              .setSchemaDescriptor(new CartGRPCServiceMethodDescriptorSupplier("deleteByProductId"))
              .build();
        }
      }
    }
    return getDeleteByProductIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.cartProto.CartProto.takeStatisticRequest,
      com.example.cartProto.CartProto.takeStatisticResponce> getGetStatisticMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getStatistic",
      requestType = com.example.cartProto.CartProto.takeStatisticRequest.class,
      responseType = com.example.cartProto.CartProto.takeStatisticResponce.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.cartProto.CartProto.takeStatisticRequest,
      com.example.cartProto.CartProto.takeStatisticResponce> getGetStatisticMethod() {
    io.grpc.MethodDescriptor<com.example.cartProto.CartProto.takeStatisticRequest, com.example.cartProto.CartProto.takeStatisticResponce> getGetStatisticMethod;
    if ((getGetStatisticMethod = CartGRPCServiceGrpc.getGetStatisticMethod) == null) {
      synchronized (CartGRPCServiceGrpc.class) {
        if ((getGetStatisticMethod = CartGRPCServiceGrpc.getGetStatisticMethod) == null) {
          CartGRPCServiceGrpc.getGetStatisticMethod = getGetStatisticMethod =
              io.grpc.MethodDescriptor.<com.example.cartProto.CartProto.takeStatisticRequest, com.example.cartProto.CartProto.takeStatisticResponce>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getStatistic"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.cartProto.CartProto.takeStatisticRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.cartProto.CartProto.takeStatisticResponce.getDefaultInstance()))
              .setSchemaDescriptor(new CartGRPCServiceMethodDescriptorSupplier("getStatistic"))
              .build();
        }
      }
    }
    return getGetStatisticMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.cartProto.CartProto.ProductDeletedRequest,
      com.example.cartProto.CartProto.ProductDeletedResponse> getMarkProductAsUnavailableMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MarkProductAsUnavailable",
      requestType = com.example.cartProto.CartProto.ProductDeletedRequest.class,
      responseType = com.example.cartProto.CartProto.ProductDeletedResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.cartProto.CartProto.ProductDeletedRequest,
      com.example.cartProto.CartProto.ProductDeletedResponse> getMarkProductAsUnavailableMethod() {
    io.grpc.MethodDescriptor<com.example.cartProto.CartProto.ProductDeletedRequest, com.example.cartProto.CartProto.ProductDeletedResponse> getMarkProductAsUnavailableMethod;
    if ((getMarkProductAsUnavailableMethod = CartGRPCServiceGrpc.getMarkProductAsUnavailableMethod) == null) {
      synchronized (CartGRPCServiceGrpc.class) {
        if ((getMarkProductAsUnavailableMethod = CartGRPCServiceGrpc.getMarkProductAsUnavailableMethod) == null) {
          CartGRPCServiceGrpc.getMarkProductAsUnavailableMethod = getMarkProductAsUnavailableMethod =
              io.grpc.MethodDescriptor.<com.example.cartProto.CartProto.ProductDeletedRequest, com.example.cartProto.CartProto.ProductDeletedResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MarkProductAsUnavailable"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.cartProto.CartProto.ProductDeletedRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.cartProto.CartProto.ProductDeletedResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CartGRPCServiceMethodDescriptorSupplier("MarkProductAsUnavailable"))
              .build();
        }
      }
    }
    return getMarkProductAsUnavailableMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CartGRPCServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CartGRPCServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CartGRPCServiceStub>() {
        @java.lang.Override
        public CartGRPCServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CartGRPCServiceStub(channel, callOptions);
        }
      };
    return CartGRPCServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CartGRPCServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CartGRPCServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CartGRPCServiceBlockingStub>() {
        @java.lang.Override
        public CartGRPCServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CartGRPCServiceBlockingStub(channel, callOptions);
        }
      };
    return CartGRPCServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CartGRPCServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CartGRPCServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CartGRPCServiceFutureStub>() {
        @java.lang.Override
        public CartGRPCServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CartGRPCServiceFutureStub(channel, callOptions);
        }
      };
    return CartGRPCServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void cleanCart(com.example.cartProto.CartProto.CartRequest request,
        io.grpc.stub.StreamObserver<com.example.cartProto.CartProto.CartResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCleanCartMethod(), responseObserver);
    }

    /**
     */
    default void addInCart(com.example.cartProto.CartProto.Request request,
        io.grpc.stub.StreamObserver<com.example.cartProto.CartProto.Response> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddInCartMethod(), responseObserver);
    }

    /**
     */
    default void getCartOfUser(com.example.cartProto.CartProto.GetCartRequest request,
        io.grpc.stub.StreamObserver<com.example.cartProto.CartProto.GetCartResponce> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetCartOfUserMethod(), responseObserver);
    }

    /**
     */
    default void getIdProducts(com.example.cartProto.CartProto.GetIdProductsRequest request,
        io.grpc.stub.StreamObserver<com.example.cartProto.CartProto.GetIdProductsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetIdProductsMethod(), responseObserver);
    }

    /**
     */
    default void getOrderOfUser(com.example.cartProto.CartProto.OrderRequest request,
        io.grpc.stub.StreamObserver<com.example.cartProto.CartProto.OrderResponce> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetOrderOfUserMethod(), responseObserver);
    }

    /**
     */
    default void setAddress(com.example.cartProto.CartProto.SetAddress request,
        io.grpc.stub.StreamObserver<com.example.cartProto.CartProto.SetAddressResponce> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetAddressMethod(), responseObserver);
    }

    /**
     */
    default void deleteByProductId(com.example.cartProto.CartProto.DeleteRequest request,
        io.grpc.stub.StreamObserver<com.example.cartProto.CartProto.DeleteResponce> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteByProductIdMethod(), responseObserver);
    }

    /**
     */
    default void getStatistic(com.example.cartProto.CartProto.takeStatisticRequest request,
        io.grpc.stub.StreamObserver<com.example.cartProto.CartProto.takeStatisticResponce> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetStatisticMethod(), responseObserver);
    }

    /**
     */
    default void markProductAsUnavailable(com.example.cartProto.CartProto.ProductDeletedRequest request,
        io.grpc.stub.StreamObserver<com.example.cartProto.CartProto.ProductDeletedResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMarkProductAsUnavailableMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service CartGRPCService.
   */
  public static abstract class CartGRPCServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return CartGRPCServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service CartGRPCService.
   */
  public static final class CartGRPCServiceStub
      extends io.grpc.stub.AbstractAsyncStub<CartGRPCServiceStub> {
    private CartGRPCServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CartGRPCServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CartGRPCServiceStub(channel, callOptions);
    }

    /**
     */
    public void cleanCart(com.example.cartProto.CartProto.CartRequest request,
        io.grpc.stub.StreamObserver<com.example.cartProto.CartProto.CartResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCleanCartMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addInCart(com.example.cartProto.CartProto.Request request,
        io.grpc.stub.StreamObserver<com.example.cartProto.CartProto.Response> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddInCartMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getCartOfUser(com.example.cartProto.CartProto.GetCartRequest request,
        io.grpc.stub.StreamObserver<com.example.cartProto.CartProto.GetCartResponce> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetCartOfUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getIdProducts(com.example.cartProto.CartProto.GetIdProductsRequest request,
        io.grpc.stub.StreamObserver<com.example.cartProto.CartProto.GetIdProductsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetIdProductsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getOrderOfUser(com.example.cartProto.CartProto.OrderRequest request,
        io.grpc.stub.StreamObserver<com.example.cartProto.CartProto.OrderResponce> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetOrderOfUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setAddress(com.example.cartProto.CartProto.SetAddress request,
        io.grpc.stub.StreamObserver<com.example.cartProto.CartProto.SetAddressResponce> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetAddressMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteByProductId(com.example.cartProto.CartProto.DeleteRequest request,
        io.grpc.stub.StreamObserver<com.example.cartProto.CartProto.DeleteResponce> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteByProductIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getStatistic(com.example.cartProto.CartProto.takeStatisticRequest request,
        io.grpc.stub.StreamObserver<com.example.cartProto.CartProto.takeStatisticResponce> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetStatisticMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void markProductAsUnavailable(com.example.cartProto.CartProto.ProductDeletedRequest request,
        io.grpc.stub.StreamObserver<com.example.cartProto.CartProto.ProductDeletedResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMarkProductAsUnavailableMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service CartGRPCService.
   */
  public static final class CartGRPCServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<CartGRPCServiceBlockingStub> {
    private CartGRPCServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CartGRPCServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CartGRPCServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.example.cartProto.CartProto.CartResponse cleanCart(com.example.cartProto.CartProto.CartRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCleanCartMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.cartProto.CartProto.Response addInCart(com.example.cartProto.CartProto.Request request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddInCartMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.cartProto.CartProto.GetCartResponce getCartOfUser(com.example.cartProto.CartProto.GetCartRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetCartOfUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.cartProto.CartProto.GetIdProductsResponse getIdProducts(com.example.cartProto.CartProto.GetIdProductsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetIdProductsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.cartProto.CartProto.OrderResponce getOrderOfUser(com.example.cartProto.CartProto.OrderRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetOrderOfUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.cartProto.CartProto.SetAddressResponce setAddress(com.example.cartProto.CartProto.SetAddress request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetAddressMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.cartProto.CartProto.DeleteResponce deleteByProductId(com.example.cartProto.CartProto.DeleteRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteByProductIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.cartProto.CartProto.takeStatisticResponce getStatistic(com.example.cartProto.CartProto.takeStatisticRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetStatisticMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.cartProto.CartProto.ProductDeletedResponse markProductAsUnavailable(com.example.cartProto.CartProto.ProductDeletedRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMarkProductAsUnavailableMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service CartGRPCService.
   */
  public static final class CartGRPCServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<CartGRPCServiceFutureStub> {
    private CartGRPCServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CartGRPCServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CartGRPCServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.cartProto.CartProto.CartResponse> cleanCart(
        com.example.cartProto.CartProto.CartRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCleanCartMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.cartProto.CartProto.Response> addInCart(
        com.example.cartProto.CartProto.Request request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddInCartMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.cartProto.CartProto.GetCartResponce> getCartOfUser(
        com.example.cartProto.CartProto.GetCartRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetCartOfUserMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.cartProto.CartProto.GetIdProductsResponse> getIdProducts(
        com.example.cartProto.CartProto.GetIdProductsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetIdProductsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.cartProto.CartProto.OrderResponce> getOrderOfUser(
        com.example.cartProto.CartProto.OrderRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetOrderOfUserMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.cartProto.CartProto.SetAddressResponce> setAddress(
        com.example.cartProto.CartProto.SetAddress request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetAddressMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.cartProto.CartProto.DeleteResponce> deleteByProductId(
        com.example.cartProto.CartProto.DeleteRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteByProductIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.cartProto.CartProto.takeStatisticResponce> getStatistic(
        com.example.cartProto.CartProto.takeStatisticRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetStatisticMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.cartProto.CartProto.ProductDeletedResponse> markProductAsUnavailable(
        com.example.cartProto.CartProto.ProductDeletedRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMarkProductAsUnavailableMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CLEAN_CART = 0;
  private static final int METHODID_ADD_IN_CART = 1;
  private static final int METHODID_GET_CART_OF_USER = 2;
  private static final int METHODID_GET_ID_PRODUCTS = 3;
  private static final int METHODID_GET_ORDER_OF_USER = 4;
  private static final int METHODID_SET_ADDRESS = 5;
  private static final int METHODID_DELETE_BY_PRODUCT_ID = 6;
  private static final int METHODID_GET_STATISTIC = 7;
  private static final int METHODID_MARK_PRODUCT_AS_UNAVAILABLE = 8;

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
        case METHODID_CLEAN_CART:
          serviceImpl.cleanCart((com.example.cartProto.CartProto.CartRequest) request,
              (io.grpc.stub.StreamObserver<com.example.cartProto.CartProto.CartResponse>) responseObserver);
          break;
        case METHODID_ADD_IN_CART:
          serviceImpl.addInCart((com.example.cartProto.CartProto.Request) request,
              (io.grpc.stub.StreamObserver<com.example.cartProto.CartProto.Response>) responseObserver);
          break;
        case METHODID_GET_CART_OF_USER:
          serviceImpl.getCartOfUser((com.example.cartProto.CartProto.GetCartRequest) request,
              (io.grpc.stub.StreamObserver<com.example.cartProto.CartProto.GetCartResponce>) responseObserver);
          break;
        case METHODID_GET_ID_PRODUCTS:
          serviceImpl.getIdProducts((com.example.cartProto.CartProto.GetIdProductsRequest) request,
              (io.grpc.stub.StreamObserver<com.example.cartProto.CartProto.GetIdProductsResponse>) responseObserver);
          break;
        case METHODID_GET_ORDER_OF_USER:
          serviceImpl.getOrderOfUser((com.example.cartProto.CartProto.OrderRequest) request,
              (io.grpc.stub.StreamObserver<com.example.cartProto.CartProto.OrderResponce>) responseObserver);
          break;
        case METHODID_SET_ADDRESS:
          serviceImpl.setAddress((com.example.cartProto.CartProto.SetAddress) request,
              (io.grpc.stub.StreamObserver<com.example.cartProto.CartProto.SetAddressResponce>) responseObserver);
          break;
        case METHODID_DELETE_BY_PRODUCT_ID:
          serviceImpl.deleteByProductId((com.example.cartProto.CartProto.DeleteRequest) request,
              (io.grpc.stub.StreamObserver<com.example.cartProto.CartProto.DeleteResponce>) responseObserver);
          break;
        case METHODID_GET_STATISTIC:
          serviceImpl.getStatistic((com.example.cartProto.CartProto.takeStatisticRequest) request,
              (io.grpc.stub.StreamObserver<com.example.cartProto.CartProto.takeStatisticResponce>) responseObserver);
          break;
        case METHODID_MARK_PRODUCT_AS_UNAVAILABLE:
          serviceImpl.markProductAsUnavailable((com.example.cartProto.CartProto.ProductDeletedRequest) request,
              (io.grpc.stub.StreamObserver<com.example.cartProto.CartProto.ProductDeletedResponse>) responseObserver);
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
          getCleanCartMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.example.cartProto.CartProto.CartRequest,
              com.example.cartProto.CartProto.CartResponse>(
                service, METHODID_CLEAN_CART)))
        .addMethod(
          getAddInCartMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.example.cartProto.CartProto.Request,
              com.example.cartProto.CartProto.Response>(
                service, METHODID_ADD_IN_CART)))
        .addMethod(
          getGetCartOfUserMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.example.cartProto.CartProto.GetCartRequest,
              com.example.cartProto.CartProto.GetCartResponce>(
                service, METHODID_GET_CART_OF_USER)))
        .addMethod(
          getGetIdProductsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.example.cartProto.CartProto.GetIdProductsRequest,
              com.example.cartProto.CartProto.GetIdProductsResponse>(
                service, METHODID_GET_ID_PRODUCTS)))
        .addMethod(
          getGetOrderOfUserMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.example.cartProto.CartProto.OrderRequest,
              com.example.cartProto.CartProto.OrderResponce>(
                service, METHODID_GET_ORDER_OF_USER)))
        .addMethod(
          getSetAddressMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.example.cartProto.CartProto.SetAddress,
              com.example.cartProto.CartProto.SetAddressResponce>(
                service, METHODID_SET_ADDRESS)))
        .addMethod(
          getDeleteByProductIdMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.example.cartProto.CartProto.DeleteRequest,
              com.example.cartProto.CartProto.DeleteResponce>(
                service, METHODID_DELETE_BY_PRODUCT_ID)))
        .addMethod(
          getGetStatisticMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.example.cartProto.CartProto.takeStatisticRequest,
              com.example.cartProto.CartProto.takeStatisticResponce>(
                service, METHODID_GET_STATISTIC)))
        .addMethod(
          getMarkProductAsUnavailableMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.example.cartProto.CartProto.ProductDeletedRequest,
              com.example.cartProto.CartProto.ProductDeletedResponse>(
                service, METHODID_MARK_PRODUCT_AS_UNAVAILABLE)))
        .build();
  }

  private static abstract class CartGRPCServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CartGRPCServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.example.cartProto.CartProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CartGRPCService");
    }
  }

  private static final class CartGRPCServiceFileDescriptorSupplier
      extends CartGRPCServiceBaseDescriptorSupplier {
    CartGRPCServiceFileDescriptorSupplier() {}
  }

  private static final class CartGRPCServiceMethodDescriptorSupplier
      extends CartGRPCServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    CartGRPCServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (CartGRPCServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CartGRPCServiceFileDescriptorSupplier())
              .addMethod(getCleanCartMethod())
              .addMethod(getAddInCartMethod())
              .addMethod(getGetCartOfUserMethod())
              .addMethod(getGetIdProductsMethod())
              .addMethod(getGetOrderOfUserMethod())
              .addMethod(getSetAddressMethod())
              .addMethod(getDeleteByProductIdMethod())
              .addMethod(getGetStatisticMethod())
              .addMethod(getMarkProductAsUnavailableMethod())
              .build();
        }
      }
    }
    return result;
  }
}
