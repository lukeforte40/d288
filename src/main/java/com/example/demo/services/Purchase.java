package com.example.demo.services;

import com.example.demo.entities.Cart;
import com.example.demo.entities.CartItem;
import com.example.demo.entities.Customer;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Set;

@Getter
@Setter
public class Purchase {
    @Autowired
    private Customer customer;
    @Autowired
    private Cart cart;
    @Autowired
    private Set<CartItem> cartItems;
}