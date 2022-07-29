package com.bookstore.backend.model.entity;

import lombok.Data;

import java.util.Date;

/**
 * @author: world
 * @date: 2022/7/29 15:40
 * @description: Demo表的实体信息
 */
@Data
public class Demo {
    private Long id;
    private String message;
    private Date createTime;
}
