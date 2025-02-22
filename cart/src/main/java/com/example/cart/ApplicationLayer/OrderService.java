package com.example.cart.ApplicationLayer;

import java.lang.reflect.Executable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.cart.InfrastructureLayer.Entityes.Orders.Order;
import com.example.cart.InfrastructureLayer.Entityes.Orders.OrderItem;
import com.example.cart.InfrastructureLayer.Entityes.Orders.Order.OrderStatus;
import com.example.cart.InfrastructureLayer.Repositoryes.OrderItemRepository;
import com.example.cart.InfrastructureLayer.Repositoryes.OrderRepository;

import jakarta.transaction.Transactional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;
    @Autowired
    private OrderItemRepository orderItemRepository;

    @Transactional
    public void createOrder(Long userId, Map<Long, Integer> productsId){
        Order newOrder = new Order(userId, OrderStatus.PENDING, LocalDateTime.now());
        orderRepository.save(newOrder);

        List<OrderItem> orderItems = new ArrayList<>();
        
        for(Map.Entry<Long, Integer> items : productsId.entrySet()){
           OrderItem  newOrderItems = new OrderItem(items.getKey(), items.getValue(), newOrder);
           orderItemRepository.save(newOrderItems);
           orderItems.add(newOrderItems);
        }

        newOrder.setOrderItems(orderItems);
        orderRepository.save(newOrder);

    }
}
