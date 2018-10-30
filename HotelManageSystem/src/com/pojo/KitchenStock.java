package com.pojo;

public class KitchenStock {
    private String kitchenStockId;

    private String kitchenStockName;

    private String kitchenStockNumber;

    public String getKitchenStockId() {
        return kitchenStockId;
    }

    public void setKitchenStockId(String kitchenStockId) {
        this.kitchenStockId = kitchenStockId == null ? null : kitchenStockId.trim();
    }

    public String getKitchenStockName() {
        return kitchenStockName;
    }

    public void setKitchenStockName(String kitchenStockName) {
        this.kitchenStockName = kitchenStockName == null ? null : kitchenStockName.trim();
    }

    public String getKitchenStockNumber() {
        return kitchenStockNumber;
    }

    public void setKitchenStockNumber(String kitchenStockNumber) {
        this.kitchenStockNumber = kitchenStockNumber == null ? null : kitchenStockNumber.trim();
    }

	@Override
	public String toString() {
		return "KitchenStock [kitchenStockId=" + kitchenStockId + ", kitchenStockName=" + kitchenStockName
				+ ", kitchenStockNumber=" + kitchenStockNumber + "]";
	}
    
}