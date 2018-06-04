package com.ian.nidu.model;

import com.ian.nidu.base.BaseEntity;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author ian
 * @description 用户类
 * @createTime 20180504 23:04
 */
@Entity
@Table(name = "nidu_user")
@Data
public class User extends BaseEntity{

    /**
     * 账号
     */
    private String account;

    /**
     * 密码
     */
    private String password;

    /**
     * 名字
     */
    private String name;

    /**
     * 地址
     */
    private String address;

}