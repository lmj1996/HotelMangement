package com.pojo;

import java.util.ArrayList;
import java.util.List;

public class StockReceiveExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StockReceiveExample() {
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

        public Criteria andStockReceiveIdIsNull() {
            addCriterion("stock_receive_id is null");
            return (Criteria) this;
        }

        public Criteria andStockReceiveIdIsNotNull() {
            addCriterion("stock_receive_id is not null");
            return (Criteria) this;
        }

        public Criteria andStockReceiveIdEqualTo(String value) {
            addCriterion("stock_receive_id =", value, "stockReceiveId");
            return (Criteria) this;
        }

        public Criteria andStockReceiveIdNotEqualTo(String value) {
            addCriterion("stock_receive_id <>", value, "stockReceiveId");
            return (Criteria) this;
        }

        public Criteria andStockReceiveIdGreaterThan(String value) {
            addCriterion("stock_receive_id >", value, "stockReceiveId");
            return (Criteria) this;
        }

        public Criteria andStockReceiveIdGreaterThanOrEqualTo(String value) {
            addCriterion("stock_receive_id >=", value, "stockReceiveId");
            return (Criteria) this;
        }

        public Criteria andStockReceiveIdLessThan(String value) {
            addCriterion("stock_receive_id <", value, "stockReceiveId");
            return (Criteria) this;
        }

        public Criteria andStockReceiveIdLessThanOrEqualTo(String value) {
            addCriterion("stock_receive_id <=", value, "stockReceiveId");
            return (Criteria) this;
        }

        public Criteria andStockReceiveIdLike(String value) {
            addCriterion("stock_receive_id like", value, "stockReceiveId");
            return (Criteria) this;
        }

        public Criteria andStockReceiveIdNotLike(String value) {
            addCriterion("stock_receive_id not like", value, "stockReceiveId");
            return (Criteria) this;
        }

        public Criteria andStockReceiveIdIn(List<String> values) {
            addCriterion("stock_receive_id in", values, "stockReceiveId");
            return (Criteria) this;
        }

        public Criteria andStockReceiveIdNotIn(List<String> values) {
            addCriterion("stock_receive_id not in", values, "stockReceiveId");
            return (Criteria) this;
        }

        public Criteria andStockReceiveIdBetween(String value1, String value2) {
            addCriterion("stock_receive_id between", value1, value2, "stockReceiveId");
            return (Criteria) this;
        }

        public Criteria andStockReceiveIdNotBetween(String value1, String value2) {
            addCriterion("stock_receive_id not between", value1, value2, "stockReceiveId");
            return (Criteria) this;
        }

        public Criteria andStockReceiveNameIsNull() {
            addCriterion("stock_receive_name is null");
            return (Criteria) this;
        }

        public Criteria andStockReceiveNameIsNotNull() {
            addCriterion("stock_receive_name is not null");
            return (Criteria) this;
        }

        public Criteria andStockReceiveNameEqualTo(String value) {
            addCriterion("stock_receive_name =", value, "stockReceiveName");
            return (Criteria) this;
        }

        public Criteria andStockReceiveNameNotEqualTo(String value) {
            addCriterion("stock_receive_name <>", value, "stockReceiveName");
            return (Criteria) this;
        }

        public Criteria andStockReceiveNameGreaterThan(String value) {
            addCriterion("stock_receive_name >", value, "stockReceiveName");
            return (Criteria) this;
        }

        public Criteria andStockReceiveNameGreaterThanOrEqualTo(String value) {
            addCriterion("stock_receive_name >=", value, "stockReceiveName");
            return (Criteria) this;
        }

        public Criteria andStockReceiveNameLessThan(String value) {
            addCriterion("stock_receive_name <", value, "stockReceiveName");
            return (Criteria) this;
        }

        public Criteria andStockReceiveNameLessThanOrEqualTo(String value) {
            addCriterion("stock_receive_name <=", value, "stockReceiveName");
            return (Criteria) this;
        }

        public Criteria andStockReceiveNameLike(String value) {
            addCriterion("stock_receive_name like", value, "stockReceiveName");
            return (Criteria) this;
        }

        public Criteria andStockReceiveNameNotLike(String value) {
            addCriterion("stock_receive_name not like", value, "stockReceiveName");
            return (Criteria) this;
        }

        public Criteria andStockReceiveNameIn(List<String> values) {
            addCriterion("stock_receive_name in", values, "stockReceiveName");
            return (Criteria) this;
        }

        public Criteria andStockReceiveNameNotIn(List<String> values) {
            addCriterion("stock_receive_name not in", values, "stockReceiveName");
            return (Criteria) this;
        }

        public Criteria andStockReceiveNameBetween(String value1, String value2) {
            addCriterion("stock_receive_name between", value1, value2, "stockReceiveName");
            return (Criteria) this;
        }

        public Criteria andStockReceiveNameNotBetween(String value1, String value2) {
            addCriterion("stock_receive_name not between", value1, value2, "stockReceiveName");
            return (Criteria) this;
        }

        public Criteria andStockReceiveNumIsNull() {
            addCriterion("stock_receive_num is null");
            return (Criteria) this;
        }

        public Criteria andStockReceiveNumIsNotNull() {
            addCriterion("stock_receive_num is not null");
            return (Criteria) this;
        }

        public Criteria andStockReceiveNumEqualTo(String value) {
            addCriterion("stock_receive_num =", value, "stockReceiveNum");
            return (Criteria) this;
        }

        public Criteria andStockReceiveNumNotEqualTo(String value) {
            addCriterion("stock_receive_num <>", value, "stockReceiveNum");
            return (Criteria) this;
        }

        public Criteria andStockReceiveNumGreaterThan(String value) {
            addCriterion("stock_receive_num >", value, "stockReceiveNum");
            return (Criteria) this;
        }

        public Criteria andStockReceiveNumGreaterThanOrEqualTo(String value) {
            addCriterion("stock_receive_num >=", value, "stockReceiveNum");
            return (Criteria) this;
        }

        public Criteria andStockReceiveNumLessThan(String value) {
            addCriterion("stock_receive_num <", value, "stockReceiveNum");
            return (Criteria) this;
        }

        public Criteria andStockReceiveNumLessThanOrEqualTo(String value) {
            addCriterion("stock_receive_num <=", value, "stockReceiveNum");
            return (Criteria) this;
        }

        public Criteria andStockReceiveNumLike(String value) {
            addCriterion("stock_receive_num like", value, "stockReceiveNum");
            return (Criteria) this;
        }

        public Criteria andStockReceiveNumNotLike(String value) {
            addCriterion("stock_receive_num not like", value, "stockReceiveNum");
            return (Criteria) this;
        }

        public Criteria andStockReceiveNumIn(List<String> values) {
            addCriterion("stock_receive_num in", values, "stockReceiveNum");
            return (Criteria) this;
        }

        public Criteria andStockReceiveNumNotIn(List<String> values) {
            addCriterion("stock_receive_num not in", values, "stockReceiveNum");
            return (Criteria) this;
        }

        public Criteria andStockReceiveNumBetween(String value1, String value2) {
            addCriterion("stock_receive_num between", value1, value2, "stockReceiveNum");
            return (Criteria) this;
        }

        public Criteria andStockReceiveNumNotBetween(String value1, String value2) {
            addCriterion("stock_receive_num not between", value1, value2, "stockReceiveNum");
            return (Criteria) this;
        }

        public Criteria andStockReceiveStaffIsNull() {
            addCriterion("stock_receive_staff is null");
            return (Criteria) this;
        }

        public Criteria andStockReceiveStaffIsNotNull() {
            addCriterion("stock_receive_staff is not null");
            return (Criteria) this;
        }

        public Criteria andStockReceiveStaffEqualTo(String value) {
            addCriterion("stock_receive_staff =", value, "stockReceiveStaff");
            return (Criteria) this;
        }

        public Criteria andStockReceiveStaffNotEqualTo(String value) {
            addCriterion("stock_receive_staff <>", value, "stockReceiveStaff");
            return (Criteria) this;
        }

        public Criteria andStockReceiveStaffGreaterThan(String value) {
            addCriterion("stock_receive_staff >", value, "stockReceiveStaff");
            return (Criteria) this;
        }

        public Criteria andStockReceiveStaffGreaterThanOrEqualTo(String value) {
            addCriterion("stock_receive_staff >=", value, "stockReceiveStaff");
            return (Criteria) this;
        }

        public Criteria andStockReceiveStaffLessThan(String value) {
            addCriterion("stock_receive_staff <", value, "stockReceiveStaff");
            return (Criteria) this;
        }

        public Criteria andStockReceiveStaffLessThanOrEqualTo(String value) {
            addCriterion("stock_receive_staff <=", value, "stockReceiveStaff");
            return (Criteria) this;
        }

        public Criteria andStockReceiveStaffLike(String value) {
            addCriterion("stock_receive_staff like", value, "stockReceiveStaff");
            return (Criteria) this;
        }

        public Criteria andStockReceiveStaffNotLike(String value) {
            addCriterion("stock_receive_staff not like", value, "stockReceiveStaff");
            return (Criteria) this;
        }

        public Criteria andStockReceiveStaffIn(List<String> values) {
            addCriterion("stock_receive_staff in", values, "stockReceiveStaff");
            return (Criteria) this;
        }

        public Criteria andStockReceiveStaffNotIn(List<String> values) {
            addCriterion("stock_receive_staff not in", values, "stockReceiveStaff");
            return (Criteria) this;
        }

        public Criteria andStockReceiveStaffBetween(String value1, String value2) {
            addCriterion("stock_receive_staff between", value1, value2, "stockReceiveStaff");
            return (Criteria) this;
        }

        public Criteria andStockReceiveStaffNotBetween(String value1, String value2) {
            addCriterion("stock_receive_staff not between", value1, value2, "stockReceiveStaff");
            return (Criteria) this;
        }

        public Criteria andStockReceiveTimeIsNull() {
            addCriterion("stock_receive_time is null");
            return (Criteria) this;
        }

        public Criteria andStockReceiveTimeIsNotNull() {
            addCriterion("stock_receive_time is not null");
            return (Criteria) this;
        }

        public Criteria andStockReceiveTimeEqualTo(String value) {
            addCriterion("stock_receive_time =", value, "stockReceiveTime");
            return (Criteria) this;
        }

        public Criteria andStockReceiveTimeNotEqualTo(String value) {
            addCriterion("stock_receive_time <>", value, "stockReceiveTime");
            return (Criteria) this;
        }

        public Criteria andStockReceiveTimeGreaterThan(String value) {
            addCriterion("stock_receive_time >", value, "stockReceiveTime");
            return (Criteria) this;
        }

        public Criteria andStockReceiveTimeGreaterThanOrEqualTo(String value) {
            addCriterion("stock_receive_time >=", value, "stockReceiveTime");
            return (Criteria) this;
        }

        public Criteria andStockReceiveTimeLessThan(String value) {
            addCriterion("stock_receive_time <", value, "stockReceiveTime");
            return (Criteria) this;
        }

        public Criteria andStockReceiveTimeLessThanOrEqualTo(String value) {
            addCriterion("stock_receive_time <=", value, "stockReceiveTime");
            return (Criteria) this;
        }

        public Criteria andStockReceiveTimeLike(String value) {
            addCriterion("stock_receive_time like", value, "stockReceiveTime");
            return (Criteria) this;
        }

        public Criteria andStockReceiveTimeNotLike(String value) {
            addCriterion("stock_receive_time not like", value, "stockReceiveTime");
            return (Criteria) this;
        }

        public Criteria andStockReceiveTimeIn(List<String> values) {
            addCriterion("stock_receive_time in", values, "stockReceiveTime");
            return (Criteria) this;
        }

        public Criteria andStockReceiveTimeNotIn(List<String> values) {
            addCriterion("stock_receive_time not in", values, "stockReceiveTime");
            return (Criteria) this;
        }

        public Criteria andStockReceiveTimeBetween(String value1, String value2) {
            addCriterion("stock_receive_time between", value1, value2, "stockReceiveTime");
            return (Criteria) this;
        }

        public Criteria andStockReceiveTimeNotBetween(String value1, String value2) {
            addCriterion("stock_receive_time not between", value1, value2, "stockReceiveTime");
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