package com.example.ssm.rental.common.enums;

/**
 * 用户状态枚举
 *
 * @author 言曌
 * @date 2021/3/14 12:51 下午
 */

public enum UserStatusEnum {

    /**
     * 正常
     */
    ENABLE(0),

    /**
     * 禁用
     */
    DISABLE(1),


    ;

    private Integer value;

    UserStatusEnum(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }
}
