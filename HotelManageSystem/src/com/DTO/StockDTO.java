package com.DTO;

import com.pojo.Stock;
import com.pojo.StockType;

public class StockDTO {
	private Stock stock;
	private StockType stockType;
	public Stock getStock() {
		return stock;
	}
	public void setStock(Stock stock) {
		this.stock = stock;
	}
	public StockType getStockType() {
		return stockType;
	}
	public void setStockType(StockType stockType) {
		this.stockType = stockType;
	}
	@Override
	public String toString() {
		return "StockDTO [stock=" + stock + ", stockType=" + stockType + "]";
	}
	
}
