package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;

public interface CheckoutService {
    PurchaseResponse placeOrder(Purchase purchase);
}
