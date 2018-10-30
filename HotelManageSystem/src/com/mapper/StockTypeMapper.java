package com.mapper;

import com.pojo.StockType;
import com.pojo.StockTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StockTypeMapper {
    int countByExample(StockTypeExample example);

    int deleteByExample(StockTypeExample example);

    int deleteByPrimaryKey(String stockTypeId);

    int insert(StockType record);

    int insertSelective(StockType record);

    List<StockType> selectByExample(StockTypeExample example);

    StockType selectByPrimaryKey(String stockTypeId);

    int updateByExampleSelective(@Param("record") StockType record, @Param("example") StockTypeExample example);

    int updateByExample(@Param("record") StockType record, @Param("example") StockTypeExample example);

    int updateByPrimaryKeySelective(StockType record);

    int updateByPrimaryKey(StockType record);
}