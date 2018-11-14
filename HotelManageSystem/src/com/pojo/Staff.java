package com.pojo;

public class Staff {
    private String staffId;

    private String staffNum;

    private String staffPassword;

    private String staffIdnumber;

    private String staffName;

    private String staffSex;

    private String staffPhone;

    private String staffAddress;

    private String staffEntrytime;

    private String staffPosition;

    private String staffCreatetime;

    private String staffModifytime;

    public String getStaffId() {
        return staffId;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId == null ? null : staffId.trim();
    }

    public String getStaffNum() {
        return staffNum;
    }

    public void setStaffNum(String staffNum) {
        this.staffNum = staffNum == null ? null : staffNum.trim();
    }

    public String getStaffPassword() {
        return staffPassword;
    }

    public void setStaffPassword(String staffPassword) {
        this.staffPassword = staffPassword == null ? null : staffPassword.trim();
    }

    public String getStaffIdnumber() {
        return staffIdnumber;
    }

    public void setStaffIdnumber(String staffIdnumber) {
        this.staffIdnumber = staffIdnumber == null ? null : staffIdnumber.trim();
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName == null ? null : staffName.trim();
    }

    public String getStaffSex() {
        return staffSex;
    }

    public void setStaffSex(String staffSex) {
        this.staffSex = staffSex == null ? null : staffSex.trim();
    }

    public String getStaffPhone() {
        return staffPhone;
    }

    public void setStaffPhone(String staffPhone) {
        this.staffPhone = staffPhone == null ? null : staffPhone.trim();
    }

    public String getStaffAddress() {
        return staffAddress;
    }

    public void setStaffAddress(String staffAddress) {
        this.staffAddress = staffAddress == null ? null : staffAddress.trim();
    }

    public String getStaffEntrytime() {
        return staffEntrytime;
    }

    public void setStaffEntrytime(String staffEntrytime) {
        this.staffEntrytime = staffEntrytime == null ? null : staffEntrytime.trim();
    }

    public String getStaffPosition() {
        return staffPosition;
    }

    public void setStaffPosition(String staffPosition) {
        this.staffPosition = staffPosition == null ? null : staffPosition.trim();
    }

    public String getStaffCreatetime() {
        return staffCreatetime;
    }

    public void setStaffCreatetime(String staffCreatetime) {
        this.staffCreatetime = staffCreatetime == null ? null : staffCreatetime.trim();
    }

    public String getStaffModifytime() {
        return staffModifytime;
    }

    public void setStaffModifytime(String staffModifytime) {
        this.staffModifytime = staffModifytime == null ? null : staffModifytime.trim();
    }

	@Override
	public String toString() {
		return "Staff [staffId=" + staffId + ", staffNum=" + staffNum + ", staffPassword=" + staffPassword
				+ ", staffIdnumber=" + staffIdnumber + ", staffName=" + staffName + ", staffSex=" + staffSex
				+ ", staffPhone=" + staffPhone + ", staffAddress=" + staffAddress + ", staffEntrytime=" + staffEntrytime
				+ ", staffPosition=" + staffPosition + ", staffCreatetime=" + staffCreatetime + ", staffModifytime="
				+ staffModifytime + "]";
	}
    
}