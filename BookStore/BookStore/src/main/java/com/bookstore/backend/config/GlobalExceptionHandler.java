package com.bookstore.backend.config;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author: world
 * @date: 2022/7/29 15:13
 * @description: 全局异常处理
 */
@RestControllerAdvice
public class GlobalExceptionHandler {

    // 全局捕获RuntimeException异常处理
    @ExceptionHandler(RuntimeException.class)
    public Object runtimeException(RuntimeException runtimeException){
        return runtimeException.getMessage();
    }
}
