package com.pojo;

import java.util.ArrayList;
import java.util.List;

public class AddConsumptionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AddConsumptionExample() {
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

        public Criteria andAddConsumptionIdIsNull() {
            addCriterion("add_consumption_id is null");
            return (Criteria) this;
        }

        public Criteria andAddConsumptionIdIsNotNull() {
            addCriterion("add_consumption_id is not null");
            return (Criteria) this;
        }

        public Criteria andAddConsumptionIdEqualTo(String value) {
            addCriterion("add_consumption_id =", value, "addConsumptionId");
            return (Criteria) this;
        }

        public Criteria andAddConsumptionIdNotEqualTo(String value) {
            addCriterion("add_consumption_id <>", value, "addConsumptionId");
            return (Criteria) this;
        }

        public Criteria andAddConsumptionIdGreaterThan(String value) {
            addCriterion("add_consumption_id >", value, "addConsumptionId");
            return (Criteria) this;
        }

        public Criteria andAddConsumptionIdGreaterThanOrEqualTo(String value) {
            addCriterion("add_consumption_id >=", value, "addConsumptionId");
            return (Criteria) this;
        }

        public Criteria andAddConsumptionIdLessThan(String value) {
            addCriterion("add_consumption_id <", value, "addConsumptionId");
            return (Criteria) this;
        }

        public Criteria andAddConsumptionIdLessThanOrEqualTo(String value) {
            addCriterion("add_consumption_id <=", value, "addConsumptionId");
            return (Criteria) this;
        }

        public Criteria andAddConsumptionIdLike(String value) {
            addCriterion("add_consumption_id like", value, "addConsumptionId");
            return (Criteria) this;
        }

        public Criteria andAddConsumptionIdNotLike(String value) {
            addCriterion("add_consumption_id not like", value, "addConsumptionId");
            return (Criteria) this;
        }

        public Criteria andAddConsumptionIdIn(List<String> values) {
            addCriterion("add_consumption_id in", values, "addConsumptionId");
            return (Criteria) this;
        }

        public Criteria andAddConsumptionIdNotIn(List<String> values) {
            addCriterion("add_consumption_id not in", values, "addConsumptionId");
            return (Criteria) this;
        }

        public Criteria andAddConsumptionIdBetween(String value1, String value2) {
            addCriterion("add_consumption_id between", value1, value2, "addConsumptionId");
            return (Criteria) this;
        }

        public Criteria andAddConsumptionIdNotBetween(String value1, String value2) {
            addCriterion("add_consumption_id not between", value1, value2, "addConsumptionId");
            return (Criteria) this;
        }

        public Criteria andAddConsumptionNameIsNull() {
            addCriterion("add_consumption_name is null");
            return (Criteria) this;
        }

        public Criteria andAddConsumptionNameIsNotNull() {
            addCriterion("add_consumption_name is not null");
            return (Criteria) this;
        }

        public Criteria andAddConsumptionNameEqualTo(String value) {
            addCriterion("add_consumption_name =", value, "addConsumptionName");
            return (Criteria) this;
        }

        public Criteria andAddConsumptionNameNotEqualTo(String value) {
            addCriterion("add_consumption_name <>", value, "addConsumptionName");
            return (Criteria) this;
        }

        public Criteria andAddConsumptionNameGreaterThan(String value) {
            addCriterion("add_consumption_name >", value, "addConsumptionName");
            return (Criteria) this;
        }

        public Criteria andAddConsumptionNameGreaterThanOrEqualTo(String value) {
            addCriterion("add_consumption_name >=", value, "addConsumptionName");
            return (Criteria) this;
        }

        public Criteria andAddConsumptionNameLessThan(String value) {
            addCriterion("add_consumption_name <", value, "addConsumptionName");
            return (Criteria) this;
        }

        public Criteria andAddConsumptionNameLessThanOrEqualTo(String value) {
            addCriterion("add_consumption_name <=", value, "addConsumptionName");
            return (Criteria) this;
        }

        public Criteria andAddConsumptionNameLike(String value) {
            addCriterion("add_consumption_name like", value, "addConsumptionName");
            return (Criteria) this;
        }

        public Criteria andAddConsumptionNameNotLike(String value) {
            addCriterion("add_consumption_name not like", value, "addConsumptionName");
            return (Criteria) this;
        }

        public Criteria andAddConsumptionNameIn(List<String> values) {
            addCriterion("add_consumption_name in", values, "addConsumptionName");
            return (Criteria) this;
        }

        public Criteria andAddConsumptionNameNotIn(List<String> values) {
            addCriterion("add_consumption_name not in", values, "addConsumptionName");
            return (Criteria) this;
        }

        public Criteria andAddConsumptionNameBetween(String value1, String value2) {
            addCriterion("add_consumption_name between", value1, value2, "addConsumptionName");
            return (Criteria) this;
        }

        public Criteria andAddConsumptionNameNotBetween(String value1, String value2) {
            addCriterion("add_consumption_name not between", value1, value2, "addConsumptionName");
            return (Criteria) this;
        }

        public Criteria andAddConsumptionPriceIsNull() {
            addCriterion("add_consumption_price is null");
            return (Criteria) this;
        }

        public Criteria andAddConsumptionPriceIsNotNull() {
            addCriterion("add_consumption_price is not null");
            return (Criteria) this;
        }

        public Criteria andAddConsumptionPriceEqualTo(String value) {
            addCriterion("add_consumption_price =", value, "addConsumptionPrice");
            return (Criteria) this;
        }

        public Criteria andAddConsumptionPriceNotEqualTo(String value) {
            addCriterion("add_consumption_price <>", value, "addConsumptionPrice");
            return (Criteria) this;
        }

        public Criteria andAddConsumptionPriceGreaterThan(String value) {
            addCriterion("add_consumption_price >", value, "addConsumptionPrice");
            return (Criteria) this;
        }

        public Criteria andAddConsumptionPriceGreaterThanOrEqualTo(String value) {
            addCriterion("add_consumption_price >=", value, "addConsumptionPrice");
            return (Criteria) this;
        }

        public Criteria andAddConsumptionPriceLessThan(String value) {
            addCriterion("add_consumption_price <", value, "addConsumptionPrice");
            return (Criteria) this;
        }

        public Criteria andAddConsumptionPriceLessThanOrEqualTo(String value) {
            addCriterion("add_consumption_price <=", value, "addConsumptionPrice");
            return (Criteria) this;
        }

        public Criteria andAddConsumptionPriceLike(String value) {
            addCriterion("add_consumption_price like", value, "addConsumptionPrice");
            return (Criteria) this;
        }

        public Criteria andAddConsumptionPriceNotLike(String value) {
            addCriterion("add_consumption_price not like", value, "addConsumptionPrice");
            return (Criteria) this;
        }

        public Criteria andAddConsumptionPriceIn(List<String> values) {
            addCriterion("add_consumption_price in", values, "addConsumptionPrice");
            return (Criteria) this;
        }

        public Criteria andAddConsumptionPriceNotIn(List<String> values) {
            addCriterion("add_consumption_price not in", values, "addConsumptionPrice");
            return (Criteria) this;
        }

        public Criteria andAddConsumptionPriceBetween(String value1, String value2) {
            addCriterion("add_consumption_price between", value1, value2, "addConsumptionPrice");
            return (Criteria) this;
        }

        public Criteria andAddConsumptionPriceNotBetween(String value1, String value2) {
            addCriterion("add_consumption_price not between", value1, value2, "addConsumptionPrice");
            return (Criteria) this;
        }

        public Criteria andAddConsumptionCustomerIsNull() {
            addCriterion("add_consumption_customer is null");
            return (Criteria) this;
        }

        public Criteria andAddConsumptionCustomerIsNotNull() {
            addCriterion("add_consumption_customer is not null");
            return (Criteria) this;
        }

        public Criteria andAddConsumptionCustomerEqualTo(String value) {
            addCriterion("add_consumption_customer =", value, "addConsumptionCustomer");
            return (Criteria) this;
        }

        public Criteria andAddConsumptionCustomerNotEqualTo(String value) {
            addCriterion("add_consumption_customer <>", value, "addConsumptionCustomer");
            return (Criteria) this;
        }

        public Criteria andAddConsumptionCustomerGreaterThan(String value) {
            addCriterion("add_consumption_customer >", value, "addConsumptionCustomer");
            return (Criteria) this;
        }

        public Criteria andAddConsumptionCustomerGreaterThanOrEqualTo(String value) {
            addCriterion("add_consumption_customer >=", value, "addConsumptionCustomer");
            return (Criteria) this;
        }

        public Criteria andAddConsumptionCustomerLessThan(String value) {
            addCriterion("add_consumption_customer <", value, "addConsumptionCustomer");
            return (Criteria) this;
        }

        public Criteria andAddConsumptionCustomerLessThanOrEqualTo(String value) {
            addCriterion("add_consumption_customer <=", value, "addConsumptionCustomer");
            return (Criteria) this;
        }

        public Criteria andAddConsumptionCustomerLike(String value) {
            addCriterion("add_consumption_customer like", value, "addConsumptionCustomer");
            return (Criteria) this;
        }

        public Criteria andAddConsumptionCustomerNotLike(String value) {
            addCriterion("add_consumption_customer not like", value, "addConsumptionCustomer");
            return (Criteria) this;
        }

        public Criteria andAddConsumptionCustomerIn(List<String> values) {
            addCriterion("add_consumption_customer in", values, "addConsumptionCustomer");
            return (Criteria) this;
        }

        public Criteria andAddConsumptionCustomerNotIn(List<String> values) {
            addCriterion("add_consumption_customer not in", values, "addConsumptionCustomer");
            return (Criteria) this;
        }

        public Criteria andAddConsumptionCustomerBetween(String value1, String value2) {
            addCriterion("add_consumption_customer between", value1, value2, "addConsumptionCustomer");
            return (Criteria) this;
        }

        public Criteria andAddConsumptionCustomerNotBetween(String value1, String value2) {
            addCriterion("add_consumption_customer not between", value1, value2, "addConsumptionCustomer");
            return (Criteria) this;
        }

        public Criteria andAddConsumptionRoomIsNull() {
            addCriterion("add_consumption_room is null");
            return (Criteria) this;
        }

        public Criteria andAddConsumptionRoomIsNotNull() {
            addCriterion("add_consumption_room is not null");
            return (Criteria) this;
        }

        public Criteria andAddConsumptionRoomEqualTo(String value) {
            addCriterion("add_consumption_room =", value, "addConsumptionRoom");
            return (Criteria) this;
        }

        public Criteria andAddConsumptionRoomNotEqualTo(String value) {
            addCriterion("add_consumption_room <>", value, "addConsumptionRoom");
            return (Criteria) this;
        }

        public Criteria andAddConsumptionRoomGreaterThan(String value) {
            addCriterion("add_consumption_room >", value, "addConsumptionRoom");
            return (Criteria) this;
        }

        public Criteria andAddConsumptionRoomGreaterThanOrEqualTo(String value) {
            addCriterion("add_consumption_room >=", value, "addConsumptionRoom");
            return (Criteria) this;
        }

        public Criteria andAddConsumptionRoomLessThan(String value) {
            addCriterion("add_consumption_room <", value, "addConsumptionRoom");
            return (Criteria) this;
        }

        public Criteria andAddConsumptionRoomLessThanOrEqualTo(String value) {
            addCriterion("add_consumption_room <=", value, "addConsumptionRoom");
            return (Criteria) this;
        }

        public Criteria andAddConsumptionRoomLike(String value) {
            addCriterion("add_consumption_room like", value, "addConsumptionRoom");
            return (Criteria) this;
        }

        public Criteria andAddConsumptionRoomNotLike(String value) {
            addCriterion("add_consumption_room not like", value, "addConsumptionRoom");
            return (Criteria) this;
        }

        public Criteria andAddConsumptionRoomIn(List<String> values) {
            addCriterion("add_consumption_room in", values, "addConsumptionRoom");
            return (Criteria) this;
        }

        public Criteria andAddConsumptionRoomNotIn(List<String> values) {
            addCriterion("add_consumption_room not in", values, "addConsumptionRoom");
            return (Criteria) this;
        }

        public Criteria andAddConsumptionRoomBetween(String value1, String value2) {
            addCriterion("add_consumption_room between", value1, value2, "addConsumptionRoom");
            return (Criteria) this;
        }

        public Criteria andAddConsumptionRoomNotBetween(String value1, String value2) {
            addCriterion("add_consumption_room not between", value1, value2, "addConsumptionRoom");
            return (Criteria) this;
        }

        public Criteria andAddConsumptionTimeIsNull() {
            addCriterion("add_consumption_time is null");
            return (Criteria) this;
        }

        public Criteria andAddConsumptionTimeIsNotNull() {
            addCriterion("add_consumption_time is not null");
            return (Criteria) this;
        }

        public Criteria andAddConsumptionTimeEqualTo(String value) {
            addCriterion("add_consumption_time =", value, "addConsumptionTime");
            return (Criteria) this;
        }

        public Criteria andAddConsumptionTimeNotEqualTo(String value) {
            addCriterion("add_consumption_time <>", value, "addConsumptionTime");
            return (Criteria) this;
        }

        public Criteria andAddConsumptionTimeGreaterThan(String value) {
            addCriterion("add_consumption_time >", value, "addConsumptionTime");
            return (Criteria) this;
        }

        public Criteria andAddConsumptionTimeGreaterThanOrEqualTo(String value) {
            addCriterion("add_consumption_time >=", value, "addConsumptionTime");
            return (Criteria) this;
        }

        public Criteria andAddConsumptionTimeLessThan(String value) {
            addCriterion("add_consumption_time <", value, "addConsumptionTime");
            return (Criteria) this;
        }

        public Criteria andAddConsumptionTimeLessThanOrEqualTo(String value) {
            addCriterion("add_consumption_time <=", value, "addConsumptionTime");
            return (Criteria) this;
        }

        public Criteria andAddConsumptionTimeLike(String value) {
            addCriterion("add_consumption_time like", value, "addConsumptionTime");
            return (Criteria) this;
        }

        public Criteria andAddConsumptionTimeNotLike(String value) {
            addCriterion("add_consumption_time not like", value, "addConsumptionTime");
            return (Criteria) this;
        }

        public Criteria andAddConsumptionTimeIn(List<String> values) {
            addCriterion("add_consumption_time in", values, "addConsumptionTime");
            return (Criteria) this;
        }

        public Criteria andAddConsumptionTimeNotIn(List<String> values) {
            addCriterion("add_consumption_time not in", values, "addConsumptionTime");
            return (Criteria) this;
        }

        public Criteria andAddConsumptionTimeBetween(String value1, String value2) {
            addCriterion("add_consumption_time between", value1, value2, "addConsumptionTime");
            return (Criteria) this;
        }

        public Criteria andAddConsumptionTimeNotBetween(String value1, String value2) {
            addCriterion("add_consumption_time not between", value1, value2, "addConsumptionTime");
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