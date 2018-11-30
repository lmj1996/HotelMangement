package com.DTO;

import java.util.List;

public class TotalRoomDTO {
	private List<RoomCountDTO> listDTO;
	/**
	 * 房间总数
	 */
	private int totalRooms;
	/**
	 * 房间入住中总数
	 */
	private int usedRooms;
	/**
	 * 房间打扫中总数
	 */
	private int cleaningRooms;
	/**
	 * 房间剩余总数
	 */
	private int surplusRooms;
	public List<RoomCountDTO> getListDTO() {
		return listDTO;
	}
	public void setListDTO(List<RoomCountDTO> listDTO) {
		this.listDTO = listDTO;
	}
	public int getTotalRooms() {
		return totalRooms;
	}
	public void setTotalRooms(int totalRooms) {
		this.totalRooms = totalRooms;
	}
	public int getUsedRooms() {
		return usedRooms;
	}
	public void setUsedRooms(int usedRooms) {
		this.usedRooms = usedRooms;
	}
	public int getCleaningRooms() {
		return cleaningRooms;
	}
	public void setCleaningRooms(int cleaningRooms) {
		this.cleaningRooms = cleaningRooms;
	}
	public int getSurplusRooms() {
		return surplusRooms;
	}
	public void setSurplusRooms(int surplusRooms) {
		this.surplusRooms = surplusRooms;
	}
	@Override
	public String toString() {
		return "TotalRoomDTO [listDTO=" + listDTO + ", totalRooms=" + totalRooms + ", usedRooms=" + usedRooms
				+ ", cleaningRooms=" + cleaningRooms + ", surplusRooms=" + surplusRooms + "]";
	}
	
}
