package com.pojo;

import java.util.ArrayList;
import java.util.List;

public class WorkRecordExample {
	protected int startRow;
	protected int pageSize;
	
    public int getStartRow() {
		return startRow;
	}

	public void setStartRow(int startRow) {
		this.startRow = startRow;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WorkRecordExample() {
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

        public Criteria andWorkRecordIdIsNull() {
            addCriterion("work_record_id is null");
            return (Criteria) this;
        }

        public Criteria andWorkRecordIdIsNotNull() {
            addCriterion("work_record_id is not null");
            return (Criteria) this;
        }

        public Criteria andWorkRecordIdEqualTo(String value) {
            addCriterion("work_record_id =", value, "workRecordId");
            return (Criteria) this;
        }

        public Criteria andWorkRecordIdNotEqualTo(String value) {
            addCriterion("work_record_id <>", value, "workRecordId");
            return (Criteria) this;
        }

        public Criteria andWorkRecordIdGreaterThan(String value) {
            addCriterion("work_record_id >", value, "workRecordId");
            return (Criteria) this;
        }

        public Criteria andWorkRecordIdGreaterThanOrEqualTo(String value) {
            addCriterion("work_record_id >=", value, "workRecordId");
            return (Criteria) this;
        }

        public Criteria andWorkRecordIdLessThan(String value) {
            addCriterion("work_record_id <", value, "workRecordId");
            return (Criteria) this;
        }

        public Criteria andWorkRecordIdLessThanOrEqualTo(String value) {
            addCriterion("work_record_id <=", value, "workRecordId");
            return (Criteria) this;
        }

        public Criteria andWorkRecordIdLike(String value) {
            addCriterion("work_record_id like", value, "workRecordId");
            return (Criteria) this;
        }

        public Criteria andWorkRecordIdNotLike(String value) {
            addCriterion("work_record_id not like", value, "workRecordId");
            return (Criteria) this;
        }

        public Criteria andWorkRecordIdIn(List<String> values) {
            addCriterion("work_record_id in", values, "workRecordId");
            return (Criteria) this;
        }

        public Criteria andWorkRecordIdNotIn(List<String> values) {
            addCriterion("work_record_id not in", values, "workRecordId");
            return (Criteria) this;
        }

        public Criteria andWorkRecordIdBetween(String value1, String value2) {
            addCriterion("work_record_id between", value1, value2, "workRecordId");
            return (Criteria) this;
        }

        public Criteria andWorkRecordIdNotBetween(String value1, String value2) {
            addCriterion("work_record_id not between", value1, value2, "workRecordId");
            return (Criteria) this;
        }

        public Criteria andWorkRecordCurrentstaffIsNull() {
            addCriterion("work_record_currentstaff is null");
            return (Criteria) this;
        }

        public Criteria andWorkRecordCurrentstaffIsNotNull() {
            addCriterion("work_record_currentstaff is not null");
            return (Criteria) this;
        }

        public Criteria andWorkRecordCurrentstaffEqualTo(String value) {
            addCriterion("work_record_currentstaff =", value, "workRecordCurrentstaff");
            return (Criteria) this;
        }

        public Criteria andWorkRecordCurrentstaffNotEqualTo(String value) {
            addCriterion("work_record_currentstaff <>", value, "workRecordCurrentstaff");
            return (Criteria) this;
        }

        public Criteria andWorkRecordCurrentstaffGreaterThan(String value) {
            addCriterion("work_record_currentstaff >", value, "workRecordCurrentstaff");
            return (Criteria) this;
        }

        public Criteria andWorkRecordCurrentstaffGreaterThanOrEqualTo(String value) {
            addCriterion("work_record_currentstaff >=", value, "workRecordCurrentstaff");
            return (Criteria) this;
        }

        public Criteria andWorkRecordCurrentstaffLessThan(String value) {
            addCriterion("work_record_currentstaff <", value, "workRecordCurrentstaff");
            return (Criteria) this;
        }

        public Criteria andWorkRecordCurrentstaffLessThanOrEqualTo(String value) {
            addCriterion("work_record_currentstaff <=", value, "workRecordCurrentstaff");
            return (Criteria) this;
        }

        public Criteria andWorkRecordCurrentstaffLike(String value) {
            addCriterion("work_record_currentstaff like", value, "workRecordCurrentstaff");
            return (Criteria) this;
        }

        public Criteria andWorkRecordCurrentstaffNotLike(String value) {
            addCriterion("work_record_currentstaff not like", value, "workRecordCurrentstaff");
            return (Criteria) this;
        }

        public Criteria andWorkRecordCurrentstaffIn(List<String> values) {
            addCriterion("work_record_currentstaff in", values, "workRecordCurrentstaff");
            return (Criteria) this;
        }

        public Criteria andWorkRecordCurrentstaffNotIn(List<String> values) {
            addCriterion("work_record_currentstaff not in", values, "workRecordCurrentstaff");
            return (Criteria) this;
        }

        public Criteria andWorkRecordCurrentstaffBetween(String value1, String value2) {
            addCriterion("work_record_currentstaff between", value1, value2, "workRecordCurrentstaff");
            return (Criteria) this;
        }

        public Criteria andWorkRecordCurrentstaffNotBetween(String value1, String value2) {
            addCriterion("work_record_currentstaff not between", value1, value2, "workRecordCurrentstaff");
            return (Criteria) this;
        }

        public Criteria andWorkRecordTypeIsNull() {
            addCriterion("work_record_type is null");
            return (Criteria) this;
        }

        public Criteria andWorkRecordTypeIsNotNull() {
            addCriterion("work_record_type is not null");
            return (Criteria) this;
        }

        public Criteria andWorkRecordTypeEqualTo(String value) {
            addCriterion("work_record_type =", value, "workRecordType");
            return (Criteria) this;
        }

        public Criteria andWorkRecordTypeNotEqualTo(String value) {
            addCriterion("work_record_type <>", value, "workRecordType");
            return (Criteria) this;
        }

        public Criteria andWorkRecordTypeGreaterThan(String value) {
            addCriterion("work_record_type >", value, "workRecordType");
            return (Criteria) this;
        }

        public Criteria andWorkRecordTypeGreaterThanOrEqualTo(String value) {
            addCriterion("work_record_type >=", value, "workRecordType");
            return (Criteria) this;
        }

        public Criteria andWorkRecordTypeLessThan(String value) {
            addCriterion("work_record_type <", value, "workRecordType");
            return (Criteria) this;
        }

        public Criteria andWorkRecordTypeLessThanOrEqualTo(String value) {
            addCriterion("work_record_type <=", value, "workRecordType");
            return (Criteria) this;
        }

        public Criteria andWorkRecordTypeLike(String value) {
            addCriterion("work_record_type like", value, "workRecordType");
            return (Criteria) this;
        }

        public Criteria andWorkRecordTypeNotLike(String value) {
            addCriterion("work_record_type not like", value, "workRecordType");
            return (Criteria) this;
        }

        public Criteria andWorkRecordTypeIn(List<String> values) {
            addCriterion("work_record_type in", values, "workRecordType");
            return (Criteria) this;
        }

        public Criteria andWorkRecordTypeNotIn(List<String> values) {
            addCriterion("work_record_type not in", values, "workRecordType");
            return (Criteria) this;
        }

        public Criteria andWorkRecordTypeBetween(String value1, String value2) {
            addCriterion("work_record_type between", value1, value2, "workRecordType");
            return (Criteria) this;
        }

        public Criteria andWorkRecordTypeNotBetween(String value1, String value2) {
            addCriterion("work_record_type not between", value1, value2, "workRecordType");
            return (Criteria) this;
        }

        public Criteria andWorkRecordTimeIsNull() {
            addCriterion("work_record_time is null");
            return (Criteria) this;
        }

        public Criteria andWorkRecordTimeIsNotNull() {
            addCriterion("work_record_time is not null");
            return (Criteria) this;
        }

        public Criteria andWorkRecordTimeEqualTo(String value) {
            addCriterion("work_record_time =", value, "workRecordTime");
            return (Criteria) this;
        }

        public Criteria andWorkRecordTimeNotEqualTo(String value) {
            addCriterion("work_record_time <>", value, "workRecordTime");
            return (Criteria) this;
        }

        public Criteria andWorkRecordTimeGreaterThan(String value) {
            addCriterion("work_record_time >", value, "workRecordTime");
            return (Criteria) this;
        }

        public Criteria andWorkRecordTimeGreaterThanOrEqualTo(String value) {
            addCriterion("work_record_time >=", value, "workRecordTime");
            return (Criteria) this;
        }

        public Criteria andWorkRecordTimeLessThan(String value) {
            addCriterion("work_record_time <", value, "workRecordTime");
            return (Criteria) this;
        }

        public Criteria andWorkRecordTimeLessThanOrEqualTo(String value) {
            addCriterion("work_record_time <=", value, "workRecordTime");
            return (Criteria) this;
        }

        public Criteria andWorkRecordTimeLike(String value) {
            addCriterion("work_record_time like", value, "workRecordTime");
            return (Criteria) this;
        }

        public Criteria andWorkRecordTimeNotLike(String value) {
            addCriterion("work_record_time not like", value, "workRecordTime");
            return (Criteria) this;
        }

        public Criteria andWorkRecordTimeIn(List<String> values) {
            addCriterion("work_record_time in", values, "workRecordTime");
            return (Criteria) this;
        }

        public Criteria andWorkRecordTimeNotIn(List<String> values) {
            addCriterion("work_record_time not in", values, "workRecordTime");
            return (Criteria) this;
        }

        public Criteria andWorkRecordTimeBetween(String value1, String value2) {
            addCriterion("work_record_time between", value1, value2, "workRecordTime");
            return (Criteria) this;
        }

        public Criteria andWorkRecordTimeNotBetween(String value1, String value2) {
            addCriterion("work_record_time not between", value1, value2, "workRecordTime");
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