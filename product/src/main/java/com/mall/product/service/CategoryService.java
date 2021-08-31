package com.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mall.common.utils.PageUtils;
import com.mall.product.entity.CategoryEntity;

import java.util.List;
import java.util.Map;

/**
 * 商品三级分类
 *
 * @author Neil
 * @email wangzhecoc@gmail.com
 * @date 2021-08-27 15:00:33
 */
public interface CategoryService extends IService<CategoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
    /**
     * 按照父子结构列出所有数据
     * @Date 16:28 2021/8/30
     * @return  java.util.List<com.mall.product.entity.CategoryEntity>
     **/
    List<CategoryEntity> listWithTree();

    void removeMenuByIds(List<Long> asList);
}

