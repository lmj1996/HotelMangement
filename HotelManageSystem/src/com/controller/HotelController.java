package com.controller;

import java.util.List;

import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.DTO.*;
import com.VO.*;
import com.pojo.Customer;
import com.pojo.HotelRegister;
import com.pojo.Room;
import com.service.HotelService;

@Controller

@RequestMapping("/hotel")
public class HotelController {
	@Resource(name="hotelService")
	private HotelService hotelService;
	
	private int page=1;
	

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	//查询所有房间
	@RequestMapping(value="/queryAllRoom")
	public ModelAndView queryAllRoom() {
		ModelAndView mv = new ModelAndView();
		try {
			List<RoomDTO> listRoomDTO = hotelService.findAllRoom();
			mv.setViewName("room/room_list");
			mv.addObject("listRoomDTO",listRoomDTO);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return mv;
		
	}
	
	//查询所有房间
		@RequestMapping(value="/getAllRoom")
		public ModelAndView getAllRoom(RoomVO roomVO) {
			roomVO.setPageIndex(page);
			System.out.println("page:"+page);
			ModelAndView mv = new ModelAndView();
			try {
				RoomVO getRoomVO = hotelService.queryAllRoom(roomVO);
				mv.setViewName("room/room_list");
				mv.addObject("getRoomVO",getRoomVO);
			} catch (Exception e) {
				e.printStackTrace();
			}
			return mv;
			
		}
	
	//添加房间
	@RequestMapping(value="/addRoom")
	public ModelAndView addRoom(Room room) {
		ModelAndView modelAndView = new ModelAndView();
		String add = hotelService.addRoom(room);
		if(add.equals("success")) {
			System.out.println("添加成功");
			modelAndView.setViewName("redirect:queryAllRoom");
			return modelAndView;
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
