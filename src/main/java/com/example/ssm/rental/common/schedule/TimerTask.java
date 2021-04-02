package com.example.ssm.rental.common.schedule;

import com.example.ssm.rental.common.enums.HouseStatusEnum;
import com.example.ssm.rental.common.enums.OrderStatusEnum;
import com.example.ssm.rental.entity.House;
import com.example.ssm.rental.entity.Order;
import com.example.ssm.rental.service.HouseService;
import com.example.ssm.rental.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Objects;

/**
 * 定时器，定时更新超过2天的竞价为流拍
 *
 * @author 言曌
 * @date 2020/2/27 10:48 下午
 */
@Component
public class TimerTask {

    @Autowired
    private OrderService orderService;

    @Autowired
    private HouseService houseService;

    /**
     * 每分钟执行一次
     * 查询已经到期的订单，查询 t_order 表 end_date 字段大于系统时间 且 状态为已租出的
     */
    @Scheduled(cron = "0 */1 * * * ?")
    public void endOrderTimer() {
        List<Order> orderList = orderService.findOverDueOrderList();
        if (orderList == null || orderList.size() == 0) {
            return;
        }

        for (Order order : orderList) {
            try {
                // 更新订单状态为已退租
                order.setStatus(OrderStatusEnum.FINISH.getValue());
                orderService.update(order);

                // 更新房屋状态为未租出
                House house = houseService.get(order.getHouseId());
                if (house != null) {
                    if (!Objects.equals(house.getStatus(), HouseStatusEnum.HAS_RENT.getValue())) {
                        house.setStatus(HouseStatusEnum.NOT_RENT.getValue());
                        houseService.update(house);
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
