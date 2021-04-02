package com.example.ssm.rental.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.ssm.rental.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * 用户数据访问层
 *
 * @author 言曌
 * @date 2021/3/13 1:20 下午
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {


}
