package com.ian.nidu.base;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.*;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @description Service实现类基类
 * @createTime 20180504 22:53
 * @author ian
 */
public class BaseServiceImpl<T extends BaseEntity,ID extends Serializable> implements  BaseService<T,ID>{

    @Autowired
    private BaseDao<T,ID> baseDao;

    @Transactional
    @Override
    public T save(T entity) {
        if(entity.getId() == null || entity.getId().equals("")) {
            entity.setId(null);
            entity.setCreateDate(new Date());
        }
        return baseDao.save(entity);
    }

    @Transactional
    @Override
    public void delete(ID id) {
        baseDao.delete(id);
    }

    @Transactional
    @Override
    public void delete(ID[] ids) {
        for(ID id:ids){
            baseDao.delete(id);
        }
    }

    @Override
    public T getById(ID id) {
        return baseDao.findOne(id);
    }

    @Override
    public List<T> getAllList() {
        return baseDao.findAll();
    }

    @Override
    public Page<T> getPage(T entity, Sort sort, int pageSize, int pageNum) {
        //创建匹配器，即如何使用查询条件
        ExampleMatcher matcher = ExampleMatcher.matching() //构建对象
                .withMatcher("name", ExampleMatcher.GenericPropertyMatchers.startsWith()) //姓名采用“开始匹配”的方式查询
                .withIgnorePaths("focus");  //忽略属性：是否关注。因为是基本类型，需要忽略掉
        //创建实例
        Example<T> ex = Example.of(entity, matcher);
        Pageable pageable = new PageRequest((pageNum-1)*pageSize, pageSize, sort);
        return baseDao.findAll(ex,pageable);
    }
}
