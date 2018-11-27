package com.pojo;

public class HotelRegister {
    private String hotelRegisterId;

    private String hotelRegisterCustomer;

    private String hotelRegisterRoom;

    private String hotelRegisterChargingway;

    private String hotelRegisterCheckinday;

    private String hotelRegisterCheckoutday;

    private String hotelRegisterStarttime;

    private String hotelRegisterEndtime;

    private String hotelRegisterAdults;

    private String hotelRegisterChildren;

    private String hotelRegisterSecurity;

    private String hotelRegisterTotalprice;

    private String hotelRegisterCreatetime;

    private String hotelRegisterModifytime;

    public String getHotelRegisterId() {
        return hotelRegisterId;
    }

    public void setHotelRegisterId(String hotelRegisterId) {
        this.hotelRegisterId = hotelRegisterId == null ? null : hotelRegisterId.trim();
    }

    public String getHotelRegisterCustomer() {
        return hotelRegisterCustomer;
    }

    public void setHotelRegisterCustomer(String hotelRegisterCustomer) {
        this.hotelRegisterCustomer = hotelRegisterCustomer == null ? null : hotelRegisterCustomer.trim();
    }

    public String getHotelRegisterRoom() {
        return hotelRegisterRoom;
    }

    public void setHotelRegisterRoom(String hotelRegisterRoom) {
        this.hotelRegisterRoom = hotelRegisterRoom == null ? null : hotelRegisterRoom.trim();
    }

    public String getHotelRegisterChargingway() {
        return hotelRegisterChargingway;
    }

    public void setHotelRegisterChargingway(String hotelRegisterChargingway) {
        this.hotelRegisterChargingway = hotelRegisterChargingway == null ? null : hotelRegisterChargingway.trim();
    }

    public String getHotelRegisterCheckinday() {
        return hotelRegisterCheckinday;
    }

    public void setHotelRegisterCheckinday(String hotelRegisterCheckinday) {
        this.hotelRegisterCheckinday = hotelRegisterCheckinday == null ? null : hotelRegisterCheckinday.trim();
    }

    public String getHotelRegisterCheckoutday() {
        return hotelRegisterCheckoutday;
    }

    public void setHotelRegisterCheckoutday(String hotelRegisterCheckoutday) {
        this.hotelRegisterCheckoutday = hotelRegisterCheckoutday == null ? null : hotelRegisterCheckoutday.trim();
    }

    public String getHotelRegisterStarttime() {
        return hotelRegisterStarttime;
    }

    public void setHotelRegisterStarttime(String hotelRegisterStarttime) {
        this.hotelRegisterStarttime = hotelRegisterStarttime == null ? null : hotelRegisterStarttime.trim();
    }

    public String getHotelRegisterEndtime() {
        return hotelRegisterEndtime;
    }

    public void setHotelRegisterEndtime(String hotelRegisterEndtime) {
        this.hotelRegisterEndtime = hotelRegisterEndtime == null ? null : hotelRegisterEndtime.trim();
    }

    public String getHotelRegisterAdults() {
        return hotelRegisterAdults;
    }

    public void setHotelRegisterAdults(String hotelRegisterAdults) {
        this.hotelRegisterAdults = hotelRegisterAdults == null ? null : hotelRegisterAdults.trim();
    }

    public String getHotelRegisterChildren() {
        return hotelRegisterChildren;
    }

    public void setHotelRegisterChildren(String hotelRegisterChildren) {
        this.hotelRegisterChildren = hotelRegisterChildren == null ? null : hotelRegisterChildren.trim();
    }

    public String getHotelRegisterSecurity() {
        return hotelRegisterSecurity;
    }

    public void setHotelRegisterSecurity(String hotelRegisterSecurity) {
        this.hotelRegisterSecurity = hotelRegisterSecurity == null ? null : hotelRegisterSecurity.trim();
    }

    public String getHotelRegisterTotalprice() {
        return hotelRegisterTotalprice;
    }

    public void setHotelRegisterTotalprice(String hotelRegisterTotalprice) {
        this.hotelRegisterTotalprice = hotelRegisterTotalprice == null ? null : hotelRegisterTotalprice.trim();
    }

    public String getHotelRegisterCreatetime() {
        return hotelRegisterCreatetime;
    }

    public void setHotelRegisterCreatetime(String hotelRegisterCreatetime) {
        this.hotelRegisterCreatetime = hotelRegisterCreatetime == null ? null : hotelRegisterCreatetime.trim();
    }

    public String getHotelRegisterModifytime() {
        return hotelRegisterModifytime;
    }

    public void setHotelRegisterModifytime(String hotelRegisterModifytime) {
        this.hotelRegisterModifytime = hotelRegisterModifytime == null ? null : hotelRegisterModifytime.trim();
    }

	@Override
	public String toString() {
		return "HotelRegister [hotelRegisterId=" + hotelRegisterId + ", hotelRegisterCustomer=" + hotelRegisterCustomer
				+ ", hotelRegisterRoom=" + hotelRegisterRoom + ", hotelRegisterChargingway=" + hotelRegisterChargingway
				+ ", hotelRegisterCheckinday=" + hotelRegisterCheckinday + ", hotelRegisterCheckoutday="
				+ hotelRegisterCheckoutday + ", hotelRegisterStarttime=" + hotelRegisterStarttime
				+ ", hotelRegisterEndtime=" + hotelRegisterEndtime + ", hotelRegisterAdults=" + hotelRegisterAdults
				+ ", hotelRegisterChildren=" + hotelRegisterChildren + ", hotelRegisterSecurity="
				+ hotelRegisterSecurity + ", hotelRegisterTotalprice=" + hotelRegisterTotalprice
				+ ", hotelRegisterCreatetime=" + hotelRegisterCreatetime + ", hotelRegisterModifytime="
				+ hotelRegisterModifytime + "]";
	}
    
}