package com.pojo;

public class HotelRegister {
    private String hotelRegisterId;

    private String hotelRegisterCustomer;

    private String hotelRegisterRoom;

    private String hotelRegisterStarttime;

    private String hotelRegisterEndtime;

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
				+ ", hotelRegisterRoom=" + hotelRegisterRoom + ", hotelRegisterStarttime=" + hotelRegisterStarttime
				+ ", hotelRegisterEndtime=" + hotelRegisterEndtime + ", hotelRegisterSecurity=" + hotelRegisterSecurity
				+ ", hotelRegisterTotalprice=" + hotelRegisterTotalprice + ", hotelRegisterCreatetime="
				+ hotelRegisterCreatetime + ", hotelRegisterModifytime=" + hotelRegisterModifytime + "]";
	}
    
}