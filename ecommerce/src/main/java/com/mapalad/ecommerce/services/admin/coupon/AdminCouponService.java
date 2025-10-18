package com.mapalad.ecommerce.services.admin.coupon;

import com.mapalad.ecommerce.entity.Coupon;

import java.util.List;

public interface AdminCouponService {

    Coupon createCoupon(Coupon coupon);

    List<Coupon> getAllCoupons();
}
