package com.truck.member.components;

import com.alibaba.dubbo.config.annotation.Service;
import com.truck.base.entities.member.SalCoupon;
import com.truck.base.logics.member.SalCouponLogic;
import com.truck.member.api.MemberService;
import com.truck.member.api.response.CouponInfo;
import com.truck.utils.gateway.utils.annotation.ApiParameter;
import com.truck.utils.gateway.utils.define.Version;
import com.truck.utils.gateway.utils.entity.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2016-04-25.
 */
@Component
@Service(version = Version.LATEST)
public class MemberComponents implements MemberService {

    @Autowired
    private SalCouponLogic salCouponLogic;

    @Override
    public CouponInfo info(@ApiParameter(required = false, name = "id", desc = "优惠编号") long id) throws ServiceException {
        SalCoupon salCoupon = salCouponLogic.getSalCouponById(id);
        CouponInfo couponInfo = new CouponInfo();
        if(salCoupon != null){
            couponInfo.setId(Long.parseLong(salCoupon.getOldId()));
            couponInfo.setRuleCode(salCoupon.getRuleCode());
        }
        return couponInfo;
    }
}
