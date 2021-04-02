package com.example.ssm.rental.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.ssm.rental.entity.Mark;
import org.apache.ibatis.annotations.Mapper;

/**
 * 收藏mapper
 * @author 言曌
 * @date 2021/3/13 1:24 下午
 */
@Mapper
public interface MarkMapper extends BaseMapper<Mark> {
}
