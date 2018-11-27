package com.DTO;

import java.util.List;

public class IndexInfoDTO {
	/**
	 * 日期
	 */
	private List<String> listDate; 
	/**
	 * 单人间
	 */
	private List<Integer> listSingle;
	/**
	 * 双人间
	 */
	private List<Integer> listDouble;
	/**
	 * 普通套房
	 */
	private List<Integer> listOrdinary;
	/**
	 * 豪华套房
	 */
	private List<Integer> listLuxury;
	/**
	 * 商务间
	 */
	private List<Integer> listBusiness;
	/**
	 * 公寓间
	 */
	private List<Integer> listApartment;
	/**
	 * 总统套房
	 */
	private List<Integer> listPresident;
	public List<String> getListDate() {
		return listDate;
	}
	public void setListDate(List<String> listDate) {
		this.listDate = listDate;
	}
	public List<Integer> getListSingle() {
		return listSingle;
	}
	public void setListSingle(List<Integer> listSingle) {
		this.listSingle = listSingle;
	}
	public List<Integer> getListDouble() {
		return listDouble;
	}
	public void setListDouble(List<Integer> listDouble) {
		this.listDouble = listDouble;
	}
	public List<Integer> getListOrdinary() {
		return listOrdinary;
	}
	public void setListOrdinary(List<Integer> listOrdinary) {
		this.listOrdinary = listOrdinary;
	}
	public List<Integer> getListLuxury() {
		return listLuxury;
	}
	public void setListLuxury(List<Integer> listLuxury) {
		this.listLuxury = listLuxury;
	}
	public List<Integer> getListBusiness() {
		return listBusiness;
	}
	public void setListBusiness(List<Integer> listBusiness) {
		this.listBusiness = listBusiness;
	}
	public List<Integer> getListApartment() {
		return listApartment;
	}
	public void setListApartment(List<Integer> listApartment) {
		this.listApartment = listApartment;
	}
	public List<Integer> getListPresident() {
		return listPresident;
	}
	public void setListPresident(List<Integer> listPresident) {
		this.listPresident = listPresident;
	}
	@Override
	public String toString() {
		return "IndexInfoDTO [listDate=" + listDate + ", listSingle=" + listSingle + ", listDouble=" + listDouble
				+ ", listOrdinary=" + listOrdinary + ", listLuxury=" + listLuxury + ", listBusiness=" + listBusiness
				+ ", listApartment=" + listApartment + ", listPresident=" + listPresident + "]";
	}
	
}
