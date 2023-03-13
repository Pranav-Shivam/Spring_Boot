package com.pranav.OrderService.service;

import com.pranav.OrderService.dto.OrderListItemsDto;
import com.pranav.OrderService.dto.OrderRequest;
import com.pranav.OrderService.model.Order;
import com.pranav.OrderService.model.OrderLineItem;
import com.pranav.OrderService.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
@Transactional
public class OrderService {
    private final OrderRepository orderRepository;

    public void placeOrder(OrderRequest orderRequest) {
        Order order = new Order();
        order.setOrderNumber(UUID.randomUUID().toString());
        List<OrderLineItem> orderLineItems = orderRequest.getOrderListItemsDtoList().
                stream().map(this::mapToDto).toList();
        order.setOrderLineItems(orderLineItems);
        orderRepository.save(order);
    }

    private OrderLineItem mapToDto(OrderListItemsDto orderListItemsDto) {
        OrderLineItem orderLineItem = new OrderLineItem();
        orderLineItem.setPrice(orderListItemsDto.getPrice());
        orderLineItem.setQuantity(orderListItemsDto.getQuantity());
        orderLineItem.setSkuCode(orderListItemsDto.getSkuCode());
        return orderLineItem;
    }
}
