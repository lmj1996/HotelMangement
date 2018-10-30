package com.pojo;

import java.util.ArrayList;
import java.util.List;

public class KitchenStockExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public KitchenStockExample() {
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

        public Criteria andKitchenStockIdIsNull() {
            addCriterion("kitchen_stock_id is null");
            return (Criteria) this;
        }

        public Criteria andKitchenStockIdIsNotNull() {
            addCriterion("kitchen_stock_id is not null");
            return (Criteria) this;
        }

        public Criteria andKitchenStockIdEqualTo(String value) {
            addCriterion("kitchen_stock_id =", value, "kitchenStockId");
            return (Criteria) this;
        }

        public Criteria andKitchenStockIdNotEqualTo(String value) {
            addCriterion("kitchen_stock_id <>", value, "kitchenStockId");
            return (Criteria) this;
        }

        public Criteria andKitchenStockIdGreaterThan(String value) {
            addCriterion("kitchen_stock_id >", value, "kitchenStockId");
            return (Criteria) this;
        }

        public Criteria andKitchenStockIdGreaterThanOrEqualTo(String value) {
            addCriterion("kitchen_stock_id >=", value, "kitchenStockId");
            return (Criteria) this;
        }

        public Criteria andKitchenStockIdLessThan(String value) {
            addCriterion("kitchen_stock_id <", value, "kitchenStockId");
            return (Criteria) this;
        }

        public Criteria andKitchenStockIdLessThanOrEqualTo(String value) {
            addCriterion("kitchen_stock_id <=", value, "kitchenStockId");
            return (Criteria) this;
        }

        public Criteria andKitchenStockIdLike(String value) {
            addCriterion("kitchen_stock_id like", value, "kitchenStockId");
            return (Criteria) this;
        }

        public Criteria andKitchenStockIdNotLike(String value) {
            addCriterion("kitchen_stock_id not like", value, "kitchenStockId");
            return (Criteria) this;
        }

        public Criteria andKitchenStockIdIn(List<String> values) {
            addCriterion("kitchen_stock_id in", values, "kitchenStockId");
            return (Criteria) this;
        }

        public Criteria andKitchenStockIdNotIn(List<String> values) {
            addCriterion("kitchen_stock_id not in", values, "kitchenStockId");
            return (Criteria) this;
        }

        public Criteria andKitchenStockIdBetween(String value1, String value2) {
            addCriterion("kitchen_stock_id between", value1, value2, "kitchenStockId");
            return (Criteria) this;
        }

        public Criteria andKitchenStockIdNotBetween(String value1, String value2) {
            addCriterion("kitchen_stock_id not between", value1, value2, "kitchenStockId");
            return (Criteria) this;
        }

        public Criteria andKitchenStockNameIsNull() {
            addCriterion("kitchen_stock_name is null");
            return (Criteria) this;
        }

        public Criteria andKitchenStockNameIsNotNull() {
            addCriterion("kitchen_stock_name is not null");
            return (Criteria) this;
        }

        public Criteria andKitchenStockNameEqualTo(String value) {
            addCriterion("kitchen_stock_name =", value, "kitchenStockName");
            return (Criteria) this;
        }

        public Criteria andKitchenStockNameNotEqualTo(String value) {
            addCriterion("kitchen_stock_name <>", value, "kitchenStockName");
            return (Criteria) this;
        }

        public Criteria andKitchenStockNameGreaterThan(String value) {
            addCriterion("kitchen_stock_name >", value, "kitchenStockName");
            return (Criteria) this;
        }

        public Criteria andKitchenStockNameGreaterThanOrEqualTo(String value) {
            addCriterion("kitchen_stock_name >=", value, "kitchenStockName");
            return (Criteria) this;
        }

        public Criteria andKitchenStockNameLessThan(String value) {
            addCriterion("kitchen_stock_name <", value, "kitchenStockName");
            return (Criteria) this;
        }

        public Criteria andKitchenStockNameLessThanOrEqualTo(String value) {
            addCriterion("kitchen_stock_name <=", value, "kitchenStockName");
            return (Criteria) this;
        }

        public Criteria andKitchenStockNameLike(String value) {
            addCriterion("kitchen_stock_name like", value, "kitchenStockName");
            return (Criteria) this;
        }

        public Criteria andKitchenStockNameNotLike(String value) {
            addCriterion("kitchen_stock_name not like", value, "kitchenStockName");
            return (Criteria) this;
        }

        public Criteria andKitchenStockNameIn(List<String> values) {
            addCriterion("kitchen_stock_name in", values, "kitchenStockName");
            return (Criteria) this;
        }

        public Criteria andKitchenStockNameNotIn(List<String> values) {
            addCriterion("kitchen_stock_name not in", values, "kitchenStockName");
            return (Criteria) this;
        }

        public Criteria andKitchenStockNameBetween(String value1, String value2) {
            addCriterion("kitchen_stock_name between", value1, value2, "kitchenStockName");
            return (Criteria) this;
        }

        public Criteria andKitchenStockNameNotBetween(String value1, String value2) {
            addCriterion("kitchen_stock_name not between", value1, value2, "kitchenStockName");
            return (Criteria) this;
        }

        public Criteria andKitchenStockNumberIsNull() {
            addCriterion("kitchen_stock_number is null");
            return (Criteria) this;
        }

        public Criteria andKitchenStockNumberIsNotNull() {
            addCriterion("kitchen_stock_number is not null");
            return (Criteria) this;
        }

        public Criteria andKitchenStockNumberEqualTo(String value) {
            addCriterion("kitchen_stock_number =", value, "kitchenStockNumber");
            return (Criteria) this;
        }

        public Criteria andKitchenStockNumberNotEqualTo(String value) {
            addCriterion("kitchen_stock_number <>", value, "kitchenStockNumber");
            return (Criteria) this;
        }

        public Criteria andKitchenStockNumberGreaterThan(String value) {
            addCriterion("kitchen_stock_number >", value, "kitchenStockNumber");
            return (Criteria) this;
        }

        public Criteria andKitchenStockNumberGreaterThanOrEqualTo(String value) {
            addCriterion("kitchen_stock_number >=", value, "kitchenStockNumber");
            return (Criteria) this;
        }

        public Criteria andKitchenStockNumberLessThan(String value) {
            addCriterion("kitchen_stock_number <", value, "kitchenStockNumber");
            return (Criteria) this;
        }

        public Criteria andKitchenStockNumberLessThanOrEqualTo(String value) {
            addCriterion("kitchen_stock_number <=", value, "kitchenStockNumber");
            return (Criteria) this;
        }

        public Criteria andKitchenStockNumberLike(String value) {
            addCriterion("kitchen_stock_number like", value, "kitchenStockNumber");
            return (Criteria) this;
        }

        public Criteria andKitchenStockNumberNotLike(String value) {
            addCriterion("kitchen_stock_number not like", value, "kitchenStockNumber");
            return (Criteria) this;
        }

        public Criteria andKitchenStockNumberIn(List<String> values) {
            addCriterion("kitchen_stock_number in", values, "kitchenStockNumber");
            return (Criteria) this;
        }

        public Criteria andKitchenStockNumberNotIn(List<String> values) {
            addCriterion("kitchen_stock_number not in", values, "kitchenStockNumber");
            return (Criteria) this;
        }

        public Criteria andKitchenStockNumberBetween(String value1, String value2) {
            addCriterion("kitchen_stock_number between", value1, value2, "kitchenStockNumber");
            return (Criteria) this;
        }

        public Criteria andKitchenStockNumberNotBetween(String value1, String value2) {
            addCriterion("kitchen_stock_number not between", value1, value2, "kitchenStockNumber");
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