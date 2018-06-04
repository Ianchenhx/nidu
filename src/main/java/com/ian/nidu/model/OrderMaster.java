package com.ian.nidu.model;

import com.ian.nidu.base.BaseEntity;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;

/**
 * @author ian
 * @description 订单主表
 * @createTime 20180527 21:41
 */
@Entity
@Table(name = "nidu_product_info")
@Data
public class OrderMaster extends BaseEntity{

    private String buyerName;

    private String buyerPhone;

    private String buyerAddress;

    private String buyerOpenId;

    private BigDecimal orderAmount;

    private Integer orderStatus;

    private Integer payStatus;
}