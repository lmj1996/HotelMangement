package com.pojo;

public class StockReceive {
    private String stockReceiveId;

    private String stockReceiveName;

    private String stockReceiveNum;

    private String stockReceiveStaff;

    private String stockReceiveTime;

    public String getStockReceiveId() {
        return stockReceiveId;
    }

    public void setStockReceiveId(String stockReceiveId) {
        this.stockReceiveId = stockReceiveId == null ? null : stockReceiveId.trim();
    }

    public String getStockReceiveName() {
        return stockReceiveName;
    }

    public void setStockReceiveName(String stockReceiveName) {
        this.stockReceiveName = stockReceiveName == null ? null : stockReceiveName.trim();
    }

    public String getStockReceiveNum() {
        return stockReceiveNum;
    }

    public void setStockReceiveNum(String stockReceiveNum) {
        this.stockReceiveNum = stockReceiveNum == null ? null : stockReceiveNum.trim();
    }

    public String getStockReceiveStaff() {
        return stockReceiveStaff;
    }

    public void setStockReceiveStaff(String stockReceiveStaff) {
        this.stockReceiveStaff = stockReceiveStaff == null ? null : stockReceiveStaff.trim();
    }

    public String getStockReceiveTime() {
        return stockReceiveTime;
    }

    public void setStockReceiveTime(String stockReceiveTime) {
        this.stockReceiveTime = stockReceiveTime == null ? null : stockReceiveTime.trim();
    }

	@Override
	public String toString() {
		return "StockReceive [stockReceiveId=" + stockReceiveId + ", stockReceiveName=" + stockReceiveName
				+ ", stockReceiveNum=" + stockReceiveNum + ", stockReceiveStaff=" + stockReceiveStaff
				+ ", stockReceiveTime=" + stockReceiveTime + "]";
	}
    
}