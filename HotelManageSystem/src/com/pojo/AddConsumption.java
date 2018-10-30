package com.pojo;

public class AddConsumption {
    private String addConsumptionId;

    private String addConsumptionName;

    private String addConsumptionPrice;

    private String addConsumptionCustomer;

    private String addConsumptionRoom;

    private String addConsumptionTime;

    public String getAddConsumptionId() {
        return addConsumptionId;
    }

    public void setAddConsumptionId(String addConsumptionId) {
        this.addConsumptionId = addConsumptionId == null ? null : addConsumptionId.trim();
    }

    public String getAddConsumptionName() {
        return addConsumptionName;
    }

    public void setAddConsumptionName(String addConsumptionName) {
        this.addConsumptionName = addConsumptionName == null ? null : addConsumptionName.trim();
    }

    public String getAddConsumptionPrice() {
        return addConsumptionPrice;
    }

    public void setAddConsumptionPrice(String addConsumptionPrice) {
        this.addConsumptionPrice = addConsumptionPrice == null ? null : addConsumptionPrice.trim();
    }

    public String getAddConsumptionCustomer() {
        return addConsumptionCustomer;
    }

    public void setAddConsumptionCustomer(String addConsumptionCustomer) {
        this.addConsumptionCustomer = addConsumptionCustomer == null ? null : addConsumptionCustomer.trim();
    }

    public String getAddConsumptionRoom() {
        return addConsumptionRoom;
    }

    public void setAddConsumptionRoom(String addConsumptionRoom) {
        this.addConsumptionRoom = addConsumptionRoom == null ? null : addConsumptionRoom.trim();
    }

    public String getAddConsumptionTime() {
        return addConsumptionTime;
    }

    public void setAddConsumptionTime(String addConsumptionTime) {
        this.addConsumptionTime = addConsumptionTime == null ? null : addConsumptionTime.trim();
    }

	@Override
	public String toString() {
		return "AddConsumption [addConsumptionId=" + addConsumptionId + ", addConsumptionName=" + addConsumptionName
				+ ", addConsumptionPrice=" + addConsumptionPrice + ", addConsumptionCustomer=" + addConsumptionCustomer
				+ ", addConsumptionRoom=" + addConsumptionRoom + ", addConsumptionTime=" + addConsumptionTime + "]";
	}
    
}