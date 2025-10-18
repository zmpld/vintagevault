package com.mapalad.ecommerce.services.admin.coupon;

import com.mapalad.ecommerce.entity.Coupon;
import com.mapalad.ecommerce.exceptions.ValidationException;
import com.mapalad.ecommerce.repository.CouponRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class AdminCouponServiceImpl implements AdminCouponService {

    private final CouponRepository couponRepository;

    public Coupon createCoupon(Coupon coupon) {
        if (couponRepository.existsByCode(coupon.getCode())) {
            throw new ValidationException("Coupon code already exists.");
        }
        return couponRepository.save(coupon);
    }

    public List<Coupon> getAllCoupons() {
        return couponRepository.findAll();
    }

    public AdminCouponServiceImpl(CouponRepository couponRepository) {
        this.couponRepository = couponRepository;
    }
}
