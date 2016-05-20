package com.truck.member.api.response;


import com.truck.utils.gateway.utils.annotation.Description;

import java.io.Serializable;

/**
 * Created by Arvin on 2016/3/4.
 */
@Description("用户账号是否被占用")
public class CouponInfo implements Serializable {

    @Description("编号")
    public long id;

    @Description("规则编码")
    public String ruleCode;

    public long getId() {
        return id;
    }

    public String getRuleCode() {
        return ruleCode;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setRuleCode(String ruleCode) {
        this.ruleCode = ruleCode;
    }
}
