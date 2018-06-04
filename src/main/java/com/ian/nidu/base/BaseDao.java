package com.ian.nidu.base;

import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;

/**
 * @description dao层基类
 * @createTime 20180504 22:53
 * @author ian
 */
public interface BaseDao <T extends BaseEntity,ID extends Serializable > extends JpaRepository<T,ID>{

}
