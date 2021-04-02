package com.example.ssm.rental.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.ssm.rental.entity.User;
import com.example.ssm.rental.mapper.UserMapper;
import com.example.ssm.rental.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * @author 言曌
 * @date 2021/3/13 2:22 下午
 */

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public BaseMapper<User> getRepository() {
        return userMapper;
    }

    @Override
    public QueryWrapper<User> getQueryWrapper(User user) {
        return null;
    }

    @Override
    public QueryWrapper<User> getQueryWrapper(Map<String, Object> condition) {
        return null;
    }

    @Override
    public User findByUserName(String userName) {
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.eq("user_name", userName);
        return userMapper.selectOne(queryWrapper);
    }
}
