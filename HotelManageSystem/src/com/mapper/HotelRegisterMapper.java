package com.mapper;

import com.pojo.HotelRegister;
import com.pojo.HotelRegisterExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HotelRegisterMapper {
    int countByExample(HotelRegisterExample example);

    int deleteByExample(HotelRegisterExample example);

    int deleteByPrimaryKey(String hotelRegisterId);

    int insert(HotelRegister record);

    int insertSelective(HotelRegister record);

    List<HotelRegister> selectByExample(HotelRegisterExample example);

    HotelRegister selectByPrimaryKey(String hotelRegisterId);

    int updateByExampleSelective(@Param("record") HotelRegister record, @Param("example") HotelRegisterExample example);

    int updateByExample(@Param("record") HotelRegister record, @Param("example") HotelRegisterExample example);

    int updateByPrimaryKeySelective(HotelRegister record);

    int updateByPrimaryKey(HotelRegister record);
    
    HotelRegister selectByRoomId(String roomId);

}