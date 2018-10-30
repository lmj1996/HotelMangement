package com.mapper;

import com.pojo.ReceptionStock;
import com.pojo.ReceptionStockExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReceptionStockMapper {
    int countByExample(ReceptionStockExample example);

    int deleteByExample(ReceptionStockExample example);

    int deleteByPrimaryKey(String receptionStockId);

    int insert(ReceptionStock record);

    int insertSelective(ReceptionStock record);

    List<ReceptionStock> selectByExample(ReceptionStockExample example);

    ReceptionStock selectByPrimaryKey(String receptionStockId);

    int updateByExampleSelective(@Param("record") ReceptionStock record, @Param("example") ReceptionStockExample example);

    int updateByExample(@Param("record") ReceptionStock record, @Param("example") ReceptionStockExample example);

    int updateByPrimaryKeySelective(ReceptionStock record);

    int updateByPrimaryKey(ReceptionStock record);
}