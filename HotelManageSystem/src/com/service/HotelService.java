package com.service;

import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;

import com.DTO.*;
import com.mapper.*;
import com.pojo.*;
import com.pojo.RoomExample.Criteria;
import com.util.*;

@Service("hotelService")
public class HotelService {
	@Resource
	private RoomMapper roomMapper;

	@Resource
	private HotelRegisterMapper hotelRegisterMapper;

	@Resource
	private CustomerMapper customerMapper;

	//添加房间
	public String addRoom(Room room) {
		Room newroom = new Room();
		System.out.println("编号"+room.getRoomNum());
		newroom = roomMapper.selectByNum(room.getRoomNum());
		System.out.println("房间信息"+newroom);
		if(newroom!=null) {
			System.out.println("已存在的编号");
			return "error";
		}else {
		room.setRoomId(BuildUuid.getUuid());
		roomMapper.insertSelective(room);
		System.out.println("添加成功");
		return "success";
		}
	}

	//查询所有房间
	public List<RoomDTO> findAllRoom() {
		List<RoomDTO> listRoomDTO = new ArrayList<>();
		RoomDTO roomDTO;
		List<Room> listRoom = new ArrayList<>();
		HotelRegister hotelRegister;
		Customer customer;

		RoomExample roomExample = new RoomExample();
		Criteria roomCriteria = roomExample.createCriteria();
		roomCriteria.andRoomIdIsNotNull();
		listRoom = roomMapper.selectByExample(roomExample);
		if (listRoom != null && listRoom.size() > 0) {
			for (Room room : listRoom) {
				roomDTO = new RoomDTO();
				hotelRegister = new HotelRegister();
				customer = new Customer();
				if (room != null) {
					if (room.getRoomState() != null && room.getRoomState().trim().length() > 0) {
						if (room.getRoomState().equals("已租出")) {
							hotelRegister = hotelRegisterMapper.selectByRoomId(room.getRoomId());
							customer = customerMapper.selectByPrimaryKey(hotelRegister.getHotelRegisterCustomer());
							roomDTO.setRoom(room);
							roomDTO.setHotelRegister(hotelRegister);
							roomDTO.setCustomer(customer);
						} else {
							roomDTO.setRoom(room);
						}

					}
				}
				listRoomDTO.add(roomDTO);

			}
			return listRoomDTO;
		}

		return null;
	}

	//更新房间信息
	public String updateRoom(Room room) {
		room.setRoomState("空闲");
		roomMapper.updateByPrimaryKeySelective(room);
		return "success";
	}

	//顾客住宿登记
	public String customerStayOverNight(Room room, Customer customer, HotelRegister hotelRegister) {
		customer.setCustomerId(BuildUuid.getUuid());
		customerMapper.insertSelective(customer);
		
		hotelRegister.setHotelRegisterId(BuildUuid.getUuid());
		hotelRegister.setHotelRegisterCustomer(customer.getCustomerId());
		hotelRegister.setHotelRegisterRoom(room.getRoomId());
		hotelRegister.setHotelRegisterCreatetime(TimeUtil.getStringSecond());
		hotelRegister.setHotelRegisterModifytime(TimeUtil.getStringSecond());
		hotelRegisterMapper.insertSelective(hotelRegister);
		
		room.setRoomState("已租出");
		roomMapper.updateByPrimaryKeySelective(room);
		
		return "success";
	}

}
