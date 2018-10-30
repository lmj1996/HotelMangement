package com.mapper;

import com.pojo.AddConsumption;
import com.pojo.AddConsumptionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AddConsumptionMapper {
    int countByExample(AddConsumptionExample example);

    int deleteByExample(AddConsumptionExample example);

    int deleteByPrimaryKey(String addConsumptionId);

    int insert(AddConsumption record);

    int insertSelective(AddConsumption record);

    List<AddConsumption> selectByExample(AddConsumptionExample example);

    AddConsumption selectByPrimaryKey(String addConsumptionId);

    int updateByExampleSelective(@Param("record") AddConsumption record, @Param("example") AddConsumptionExample example);

    int updateByExample(@Param("record") AddConsumption record, @Param("example") AddConsumptionExample example);

    int updateByPrimaryKeySelective(AddConsumption record);

    int updateByPrimaryKey(AddConsumption record);
}