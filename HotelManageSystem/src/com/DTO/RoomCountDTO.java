package com.DTO;



public class RoomCountDTO {
	private String roomType;
	/**
	 * 该种类房间总数
	 */
	private int total;
	/**
	 * 该种类房间入住中总数
	 */
	private int used;
	/**
	 * 该种类房间打扫中总数
	 */
	private int cleaning;
	/**
	 * 该种类房间剩余总数
	 */
	private int surplus;
	public String getRoomType() {
		return roomType;
	}
	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public int getUsed() {
		return used;
	}
	public void setUsed(int used) {
		this.used = used;
	}
	public int getCleaning() {
		return cleaning;
	}
	public void setCleaning(int cleaning) {
		this.cleaning = cleaning;
	}
	public int getSurplus() {
		return surplus;
	}
	public void setSurplus(int surplus) {
		this.surplus = surplus;
	}
	@Override
	public String toString() {
		return "RoomCountDTO [roomType=" + roomType + ", total=" + total + ", used=" + used + ", cleaning=" + cleaning
				+ ", surplus=" + surplus + "]";
	}
	
	
}
