package com.mapalad.ecommerce.services.customer.cart;

import com.mapalad.ecommerce.dto.AddProductInCartDto;
import com.mapalad.ecommerce.dto.OrderDto;
import org.springframework.http.ResponseEntity;

public interface CartService {

    ResponseEntity<?> addProductToCart(AddProductInCartDto addProductInCartDto);
    OrderDto getCartByUserId(Long userId);
}
