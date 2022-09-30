package com.io.orders.mapper;

import com.io.orders.dto.OrderDto;
import com.io.orders.models.Order;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface OrderMapper {
     OrderMapper INSTANCE = Mappers.getMapper(OrderMapper.class);
     OrderDto modelToDto(Order order);
     Order dtoTomodel(OrderDto orderDto);

}
