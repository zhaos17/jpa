package com.xmaven.service.impl;

import com.xmaven.dao.OrderDao;
import com.xmaven.model.Order;
import com.xmaven.service.OrderService;
import com.xmaven.util.EntityUtils;
import com.xmaven.util.PageQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @author: zhaos
 * @date: 2021/1/5
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderDao orderDao;


    @Override
    public void save(Order order) {
        orderDao.save(order);
    }

    @Override
    public Optional<Order> findById(Long id) {
        return orderDao.findById(id);
    }

    @Override
    public List<Order> findAll() {
        return orderDao.findAll();
    }

    @Override
    public void deleteById(Long id) {
        orderDao.deleteById(id);
    }

    @Override
    public List<Order> findByPage(PageQuery query) {
        return orderDao.findAll(PageRequest.of(query.getPage(), query.getSize())).getContent();
    }
}
