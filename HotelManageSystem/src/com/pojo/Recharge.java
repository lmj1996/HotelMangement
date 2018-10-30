package com.pojo;

public class Recharge {
    private String rechargeId;

    private String rechargeCustomer;

    private String rechargeMoney;

    private String rechargeTime;

    public String getRechargeId() {
        return rechargeId;
    }

    public void setRechargeId(String rechargeId) {
        this.rechargeId = rechargeId == null ? null : rechargeId.trim();
    }

    public String getRechargeCustomer() {
        return rechargeCustomer;
    }

    public void setRechargeCustomer(String rechargeCustomer) {
        this.rechargeCustomer = rechargeCustomer == null ? null : rechargeCustomer.trim();
    }

    public String getRechargeMoney() {
        return rechargeMoney;
    }

    public void setRechargeMoney(String rechargeMoney) {
        this.rechargeMoney = rechargeMoney == null ? null : rechargeMoney.trim();
    }

    public String getRechargeTime() {
        return rechargeTime;
    }

    public void setRechargeTime(String rechargeTime) {
        this.rechargeTime = rechargeTime == null ? null : rechargeTime.trim();
    }

	@Override
	public String toString() {
		return "Recharge [rechargeId=" + rechargeId + ", rechargeCustomer=" + rechargeCustomer + ", rechargeMoney="
				+ rechargeMoney + ", rechargeTime=" + rechargeTime + "]";
	}
    
}