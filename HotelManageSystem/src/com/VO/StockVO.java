package com.VO;

import java.util.List;

import com.DTO.StockDTO;

public class StockVO {
	private List<StockDTO> listStockDTO;
	/**
	 * 需要显示的页码
	 */
	private int pageIndex = 1;
	/**
	 * 总记录数
	 */
	private int totalRecords = 0;
	/**
	 * 每页记录数
	 */
	private int pageSize = 8;
	/**
	 * 总页数
	 */
	private int totalPages = 1;
	/**
	 * 是否有上一页
	 */
	private boolean HavePrePage = false;
	/**
	 * 是否有下一页
	 */
	private boolean HaveNextPage = false;

	/**
	 * 模糊查询关键字
	 */
	private String search;
	/**
	 * 根据类型筛选
	 */
	private String type;
	public List<StockDTO> getListStockDTO() {
		return listStockDTO;
	}
	public void setListStockDTO(List<StockDTO> listStockDTO) {
		this.listStockDTO = listStockDTO;
	}
	public int getPageIndex() {
		return pageIndex;
	}
	public void setPageIndex(int pageIndex) {
		this.pageIndex = pageIndex;
	}
	public int getTotalRecords() {
		return totalRecords;
	}
	public void setTotalRecords(int totalRecords) {
		this.totalRecords = totalRecords;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public int getTotalPages() {
		return totalPages;
	}
	public void setTotalPages(int totalPages) {
		this.totalPages = totalPages;
	}
	public boolean isHavePrePage() {
		return HavePrePage;
	}
	public void setHavePrePage(boolean havePrePage) {
		HavePrePage = havePrePage;
	}
	public boolean isHaveNextPage() {
		return HaveNextPage;
	}
	public void setHaveNextPage(boolean haveNextPage) {
		HaveNextPage = haveNextPage;
	}
	public String getSearch() {
		return search;
	}
	public void setSearch(String search) {
		this.search = search;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "StockVO [listStockDTO=" + listStockDTO + ", pageIndex=" + pageIndex + ", totalRecords=" + totalRecords
				+ ", pageSize=" + pageSize + ", totalPages=" + totalPages + ", HavePrePage=" + HavePrePage
				+ ", HaveNextPage=" + HaveNextPage + ", search=" + search + ", type=" + type + "]";
	}
	
	
	
}
