package com.mapper;

import com.pojo.StockReceive;
import com.pojo.StockReceiveExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StockReceiveMapper {
    int countByExample(StockReceiveExample example);

    int deleteByExample(StockReceiveExample example);

    int deleteByPrimaryKey(String stockReceiveId);

    int insert(StockReceive record);

    int insertSelective(StockReceive record);

    List<StockReceive> selectByExample(StockReceiveExample example);

    StockReceive selectByPrimaryKey(String stockReceiveId);

    int updateByExampleSelective(@Param("record") StockReceive record, @Param("example") StockReceiveExample example);

    int updateByExample(@Param("record") StockReceive record, @Param("example") StockReceiveExample example);

    int updateByPrimaryKeySelective(StockReceive record);

    int updateByPrimaryKey(StockReceive record);
}