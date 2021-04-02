package com.example.ssm.rental.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.ssm.rental.entity.Feedback;
import org.apache.ibatis.annotations.Mapper;

/**
 * 反馈mapper
 *
 * @author 言曌
 * @date 2021/3/13 1:25 下午
 */
@Mapper
public interface FeedbackMapper extends BaseMapper<Feedback> {
}
