package com.ian.nidu.base;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;

import java.io.Serializable;
import java.util.List;

/**
 * @description Service层基础接口
 * @createTime 20180504 22:53
 * @author ian
 */
public interface BaseService<T extends BaseEntity,ID extends Serializable> {

    /**
     * 新增或更新
     * @param entity
     */
    public T save(T entity);

    /**
     * 删除
     * @param id
     */
    public void delete(ID id);

    /**
     * 批量删除
     * @param ids
     */
    public void delete(ID ids[]);

    /**
     * 根据id获取实体
     * @param id
     * @return
     */
    public T getById(ID id);

    /**
     * 获取所有实体列表
     * @return
     */
    public List<T> getAllList();

    /**
     * 分页查询
     * @param entity
     * @param sort
     * @param pageSize
     * @param pageNum
     * @return
     */
    public Page<T> getPage(T entity, Sort sort, int pageSize, int pageNum);
}
