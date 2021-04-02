package com.example.ssm.rental.common.vo;

import lombok.Data;

/**
 * 房子搜索封装参数
 * 用于搜索
 *
 * @author 言曌
 * @date 2021/3/13 9:41 下午
 */
@Data
public class HouseSearchVO {

    /**
     * 页码，默认1
     */
    private Integer page = 1;

    /**
     * 页大小，默认6
     */
    private Integer size = 6;

    /**
     * 状态
     */
    private Integer status = 1;

    /**
     * 出租类型
     */
    private String rentType;
    /**
     * 城市关键字
     */
    private String city = "";
    /**
     * 地址关键字
     */
    private String address = "";
    /**
     * 面积范围，;分隔
     */
    private String areaRange = "0;150";
    /**
     * 价格范围，;分隔
     */
    private String priceRange = "0;10000";
    /**
     * 最大面积
     */
    private Integer minArea = 0;
    /**
     * 最小面积
     */
    private Integer maxArea = 150;
    /**
     * 最小价格
     */
    private Integer minPrice = 0;
    /**
     * 最大价格
     */
    private Integer maxPrice = 10000;


    /**
     * 获得分页前缀参数
     *
     * @return
     */
    public String getPagePrefix() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("?address=").append(this.address);
        stringBuilder.append("&rentType=").append(this.rentType);
        stringBuilder.append("&priceRange=").append(this.priceRange);
        stringBuilder.append("&areaRange=").append(this.areaRange);
        return stringBuilder.toString();
    }
}
