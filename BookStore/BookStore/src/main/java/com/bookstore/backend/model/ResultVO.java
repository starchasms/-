package com.bookstore.backend.model;

import com.bookstore.backend.model.enums.ApiCode;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: world
 * @date: 2022/7/29 15:14
 * @description: 请求返回类封装
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResultVO<T> {
    private Integer code;

    private String message;

    private T data;

    public ResultVO(ApiCode apiCode, T data){
        this.code = apiCode.getCode();
        this.message = apiCode.getMessage();
        this.data = data;
    }

    public static <T> ResultVO<T> success(T data) {
        return new ResultVO<>(ApiCode.OK,data);
    }

    public static <T> ResultVO<T> success(String message,T data){
        return new ResultVO<>(ApiCode.OK.getCode(),message,data);
    }

    public static <T> ResultVO<T> error(String message){
        return new ResultVO<>(ApiCode.Failed.getCode(),message,null);
    }

    public static <T> ResultVO<T> error(ApiCode apiCode){
        return new ResultVO<>(apiCode,null);
    }

    /**
     * 自定义返回
     * @param code 状态码
     * @param message 返回的提示信息
     * @param data 返回的数据
     * @return JSON序列化后的实体类
     */
    public static <T> ResultVO<T> custom(Integer code,String message,T data){
        return new ResultVO<>(code,message,data);
    }
}
