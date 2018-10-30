package com.pojo;

public class StockPurchase {
    private String stockPurchaseId;

    private String stockPurchaseNum;

    private String stockPurchaseName;

    private String stockPurchasePrice;

    private String stockPurchaseNumber;

    private String stockPurchaseStaff;

    public String getStockPurchaseId() {
        return stockPurchaseId;
    }

    public void setStockPurchaseId(String stockPurchaseId) {
        this.stockPurchaseId = stockPurchaseId == null ? null : stockPurchaseId.trim();
    }

    public String getStockPurchaseNum() {
        return stockPurchaseNum;
    }

    public void setStockPurchaseNum(String stockPurchaseNum) {
        this.stockPurchaseNum = stockPurchaseNum == null ? null : stockPurchaseNum.trim();
    }

    public String getStockPurchaseName() {
        return stockPurchaseName;
    }

    public void setStockPurchaseName(String stockPurchaseName) {
        this.stockPurchaseName = stockPurchaseName == null ? null : stockPurchaseName.trim();
    }

    public String getStockPurchasePrice() {
        return stockPurchasePrice;
    }

    public void setStockPurchasePrice(String stockPurchasePrice) {
        this.stockPurchasePrice = stockPurchasePrice == null ? null : stockPurchasePrice.trim();
    }

    public String getStockPurchaseNumber() {
        return stockPurchaseNumber;
    }

    public void setStockPurchaseNumber(String stockPurchaseNumber) {
        this.stockPurchaseNumber = stockPurchaseNumber == null ? null : stockPurchaseNumber.trim();
    }

    public String getStockPurchaseStaff() {
        return stockPurchaseStaff;
    }

    public void setStockPurchaseStaff(String stockPurchaseStaff) {
        this.stockPurchaseStaff = stockPurchaseStaff == null ? null : stockPurchaseStaff.trim();
    }

	@Override
	public String toString() {
		return "StockPurchase [stockPurchaseId=" + stockPurchaseId + ", stockPurchaseNum=" + stockPurchaseNum
				+ ", stockPurchaseName=" + stockPurchaseName + ", stockPurchasePrice=" + stockPurchasePrice
				+ ", stockPurchaseNumber=" + stockPurchaseNumber + ", stockPurchaseStaff=" + stockPurchaseStaff + "]";
	}
    
}