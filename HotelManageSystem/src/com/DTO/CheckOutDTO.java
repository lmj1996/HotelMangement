package com.DTO;

import com.pojo.*;

public class CheckOutDTO {
	private Room room;
	private Customer customer;
	private HotelRegister hotelRegister;
	/**
	 * 房间消费
	 */
	private String roomCost;
	/**
	 * 服务消费
	 */
	private String serviceCost;
	/**
	 * 结算金额
	 */
	private String settleMoney;
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
	public String getRoomCost() {
		return roomCost;
	}
	public void setRoomCost(String roomCost) {
		this.roomCost = roomCost;
	}
	public String getServiceCost() {
		return serviceCost;
	}
	public void setServiceCost(String serviceCost) {
		this.serviceCost = serviceCost;
	}
	public String getSettleMoney() {
		return settleMoney;
	}
	public void setSettleMoney(String settleMoney) {
		this.settleMoney = settleMoney;
	}
	@Override
	public String toString() {
		return "CheckOutDTO [room=" + room + ", customer=" + customer + ", hotelRegister=" + hotelRegister
				+ ", roomCost=" + roomCost + ", serviceCost=" + serviceCost + ", settleMoney=" + settleMoney + "]";
	}
	
	
}
