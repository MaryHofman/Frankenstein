package com.example.getaway.Cart.Application;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.time.LocalDate;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import com.example.getaway.ApplicationLayer.DTO.OrderItemsGRPCDTO;
import com.example.getaway.ApplicationLayer.DTO.OrderOfUserDTO;
import com.example.getaway.Cart.Application.DTO.in.AddProductInCart;
import com.example.getaway.Cart.Application.DTO.in.GetCartDTO;
import com.example.getaway.Cart.Application.DTO.out.CartItem;
import com.example.getaway.Products.Application.DTO.out.AddProductInCartOut;

import reactor.core.publisher.Mono;




@Service
public class CartService {

    @Autowired
    private  WebClient webClientSecurity;

    @Autowired
    private  WebClient webClientCart;



    // @Autowired
    // private  CartGRPCServiceGrpc.CartGRPCServiceBlockingStub blockingStub;


    // public void cleanCart(long userId) {
    //     CartRequest request = CartRequest.newBuilder()
    //             .setUserId(userId)
    //             .build();

    //     CartResponse response = blockingStub.cleanCart(request);
    //     System.out.println("Clean cart result: " + response.getResult());
    // }

    

    public Mono<String> addInCart(AddProductInCart product, String accessToken) {
        return webClientSecurity.get()  
                .uri("/api/security/user/id")
                .header("Authorization",accessToken)
                .retrieve()
                .bodyToMono(String.class)  
                .flatMap(responseFromFirstApi -> {
                    try {
                        Long userId = Long.parseLong(responseFromFirstApi);
                        System.out.println("userId  "+userId);
                        AddProductInCartOut result = new AddProductInCartOut(product.getProductId(), userId, product.getQuantity());

                        return webClientCart.post()  
                                .uri("/api/add")
                                .bodyValue(result) 
                                .retrieve()
                                .bodyToMono(String.class);  
                    } catch (NumberFormatException e) {
                        return Mono.error(new RuntimeException("Invalid userId received from first API"));
                    }
                });
    }
    


    // public List<GetCartDTO> getCartById(Long userId){

    //     GetCartRequest.Builder cart = GetCartRequest.newBuilder();
    //     cart.setUserId(userId);
    //     GetCartRequest request = cart.build();
    //     GetCartResponce response = blockingStub.getCartOfUser(request);
    //     List<ItemCart> itemsCart = response.getItemsList();
    //     List<GetCartDTO> result = new ArrayList<>();

    //     for(ItemCart item : itemsCart){
    //         GetCartDTO cartDTO = new GetCartDTO();
    //         cartDTO.initializeCart(item.getProduct().getId(), item.getProduct().getListImage(), item.getProduct().getName(), 
    //         item.getProduct().getPrice(), item.getProduct().getType(), item.getProduct().getQuantity());
    //         cartDTO.setPrice(item.getPrice());
    //         cartDTO.setQuantity(item.getQuantity());
    //         result.add(cartDTO);
    //     }

    //     return result;

    // }


    // public List<ProductAndQuantity> getUserCartProductsId(Long userId) {
    //     GetIdProductsRequest user = GetIdProductsRequest.newBuilder()
    //     .setUserId(userId)
    //     .build();
    //     GetIdProductsResponse responce = blockingStub.getIdProducts(user);
    //     return responce.getProductsList();
    // }

    // public List<OrderOfUserDTO> getOrdersOfUser(Long userId){
    //     OrderRequest request = OrderRequest.newBuilder()
    //     .setUserId(userId)
    //     .build();
    //     OrderResponce result = blockingStub.getOrderOfUser(request);

    //     List<OrderOfUserDTO> orders = new ArrayList<>();

    //     for (orderOfUesr order : result.getOrdersList()) {
    //         List<OrderItemsGRPCDTO> itemsDTO = order.getItemsList().stream()
    //                 .map(item -> new OrderItemsGRPCDTO(
    //                         item.getProductId(),
    //                         item.getName(),
    //                         item.getType(),
    //                         item.getPrice(),
    //                         item.getPhoto()
    //                 ))
    //                 .collect(Collectors.toList());

    //         OrderOfUserDTO orderDTO = new OrderOfUserDTO(
    //                 order.getOrderId(),
    //                 itemsDTO,
    //                 order.getSum()
    //         );
    
       
    //         orders.add(orderDTO);
    //     }
    
    //     return orders;

    // }


    public Mono<?> deleteByProductId(String accessToken, Long id) {
        
        return webClientSecurity.get()  
                .uri("/api/security/user/id")
                .header("Authorization",accessToken)
                .retrieve()
                .bodyToMono(String.class)  
                .flatMap(responseFromFirstApi -> {
                    try {
                        Long userId = Long.parseLong(responseFromFirstApi);
                
                        
                        return webClientCart.delete()  
                                .uri("/api/delete/{userId}/items/{productId}", userId,id)
                                .retrieve()
                                .bodyToMono(String.class);  
                    } catch (NumberFormatException e) {
                        return Mono.error(new RuntimeException("Invalid userId  from first API"));
                    }
                });
    }



    public Mono<?> updateItemQuantity(String accessToken, Long productId, int quantity) {

        return webClientSecurity.get()  
                .uri("/api/security/user/id")
                .header("Authorization",accessToken)
                .retrieve()
                .bodyToMono(String.class)  
                .flatMap(responseFromFirstApi -> {
                    try {
                        Long userId = Long.parseLong(responseFromFirstApi);
                             
                        return webClientCart.put()
                            .uri(uriBuilder -> uriBuilder
                                    .path("/api/items/{productId}")
                                    .queryParam("quantity", quantity)
                                    .build(productId))
                            .retrieve()
                            .bodyToMono(String.class);  
                    } catch (NumberFormatException e) {
                        return Mono.error(new RuntimeException("Invalid userId  from first API"));
                    }
                });
    }



    public Mono<List<CartItem>> getItemsInCart(String accessToken) {
        return webClientSecurity.get()  
                .uri("/api/security/user/id")
                .header("Authorization", accessToken)
                .retrieve()
                .bodyToMono(String.class)  
                .flatMap(responseFromFirstApi -> {
                    try {
                        Long userId = Long.parseLong(responseFromFirstApi); 
                        return webClientCart.get()
                                .uri(uriBuilder -> uriBuilder
                                        .path("/api/{userId}/items")  
                                        .build(userId))
                                .retrieve()
                                .bodyToFlux(CartItem.class)  
                                .collectList();      
                    } catch (NumberFormatException e) {
                        return Mono.error(new RuntimeException("Invalid userId from first API"));
                    }
                });
    }



    public Mono<String> deleteCart(String accesssToken) {

        return webClientSecurity.get()  
                .uri("/api/security/user/id")
                .header("Authorization", accesssToken)
                .retrieve()
                .bodyToMono(String.class)  
                .flatMap(responseFromFirstApi -> {
                    try {
                        Long userId = Long.parseLong(responseFromFirstApi); 
                        return webClientCart.delete()
                                .uri(uriBuilder -> uriBuilder
                                        .path("/api/delete/{userId}")  
                                        .build(userId))
                                .retrieve()
                                .bodyToMono(String.class);     
                    } catch (NumberFormatException e) {
                        return Mono.error(new RuntimeException("Invalid userId from first API"));
                    }
                });
    }
    
    


   
}

