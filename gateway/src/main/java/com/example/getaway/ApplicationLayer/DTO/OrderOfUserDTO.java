package com.example.getaway.ApplicationLayer.DTO;

import java.util.List;

public class OrderOfUserDTO {
    private Long orderId;
    private List<OrderItemsGRPCDTO> items;
    private String sum;


    public OrderOfUserDTO() {
    }

    public OrderOfUserDTO(Long orderId, List<OrderItemsGRPCDTO> items, String sum) {
        this.orderId = orderId;
        this.items = items;
        this.sum = sum;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public List<OrderItemsGRPCDTO> getItems() {
        return items;
    }

    public void setItems(List<OrderItemsGRPCDTO> items) {
        this.items = items;
    }

    public String getSum() {
        return sum;
    }

    public void setSum(String sum) {
        this.sum = sum;
    }
}
