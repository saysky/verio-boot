package com.example.ssm.rental.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.ssm.rental.entity.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * 订单mapper
 *
 * @author 言曌
 * @date 2021/3/13 1:22 下午
 */
@Mapper
public interface OrderMapper extends BaseMapper<Order> {

    /**
     * 查询到期的订单
     *
     * @return
     */
    @Select("select * from t_order where status = 0 and  end_date < now()")
    List<Order> findOverDueOrderList();
}
