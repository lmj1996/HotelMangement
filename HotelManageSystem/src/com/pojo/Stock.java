package com.pojo;

public class Stock {
    private String stockId;

    private String stockNum;

    private String stockType;

    private String stockName;

    private String stockRetailprice;

    private String stockNumber;

    public String getStockId() {
        return stockId;
    }

    public void setStockId(String stockId) {
        this.stockId = stockId == null ? null : stockId.trim();
    }

    public String getStockNum() {
        return stockNum;
    }

    public void setStockNum(String stockNum) {
        this.stockNum = stockNum == null ? null : stockNum.trim();
    }

    public String getStockType() {
        return stockType;
    }

    public void setStockType(String stockType) {
        this.stockType = stockType == null ? null : stockType.trim();
    }

    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName == null ? null : stockName.trim();
    }

    public String getStockRetailprice() {
        return stockRetailprice;
    }

    public void setStockRetailprice(String stockRetailprice) {
        this.stockRetailprice = stockRetailprice == null ? null : stockRetailprice.trim();
    }

    public String getStockNumber() {
        return stockNumber;
    }

    public void setStockNumber(String stockNumber) {
        this.stockNumber = stockNumber == null ? null : stockNumber.trim();
    }

	@Override
	public String toString() {
		return "Stock [stockId=" + stockId + ", stockNum=" + stockNum + ", stockType=" + stockType + ", stockName="
				+ stockName + ", stockRetailprice=" + stockRetailprice + ", stockNumber=" + stockNumber + "]";
	}
    
}