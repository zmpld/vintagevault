package com.mapalad.ecommerce.services.customer.wishlist;

import com.mapalad.ecommerce.dto.WishlistDto;

import java.util.List;

public interface WishlistService {

    WishlistDto addProductToWishlist(WishlistDto wishlistDto);

    List<WishlistDto> getWishlistByUserId(Long userId);
}
