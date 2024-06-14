package com.example.ssm.rental.common.enums;

/**
 * 订单状态枚举
 * 订单状态：-2待签合同，-1待付款，0生效中，1已到期，-3已取消，2申请退租，3申请退租不通过
 *
 * @author 言曌
 * @date 2021/3/13 4:07 下午
 */

public enum OrderStatusEnum {

    /**
     * 待签合同
     */
    NOT_AGREEMENT(-2),

    /**
     * 待付款
     */
    NOT_PAY(-1),


    /**
     * 生效中
     */
    NORMAL(0),

    /**
     * 已退租
     */
    FINISH(1),

    /**
     * 租户已取消
     */
    CUSTOMER_CANCEL(-3),


    /**
     * 退租申请
     */
    END_APPLY(2),

    /**
     * 退租申请不通过
     */
    END_APPLY_REJECT(3),


    ;

    private Integer value;

    OrderStatusEnum(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }
