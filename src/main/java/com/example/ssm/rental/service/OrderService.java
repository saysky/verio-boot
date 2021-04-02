package com.example.ssm.rental.service;

import com.example.ssm.rental.common.base.BaseService;
import com.example.ssm.rental.entity.Order;

import java.util.List;

/**
 * 订单服务接口
 *
 * @author 言曌
 * @date 2021/3/13 1:26 下午
 */

public interface OrderService extends BaseService<Order, Long> {

    /**
     * 查询当前有效订单
     *
     * @param houseId
     * @return
     */
    Order getCurrentEffectiveOrder(Long houseId);

    /**
     * 查询已经到期的订单
     * @return
     */
    List<Order> findOverDueOrderList();
}
