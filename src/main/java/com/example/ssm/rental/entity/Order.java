package com.example.ssm.rental.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.example.ssm.rental.common.base.BaseEntity;
import lombok.Data;

import java.util.Date;

/**
 * 订单信息
 *
 * @author 言曌
 * @date 2021/3/13 12:29 下午
 */
@Data
@TableName("t_order")
public class Order extends BaseEntity {

    /**
     * 订单状态：-2待签合同，-1待付款，0生效中，1已到期，-3已取消，2申请退租，3申请退租不通过
     */
    private Integer status;

    /**
     * 租客用户ID
     */
    private Long customerUserId;

    /**
     * 房东用户ID
     */
    private Long ownerUserId;

    /**
     * 房子ID
     */
    private Long houseId;

    /**
     * 月租金
     */
    private Integer monthRent;

    /**
     * 租住天数
     */
    private Integer dayNum;

    /**
     * 总金额
     */
    private Integer totalAmount;

    /**
     * 开始日期
     */
    private Date startDate;

    /**
     * 结束日期
     */
    private Date endDate;

    /**
     * 房子信息
     */
    @TableField(exist = false)
    private House house;


    /**
     * 租客用户信息
     */
    @TableField(exist = false)
    private User customerUser;


    /**
     * 房东用户信息
     */
    @TableField(exist = false)
    private User ownerUser;
}
