package com.mapalad.ecommerce.services.admin.adminOrder;

import com.mapalad.ecommerce.dto.AnalyticsResponse;
import com.mapalad.ecommerce.dto.OrderDto;

import java.util.List;

public interface AdminOrderService {

    List<OrderDto> getAllPlacedOrders();

    OrderDto changeOrderStatus(Long orderId, String status);

    AnalyticsResponse calculateAnalytics();
}
