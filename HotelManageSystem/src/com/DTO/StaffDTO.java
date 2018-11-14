package com.DTO;

import com.pojo.*;

public class StaffDTO {
	private Staff staff;
	private Position position;
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
		return "staffDTO [staff=" + staff + ", position=" + position + "]";
	}
	
	
	
}
