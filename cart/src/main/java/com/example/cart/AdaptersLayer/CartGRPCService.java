package com.example.cart.AdaptersLayer;

import java.util.List;
import java.util.Map;

import org.hibernate.annotations.DialectOverride.OverridesAnnotation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.cart.ApplicationLayer.Cart.CartService;
import com.example.cart.ApplicationLayer.Cart.DTO.AddProduct;
import com.example.cartProto.CartGRPCServiceGrpc.CartGRPCServiceImplBase;
import com.example.cartProto.CartProto.CartRequest;
import com.example.cartProto.CartProto.CartResponse;
import com.example.cartProto.CartProto.DeleteRequest;
import com.example.cartProto.CartProto.DeleteResponce;
import com.example.cartProto.CartProto.GetCartRequest;
import com.example.cartProto.CartProto.GetCartResponce;
import com.example.cartProto.CartProto.GetIdProductsRequest;
import com.example.cartProto.CartProto.GetIdProductsResponse;
import com.example.cartProto.CartProto.ItemCart;
import com.example.cartProto.CartProto.OrderRequest;
import com.example.cartProto.CartProto.OrderResponce;
import com.example.cartProto.CartProto.ProductAndQuantity;
import com.example.cartProto.CartProto.Request;
import com.example.cartProto.CartProto.Response;
import com.example.cartProto.CartProto.SetAddress;
import com.example.cartProto.CartProto.SetAddressResponce;
import com.example.cartProto.CartProto.orderOfUesr;
import com.example.cartProto.CartProto.takeStatisticRequest;
import com.example.cartProto.CartProto.takeStatisticResponce;

import io.grpc.stub.StreamObserver;

@Service
public class CartGRPCService extends CartGRPCServiceImplBase {

    @Autowired
    private CartService cartService;

    @Override
    public void cleanCart(CartRequest request, StreamObserver<CartResponse> responseObserver) {
    
        List<Long> idProducts = request.getIdProductList();
        System.out.println(" Product size  "+idProducts.size());
        Long userId = request.getUserId();
        String resultMessage = cartService.cleanCart(idProducts, userId);

        CartResponse response = CartResponse.newBuilder()
                .setResult(resultMessage)
                .build();

            
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void addInCart(Request request, StreamObserver<Response> responseObserver){
            Response.Builder res = Response.newBuilder();
            AddProduct added = new AddProduct(request.getIdUser() , request.getIdProduct(), request.getQuantity());
            String answer = cartService.addItemToCart(added);
            res.setResult(answer);
            res.build();

             responseObserver.onNext(res.build());
             responseObserver.onCompleted();

    }

    @Override
    public void getCartOfUser(GetCartRequest request, StreamObserver<GetCartResponce> responce){
            // GetCartResponce.Builder res = GetCartResponce.newBuilder();
            // List<ItemCart> items = cartService.getItemsInCart(request.getUserId());
            // System.out.println("Items cart   "+items.size());
            // responce.onNext(res.addAllItems(items).build());
            // responce.onCompleted();
    }

    // @Override
    // public void getIdProducts(GetIdProductsRequest request, StreamObserver<GetIdProductsResponse> responce ){
    //     List<ProductAndQuantity> productId = cartService.getProductsId(request.getUserId());

    //     GetIdProductsResponse resp = GetIdProductsResponse.newBuilder()
    //     .addAllProducts(productId)
    //     .build();

    //     responce.onNext(resp);
    //     responce.onCompleted();
    // }

    // @Override
    // public void getOrderOfUser(OrderRequest request, StreamObserver<OrderResponce> responce){
    //     Long userId = request.getUserId();
    //     List<orderOfUesr> orders = cartService.getOrdersOfUser(userId);

    //     OrderResponce result = OrderResponce.newBuilder()
    //     .addAllOrders(orders)
    //     .build();

    //     responce.onNext(result);
    //     responce.onCompleted();
    // }

   

    // @Override
    // public void deleteByProductId(DeleteRequest request, StreamObserver<DeleteResponce> responce){
    //     String answer = cartService.removeItemFromCart(request.getProductId(), userId);
    //     DeleteResponce result = DeleteResponce.newBuilder().setAnswer(answer).build();
    //     responce.onNext(result);
    //     responce.onCompleted();
    // }

   
}


