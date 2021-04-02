package com.example.ssm.rental.common.constant;

/**
 * 常量类
 *
 * @author 言曌
 * @date 2021/3/13 3:38 下午
 */

public class Constant {
    /**
     * 上传目录
     */
    public static final String UPLOADS_PATH = System.getProperties().getProperty("user.home") + "/sens/uploads/";


    /**
     * 用户SESSION的key
     */
    public static final String SESSION_USER_KEY = "user";

    /**
     * 首页显示房子数量
     */
    public static final Integer INDEX_HOUSE_NUM = 6;

    /**
     * 最小租住天数
     */
    public static final Integer MIN_RENT_DAYS = 7;


    /**
     * 图片Session前缀
     */
    public static final String SESSION_IMG_PREFIX = "SESSION_IMG_";
}
