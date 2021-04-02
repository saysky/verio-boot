package com.example.ssm.rental.common.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * 查询封装类
 * @author 言曌
 * @date 2019-08-16 13:45
 */
@Data
public class QueryCondition<T> implements Serializable {

    /**
     * 根据字段筛选
     */
    private T data;


    public QueryCondition() {
    }

    public QueryCondition(T data) {
        this.data = data;
    }

}
