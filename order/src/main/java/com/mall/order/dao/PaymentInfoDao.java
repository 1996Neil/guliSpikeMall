package com.mall.order.dao;

import com.mall.order.entity.PaymentInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 支付信息表
 * 
 * @author Neil
 * @email wangzhecoc@gmail.com
 * @date 2021-08-27 18:30:12
 */
@Mapper
public interface PaymentInfoDao extends BaseMapper<PaymentInfoEntity> {
	
}
