package com.example.ssm.rental.service;

import com.example.ssm.rental.common.base.BaseService;
import com.example.ssm.rental.entity.User;

/**
 * 用户服务接口
 *
 * @author 言曌
 * @date 2021/3/13 1:26 下午
 */

public interface UserService extends BaseService<User, Long> {

    /**
     * 根据用户名查询用户
     *
     * @param userName
     * @return
     */
    User findByUserName(String userName);
}
