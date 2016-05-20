package com.truck.member.api.errors;


import com.truck.utils.gateway.utils.entity.AbstractReturnCode;

/**
 * Created by truck on 2015/12/29.
 */
public class MemberErrorCodes extends AbstractReturnCode {
    public MemberErrorCodes(String desc, int code) {
        super(desc, code);
    }

    //获取优惠券   0-5
    public static final int MEMBER_COUPON_FAILED = 40001;
    public static final MemberErrorCodes errorCodes_MEMBER_COUPON_FAILED = new MemberErrorCodes("获取优惠券失败", MEMBER_COUPON_FAILED);

}
