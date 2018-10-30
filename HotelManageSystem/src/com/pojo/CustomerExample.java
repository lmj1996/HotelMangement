package com.pojo;

import java.util.ArrayList;
import java.util.List;

public class CustomerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CustomerExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andCustomerIdIsNull() {
            addCriterion("customer_id is null");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIsNotNull() {
            addCriterion("customer_id is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerIdEqualTo(String value) {
            addCriterion("customer_id =", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotEqualTo(String value) {
            addCriterion("customer_id <>", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdGreaterThan(String value) {
            addCriterion("customer_id >", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdGreaterThanOrEqualTo(String value) {
            addCriterion("customer_id >=", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLessThan(String value) {
            addCriterion("customer_id <", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLessThanOrEqualTo(String value) {
            addCriterion("customer_id <=", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLike(String value) {
            addCriterion("customer_id like", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotLike(String value) {
            addCriterion("customer_id not like", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIn(List<String> values) {
            addCriterion("customer_id in", values, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotIn(List<String> values) {
            addCriterion("customer_id not in", values, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdBetween(String value1, String value2) {
            addCriterion("customer_id between", value1, value2, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotBetween(String value1, String value2) {
            addCriterion("customer_id not between", value1, value2, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerNameIsNull() {
            addCriterion("customer_name is null");
            return (Criteria) this;
        }

        public Criteria andCustomerNameIsNotNull() {
            addCriterion("customer_name is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerNameEqualTo(String value) {
            addCriterion("customer_name =", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotEqualTo(String value) {
            addCriterion("customer_name <>", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameGreaterThan(String value) {
            addCriterion("customer_name >", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameGreaterThanOrEqualTo(String value) {
            addCriterion("customer_name >=", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLessThan(String value) {
            addCriterion("customer_name <", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLessThanOrEqualTo(String value) {
            addCriterion("customer_name <=", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLike(String value) {
            addCriterion("customer_name like", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotLike(String value) {
            addCriterion("customer_name not like", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameIn(List<String> values) {
            addCriterion("customer_name in", values, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotIn(List<String> values) {
            addCriterion("customer_name not in", values, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameBetween(String value1, String value2) {
            addCriterion("customer_name between", value1, value2, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotBetween(String value1, String value2) {
            addCriterion("customer_name not between", value1, value2, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerCustomeridIsNull() {
            addCriterion("customer_customerID is null");
            return (Criteria) this;
        }

        public Criteria andCustomerCustomeridIsNotNull() {
            addCriterion("customer_customerID is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerCustomeridEqualTo(String value) {
            addCriterion("customer_customerID =", value, "customerCustomerid");
            return (Criteria) this;
        }

        public Criteria andCustomerCustomeridNotEqualTo(String value) {
            addCriterion("customer_customerID <>", value, "customerCustomerid");
            return (Criteria) this;
        }

        public Criteria andCustomerCustomeridGreaterThan(String value) {
            addCriterion("customer_customerID >", value, "customerCustomerid");
            return (Criteria) this;
        }

        public Criteria andCustomerCustomeridGreaterThanOrEqualTo(String value) {
            addCriterion("customer_customerID >=", value, "customerCustomerid");
            return (Criteria) this;
        }

        public Criteria andCustomerCustomeridLessThan(String value) {
            addCriterion("customer_customerID <", value, "customerCustomerid");
            return (Criteria) this;
        }

        public Criteria andCustomerCustomeridLessThanOrEqualTo(String value) {
            addCriterion("customer_customerID <=", value, "customerCustomerid");
            return (Criteria) this;
        }

        public Criteria andCustomerCustomeridLike(String value) {
            addCriterion("customer_customerID like", value, "customerCustomerid");
            return (Criteria) this;
        }

        public Criteria andCustomerCustomeridNotLike(String value) {
            addCriterion("customer_customerID not like", value, "customerCustomerid");
            return (Criteria) this;
        }

        public Criteria andCustomerCustomeridIn(List<String> values) {
            addCriterion("customer_customerID in", values, "customerCustomerid");
            return (Criteria) this;
        }

        public Criteria andCustomerCustomeridNotIn(List<String> values) {
            addCriterion("customer_customerID not in", values, "customerCustomerid");
            return (Criteria) this;
        }

        public Criteria andCustomerCustomeridBetween(String value1, String value2) {
            addCriterion("customer_customerID between", value1, value2, "customerCustomerid");
            return (Criteria) this;
        }

        public Criteria andCustomerCustomeridNotBetween(String value1, String value2) {
            addCriterion("customer_customerID not between", value1, value2, "customerCustomerid");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneIsNull() {
            addCriterion("customer_phone is null");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneIsNotNull() {
            addCriterion("customer_phone is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneEqualTo(String value) {
            addCriterion("customer_phone =", value, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneNotEqualTo(String value) {
            addCriterion("customer_phone <>", value, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneGreaterThan(String value) {
            addCriterion("customer_phone >", value, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("customer_phone >=", value, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneLessThan(String value) {
            addCriterion("customer_phone <", value, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneLessThanOrEqualTo(String value) {
            addCriterion("customer_phone <=", value, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneLike(String value) {
            addCriterion("customer_phone like", value, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneNotLike(String value) {
            addCriterion("customer_phone not like", value, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneIn(List<String> values) {
            addCriterion("customer_phone in", values, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneNotIn(List<String> values) {
            addCriterion("customer_phone not in", values, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneBetween(String value1, String value2) {
            addCriterion("customer_phone between", value1, value2, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneNotBetween(String value1, String value2) {
            addCriterion("customer_phone not between", value1, value2, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerBalanceIsNull() {
            addCriterion("customer_balance is null");
            return (Criteria) this;
        }

        public Criteria andCustomerBalanceIsNotNull() {
            addCriterion("customer_balance is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerBalanceEqualTo(String value) {
            addCriterion("customer_balance =", value, "customerBalance");
            return (Criteria) this;
        }

        public Criteria andCustomerBalanceNotEqualTo(String value) {
            addCriterion("customer_balance <>", value, "customerBalance");
            return (Criteria) this;
        }

        public Criteria andCustomerBalanceGreaterThan(String value) {
            addCriterion("customer_balance >", value, "customerBalance");
            return (Criteria) this;
        }

        public Criteria andCustomerBalanceGreaterThanOrEqualTo(String value) {
            addCriterion("customer_balance >=", value, "customerBalance");
            return (Criteria) this;
        }

        public Criteria andCustomerBalanceLessThan(String value) {
            addCriterion("customer_balance <", value, "customerBalance");
            return (Criteria) this;
        }

        public Criteria andCustomerBalanceLessThanOrEqualTo(String value) {
            addCriterion("customer_balance <=", value, "customerBalance");
            return (Criteria) this;
        }

        public Criteria andCustomerBalanceLike(String value) {
            addCriterion("customer_balance like", value, "customerBalance");
            return (Criteria) this;
        }

        public Criteria andCustomerBalanceNotLike(String value) {
            addCriterion("customer_balance not like", value, "customerBalance");
            return (Criteria) this;
        }

        public Criteria andCustomerBalanceIn(List<String> values) {
            addCriterion("customer_balance in", values, "customerBalance");
            return (Criteria) this;
        }

        public Criteria andCustomerBalanceNotIn(List<String> values) {
            addCriterion("customer_balance not in", values, "customerBalance");
            return (Criteria) this;
        }

        public Criteria andCustomerBalanceBetween(String value1, String value2) {
            addCriterion("customer_balance between", value1, value2, "customerBalance");
            return (Criteria) this;
        }

        public Criteria andCustomerBalanceNotBetween(String value1, String value2) {
            addCriterion("customer_balance not between", value1, value2, "customerBalance");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeIsNull() {
            addCriterion("customer_type is null");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeIsNotNull() {
            addCriterion("customer_type is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeEqualTo(String value) {
            addCriterion("customer_type =", value, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeNotEqualTo(String value) {
            addCriterion("customer_type <>", value, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeGreaterThan(String value) {
            addCriterion("customer_type >", value, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeGreaterThanOrEqualTo(String value) {
            addCriterion("customer_type >=", value, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeLessThan(String value) {
            addCriterion("customer_type <", value, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeLessThanOrEqualTo(String value) {
            addCriterion("customer_type <=", value, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeLike(String value) {
            addCriterion("customer_type like", value, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeNotLike(String value) {
            addCriterion("customer_type not like", value, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeIn(List<String> values) {
            addCriterion("customer_type in", values, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeNotIn(List<String> values) {
            addCriterion("customer_type not in", values, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeBetween(String value1, String value2) {
            addCriterion("customer_type between", value1, value2, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeNotBetween(String value1, String value2) {
            addCriterion("customer_type not between", value1, value2, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerVipLevelIsNull() {
            addCriterion("customer_vip_level is null");
            return (Criteria) this;
        }

        public Criteria andCustomerVipLevelIsNotNull() {
            addCriterion("customer_vip_level is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerVipLevelEqualTo(String value) {
            addCriterion("customer_vip_level =", value, "customerVipLevel");
            return (Criteria) this;
        }

        public Criteria andCustomerVipLevelNotEqualTo(String value) {
            addCriterion("customer_vip_level <>", value, "customerVipLevel");
            return (Criteria) this;
        }

        public Criteria andCustomerVipLevelGreaterThan(String value) {
            addCriterion("customer_vip_level >", value, "customerVipLevel");
            return (Criteria) this;
        }

        public Criteria andCustomerVipLevelGreaterThanOrEqualTo(String value) {
            addCriterion("customer_vip_level >=", value, "customerVipLevel");
            return (Criteria) this;
        }

        public Criteria andCustomerVipLevelLessThan(String value) {
            addCriterion("customer_vip_level <", value, "customerVipLevel");
            return (Criteria) this;
        }

        public Criteria andCustomerVipLevelLessThanOrEqualTo(String value) {
            addCriterion("customer_vip_level <=", value, "customerVipLevel");
            return (Criteria) this;
        }

        public Criteria andCustomerVipLevelLike(String value) {
            addCriterion("customer_vip_level like", value, "customerVipLevel");
            return (Criteria) this;
        }

        public Criteria andCustomerVipLevelNotLike(String value) {
            addCriterion("customer_vip_level not like", value, "customerVipLevel");
            return (Criteria) this;
        }

        public Criteria andCustomerVipLevelIn(List<String> values) {
            addCriterion("customer_vip_level in", values, "customerVipLevel");
            return (Criteria) this;
        }

        public Criteria andCustomerVipLevelNotIn(List<String> values) {
            addCriterion("customer_vip_level not in", values, "customerVipLevel");
            return (Criteria) this;
        }

        public Criteria andCustomerVipLevelBetween(String value1, String value2) {
            addCriterion("customer_vip_level between", value1, value2, "customerVipLevel");
            return (Criteria) this;
        }

        public Criteria andCustomerVipLevelNotBetween(String value1, String value2) {
            addCriterion("customer_vip_level not between", value1, value2, "customerVipLevel");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}