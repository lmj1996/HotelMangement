package com.test;

import java.util.List;

import javax.annotation.Resource;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.DTO.RoomDTO;
import com.pojo.*;
import com.service.*;
import com.util.TimeUtil;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring/applicationContext-dao.xml",
		"classpath:spring/applicationContext-service.xml" })

public class TestFile {
	@Resource(name="hotelService")
	private HotelService hotelService;
	
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
	
	
	
}
