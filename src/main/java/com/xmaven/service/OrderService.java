package com.xmaven.service;

import com.xmaven.model.Order;
import com.xmaven.util.PageQuery;

import java.util.List;
import java.util.Optional;

/**
 * @author: zhaos
 * @date: 2021/1/5
 */
public interface OrderService {

    void save(Order order);

    Optional<Order> findById(Long id);

    List<Order> findAll();

    void deleteById(Long id);

    List<Order> findByPage(PageQuery query);

}
