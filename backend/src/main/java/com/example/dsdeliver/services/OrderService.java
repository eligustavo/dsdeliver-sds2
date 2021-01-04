package com.example.dsdeliver.services;

import com.example.dsdeliver.dto.OrderDTO;
import com.example.dsdeliver.dto.ProductDTO;
import com.example.dsdeliver.entities.Order;
import com.example.dsdeliver.entities.Product;
import com.example.dsdeliver.repositories.OrderRepository;
import com.example.dsdeliver.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class OrderService {

    @Autowired
    private OrderRepository repository;

    @Transactional(readOnly = true)
    public List<OrderDTO> findAll(){
       List<Order> list = repository.findOrdersWithProducts();
       return list.stream().map(x -> new OrderDTO(x))
               .collect(Collectors.toList());
    }

}
