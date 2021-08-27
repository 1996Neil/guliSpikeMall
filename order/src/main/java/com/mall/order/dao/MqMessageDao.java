package com.mall.order.dao;

import com.mall.order.entity.MqMessageEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * 
 * @author Neil
 * @email wangzhecoc@gmail.com
 * @date 2021-08-27 18:30:12
 */
@Mapper
public interface MqMessageDao extends BaseMapper<MqMessageEntity> {
	
}
