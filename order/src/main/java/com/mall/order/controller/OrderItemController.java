package com.mall.order.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mall.order.entity.OrderItemEntity;
import com.mall.order.service.OrderItemService;
import com.mall.common.utils.PageUtils;
import com.mall.common.utils.R;



/**
 * 订单项信息
 *
 * @author Neil
 * @email wangzhecoc@gmail.com
 * @date 2021-08-27 18:30:12
 */
@RestController
@RequestMapping("order/orderitem")
public class OrderItemController {
    @Autowired
    private OrderItemService orderItemService;

    /**
     * 列表
     */
    @RequestMapping("/list")
        public R list(@RequestParam Map<String, Object> params){
        PageUtils page = orderItemService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
        public R info(@PathVariable("id") Long id){
		OrderItemEntity orderItem = orderItemService.getById(id);

        return R.ok().put("orderItem", orderItem);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
        public R save(@RequestBody OrderItemEntity orderItem){
		orderItemService.save(orderItem);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
        public R update(@RequestBody OrderItemEntity orderItem){
		orderItemService.updateById(orderItem);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
        public R delete(@RequestBody Long[] ids){
		orderItemService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
