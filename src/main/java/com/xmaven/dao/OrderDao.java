package com.xmaven.dao;

import com.xmaven.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author: zhaos
 * @date: 2021/1/5
 */
public interface OrderDao extends JpaRepository<Order,Long> {

}
