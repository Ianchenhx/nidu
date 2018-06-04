package com.ian.nidu.enums;


import lombok.Getter;

/**
 * @author ian
 * @description 订单状态枚举类
 * @createTime 20180527 21:49
 */
@Getter
public enum OrderStatusEnum {
    /**
     * 未支付
     */
    ORDERED(0,"未支付"),
    /**
     * 未支付
     */
    PAYMENTED(1,"已支付"),
    /**
     * 未支付
     */
    DISPACTHED(2,"已发货"),
    /**
     * 未支付
     */
    FINISHED(3,"已完结"),
    /**
     * 未支付
     */
    CANCELED(4,"已取消"),
    /**
     * 未支付
     */
    COMPLAINT(5,"退货"),
    /**
     * 未支付
     */
    CHANGED(6,"换货");

    private Integer code;

    private String message;

    OrderStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}