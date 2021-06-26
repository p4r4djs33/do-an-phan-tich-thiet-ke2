package com.example.doanphantichthietke.service.cart;

import com.example.doanphantichthietke.model.Cart;
import com.example.doanphantichthietke.service.GeneralService;

import java.util.Optional;

public interface CartService extends GeneralService<Cart> {
    Iterable<Cart> findAllOrderByDate();
}
