package com.example.ssm.rental.common.enums;

/**
 * 用户角色枚举
 * @author 言曌
 * @date 2021/3/13 2:29 下午
 */

public enum UserRoleEnum {
    /**
     * 管理员
     */
    ADMIN("admin"),

    /**
     * 房东
     */
    OWNER("owner"),

    /**
     * 租客
     */
    CUSTOMER("customer"),


    ;

    private String value;

    UserRoleEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
