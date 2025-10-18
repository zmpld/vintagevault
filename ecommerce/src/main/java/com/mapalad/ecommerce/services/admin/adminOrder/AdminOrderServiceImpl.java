package com.mapalad.ecommerce.services.admin.adminOrder;

import com.mapalad.ecommerce.dto.OrderDto;
import com.mapalad.ecommerce.entity.Order;
import com.mapalad.ecommerce.enums.OrderStatus;
import com.mapalad.ecommerce.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service

public class AdminOrderServiceImpl implements AdminOrderService{

    private final OrderRepository orderRepository;

    public List<OrderDto> getAllPlacedOrders(){

        List<Order> orderList = orderRepository.
                findAllByOrderStatusIn(List.of(OrderStatus.Placed, OrderStatus.Shipped, OrderStatus.Delivered));

            return orderList.stream().map(Order::getOrderDto).collect(Collectors.toList());

    }

    public AdminOrderServiceImpl(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }
}
