package com.pojo;

public class ChargingWay {
    private String chargingWayId;

    private String chargingWayName;

    private String chargingWayStarttime;

    private String chargingWayEndtime;

    private String chargingWayPrice;

    private String chargingWayCreatetime;

    private String chargingWayModifytime;

    public String getChargingWayId() {
        return chargingWayId;
    }

    public void setChargingWayId(String chargingWayId) {
        this.chargingWayId = chargingWayId == null ? null : chargingWayId.trim();
    }

    public String getChargingWayName() {
        return chargingWayName;
    }

    public void setChargingWayName(String chargingWayName) {
        this.chargingWayName = chargingWayName == null ? null : chargingWayName.trim();
    }

    public String getChargingWayStarttime() {
        return chargingWayStarttime;
    }

    public void setChargingWayStarttime(String chargingWayStarttime) {
        this.chargingWayStarttime = chargingWayStarttime == null ? null : chargingWayStarttime.trim();
    }

    public String getChargingWayEndtime() {
        return chargingWayEndtime;
    }

    public void setChargingWayEndtime(String chargingWayEndtime) {
        this.chargingWayEndtime = chargingWayEndtime == null ? null : chargingWayEndtime.trim();
    }

    public String getChargingWayPrice() {
        return chargingWayPrice;
    }

    public void setChargingWayPrice(String chargingWayPrice) {
        this.chargingWayPrice = chargingWayPrice == null ? null : chargingWayPrice.trim();
    }

    public String getChargingWayCreatetime() {
        return chargingWayCreatetime;
    }

    public void setChargingWayCreatetime(String chargingWayCreatetime) {
        this.chargingWayCreatetime = chargingWayCreatetime == null ? null : chargingWayCreatetime.trim();
    }

    public String getChargingWayModifytime() {
        return chargingWayModifytime;
    }

    public void setChargingWayModifytime(String chargingWayModifytime) {
        this.chargingWayModifytime = chargingWayModifytime == null ? null : chargingWayModifytime.trim();
    }

	@Override
	public String toString() {
		return "ChargingWay [chargingWayId=" + chargingWayId + ", chargingWayName=" + chargingWayName
				+ ", chargingWayStarttime=" + chargingWayStarttime + ", chargingWayEndtime=" + chargingWayEndtime
				+ ", chargingWayPrice=" + chargingWayPrice + ", chargingWayCreatetime=" + chargingWayCreatetime
				+ ", chargingWayModifytime=" + chargingWayModifytime + "]";
	}
    
}