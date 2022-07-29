package com.bookstore.backend.model.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author: world
 * @date: 2022/7/29 15:26
 * @description: Api状态码枚举类
 */
@Getter
@AllArgsConstructor
public enum ApiCode {
    // 请求成功返回状态码
    OK(200,"请求成功"),
    Failed(400,"请求失败");

    private Integer code;

    private String message;

}
