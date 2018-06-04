package com.ian.nidu.model;

import com.ian.nidu.base.BaseEntity;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;

/**
 * @description 商品实体类
 * @createTime 20180526 19:45
 * @author ian
 */
@Entity
@Table(name = "nidu_product_info")
@Data
public class ProductInfo extends BaseEntity{

    /**
     * 商品名字
     */
    private String productName;

    /**
     * 商品状态
     */
    private Integer productStatus;

    /**
     *商品价格
     */
    private BigDecimal productPrice;

    /**
     * 商品库存
     */
    private Integer productStock;

    /**
     * 商品描述
     */
    private String productDescription;

    /**
     * 商品图片
     */
    private String product_icon;

}