package com.example.ssm.rental.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.ssm.rental.common.base.BaseService;
import com.example.ssm.rental.common.vo.HouseSearchVO;
import com.example.ssm.rental.entity.House;

import java.util.List;


/**
 * 房子服务接口
 *
 * @author 言曌
 * @date 2021/3/13 1:26 下午
 */

public interface HouseService extends BaseService<House, Long> {

    /**
     * 获得最新的n条房子信息
     *
     * @param rentType
     * @param limit
     * @return
     */
    List<House> findTopList(String rentType, Integer limit);

    /**
     * 获得房子分页数据
     *
     * @param houseSearchVO
     * @param page
     * @return
     */
    Page<House> getHousePage(HouseSearchVO houseSearchVO, Page<House> page);

    /**
     * 根据用户ID和房产编号查询合租房子
     *
     * @param userId
     * @param certificateNo
     * @param rentType
     * @return
     */
    List<House> findByUserIdAndCertificateNoAndRentType(Long userId, String certificateNo, String rentType);


}
