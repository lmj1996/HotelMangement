package com.mapper;

import com.pojo.KitchenStock;
import com.pojo.KitchenStockExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface KitchenStockMapper {
    int countByExample(KitchenStockExample example);

    int deleteByExample(KitchenStockExample example);

    int deleteByPrimaryKey(String kitchenStockId);

    int insert(KitchenStock record);

    int insertSelective(KitchenStock record);

    List<KitchenStock> selectByExample(KitchenStockExample example);

    KitchenStock selectByPrimaryKey(String kitchenStockId);

    int updateByExampleSelective(@Param("record") KitchenStock record, @Param("example") KitchenStockExample example);

    int updateByExample(@Param("record") KitchenStock record, @Param("example") KitchenStockExample example);

    int updateByPrimaryKeySelective(KitchenStock record);

    int updateByPrimaryKey(KitchenStock record);
}