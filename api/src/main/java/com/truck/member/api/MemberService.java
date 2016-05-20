package com.truck.member.api;


import com.truck.member.api.errors.MemberErrorCodes;
import com.truck.member.api.response.CouponInfo;
import com.truck.utils.gateway.utils.annotation.ApiGroup;
import com.truck.utils.gateway.utils.annotation.ApiParameter;
import com.truck.utils.gateway.utils.annotation.DesignedErrorCode;
import com.truck.utils.gateway.utils.annotation.HttpApi;
import com.truck.utils.gateway.utils.define.SecurityType;
import com.truck.utils.gateway.utils.entity.ServiceException;

/**
 * 会员服务
 * Created by truck on 2015/12/29.
 */
@ApiGroup(minCode = 40000, maxCode = 41000, name = "member", owner = "kfj", codeDefine = MemberErrorCodes.class)
public interface MemberService {

    /**
     * 获取会员信息
     *
     * @return
     * @throws ServiceException
     */
    @HttpApi(name = "member.info", desc = "获取优惠券信息", security = SecurityType.UserLogin, owner = "kfj")
    @DesignedErrorCode({
            MemberErrorCodes.MEMBER_COUPON_FAILED})
    public CouponInfo info( @ApiParameter(required = false, name = "id", desc = "优惠编号") long id) throws ServiceException;

}