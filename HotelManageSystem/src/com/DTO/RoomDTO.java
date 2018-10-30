package com.DTO;

import java.util.List;

import com.pojo.*;

public class RoomDTO {
	//房间列表
	private Room room;
	//住宿记录
	private HotelRegister hotelRegister;
	//住宿顾客
	private Customer customer;
	public Room getRoom() {
		return room;
	}
	public void setRoom(Room room) {
		this.room = room;
	}
	public HotelRegister getHotelRegister() {
		return hotelRegister;
	}
	public void setHotelRegister(HotelRegister hotelRegister) {
		this.hotelRegister = hotelRegister;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	@Override
	public String toString() {
		return "RoomDTO [room=" + room + ", hotelRegister=" + hotelRegister + ", customer=" + customer + "]";
	}
	
	
}
