package com.example.ssm.rental.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.ssm.rental.entity.News;
import org.apache.ibatis.annotations.Mapper;

/**
 * 新闻mapper
 *
 * @author 言曌
 * @date 2021/3/13 1:22 下午
 */
@Mapper
public interface NewsMapper extends BaseMapper<News> {
}
