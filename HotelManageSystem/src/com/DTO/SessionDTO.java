package com.DTO;

import com.pojo.*;

public class SessionDTO {
	//员工信息
	private Staff staff;
	//判断依据
	private String choice;
	public Staff getStaff() {
		return staff;
	}
	public void setStaff(Staff staff) {
		this.staff = staff;
	}
	public String getChoice() {
		return choice;
	}
	public void setChoice(String choice) {
		this.choice = choice;
	}
	@Override
	public String toString() {
		return "SessionDTO [staff=" + staff + ", choice=" + choice + "]";
	}
	
	
	
	
}
