package com.example.ssm.rental.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.ssm.rental.entity.House;
import com.example.ssm.rental.entity.Mark;
import com.example.ssm.rental.mapper.MarkMapper;
import com.example.ssm.rental.service.MarkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @author 言曌
 * @date 2021/3/13 2:22 下午
 */

@Service
public class MarkServiceImpl implements MarkService {

    @Autowired
    private MarkMapper markMapper;

    @Override
    public BaseMapper<Mark> getRepository() {
        return markMapper;
    }

    @Override
    public QueryWrapper<Mark> getQueryWrapper(Mark mark) {
        QueryWrapper<Mark> queryWrapper = new QueryWrapper();
        if (mark != null) {
            if (mark.getUserId() != null) {
                queryWrapper.eq("user_id", mark.getUserId());
            }
            if (mark.getHouseId() != null) {
                queryWrapper.eq("house_id", mark.getHouseId());
            }
        }
        return queryWrapper;
    }

    @Override
    public QueryWrapper<Mark> getQueryWrapper(Map<String, Object> condition) {
        return null;
    }

    @Override
    public List<Mark> findByUserIdAndHouseId(Long userId, Long houseId) {
        QueryWrapper<Mark> queryWrapper = new QueryWrapper();
        queryWrapper.eq("user_id", userId);
        queryWrapper.eq("house_id", houseId);
        return markMapper.selectList(queryWrapper);
    }
}
