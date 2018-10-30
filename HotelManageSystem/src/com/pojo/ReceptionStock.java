package com.pojo;

public class ReceptionStock {
    private String receptionStockId;

    private String receptionStockName;

    private String receptionStockNumber;

    public String getReceptionStockId() {
        return receptionStockId;
    }

    public void setReceptionStockId(String receptionStockId) {
        this.receptionStockId = receptionStockId == null ? null : receptionStockId.trim();
    }

    public String getReceptionStockName() {
        return receptionStockName;
    }

    public void setReceptionStockName(String receptionStockName) {
        this.receptionStockName = receptionStockName == null ? null : receptionStockName.trim();
    }

    public String getReceptionStockNumber() {
        return receptionStockNumber;
    }

    public void setReceptionStockNumber(String receptionStockNumber) {
        this.receptionStockNumber = receptionStockNumber == null ? null : receptionStockNumber.trim();
    }

	@Override
	public String toString() {
		return "ReceptionStock [receptionStockId=" + receptionStockId + ", receptionStockName=" + receptionStockName
				+ ", receptionStockNumber=" + receptionStockNumber + "]";
	}
    
}