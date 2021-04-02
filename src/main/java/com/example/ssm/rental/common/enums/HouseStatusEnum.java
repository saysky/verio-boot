package com.example.ssm.rental.common.enums;

/**
 * 房子状态枚举
 *
 * @author 言曌
 * @date 2021/3/13 2:29 下午
 */

public enum HouseStatusEnum {
    /**
     * 已上架，未出租，审核通过
     */
    NOT_RENT(1),

    /**
     * 已租出
     */
    HAS_RENT(0),

    /**
     * 已下架
     */
    HAS_DOWN(-1),

    /**
     * 待审核
     */
    NOT_CHECK(-2),
    /**
     * 审核拒绝
     */
    CHECK_REJECT(-3);

    private Integer value;

    HouseStatusEnum(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }
}
