package com.example.ssm.rental.service;

import com.example.ssm.rental.common.base.BaseService;
import com.example.ssm.rental.entity.Mark;

import java.util.List;

/**
 * 收藏服务接口
 *
 * @author 言曌
 * @date 2021/3/13 1:26 下午
 */

public interface MarkService extends BaseService<Mark, Long> {

    /**
     * 根据用户ID和房子ID查询，查询该用户是否已经收藏过该房子
     *
     * @param userId
     * @param houseId
     * @return
     */
    List<Mark> findByUserIdAndHouseId(Long userId, Long houseId);
}
