package com.pojo;

public class StockType {
    private String stockTypeId;

    private String stockTypeName;

    public String getStockTypeId() {
        return stockTypeId;
    }

    public void setStockTypeId(String stockTypeId) {
        this.stockTypeId = stockTypeId == null ? null : stockTypeId.trim();
    }

    public String getStockTypeName() {
        return stockTypeName;
    }

    public void setStockTypeName(String stockTypeName) {
        this.stockTypeName = stockTypeName == null ? null : stockTypeName.trim();
    }

	@Override
	public String toString() {
		return "StockType [stockTypeId=" + stockTypeId + ", stockTypeName=" + stockTypeName + "]";
	}
    
}