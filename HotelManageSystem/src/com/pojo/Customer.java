package com.pojo;

public class Customer {
    private String customerId;

    private String customerName;

    private String customerCustomerid;

    private String customerPhone;

    private String customerBalance;

    private String customerType;

    private String customerVipLevel;

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId == null ? null : customerId.trim();
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName == null ? null : customerName.trim();
    }

    public String getCustomerCustomerid() {
        return customerCustomerid;
    }

    public void setCustomerCustomerid(String customerCustomerid) {
        this.customerCustomerid = customerCustomerid == null ? null : customerCustomerid.trim();
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone == null ? null : customerPhone.trim();
    }

    public String getCustomerBalance() {
        return customerBalance;
    }

    public void setCustomerBalance(String customerBalance) {
        this.customerBalance = customerBalance == null ? null : customerBalance.trim();
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType == null ? null : customerType.trim();
    }

    public String getCustomerVipLevel() {
        return customerVipLevel;
    }

    public void setCustomerVipLevel(String customerVipLevel) {
        this.customerVipLevel = customerVipLevel == null ? null : customerVipLevel.trim();
    }

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerCustomerid="
				+ customerCustomerid + ", customerPhone=" + customerPhone + ", customerBalance=" + customerBalance
				+ ", customerType=" + customerType + ", customerVipLevel=" + customerVipLevel + "]";
	}
    
}