package com.test;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
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
import com.util.TimeCount;
import com.util.TimeUtil;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring/applicationContext-dao.xml",
		"classpath:spring/applicationContext-service.xml" })

public class TestFile {
	@Resource(name = "hotelService")
	private HotelService hotelService;

	@Resource(name = "staffService")
	private StaffService staffService;

	@Test
	public void addRoom() {
		Room room = new Room();
		room.setRoomType("单人间");
		room.setRoomPrice("50");
		room.setRoomFloor("12");
		//String staffId = "1";
		String s = hotelService.addRoom(room);
		System.out.println(s);
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
		for (int i = 0; i <= 10; i++) {
			Staff staff = new Staff();
			staff.setStaffName("Andy" + i);
			staff.setStaffSex("男");
			staff.setStaffIdnumber("65164" + i);
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

	@Test
	public void time() {
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM");
		Date d = new Date();
		String d1 = formatter.format(d);
//		String d2 = "2018-12-01";
//		String d3 = "01 : 10";
//		d3 = d3.replace(" ", "");
//		d2 = d2 + " " + d3;
//		d2 = d2 + ":00";
//		long e = TimeCount.getHours(d1, d2);
//		System.out.println(e);
//		int a = -1;
//		a = (-a);
		System.out.println(d1);
	}

	@Test
	public void count() {
		// double s = 0.3d;
		// int a = 300;
		// double count = Double.valueOf(s * a);
		// a = (int) count;
		int a = 1500;
		int b = 2;
		b = 10 - b;
		a = a * b / 10;
		System.out.println(a);
	}

}
