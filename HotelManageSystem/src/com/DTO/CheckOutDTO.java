package com.DTO;

import com.pojo.*;

public class CheckOutDTO {
	private Room room;
	private Customer customer;
	private HotelRegister hotelRegister;
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
	public String getSettleMoney() {
		return settleMoney;
	}
	public void setSettleMoney(String settleMoney) {
		this.settleMoney = settleMoney;
	}
	@Override
	public String toString() {
		return "CheckOutDTO [room=" + room + ", customer=" + customer + ", hotelRegister=" + hotelRegister
				+ ", settleMoney=" + settleMoney + "]";
	}
	
}
