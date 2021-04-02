package com.example.ssm.rental.common.util;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.commons.lang3.StringUtils;


/**
 * @author example
 */
public class PageUtil {

    /**
     * 最大分页大小
     */
    public static final int MAX_PAGE_SIZE = 100;

    public static Page initMpPage(long pageNumber, long pageSize) {
        return initMpPage(pageNumber, pageSize, "createTime", "desc");
    }

    /**
     * mybatis分页封装
     *
     * @param pageNumber 页码
     * @param pageSize   页大小
     * @param sort       排序字段
     * @param order      倒序/升序
     * @return
     */
    public static Page initMpPage(long pageNumber, long pageSize, String sort, String order) {

        Page p = null;
        if (StringUtils.isNotEmpty(sort)) {
            //驼峰法转下划线, createTime -> create_time
            sort = camelToUnderline(sort);
        }

        if (pageNumber < 1) {
            pageNumber = 1;
        }
        if (pageSize < 1) {
            pageSize = 10;
        }
        if (pageSize > MAX_PAGE_SIZE) {
            pageSize = MAX_PAGE_SIZE;
        }
        if (StringUtils.isNotEmpty(sort)) {
            Boolean isAsc = false;
            if (StringUtils.isNotEmpty(order)) {
                isAsc = false;
            } else {
                if ("desc".equals(order.toLowerCase())) {
                    isAsc = false;
                } else if ("asc".equals(order.toLowerCase())) {
                    isAsc = true;
                }
            }
            p = new Page(pageNumber, pageSize);
            if (isAsc) {
                p.setAsc(sort);
            } else {
                p.setDesc(sort);
            }
        } else {
            p = new Page(pageNumber, pageSize);
        }
        return p;
    }


    /**
     * 驼峰转下划线
     *
     * @param str
     * @return
     */
    private static String camelToUnderline(String str) {
        if (str == null || str.trim().isEmpty()) {
            return "";
        }
        int len = str.length();
        StringBuilder sb = new StringBuilder(len);
        sb.append(str.substring(0, 1).toLowerCase());
        for (int i = 1; i < len; i++) {
            char c = str.charAt(i);
            if (Character.isUpperCase(c)) {
                sb.append("_");
                sb.append(Character.toLowerCase(c));
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }


}
