package com.example.ssm.rental.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.ssm.rental.common.vo.HouseSearchVO;
import com.example.ssm.rental.entity.House;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.io.Serializable;
import java.util.List;

/**
 * 房子mapper
 *
 * @author 言曌
 * @date 2021/3/13 1:23 下午
 */
@Mapper
public interface HouseMapper extends BaseMapper<House> {


    /**
     * 获得最新的n条房子信息
     * 像这种比较简单的SQL，我们可以用注解的方式，直接在方法上写
     *
     * @param limit
     * @return
     */
    @Select("select * from t_house where status = 1 and rent_type = #{rentType} order by create_time desc limit #{limit}")
    List<House> findTopList(@Param("rentType") String rentType,
                            @Param("limit") Integer limit);

    /**
     * 搜索房子
     * 像这种比较复杂的SQL，我们最好写在XML里，HouseMapper.xml
     * 一个参数时，可以不写 @Param
     * 如果有2个参数，一定要写@param进行参数绑定
     *
     * @param houseSearchVO
     * @param page
     * @return
     */
    List<House> searchHouse(@Param("houseSearchVO") HouseSearchVO houseSearchVO,
                            @Param("page") Page page);


}
