package com.mapalad.ecommerce.services.customer.wishlist;

import com.mapalad.ecommerce.dto.WishlistDto;
import com.mapalad.ecommerce.entity.Product;
import com.mapalad.ecommerce.entity.User;
import com.mapalad.ecommerce.entity.Wishlist;
import com.mapalad.ecommerce.repository.ProductRepository;
import com.mapalad.ecommerce.repository.UserRepository;
import com.mapalad.ecommerce.repository.WishlistRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service

public class WishlistServiceImpl implements WishlistService{

    private final UserRepository userRepository;
    private final ProductRepository productRepository;
    private final WishlistRepository wishlistRepository;


    public WishlistDto addProductToWishlist(WishlistDto wishlistDto){
        Optional<Product> optionalProduct = productRepository.findById(wishlistDto.getProductId());
        Optional<User> optionalUser = userRepository.findById(wishlistDto.getUserId());

        if(optionalProduct.isPresent() && optionalUser.isPresent()){
            Wishlist wishlist = new Wishlist();
            wishlist.setProduct(optionalProduct.get());
            wishlist.setUser(optionalUser.get());

            return wishlistRepository.save(wishlist).getWishlistDto();
        }
        return null;
    }

    public List<WishlistDto> getWishlistByUserId(Long userId){
        return wishlistRepository.findAllByUserId(userId).stream().map(Wishlist::getWishlistDto).collect(Collectors.toList());
    }



    public WishlistServiceImpl(UserRepository userRepository, ProductRepository productRepository, WishlistRepository wishlistRepository) {
        this.userRepository = userRepository;
        this.productRepository = productRepository;
        this.wishlistRepository = wishlistRepository;
    }
}
