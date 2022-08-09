package com.example.demo.entity;

import java.util.Date;

public class Order {
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    private Integer orderId;

    private Integer bookId;
    private String bookName;
    private Date time;

    private Integer userId;
    private String userName;

    private Double orderprice;

    private Integer stateofpay;

    private Integer orderstate;
    private Integer wldhDate;
    private String zffsDate;
    private String ddlxDate;
    private Integer sjhmDate;
    private  Integer yzbmDate;
    private String sptpDate;
    private  String shdzDate;
    private String spmcDate;
    private Integer slDate;
    private Integer yfDate;

    public Integer getWldhDate() {
        return wldhDate;
    }

    public void setWldhDate(Integer wldhDate) {
        this.wldhDate = wldhDate;
    }

    public String getZffsDate() {
        return zffsDate;
    }

    public void setZffsDate(String zffsDate) {
        this.zffsDate = zffsDate;
    }

    public String getDdlxDate() {
        return ddlxDate;
    }

    public void setDdlxDate(String ddlxDate) {
        this.ddlxDate = ddlxDate;
    }

    public Integer getSjhmDate() {
        return sjhmDate;
    }

    public void setSjhmDate(Integer sjhmDate) {
        this.sjhmDate = sjhmDate;
    }

    public Integer getYzbmDate() {
        return yzbmDate;
    }

    public void setYzbmDate(Integer yzbmDate) {
        this.yzbmDate = yzbmDate;
    }

    public String getSptpDate() {
        return sptpDate;
    }

    public void setSptpDate(String sptpDate) {
        this.sptpDate = sptpDate;
    }

    public String getShdzDate() {
        return shdzDate;
    }

    public void setShdzDate(String shdzDate) {
        this.shdzDate = shdzDate;
    }

    public String getSpmcDate() {
        return spmcDate;
    }

    public void setSpmcDate(String spmcDate) {
        this.spmcDate = spmcDate;
    }

    public Integer getSlDate() {
        return slDate;
    }

    public void setSlDate(Integer slDate) {
        this.slDate = slDate;
    }

    public Integer getYfDate() {
        return yfDate;
    }

    public void setYfDate(Integer yfDate) {
        this.yfDate = yfDate;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

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