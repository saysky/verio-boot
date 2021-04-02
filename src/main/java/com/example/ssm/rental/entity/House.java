package com.example.ssm.rental.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.example.ssm.rental.common.base.BaseEntity;
import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * 房子信息
 *
 * @author 言曌
 * @date 2021/3/13 12:11 下午
 */
@Data
@TableName("t_house")
public class House extends BaseEntity {

    /**
     * 发布用户ID，房东用户ID
     */
    private Long userId;

    /**
     * 出租类型：整租whole/ 合租share
     */
    private String rentType;

    /**
     * 名称
     */
    private String title;


    /**
     * 详细介绍
     */
    private String content;

    /**
     * 城市名称
     */
    private String city;

    /**
     * 详细地址信息
     */
    private String address;

    /**
     * 缩略图URL
     */
    private String thumbnailUrl;

    /**
     * 幻灯片URL
     */
    private String slideUrl;

    /**
     * 月租金
     */
    private Integer monthRent;

    /**
     * 状态: 0未租出，1已租出，,-1已下架,-2待审核，-3审核驳回
     */
    private Integer status;

    /**
     * 房产证编号
     */
    private String certificateNo;

    /**
     * 卫生间数量
     */
    private Integer toiletNum;

    /**
     * 厨房数量
     */
    private Integer kitchenNum;

    /**
     * 客厅数量
     */
    private Integer livingRoomNum;

    /**
     * 卧室数量
     */
    private Integer bedroomNum;

    /**
     * 是否有空调，1是，0否
     */
    private Integer hasAirConditioner;

    /**
     * 面积
     */
    private Double area;

    /**
     * 楼层
     */
    private Integer floor;

    /**
     * 最高楼层
     */
    private Integer maxFloor;

    /**
     * 是否有电梯，1是，0否
     */
    private Integer hasElevator;

    /**
     * 建成年份
     */
    private Integer buildYear;

    /**
     * 方向
     */
    private String direction;

    /**
     * 开始时间
     */
    private Date lastOrderStartTime;

    /**
     * 结束时间
     */
    private Date lastOrderEndTime;

    /**
     * 经纬度
     */
    private String longitudeLatitude;

    /**
     * 联系人姓名
     */
    private String contactName;

    /**
     * 联系人电话
     */
    private String contactPhone;

    /**
     * 房东用户
     */
    @TableField(exist = false)
    private User ownerUser;

    /**
     * 轮播图列表
     */
    @TableField(exist = false)
    private List<String> slideImgList;

    /**
     * 当前订单
     */
    @TableField(exist = false)
    private Order currentOrder;

    /**
     * 合租房子
     */
    @TableField(exist = false)
    private List<House> shareHouseList;

}
