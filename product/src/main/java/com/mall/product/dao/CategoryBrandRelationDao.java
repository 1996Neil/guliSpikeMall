package com.mall.product.dao;

import com.mall.product.entity.CategoryBrandRelationEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 品牌分类关联
 * 
 * @author Neil
 * @email wangzhecoc@gmail.com
 * @date 2021-08-27 15:00:33
 */
@Mapper
public interface CategoryBrandRelationDao extends BaseMapper<CategoryBrandRelationEntity> {
	
}
