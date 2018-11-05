package com.pojo;

import java.util.ArrayList;
import java.util.List;

public class ChargingWayExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ChargingWayExample() {
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

        public Criteria andChargingWayIdIsNull() {
            addCriterion("charging_way_id is null");
            return (Criteria) this;
        }

        public Criteria andChargingWayIdIsNotNull() {
            addCriterion("charging_way_id is not null");
            return (Criteria) this;
        }

        public Criteria andChargingWayIdEqualTo(String value) {
            addCriterion("charging_way_id =", value, "chargingWayId");
            return (Criteria) this;
        }

        public Criteria andChargingWayIdNotEqualTo(String value) {
            addCriterion("charging_way_id <>", value, "chargingWayId");
            return (Criteria) this;
        }

        public Criteria andChargingWayIdGreaterThan(String value) {
            addCriterion("charging_way_id >", value, "chargingWayId");
            return (Criteria) this;
        }

        public Criteria andChargingWayIdGreaterThanOrEqualTo(String value) {
            addCriterion("charging_way_id >=", value, "chargingWayId");
            return (Criteria) this;
        }

        public Criteria andChargingWayIdLessThan(String value) {
            addCriterion("charging_way_id <", value, "chargingWayId");
            return (Criteria) this;
        }

        public Criteria andChargingWayIdLessThanOrEqualTo(String value) {
            addCriterion("charging_way_id <=", value, "chargingWayId");
            return (Criteria) this;
        }

        public Criteria andChargingWayIdLike(String value) {
            addCriterion("charging_way_id like", value, "chargingWayId");
            return (Criteria) this;
        }

        public Criteria andChargingWayIdNotLike(String value) {
            addCriterion("charging_way_id not like", value, "chargingWayId");
            return (Criteria) this;
        }

        public Criteria andChargingWayIdIn(List<String> values) {
            addCriterion("charging_way_id in", values, "chargingWayId");
            return (Criteria) this;
        }

        public Criteria andChargingWayIdNotIn(List<String> values) {
            addCriterion("charging_way_id not in", values, "chargingWayId");
            return (Criteria) this;
        }

        public Criteria andChargingWayIdBetween(String value1, String value2) {
            addCriterion("charging_way_id between", value1, value2, "chargingWayId");
            return (Criteria) this;
        }

        public Criteria andChargingWayIdNotBetween(String value1, String value2) {
            addCriterion("charging_way_id not between", value1, value2, "chargingWayId");
            return (Criteria) this;
        }

        public Criteria andChargingWayNameIsNull() {
            addCriterion("charging_way_name is null");
            return (Criteria) this;
        }

        public Criteria andChargingWayNameIsNotNull() {
            addCriterion("charging_way_name is not null");
            return (Criteria) this;
        }

        public Criteria andChargingWayNameEqualTo(String value) {
            addCriterion("charging_way_name =", value, "chargingWayName");
            return (Criteria) this;
        }

        public Criteria andChargingWayNameNotEqualTo(String value) {
            addCriterion("charging_way_name <>", value, "chargingWayName");
            return (Criteria) this;
        }

        public Criteria andChargingWayNameGreaterThan(String value) {
            addCriterion("charging_way_name >", value, "chargingWayName");
            return (Criteria) this;
        }

        public Criteria andChargingWayNameGreaterThanOrEqualTo(String value) {
            addCriterion("charging_way_name >=", value, "chargingWayName");
            return (Criteria) this;
        }

        public Criteria andChargingWayNameLessThan(String value) {
            addCriterion("charging_way_name <", value, "chargingWayName");
            return (Criteria) this;
        }

        public Criteria andChargingWayNameLessThanOrEqualTo(String value) {
            addCriterion("charging_way_name <=", value, "chargingWayName");
            return (Criteria) this;
        }

        public Criteria andChargingWayNameLike(String value) {
            addCriterion("charging_way_name like", value, "chargingWayName");
            return (Criteria) this;
        }

        public Criteria andChargingWayNameNotLike(String value) {
            addCriterion("charging_way_name not like", value, "chargingWayName");
            return (Criteria) this;
        }

        public Criteria andChargingWayNameIn(List<String> values) {
            addCriterion("charging_way_name in", values, "chargingWayName");
            return (Criteria) this;
        }

        public Criteria andChargingWayNameNotIn(List<String> values) {
            addCriterion("charging_way_name not in", values, "chargingWayName");
            return (Criteria) this;
        }

        public Criteria andChargingWayNameBetween(String value1, String value2) {
            addCriterion("charging_way_name between", value1, value2, "chargingWayName");
            return (Criteria) this;
        }

        public Criteria andChargingWayNameNotBetween(String value1, String value2) {
            addCriterion("charging_way_name not between", value1, value2, "chargingWayName");
            return (Criteria) this;
        }

        public Criteria andChargingWayStarttimeIsNull() {
            addCriterion("charging_way_starttime is null");
            return (Criteria) this;
        }

        public Criteria andChargingWayStarttimeIsNotNull() {
            addCriterion("charging_way_starttime is not null");
            return (Criteria) this;
        }

        public Criteria andChargingWayStarttimeEqualTo(String value) {
            addCriterion("charging_way_starttime =", value, "chargingWayStarttime");
            return (Criteria) this;
        }

        public Criteria andChargingWayStarttimeNotEqualTo(String value) {
            addCriterion("charging_way_starttime <>", value, "chargingWayStarttime");
            return (Criteria) this;
        }

        public Criteria andChargingWayStarttimeGreaterThan(String value) {
            addCriterion("charging_way_starttime >", value, "chargingWayStarttime");
            return (Criteria) this;
        }

        public Criteria andChargingWayStarttimeGreaterThanOrEqualTo(String value) {
            addCriterion("charging_way_starttime >=", value, "chargingWayStarttime");
            return (Criteria) this;
        }

        public Criteria andChargingWayStarttimeLessThan(String value) {
            addCriterion("charging_way_starttime <", value, "chargingWayStarttime");
            return (Criteria) this;
        }

        public Criteria andChargingWayStarttimeLessThanOrEqualTo(String value) {
            addCriterion("charging_way_starttime <=", value, "chargingWayStarttime");
            return (Criteria) this;
        }

        public Criteria andChargingWayStarttimeLike(String value) {
            addCriterion("charging_way_starttime like", value, "chargingWayStarttime");
            return (Criteria) this;
        }

        public Criteria andChargingWayStarttimeNotLike(String value) {
            addCriterion("charging_way_starttime not like", value, "chargingWayStarttime");
            return (Criteria) this;
        }

        public Criteria andChargingWayStarttimeIn(List<String> values) {
            addCriterion("charging_way_starttime in", values, "chargingWayStarttime");
            return (Criteria) this;
        }

        public Criteria andChargingWayStarttimeNotIn(List<String> values) {
            addCriterion("charging_way_starttime not in", values, "chargingWayStarttime");
            return (Criteria) this;
        }

        public Criteria andChargingWayStarttimeBetween(String value1, String value2) {
            addCriterion("charging_way_starttime between", value1, value2, "chargingWayStarttime");
            return (Criteria) this;
        }

        public Criteria andChargingWayStarttimeNotBetween(String value1, String value2) {
            addCriterion("charging_way_starttime not between", value1, value2, "chargingWayStarttime");
            return (Criteria) this;
        }

        public Criteria andChargingWayEndtimeIsNull() {
            addCriterion("charging_way_endtime is null");
            return (Criteria) this;
        }

        public Criteria andChargingWayEndtimeIsNotNull() {
            addCriterion("charging_way_endtime is not null");
            return (Criteria) this;
        }

        public Criteria andChargingWayEndtimeEqualTo(String value) {
            addCriterion("charging_way_endtime =", value, "chargingWayEndtime");
            return (Criteria) this;
        }

        public Criteria andChargingWayEndtimeNotEqualTo(String value) {
            addCriterion("charging_way_endtime <>", value, "chargingWayEndtime");
            return (Criteria) this;
        }

        public Criteria andChargingWayEndtimeGreaterThan(String value) {
            addCriterion("charging_way_endtime >", value, "chargingWayEndtime");
            return (Criteria) this;
        }

        public Criteria andChargingWayEndtimeGreaterThanOrEqualTo(String value) {
            addCriterion("charging_way_endtime >=", value, "chargingWayEndtime");
            return (Criteria) this;
        }

        public Criteria andChargingWayEndtimeLessThan(String value) {
            addCriterion("charging_way_endtime <", value, "chargingWayEndtime");
            return (Criteria) this;
        }

        public Criteria andChargingWayEndtimeLessThanOrEqualTo(String value) {
            addCriterion("charging_way_endtime <=", value, "chargingWayEndtime");
            return (Criteria) this;
        }

        public Criteria andChargingWayEndtimeLike(String value) {
            addCriterion("charging_way_endtime like", value, "chargingWayEndtime");
            return (Criteria) this;
        }

        public Criteria andChargingWayEndtimeNotLike(String value) {
            addCriterion("charging_way_endtime not like", value, "chargingWayEndtime");
            return (Criteria) this;
        }

        public Criteria andChargingWayEndtimeIn(List<String> values) {
            addCriterion("charging_way_endtime in", values, "chargingWayEndtime");
            return (Criteria) this;
        }

        public Criteria andChargingWayEndtimeNotIn(List<String> values) {
            addCriterion("charging_way_endtime not in", values, "chargingWayEndtime");
            return (Criteria) this;
        }

        public Criteria andChargingWayEndtimeBetween(String value1, String value2) {
            addCriterion("charging_way_endtime between", value1, value2, "chargingWayEndtime");
            return (Criteria) this;
        }

        public Criteria andChargingWayEndtimeNotBetween(String value1, String value2) {
            addCriterion("charging_way_endtime not between", value1, value2, "chargingWayEndtime");
            return (Criteria) this;
        }

        public Criteria andChargingWayCreatetimeIsNull() {
            addCriterion("charging_way_createtime is null");
            return (Criteria) this;
        }

        public Criteria andChargingWayCreatetimeIsNotNull() {
            addCriterion("charging_way_createtime is not null");
            return (Criteria) this;
        }

        public Criteria andChargingWayCreatetimeEqualTo(String value) {
            addCriterion("charging_way_createtime =", value, "chargingWayCreatetime");
            return (Criteria) this;
        }

        public Criteria andChargingWayCreatetimeNotEqualTo(String value) {
            addCriterion("charging_way_createtime <>", value, "chargingWayCreatetime");
            return (Criteria) this;
        }

        public Criteria andChargingWayCreatetimeGreaterThan(String value) {
            addCriterion("charging_way_createtime >", value, "chargingWayCreatetime");
            return (Criteria) this;
        }

        public Criteria andChargingWayCreatetimeGreaterThanOrEqualTo(String value) {
            addCriterion("charging_way_createtime >=", value, "chargingWayCreatetime");
            return (Criteria) this;
        }

        public Criteria andChargingWayCreatetimeLessThan(String value) {
            addCriterion("charging_way_createtime <", value, "chargingWayCreatetime");
            return (Criteria) this;
        }

        public Criteria andChargingWayCreatetimeLessThanOrEqualTo(String value) {
            addCriterion("charging_way_createtime <=", value, "chargingWayCreatetime");
            return (Criteria) this;
        }

        public Criteria andChargingWayCreatetimeLike(String value) {
            addCriterion("charging_way_createtime like", value, "chargingWayCreatetime");
            return (Criteria) this;
        }

        public Criteria andChargingWayCreatetimeNotLike(String value) {
            addCriterion("charging_way_createtime not like", value, "chargingWayCreatetime");
            return (Criteria) this;
        }

        public Criteria andChargingWayCreatetimeIn(List<String> values) {
            addCriterion("charging_way_createtime in", values, "chargingWayCreatetime");
            return (Criteria) this;
        }

        public Criteria andChargingWayCreatetimeNotIn(List<String> values) {
            addCriterion("charging_way_createtime not in", values, "chargingWayCreatetime");
            return (Criteria) this;
        }

        public Criteria andChargingWayCreatetimeBetween(String value1, String value2) {
            addCriterion("charging_way_createtime between", value1, value2, "chargingWayCreatetime");
            return (Criteria) this;
        }

        public Criteria andChargingWayCreatetimeNotBetween(String value1, String value2) {
            addCriterion("charging_way_createtime not between", value1, value2, "chargingWayCreatetime");
            return (Criteria) this;
        }

        public Criteria andChargingWayModifytimeIsNull() {
            addCriterion("charging_way_modifytime is null");
            return (Criteria) this;
        }

        public Criteria andChargingWayModifytimeIsNotNull() {
            addCriterion("charging_way_modifytime is not null");
            return (Criteria) this;
        }

        public Criteria andChargingWayModifytimeEqualTo(String value) {
            addCriterion("charging_way_modifytime =", value, "chargingWayModifytime");
            return (Criteria) this;
        }

        public Criteria andChargingWayModifytimeNotEqualTo(String value) {
            addCriterion("charging_way_modifytime <>", value, "chargingWayModifytime");
            return (Criteria) this;
        }

        public Criteria andChargingWayModifytimeGreaterThan(String value) {
            addCriterion("charging_way_modifytime >", value, "chargingWayModifytime");
            return (Criteria) this;
        }

        public Criteria andChargingWayModifytimeGreaterThanOrEqualTo(String value) {
            addCriterion("charging_way_modifytime >=", value, "chargingWayModifytime");
            return (Criteria) this;
        }

        public Criteria andChargingWayModifytimeLessThan(String value) {
            addCriterion("charging_way_modifytime <", value, "chargingWayModifytime");
            return (Criteria) this;
        }

        public Criteria andChargingWayModifytimeLessThanOrEqualTo(String value) {
            addCriterion("charging_way_modifytime <=", value, "chargingWayModifytime");
            return (Criteria) this;
        }

        public Criteria andChargingWayModifytimeLike(String value) {
            addCriterion("charging_way_modifytime like", value, "chargingWayModifytime");
            return (Criteria) this;
        }

        public Criteria andChargingWayModifytimeNotLike(String value) {
            addCriterion("charging_way_modifytime not like", value, "chargingWayModifytime");
            return (Criteria) this;
        }

        public Criteria andChargingWayModifytimeIn(List<String> values) {
            addCriterion("charging_way_modifytime in", values, "chargingWayModifytime");
            return (Criteria) this;
        }

        public Criteria andChargingWayModifytimeNotIn(List<String> values) {
            addCriterion("charging_way_modifytime not in", values, "chargingWayModifytime");
            return (Criteria) this;
        }

        public Criteria andChargingWayModifytimeBetween(String value1, String value2) {
            addCriterion("charging_way_modifytime between", value1, value2, "chargingWayModifytime");
            return (Criteria) this;
        }

        public Criteria andChargingWayModifytimeNotBetween(String value1, String value2) {
            addCriterion("charging_way_modifytime not between", value1, value2, "chargingWayModifytime");
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