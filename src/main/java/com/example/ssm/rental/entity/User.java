package com.example.ssm.rental.entity;

import com.baomidou.mybatisplus.annotation.*;
import com.example.ssm.rental.common.base.BaseEntity;
import lombok.Data;

import java.util.Date;


/**
 * 用户信息
 *
 * @author 言曌
 * @date 2021/3/13 12:08 下午
 */
@Data
@TableName("t_user")
public class User extends BaseEntity {

    /**
     * 登录名
     */
    private String userName;

    /**
     * 姓名称
     */
    private String userDisplayName;

    /**
     * 密码
     */
    private String userPass;

    /**
     * 身份证号码
     */
    private String idCard;

    /**
     * 头像
     */
    private String userAvatar;

    /**
     * 说明
     */
    private String userDesc;

    /**
     * 0 正常
     * 1 禁用
     */
    private Integer status = 0;

    /**
     * 电子邮箱
     */
    private String email;

    /**
     * 手机号
     */
    private String phone;

    /**
     * 职业
     */
    private String job;

    /**
     * 业余爱好
     */
    private String hobby;

    /**
     * 性别
     */
    private String sex;

    /**
     * 角色：管理员admin/房东owner/租客customer
     */
    private String role;


}
