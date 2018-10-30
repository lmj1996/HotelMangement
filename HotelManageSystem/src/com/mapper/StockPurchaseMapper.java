package com.mapper;

import com.pojo.StockPurchase;
import com.pojo.StockPurchaseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StockPurchaseMapper {
    int countByExample(StockPurchaseExample example);

    int deleteByExample(StockPurchaseExample example);

    int deleteByPrimaryKey(String stockPurchaseId);

    int insert(StockPurchase record);

    int insertSelective(StockPurchase record);

    List<StockPurchase> selectByExample(StockPurchaseExample example);

    StockPurchase selectByPrimaryKey(String stockPurchaseId);

    int updateByExampleSelective(@Param("record") StockPurchase record, @Param("example") StockPurchaseExample example);

    int updateByExample(@Param("record") StockPurchase record, @Param("example") StockPurchaseExample example);

    int updateByPrimaryKeySelective(StockPurchase record);

    int updateByPrimaryKey(StockPurchase record);
}