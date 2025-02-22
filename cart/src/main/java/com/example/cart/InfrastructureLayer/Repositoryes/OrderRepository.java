package com.example.cart.InfrastructureLayer.Repositoryes;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.example.cart.InfrastructureLayer.Entityes.Orders.Order;
import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

    List<Order> findAllByUserId(Long userId);
    List<Order> findByStatus(Order.OrderStatus status);
    @Query("SELECT o FROM Order o WHERE o.createdDate BETWEEN :startDate AND :endDate")
    List<Order> findAllByCreatedDateBetween(LocalDateTime startDate, LocalDateTime endDate);

    
}
