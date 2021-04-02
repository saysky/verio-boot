package com.example.ssm.rental.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.example.ssm.rental.common.base.BaseEntity;
import lombok.Data;

/**
 * 收藏记录
 *
 * @author 言曌
 * @date 2021/3/13 12:14 下午
 */
@Data
@TableName("t_mark")
public class Mark extends BaseEntity {
    /**
     * 用户ID
     */
    private Long userId;

    /**
     * 房子ID
     */
    private Long houseId;

    /**
     * 房子信息
     */
    @TableField(exist = false)
    private House house;
}
