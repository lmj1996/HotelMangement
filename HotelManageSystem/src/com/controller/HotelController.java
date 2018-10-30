package com.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.DTO.RoomDTO;
import com.pojo.Customer;
import com.pojo.HotelRegister;
import com.pojo.Room;
import com.service.HotelService;

@Controller

@RequestMapping("/hotle")
public class HotelController {
	@Resource(name="hotelService")
	private HotelService hotelService;
	
	
	private Room room;
	private Customer customer;
	private HotelRegister hotelRegister;
	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public HotelRegister getHotelRegister() {
		return hotelRegister;
	}

	public void setHotelRegister(HotelRegister hotelRegister) {
		this.hotelRegister = hotelRegister;
	}

	//查询所有房间
	@RequestMapping(value="/queryAllRoom")
	public ModelAndView queryAllRoom() {
		ModelAndView mv = new ModelAndView();
		try {
			List<RoomDTO> var = hotelService.findAllRoom();
			mv.setViewName("abc/index");
			mv.addObject("var",var);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return mv;
		
	}
	
	//添加房间
	@RequestMapping(value="/addRoom")
	public String addRoom(Room room) {
		String add = hotelService.addRoom(room);
		if(add.equals("success")) {
			System.out.println("添加成功");
			return "success";
		}else {
			System.out.println("添加失败");
		return null;
		}
	}
	
	//更新房间信息
	@RequestMapping(value="/updateRoom")
	public String updateRoom(Room room) {
		String update = hotelService.updateRoom(room);
		if(update.equals("success")) {
			System.out.println("更新成功");
			return "success";
		}else {
			System.out.println("更新失败");
		return null;
		}
	}
	
	//顾客住宿登记
	@RequestMapping(value="/customerStayOverNight")
	public String customerStayOverNight(Room room,Customer customer,HotelRegister hotelRegister) {
		String son = hotelService.customerStayOverNight(room,customer,hotelRegister);
		
		return null;
	}
	
}
