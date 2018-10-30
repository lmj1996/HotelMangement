package com.pojo;

import java.util.ArrayList;
import java.util.List;

public class StockPurchaseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StockPurchaseExample() {
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

        public Criteria andStockPurchaseIdIsNull() {
            addCriterion("stock_purchase_id is null");
            return (Criteria) this;
        }

        public Criteria andStockPurchaseIdIsNotNull() {
            addCriterion("stock_purchase_id is not null");
            return (Criteria) this;
        }

        public Criteria andStockPurchaseIdEqualTo(String value) {
            addCriterion("stock_purchase_id =", value, "stockPurchaseId");
            return (Criteria) this;
        }

        public Criteria andStockPurchaseIdNotEqualTo(String value) {
            addCriterion("stock_purchase_id <>", value, "stockPurchaseId");
            return (Criteria) this;
        }

        public Criteria andStockPurchaseIdGreaterThan(String value) {
            addCriterion("stock_purchase_id >", value, "stockPurchaseId");
            return (Criteria) this;
        }

        public Criteria andStockPurchaseIdGreaterThanOrEqualTo(String value) {
            addCriterion("stock_purchase_id >=", value, "stockPurchaseId");
            return (Criteria) this;
        }

        public Criteria andStockPurchaseIdLessThan(String value) {
            addCriterion("stock_purchase_id <", value, "stockPurchaseId");
            return (Criteria) this;
        }

        public Criteria andStockPurchaseIdLessThanOrEqualTo(String value) {
            addCriterion("stock_purchase_id <=", value, "stockPurchaseId");
            return (Criteria) this;
        }

        public Criteria andStockPurchaseIdLike(String value) {
            addCriterion("stock_purchase_id like", value, "stockPurchaseId");
            return (Criteria) this;
        }

        public Criteria andStockPurchaseIdNotLike(String value) {
            addCriterion("stock_purchase_id not like", value, "stockPurchaseId");
            return (Criteria) this;
        }

        public Criteria andStockPurchaseIdIn(List<String> values) {
            addCriterion("stock_purchase_id in", values, "stockPurchaseId");
            return (Criteria) this;
        }

        public Criteria andStockPurchaseIdNotIn(List<String> values) {
            addCriterion("stock_purchase_id not in", values, "stockPurchaseId");
            return (Criteria) this;
        }

        public Criteria andStockPurchaseIdBetween(String value1, String value2) {
            addCriterion("stock_purchase_id between", value1, value2, "stockPurchaseId");
            return (Criteria) this;
        }

        public Criteria andStockPurchaseIdNotBetween(String value1, String value2) {
            addCriterion("stock_purchase_id not between", value1, value2, "stockPurchaseId");
            return (Criteria) this;
        }

        public Criteria andStockPurchaseNumIsNull() {
            addCriterion("stock_purchase_num is null");
            return (Criteria) this;
        }

        public Criteria andStockPurchaseNumIsNotNull() {
            addCriterion("stock_purchase_num is not null");
            return (Criteria) this;
        }

        public Criteria andStockPurchaseNumEqualTo(String value) {
            addCriterion("stock_purchase_num =", value, "stockPurchaseNum");
            return (Criteria) this;
        }

        public Criteria andStockPurchaseNumNotEqualTo(String value) {
            addCriterion("stock_purchase_num <>", value, "stockPurchaseNum");
            return (Criteria) this;
        }

        public Criteria andStockPurchaseNumGreaterThan(String value) {
            addCriterion("stock_purchase_num >", value, "stockPurchaseNum");
            return (Criteria) this;
        }

        public Criteria andStockPurchaseNumGreaterThanOrEqualTo(String value) {
            addCriterion("stock_purchase_num >=", value, "stockPurchaseNum");
            return (Criteria) this;
        }

        public Criteria andStockPurchaseNumLessThan(String value) {
            addCriterion("stock_purchase_num <", value, "stockPurchaseNum");
            return (Criteria) this;
        }

        public Criteria andStockPurchaseNumLessThanOrEqualTo(String value) {
            addCriterion("stock_purchase_num <=", value, "stockPurchaseNum");
            return (Criteria) this;
        }

        public Criteria andStockPurchaseNumLike(String value) {
            addCriterion("stock_purchase_num like", value, "stockPurchaseNum");
            return (Criteria) this;
        }

        public Criteria andStockPurchaseNumNotLike(String value) {
            addCriterion("stock_purchase_num not like", value, "stockPurchaseNum");
            return (Criteria) this;
        }

        public Criteria andStockPurchaseNumIn(List<String> values) {
            addCriterion("stock_purchase_num in", values, "stockPurchaseNum");
            return (Criteria) this;
        }

        public Criteria andStockPurchaseNumNotIn(List<String> values) {
            addCriterion("stock_purchase_num not in", values, "stockPurchaseNum");
            return (Criteria) this;
        }

        public Criteria andStockPurchaseNumBetween(String value1, String value2) {
            addCriterion("stock_purchase_num between", value1, value2, "stockPurchaseNum");
            return (Criteria) this;
        }

        public Criteria andStockPurchaseNumNotBetween(String value1, String value2) {
            addCriterion("stock_purchase_num not between", value1, value2, "stockPurchaseNum");
            return (Criteria) this;
        }

        public Criteria andStockPurchaseNameIsNull() {
            addCriterion("stock_purchase_name is null");
            return (Criteria) this;
        }

        public Criteria andStockPurchaseNameIsNotNull() {
            addCriterion("stock_purchase_name is not null");
            return (Criteria) this;
        }

        public Criteria andStockPurchaseNameEqualTo(String value) {
            addCriterion("stock_purchase_name =", value, "stockPurchaseName");
            return (Criteria) this;
        }

        public Criteria andStockPurchaseNameNotEqualTo(String value) {
            addCriterion("stock_purchase_name <>", value, "stockPurchaseName");
            return (Criteria) this;
        }

        public Criteria andStockPurchaseNameGreaterThan(String value) {
            addCriterion("stock_purchase_name >", value, "stockPurchaseName");
            return (Criteria) this;
        }

        public Criteria andStockPurchaseNameGreaterThanOrEqualTo(String value) {
            addCriterion("stock_purchase_name >=", value, "stockPurchaseName");
            return (Criteria) this;
        }

        public Criteria andStockPurchaseNameLessThan(String value) {
            addCriterion("stock_purchase_name <", value, "stockPurchaseName");
            return (Criteria) this;
        }

        public Criteria andStockPurchaseNameLessThanOrEqualTo(String value) {
            addCriterion("stock_purchase_name <=", value, "stockPurchaseName");
            return (Criteria) this;
        }

        public Criteria andStockPurchaseNameLike(String value) {
            addCriterion("stock_purchase_name like", value, "stockPurchaseName");
            return (Criteria) this;
        }

        public Criteria andStockPurchaseNameNotLike(String value) {
            addCriterion("stock_purchase_name not like", value, "stockPurchaseName");
            return (Criteria) this;
        }

        public Criteria andStockPurchaseNameIn(List<String> values) {
            addCriterion("stock_purchase_name in", values, "stockPurchaseName");
            return (Criteria) this;
        }

        public Criteria andStockPurchaseNameNotIn(List<String> values) {
            addCriterion("stock_purchase_name not in", values, "stockPurchaseName");
            return (Criteria) this;
        }

        public Criteria andStockPurchaseNameBetween(String value1, String value2) {
            addCriterion("stock_purchase_name between", value1, value2, "stockPurchaseName");
            return (Criteria) this;
        }

        public Criteria andStockPurchaseNameNotBetween(String value1, String value2) {
            addCriterion("stock_purchase_name not between", value1, value2, "stockPurchaseName");
            return (Criteria) this;
        }

        public Criteria andStockPurchasePriceIsNull() {
            addCriterion("stock_purchase_price is null");
            return (Criteria) this;
        }

        public Criteria andStockPurchasePriceIsNotNull() {
            addCriterion("stock_purchase_price is not null");
            return (Criteria) this;
        }

        public Criteria andStockPurchasePriceEqualTo(String value) {
            addCriterion("stock_purchase_price =", value, "stockPurchasePrice");
            return (Criteria) this;
        }

        public Criteria andStockPurchasePriceNotEqualTo(String value) {
            addCriterion("stock_purchase_price <>", value, "stockPurchasePrice");
            return (Criteria) this;
        }

        public Criteria andStockPurchasePriceGreaterThan(String value) {
            addCriterion("stock_purchase_price >", value, "stockPurchasePrice");
            return (Criteria) this;
        }

        public Criteria andStockPurchasePriceGreaterThanOrEqualTo(String value) {
            addCriterion("stock_purchase_price >=", value, "stockPurchasePrice");
            return (Criteria) this;
        }

        public Criteria andStockPurchasePriceLessThan(String value) {
            addCriterion("stock_purchase_price <", value, "stockPurchasePrice");
            return (Criteria) this;
        }

        public Criteria andStockPurchasePriceLessThanOrEqualTo(String value) {
            addCriterion("stock_purchase_price <=", value, "stockPurchasePrice");
            return (Criteria) this;
        }

        public Criteria andStockPurchasePriceLike(String value) {
            addCriterion("stock_purchase_price like", value, "stockPurchasePrice");
            return (Criteria) this;
        }

        public Criteria andStockPurchasePriceNotLike(String value) {
            addCriterion("stock_purchase_price not like", value, "stockPurchasePrice");
            return (Criteria) this;
        }

        public Criteria andStockPurchasePriceIn(List<String> values) {
            addCriterion("stock_purchase_price in", values, "stockPurchasePrice");
            return (Criteria) this;
        }

        public Criteria andStockPurchasePriceNotIn(List<String> values) {
            addCriterion("stock_purchase_price not in", values, "stockPurchasePrice");
            return (Criteria) this;
        }

        public Criteria andStockPurchasePriceBetween(String value1, String value2) {
            addCriterion("stock_purchase_price between", value1, value2, "stockPurchasePrice");
            return (Criteria) this;
        }

        public Criteria andStockPurchasePriceNotBetween(String value1, String value2) {
            addCriterion("stock_purchase_price not between", value1, value2, "stockPurchasePrice");
            return (Criteria) this;
        }

        public Criteria andStockPurchaseNumberIsNull() {
            addCriterion("stock_purchase_number is null");
            return (Criteria) this;
        }

        public Criteria andStockPurchaseNumberIsNotNull() {
            addCriterion("stock_purchase_number is not null");
            return (Criteria) this;
        }

        public Criteria andStockPurchaseNumberEqualTo(String value) {
            addCriterion("stock_purchase_number =", value, "stockPurchaseNumber");
            return (Criteria) this;
        }

        public Criteria andStockPurchaseNumberNotEqualTo(String value) {
            addCriterion("stock_purchase_number <>", value, "stockPurchaseNumber");
            return (Criteria) this;
        }

        public Criteria andStockPurchaseNumberGreaterThan(String value) {
            addCriterion("stock_purchase_number >", value, "stockPurchaseNumber");
            return (Criteria) this;
        }

        public Criteria andStockPurchaseNumberGreaterThanOrEqualTo(String value) {
            addCriterion("stock_purchase_number >=", value, "stockPurchaseNumber");
            return (Criteria) this;
        }

        public Criteria andStockPurchaseNumberLessThan(String value) {
            addCriterion("stock_purchase_number <", value, "stockPurchaseNumber");
            return (Criteria) this;
        }

        public Criteria andStockPurchaseNumberLessThanOrEqualTo(String value) {
            addCriterion("stock_purchase_number <=", value, "stockPurchaseNumber");
            return (Criteria) this;
        }

        public Criteria andStockPurchaseNumberLike(String value) {
            addCriterion("stock_purchase_number like", value, "stockPurchaseNumber");
            return (Criteria) this;
        }

        public Criteria andStockPurchaseNumberNotLike(String value) {
            addCriterion("stock_purchase_number not like", value, "stockPurchaseNumber");
            return (Criteria) this;
        }

        public Criteria andStockPurchaseNumberIn(List<String> values) {
            addCriterion("stock_purchase_number in", values, "stockPurchaseNumber");
            return (Criteria) this;
        }

        public Criteria andStockPurchaseNumberNotIn(List<String> values) {
            addCriterion("stock_purchase_number not in", values, "stockPurchaseNumber");
            return (Criteria) this;
        }

        public Criteria andStockPurchaseNumberBetween(String value1, String value2) {
            addCriterion("stock_purchase_number between", value1, value2, "stockPurchaseNumber");
            return (Criteria) this;
        }

        public Criteria andStockPurchaseNumberNotBetween(String value1, String value2) {
            addCriterion("stock_purchase_number not between", value1, value2, "stockPurchaseNumber");
            return (Criteria) this;
        }

        public Criteria andStockPurchaseStaffIsNull() {
            addCriterion("stock_purchase_staff is null");
            return (Criteria) this;
        }

        public Criteria andStockPurchaseStaffIsNotNull() {
            addCriterion("stock_purchase_staff is not null");
            return (Criteria) this;
        }

        public Criteria andStockPurchaseStaffEqualTo(String value) {
            addCriterion("stock_purchase_staff =", value, "stockPurchaseStaff");
            return (Criteria) this;
        }

        public Criteria andStockPurchaseStaffNotEqualTo(String value) {
            addCriterion("stock_purchase_staff <>", value, "stockPurchaseStaff");
            return (Criteria) this;
        }

        public Criteria andStockPurchaseStaffGreaterThan(String value) {
            addCriterion("stock_purchase_staff >", value, "stockPurchaseStaff");
            return (Criteria) this;
        }

        public Criteria andStockPurchaseStaffGreaterThanOrEqualTo(String value) {
            addCriterion("stock_purchase_staff >=", value, "stockPurchaseStaff");
            return (Criteria) this;
        }

        public Criteria andStockPurchaseStaffLessThan(String value) {
            addCriterion("stock_purchase_staff <", value, "stockPurchaseStaff");
            return (Criteria) this;
        }

        public Criteria andStockPurchaseStaffLessThanOrEqualTo(String value) {
            addCriterion("stock_purchase_staff <=", value, "stockPurchaseStaff");
            return (Criteria) this;
        }

        public Criteria andStockPurchaseStaffLike(String value) {
            addCriterion("stock_purchase_staff like", value, "stockPurchaseStaff");
            return (Criteria) this;
        }

        public Criteria andStockPurchaseStaffNotLike(String value) {
            addCriterion("stock_purchase_staff not like", value, "stockPurchaseStaff");
            return (Criteria) this;
        }

        public Criteria andStockPurchaseStaffIn(List<String> values) {
            addCriterion("stock_purchase_staff in", values, "stockPurchaseStaff");
            return (Criteria) this;
        }

        public Criteria andStockPurchaseStaffNotIn(List<String> values) {
            addCriterion("stock_purchase_staff not in", values, "stockPurchaseStaff");
            return (Criteria) this;
        }

        public Criteria andStockPurchaseStaffBetween(String value1, String value2) {
            addCriterion("stock_purchase_staff between", value1, value2, "stockPurchaseStaff");
            return (Criteria) this;
        }

        public Criteria andStockPurchaseStaffNotBetween(String value1, String value2) {
            addCriterion("stock_purchase_staff not between", value1, value2, "stockPurchaseStaff");
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