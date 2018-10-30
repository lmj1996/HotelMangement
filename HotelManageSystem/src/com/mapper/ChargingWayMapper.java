package com.mapper;

import com.pojo.ChargingWay;
import com.pojo.ChargingWayExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ChargingWayMapper {
    int countByExample(ChargingWayExample example);

    int deleteByExample(ChargingWayExample example);

    int deleteByPrimaryKey(String chargingWayId);

    int insert(ChargingWay record);

    int insertSelective(ChargingWay record);

    List<ChargingWay> selectByExample(ChargingWayExample example);

    ChargingWay selectByPrimaryKey(String chargingWayId);

    int updateByExampleSelective(@Param("record") ChargingWay record, @Param("example") ChargingWayExample example);

    int updateByExample(@Param("record") ChargingWay record, @Param("example") ChargingWayExample example);

    int updateByPrimaryKeySelective(ChargingWay record);

    int updateByPrimaryKey(ChargingWay record);
}