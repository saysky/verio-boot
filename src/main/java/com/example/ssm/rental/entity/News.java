package com.example.ssm.rental.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.example.ssm.rental.common.base.BaseEntity;
import lombok.Data;

/**
 * 新闻资讯
 *
 * @author 言曌
 * @date 2021/3/13 12:16 下午
 */
@Data
@TableName("t_news")
public class News extends BaseEntity {

    /**
     * 标题
     */
    private String title;

    /**
     * 内容
     */
    private String content;

    /**
     * 摘要
     */
    private String summary;
}
