package com.xmaven.test;

import com.xmaven.dao.OrderDao;
import com.xmaven.model.Order;
import com.xmaven.service.OrderService;
import com.xmaven.util.EntityUtils;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

/**
 * @author: zhaos
 * @date: 2021/1/5
 */
@SpringBootTest
public class OrderTest {

    @Autowired
    private OrderService orderService;

    @Autowired
    private OrderDao orderDao;

    @Test
    void saveTest() {
        Order order = new Order();
        order.setOrderName("衬衫");
        order.setPrice(66.6);
        orderService.save(order);
    }

    @Test
    void findByIdTest() {
        Optional<Order> orderOptional = orderService.findById(1L);
        Order order = EntityUtils.toData(orderOptional);
        System.out.println(order);
    }

    @Test
    void updateTest() {
        Order order = new Order();
        order.setId(1L);
        order.setPrice(77.7);
        orderService.save(order);
    }

    @Test
    void findOneTest() {
        Order order = orderDao.getOne(1L);
        System.out.println(order);
    }

    public static void main(String[] args) {
        System.out.println(8 & 0);
    }


}
