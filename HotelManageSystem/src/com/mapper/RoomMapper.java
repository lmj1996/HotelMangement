package com.mapper;

import com.pojo.Room;
import com.pojo.RoomExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoomMapper {
    int countByExample(RoomExample example);

    int deleteByExample(RoomExample example);

    int deleteByPrimaryKey(String roomId);

    int insert(Room record);

    int insertSelective(Room record);

    List<Room> selectByExample(RoomExample example);

    Room selectByPrimaryKey(String roomId);

    int updateByExampleSelective(@Param("record") Room record, @Param("example") RoomExample example);

    int updateByExample(@Param("record") Room record, @Param("example") RoomExample example);

    int updateByPrimaryKeySelective(Room record);

    int updateByPrimaryKey(Room record);
    
    Room selectByNum(String roomNum);
    
    String getMaxNumber(String roomFloor);

	String getOneMaxNumber(String roomFloor);

	String getTwoMaxNumber(String roomFloor);

	List<Room> getRoomByFloor(String roomFloor);
	
	List<Room> selectByExampleForPaging(RoomExample example);

	String getRoomIdByType(String type);

	List<String> getRoomType();
}