package com.xmaven.model;

import lombok.Data;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.util.Date;

/**
 * @author: zhaos
 * @date: 2021/1/5
 */
@Data
@Entity
@Table(name = "orders")
@DynamicInsert
@DynamicUpdate
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private double price;

    @Column
    private String orderName;

    @Column(columnDefinition = "datetime default now()")
    private Date createTime;

    @Column(columnDefinition = "datetime default now()")
    private Date modifyTime;
}
