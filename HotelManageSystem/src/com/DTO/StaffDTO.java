package com.DTO;

import com.pojo.*;

public class StaffDTO {
	private Staff staff;
	private Position position;
	/**
	 * 每月出勤次数
	 */
	private int workCount;
	
	public int getWorkCount() {
		return workCount;
	}
	public void setWorkCount(int workCount) {
		this.workCount = workCount;
	}
	public Staff getStaff() {
		return staff;
	}
	public void setStaff(Staff staff) {
		this.staff = staff;
	}
	public Position getPosition() {
		return position;
	}
	public void setPosition(Position position) {
		this.position = position;
	}
	@Override
	public String toString() {
		return "StaffDTO [staff=" + staff + ", position=" + position + ", workCount=" + workCount + "]";
	}
	
}
