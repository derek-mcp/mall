package com.derek.mall.member.feign;

import com.derek.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

@Service
@FeignClient("coupon-server")
public interface CouponFeignService {

    @RequestMapping("/coupon/coupon/member/list")
    public R memberCoupons();
}
