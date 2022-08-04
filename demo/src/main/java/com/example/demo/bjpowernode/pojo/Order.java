package com.example.demo.bjpowernode.pojo;

import java.util.Date;

public class Order {
    private Integer orderId;

    private Integer bookId;

    private Date time;

    private Integer userId;

    private Double orderprice;

    private Integer stateofpay;

    private Integer orderstate;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Double getOrderprice() {
        return orderprice;
    }

    public void setOrderprice(Double orderprice) {
        this.orderprice = orderprice;
    }

    public Integer getStateofpay() {
        return stateofpay;
    }

    public void setStateofpay(Integer stateofpay) {
        this.stateofpay = stateofpay;
    }

    public Integer getOrderstate() {
        return orderstate;
    }

    public void setOrderstate(Integer orderstate) {
        this.orderstate = orderstate;
    }
}