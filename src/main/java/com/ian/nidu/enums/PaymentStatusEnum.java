package com.ian.nidu.enums;

import lombok.Getter;

/**
 * @author ian
 * @description 商品状态枚举类
 * @createTime 20180527 22:05
 */
@Getter
public enum PaymentStatusEnum {

    /**
     * 已下架
     */
   WAIT(0,"等待支付"),

    /**
     * 在售
     */
    SUCCESS(1,"支付成功");


    private Integer code;

    private String message;

    PaymentStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}