package com.test;

import java.util.List;

import javax.annotation.Resource;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.DTO.RoomDTO;
import com.mapper.PositionMapper;
import com.pojo.*;
import com.service.*;
import com.util.TimeUtil;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring/applicationContext-dao.xml",
		"classpath:spring/applicationContext-service.xml" })

public class TestFile {
	@Resource(name="hotelService")
	private HotelService hotelService;
	
	@Resource(name="staffService")
	private StaffService staffService;
	
	@Test
	public void addRoom() {
		Room room = new Room();
		
		room.setRoomPrice("5600/天");
		room.setRoomFloor("2");
		room.setRoomType("总统套房");
		hotelService.addRoom(room);
		
	}
	
	
	
	@Test
	public void updateRoom() {
		String num = "ss002";
		String price = "399/天";
		Room room = new Room();
		room.setRoomId("716f0520-39da-4fd1-84b5-ac93b51e51b2");
		room.setRoomNum(num);
		room.setRoomPrice(price);
		room.setRoomFloor("1楼");
		room.setRoomType("双人间");
		hotelService.updateRoom(room);
	}
	
	@Test
	public void addStaff() {
		for(int i=0;i<=10;i++) {
			Staff staff = new Staff();
			staff.setStaffName("Andy"+i);
			staff.setStaffSex("男");
			staff.setStaffIdnumber("65164"+i);
			staffService.insertStaff(staff);
		}
		
	}
	
	@Test
	public void addPosition() {
		Position position = new Position();
		position.setPositionName("保洁员");
		position.setPositionLevel("5");
		staffService.addPosition(position);
	}
	
}
