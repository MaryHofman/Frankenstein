package com.example.cart.AdaptersLayer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.cartProto.ProductServiceGrpc;
import com.example.cartProto.ProductServiceGrpc.ProductServiceImplBase;
import java.util.ArrayList;
import java.util.List;
import com.example.cartProto.Product.ProductListItem;
import com.example.cartProto.Product.ProductListRequest;
import com.example.cartProto.Product.GetProducts;;



@Service
public class ProductServiceForGRPC {

    @Autowired
    private ProductServiceGrpc.ProductServiceBlockingStub productService;

    public List<ProductListItem> getProductById(List<Long> productIds) {
        ProductListRequest request = ProductListRequest.newBuilder()
                .addAllProductId(productIds)
                .build();
        GetProducts response = productService.getProductById(request);
        List<ProductListItem> productListItems = new ArrayList<>();
        if (response.getItemsList() != null) {
            productListItems.addAll(response.getItemsList());
        }

        System.out.println("Get grpc result  "+productListItems.size());

        return productListItems;
    }
}
