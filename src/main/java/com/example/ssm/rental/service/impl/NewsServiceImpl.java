package com.example.ssm.rental.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.ssm.rental.entity.News;
import com.example.ssm.rental.mapper.NewsMapper;
import com.example.ssm.rental.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * @author 言曌
 * @date 2021/3/13 2:22 下午
 */

@Service
public class NewsServiceImpl implements NewsService {

    @Autowired
    private NewsMapper newsMapper;

    @Override
    public BaseMapper<News> getRepository() {
        return newsMapper;
    }

    @Override
    public QueryWrapper<News> getQueryWrapper(News news) {
        //对指定字段查询
        QueryWrapper<News> queryWrapper = new QueryWrapper<>();
        if (news != null) {
            
        }
        return queryWrapper;
    }

    @Override
    public QueryWrapper<News> getQueryWrapper(Map<String, Object> condition) {
        return null;
    }
}
