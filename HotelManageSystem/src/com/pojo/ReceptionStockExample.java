package com.pojo;

import java.util.ArrayList;
import java.util.List;

public class ReceptionStockExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ReceptionStockExample() {
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

        public Criteria andReceptionStockIdIsNull() {
            addCriterion("reception_stock_id is null");
            return (Criteria) this;
        }

        public Criteria andReceptionStockIdIsNotNull() {
            addCriterion("reception_stock_id is not null");
            return (Criteria) this;
        }

        public Criteria andReceptionStockIdEqualTo(String value) {
            addCriterion("reception_stock_id =", value, "receptionStockId");
            return (Criteria) this;
        }

        public Criteria andReceptionStockIdNotEqualTo(String value) {
            addCriterion("reception_stock_id <>", value, "receptionStockId");
            return (Criteria) this;
        }

        public Criteria andReceptionStockIdGreaterThan(String value) {
            addCriterion("reception_stock_id >", value, "receptionStockId");
            return (Criteria) this;
        }

        public Criteria andReceptionStockIdGreaterThanOrEqualTo(String value) {
            addCriterion("reception_stock_id >=", value, "receptionStockId");
            return (Criteria) this;
        }

        public Criteria andReceptionStockIdLessThan(String value) {
            addCriterion("reception_stock_id <", value, "receptionStockId");
            return (Criteria) this;
        }

        public Criteria andReceptionStockIdLessThanOrEqualTo(String value) {
            addCriterion("reception_stock_id <=", value, "receptionStockId");
            return (Criteria) this;
        }

        public Criteria andReceptionStockIdLike(String value) {
            addCriterion("reception_stock_id like", value, "receptionStockId");
            return (Criteria) this;
        }

        public Criteria andReceptionStockIdNotLike(String value) {
            addCriterion("reception_stock_id not like", value, "receptionStockId");
            return (Criteria) this;
        }

        public Criteria andReceptionStockIdIn(List<String> values) {
            addCriterion("reception_stock_id in", values, "receptionStockId");
            return (Criteria) this;
        }

        public Criteria andReceptionStockIdNotIn(List<String> values) {
            addCriterion("reception_stock_id not in", values, "receptionStockId");
            return (Criteria) this;
        }

        public Criteria andReceptionStockIdBetween(String value1, String value2) {
            addCriterion("reception_stock_id between", value1, value2, "receptionStockId");
            return (Criteria) this;
        }

        public Criteria andReceptionStockIdNotBetween(String value1, String value2) {
            addCriterion("reception_stock_id not between", value1, value2, "receptionStockId");
            return (Criteria) this;
        }

        public Criteria andReceptionStockNameIsNull() {
            addCriterion("reception_stock_name is null");
            return (Criteria) this;
        }

        public Criteria andReceptionStockNameIsNotNull() {
            addCriterion("reception_stock_name is not null");
            return (Criteria) this;
        }

        public Criteria andReceptionStockNameEqualTo(String value) {
            addCriterion("reception_stock_name =", value, "receptionStockName");
            return (Criteria) this;
        }

        public Criteria andReceptionStockNameNotEqualTo(String value) {
            addCriterion("reception_stock_name <>", value, "receptionStockName");
            return (Criteria) this;
        }

        public Criteria andReceptionStockNameGreaterThan(String value) {
            addCriterion("reception_stock_name >", value, "receptionStockName");
            return (Criteria) this;
        }

        public Criteria andReceptionStockNameGreaterThanOrEqualTo(String value) {
            addCriterion("reception_stock_name >=", value, "receptionStockName");
            return (Criteria) this;
        }

        public Criteria andReceptionStockNameLessThan(String value) {
            addCriterion("reception_stock_name <", value, "receptionStockName");
            return (Criteria) this;
        }

        public Criteria andReceptionStockNameLessThanOrEqualTo(String value) {
            addCriterion("reception_stock_name <=", value, "receptionStockName");
            return (Criteria) this;
        }

        public Criteria andReceptionStockNameLike(String value) {
            addCriterion("reception_stock_name like", value, "receptionStockName");
            return (Criteria) this;
        }

        public Criteria andReceptionStockNameNotLike(String value) {
            addCriterion("reception_stock_name not like", value, "receptionStockName");
            return (Criteria) this;
        }

        public Criteria andReceptionStockNameIn(List<String> values) {
            addCriterion("reception_stock_name in", values, "receptionStockName");
            return (Criteria) this;
        }

        public Criteria andReceptionStockNameNotIn(List<String> values) {
            addCriterion("reception_stock_name not in", values, "receptionStockName");
            return (Criteria) this;
        }

        public Criteria andReceptionStockNameBetween(String value1, String value2) {
            addCriterion("reception_stock_name between", value1, value2, "receptionStockName");
            return (Criteria) this;
        }

        public Criteria andReceptionStockNameNotBetween(String value1, String value2) {
            addCriterion("reception_stock_name not between", value1, value2, "receptionStockName");
            return (Criteria) this;
        }

        public Criteria andReceptionStockNumberIsNull() {
            addCriterion("reception_stock_number is null");
            return (Criteria) this;
        }

        public Criteria andReceptionStockNumberIsNotNull() {
            addCriterion("reception_stock_number is not null");
            return (Criteria) this;
        }

        public Criteria andReceptionStockNumberEqualTo(String value) {
            addCriterion("reception_stock_number =", value, "receptionStockNumber");
            return (Criteria) this;
        }

        public Criteria andReceptionStockNumberNotEqualTo(String value) {
            addCriterion("reception_stock_number <>", value, "receptionStockNumber");
            return (Criteria) this;
        }

        public Criteria andReceptionStockNumberGreaterThan(String value) {
            addCriterion("reception_stock_number >", value, "receptionStockNumber");
            return (Criteria) this;
        }

        public Criteria andReceptionStockNumberGreaterThanOrEqualTo(String value) {
            addCriterion("reception_stock_number >=", value, "receptionStockNumber");
            return (Criteria) this;
        }

        public Criteria andReceptionStockNumberLessThan(String value) {
            addCriterion("reception_stock_number <", value, "receptionStockNumber");
            return (Criteria) this;
        }

        public Criteria andReceptionStockNumberLessThanOrEqualTo(String value) {
            addCriterion("reception_stock_number <=", value, "receptionStockNumber");
            return (Criteria) this;
        }

        public Criteria andReceptionStockNumberLike(String value) {
            addCriterion("reception_stock_number like", value, "receptionStockNumber");
            return (Criteria) this;
        }

        public Criteria andReceptionStockNumberNotLike(String value) {
            addCriterion("reception_stock_number not like", value, "receptionStockNumber");
            return (Criteria) this;
        }

        public Criteria andReceptionStockNumberIn(List<String> values) {
            addCriterion("reception_stock_number in", values, "receptionStockNumber");
            return (Criteria) this;
        }

        public Criteria andReceptionStockNumberNotIn(List<String> values) {
            addCriterion("reception_stock_number not in", values, "receptionStockNumber");
            return (Criteria) this;
        }

        public Criteria andReceptionStockNumberBetween(String value1, String value2) {
            addCriterion("reception_stock_number between", value1, value2, "receptionStockNumber");
            return (Criteria) this;
        }

        public Criteria andReceptionStockNumberNotBetween(String value1, String value2) {
            addCriterion("reception_stock_number not between", value1, value2, "receptionStockNumber");
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