package com.example.getaway.ApplicationLayer.DTO;

import java.util.List;


import java.util.List;

public class PrepareForOrderDTO {

    private List<Long> notAvailible;
    private List<Long> availible;
    private String orderId;
    private String sum;

    public PrepareForOrderDTO() {
    }

    public List<Long> getNotAvailible() {
        return notAvailible;
    }

    public void setNotAvailible(List<Long> notAvailible) {
        this.notAvailible = notAvailible;
    }

    public List<Long> getAvailible() {
        return availible;
    }

    public void setAvailible(List<Long> availible) {
        this.availible = availible;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getSum() {
        return sum;
    }

    public void setSum(String sum) {
        this.sum = sum;
    }
}


