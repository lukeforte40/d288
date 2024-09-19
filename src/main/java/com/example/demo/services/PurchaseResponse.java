package com.example.demo.services;

import lombok.Data;

@Data
public class PurchaseResponse {
    private final String orderTrackingNumber;

    // Fix me : is this necessary
    public PurchaseResponse(String orderTrackingNumber) {
        this.orderTrackingNumber = orderTrackingNumber;
    }
}
