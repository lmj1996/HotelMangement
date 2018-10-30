package com.pojo;

import java.util.ArrayList;
import java.util.List;

public class RechargeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RechargeExample() {
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

        public Criteria andRechargeIdIsNull() {
            addCriterion("recharge_id is null");
            return (Criteria) this;
        }

        public Criteria andRechargeIdIsNotNull() {
            addCriterion("recharge_id is not null");
            return (Criteria) this;
        }

        public Criteria andRechargeIdEqualTo(String value) {
            addCriterion("recharge_id =", value, "rechargeId");
            return (Criteria) this;
        }

        public Criteria andRechargeIdNotEqualTo(String value) {
            addCriterion("recharge_id <>", value, "rechargeId");
            return (Criteria) this;
        }

        public Criteria andRechargeIdGreaterThan(String value) {
            addCriterion("recharge_id >", value, "rechargeId");
            return (Criteria) this;
        }

        public Criteria andRechargeIdGreaterThanOrEqualTo(String value) {
            addCriterion("recharge_id >=", value, "rechargeId");
            return (Criteria) this;
        }

        public Criteria andRechargeIdLessThan(String value) {
            addCriterion("recharge_id <", value, "rechargeId");
            return (Criteria) this;
        }

        public Criteria andRechargeIdLessThanOrEqualTo(String value) {
            addCriterion("recharge_id <=", value, "rechargeId");
            return (Criteria) this;
        }

        public Criteria andRechargeIdLike(String value) {
            addCriterion("recharge_id like", value, "rechargeId");
            return (Criteria) this;
        }

        public Criteria andRechargeIdNotLike(String value) {
            addCriterion("recharge_id not like", value, "rechargeId");
            return (Criteria) this;
        }

        public Criteria andRechargeIdIn(List<String> values) {
            addCriterion("recharge_id in", values, "rechargeId");
            return (Criteria) this;
        }

        public Criteria andRechargeIdNotIn(List<String> values) {
            addCriterion("recharge_id not in", values, "rechargeId");
            return (Criteria) this;
        }

        public Criteria andRechargeIdBetween(String value1, String value2) {
            addCriterion("recharge_id between", value1, value2, "rechargeId");
            return (Criteria) this;
        }

        public Criteria andRechargeIdNotBetween(String value1, String value2) {
            addCriterion("recharge_id not between", value1, value2, "rechargeId");
            return (Criteria) this;
        }

        public Criteria andRechargeCustomerIsNull() {
            addCriterion("recharge_customer is null");
            return (Criteria) this;
        }

        public Criteria andRechargeCustomerIsNotNull() {
            addCriterion("recharge_customer is not null");
            return (Criteria) this;
        }

        public Criteria andRechargeCustomerEqualTo(String value) {
            addCriterion("recharge_customer =", value, "rechargeCustomer");
            return (Criteria) this;
        }

        public Criteria andRechargeCustomerNotEqualTo(String value) {
            addCriterion("recharge_customer <>", value, "rechargeCustomer");
            return (Criteria) this;
        }

        public Criteria andRechargeCustomerGreaterThan(String value) {
            addCriterion("recharge_customer >", value, "rechargeCustomer");
            return (Criteria) this;
        }

        public Criteria andRechargeCustomerGreaterThanOrEqualTo(String value) {
            addCriterion("recharge_customer >=", value, "rechargeCustomer");
            return (Criteria) this;
        }

        public Criteria andRechargeCustomerLessThan(String value) {
            addCriterion("recharge_customer <", value, "rechargeCustomer");
            return (Criteria) this;
        }

        public Criteria andRechargeCustomerLessThanOrEqualTo(String value) {
            addCriterion("recharge_customer <=", value, "rechargeCustomer");
            return (Criteria) this;
        }

        public Criteria andRechargeCustomerLike(String value) {
            addCriterion("recharge_customer like", value, "rechargeCustomer");
            return (Criteria) this;
        }

        public Criteria andRechargeCustomerNotLike(String value) {
            addCriterion("recharge_customer not like", value, "rechargeCustomer");
            return (Criteria) this;
        }

        public Criteria andRechargeCustomerIn(List<String> values) {
            addCriterion("recharge_customer in", values, "rechargeCustomer");
            return (Criteria) this;
        }

        public Criteria andRechargeCustomerNotIn(List<String> values) {
            addCriterion("recharge_customer not in", values, "rechargeCustomer");
            return (Criteria) this;
        }

        public Criteria andRechargeCustomerBetween(String value1, String value2) {
            addCriterion("recharge_customer between", value1, value2, "rechargeCustomer");
            return (Criteria) this;
        }

        public Criteria andRechargeCustomerNotBetween(String value1, String value2) {
            addCriterion("recharge_customer not between", value1, value2, "rechargeCustomer");
            return (Criteria) this;
        }

        public Criteria andRechargeMoneyIsNull() {
            addCriterion("recharge_money is null");
            return (Criteria) this;
        }

        public Criteria andRechargeMoneyIsNotNull() {
            addCriterion("recharge_money is not null");
            return (Criteria) this;
        }

        public Criteria andRechargeMoneyEqualTo(String value) {
            addCriterion("recharge_money =", value, "rechargeMoney");
            return (Criteria) this;
        }

        public Criteria andRechargeMoneyNotEqualTo(String value) {
            addCriterion("recharge_money <>", value, "rechargeMoney");
            return (Criteria) this;
        }

        public Criteria andRechargeMoneyGreaterThan(String value) {
            addCriterion("recharge_money >", value, "rechargeMoney");
            return (Criteria) this;
        }

        public Criteria andRechargeMoneyGreaterThanOrEqualTo(String value) {
            addCriterion("recharge_money >=", value, "rechargeMoney");
            return (Criteria) this;
        }

        public Criteria andRechargeMoneyLessThan(String value) {
            addCriterion("recharge_money <", value, "rechargeMoney");
            return (Criteria) this;
        }

        public Criteria andRechargeMoneyLessThanOrEqualTo(String value) {
            addCriterion("recharge_money <=", value, "rechargeMoney");
            return (Criteria) this;
        }

        public Criteria andRechargeMoneyLike(String value) {
            addCriterion("recharge_money like", value, "rechargeMoney");
            return (Criteria) this;
        }

        public Criteria andRechargeMoneyNotLike(String value) {
            addCriterion("recharge_money not like", value, "rechargeMoney");
            return (Criteria) this;
        }

        public Criteria andRechargeMoneyIn(List<String> values) {
            addCriterion("recharge_money in", values, "rechargeMoney");
            return (Criteria) this;
        }

        public Criteria andRechargeMoneyNotIn(List<String> values) {
            addCriterion("recharge_money not in", values, "rechargeMoney");
            return (Criteria) this;
        }

        public Criteria andRechargeMoneyBetween(String value1, String value2) {
            addCriterion("recharge_money between", value1, value2, "rechargeMoney");
            return (Criteria) this;
        }

        public Criteria andRechargeMoneyNotBetween(String value1, String value2) {
            addCriterion("recharge_money not between", value1, value2, "rechargeMoney");
            return (Criteria) this;
        }

        public Criteria andRechargeTimeIsNull() {
            addCriterion("recharge_time is null");
            return (Criteria) this;
        }

        public Criteria andRechargeTimeIsNotNull() {
            addCriterion("recharge_time is not null");
            return (Criteria) this;
        }

        public Criteria andRechargeTimeEqualTo(String value) {
            addCriterion("recharge_time =", value, "rechargeTime");
            return (Criteria) this;
        }

        public Criteria andRechargeTimeNotEqualTo(String value) {
            addCriterion("recharge_time <>", value, "rechargeTime");
            return (Criteria) this;
        }

        public Criteria andRechargeTimeGreaterThan(String value) {
            addCriterion("recharge_time >", value, "rechargeTime");
            return (Criteria) this;
        }

        public Criteria andRechargeTimeGreaterThanOrEqualTo(String value) {
            addCriterion("recharge_time >=", value, "rechargeTime");
            return (Criteria) this;
        }

        public Criteria andRechargeTimeLessThan(String value) {
            addCriterion("recharge_time <", value, "rechargeTime");
            return (Criteria) this;
        }

        public Criteria andRechargeTimeLessThanOrEqualTo(String value) {
            addCriterion("recharge_time <=", value, "rechargeTime");
            return (Criteria) this;
        }

        public Criteria andRechargeTimeLike(String value) {
            addCriterion("recharge_time like", value, "rechargeTime");
            return (Criteria) this;
        }

        public Criteria andRechargeTimeNotLike(String value) {
            addCriterion("recharge_time not like", value, "rechargeTime");
            return (Criteria) this;
        }

        public Criteria andRechargeTimeIn(List<String> values) {
            addCriterion("recharge_time in", values, "rechargeTime");
            return (Criteria) this;
        }

        public Criteria andRechargeTimeNotIn(List<String> values) {
            addCriterion("recharge_time not in", values, "rechargeTime");
            return (Criteria) this;
        }

        public Criteria andRechargeTimeBetween(String value1, String value2) {
            addCriterion("recharge_time between", value1, value2, "rechargeTime");
            return (Criteria) this;
        }

        public Criteria andRechargeTimeNotBetween(String value1, String value2) {
            addCriterion("recharge_time not between", value1, value2, "rechargeTime");
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