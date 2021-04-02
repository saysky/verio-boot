package com.example.ssm.rental.common.enums;

/**
 * 反馈状态 0 待处理，1已处理
 *
 * @author 言曌
 * @date 2021/3/13 4:07 下午
 */

public enum FeedbackStatusEnum {

    /**
     * 待处理
     */
    NOT_HANDLE(0),

    /**
     * 已处理
     */
    HAS_HANDLE(1),

    ;

    private Integer value;

    FeedbackStatusEnum(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }
}