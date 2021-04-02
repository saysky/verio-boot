package com.example.ssm.rental.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.example.ssm.rental.common.base.BaseEntity;
import lombok.Data;

/**
 * 反馈信息
 *
 * @author 言曌
 * @date 2021/3/13 12:17 下午
 */
@Data
@TableName("t_feedback")
public class Feedback extends BaseEntity {

    /**
     * 标题
     */
    private String title;

    /**
     * 内容
     */
    private String content;
    
    /**
     * 回复内容
     */
    private String reply;

    /**
     * 反馈用户ID
     */
    private Long userId;

    /**
     * 联系人姓名
     */
    private String contactName;

    /**
     * 联系人邮箱
     */
    private String contactEmail;

    /**
     * 状态：0待处理，1已处理
     */
    private Integer status;


}

