package com.ian.nidu.enums;

import lombok.Getter;

/**
 * @author ian
 * @description 商品状态枚举类
 * @createTime 20180527 22:05
 */
@Getter
public enum ProductStatusEnum {

    /**
     * 已下架
     */
   DOWNLINE(0,"已下架"),

    /**
     * 在售
     */
    ONLINE(0,"已下架");


    private Integer code;

    private String message;

    ProductStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}