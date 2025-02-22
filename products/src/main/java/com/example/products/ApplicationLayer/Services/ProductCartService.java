package com.example.products.ApplicationLayer.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.cartProto.Cart.GetProducts;
import com.example.cartProto.Cart.ProductListItem;
import com.example.cartProto.Cart.ProductListRequest;
import com.example.cartProto.ProductServiceGrpc.ProductServiceImplBase;
import io.grpc.stub.StreamObserver;

@Service
public class ProductCartService extends ProductServiceImplBase{
    @Autowired
    private ProductsService productsService;

    @Override
    public void getProductById(ProductListRequest request, StreamObserver<GetProducts> responce ){
        GetProducts.Builder resp = GetProducts.newBuilder();
        List<ProductListItem> result = productsService.getProductsById(request.getProductIdList());
        responce.onNext(resp.addAllItems(result).build());
        responce.onCompleted();
    }
    
}
