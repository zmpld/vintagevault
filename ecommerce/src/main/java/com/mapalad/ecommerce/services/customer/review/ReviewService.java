package com.mapalad.ecommerce.services.customer.review;

import com.mapalad.ecommerce.dto.OrderedProductsResponseDto;
import com.mapalad.ecommerce.dto.ReviewDto;

import java.io.IOException;

public interface ReviewService {

    OrderedProductsResponseDto getOrderedProductsDetailsByOrderId(Long orderId);
    ReviewDto giveReview(ReviewDto reviewDto) throws IOException;

}
