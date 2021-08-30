package com.mall.member.feign;

import com.mall.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author wangzhe
 * @version 1.0
 * @ClassName CouponFeignService
 * @create 2021-08-28 0:26
 * @description  FeignClient表明是远程客户端
 */
@FeignClient("coupon")
public interface CouponFeignService {

    @RequestMapping("/coupon/coupon/member/list")
    public R memberCoupons();
}
