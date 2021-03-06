package com.pojo;

import java.util.ArrayList;
import java.util.List;

public class RoomExample {
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

    public RoomExample() {
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

        public Criteria andRoomIdIsNull() {
            addCriterion("room_id is null");
            return (Criteria) this;
        }

        public Criteria andRoomIdIsNotNull() {
            addCriterion("room_id is not null");
            return (Criteria) this;
        }

        public Criteria andRoomIdEqualTo(String value) {
            addCriterion("room_id =", value, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdNotEqualTo(String value) {
            addCriterion("room_id <>", value, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdGreaterThan(String value) {
            addCriterion("room_id >", value, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdGreaterThanOrEqualTo(String value) {
            addCriterion("room_id >=", value, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdLessThan(String value) {
            addCriterion("room_id <", value, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdLessThanOrEqualTo(String value) {
            addCriterion("room_id <=", value, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdLike(String value) {
            addCriterion("room_id like", value, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdNotLike(String value) {
            addCriterion("room_id not like", value, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdIn(List<String> values) {
            addCriterion("room_id in", values, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdNotIn(List<String> values) {
            addCriterion("room_id not in", values, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdBetween(String value1, String value2) {
            addCriterion("room_id between", value1, value2, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdNotBetween(String value1, String value2) {
            addCriterion("room_id not between", value1, value2, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomNumIsNull() {
            addCriterion("room_num is null");
            return (Criteria) this;
        }

        public Criteria andRoomNumIsNotNull() {
            addCriterion("room_num is not null");
            return (Criteria) this;
        }

        public Criteria andRoomNumEqualTo(String value) {
            addCriterion("room_num =", value, "roomNum");
            return (Criteria) this;
        }

        public Criteria andRoomNumNotEqualTo(String value) {
            addCriterion("room_num <>", value, "roomNum");
            return (Criteria) this;
        }

        public Criteria andRoomNumGreaterThan(String value) {
            addCriterion("room_num >", value, "roomNum");
            return (Criteria) this;
        }

        public Criteria andRoomNumGreaterThanOrEqualTo(String value) {
            addCriterion("room_num >=", value, "roomNum");
            return (Criteria) this;
        }

        public Criteria andRoomNumLessThan(String value) {
            addCriterion("room_num <", value, "roomNum");
            return (Criteria) this;
        }

        public Criteria andRoomNumLessThanOrEqualTo(String value) {
            addCriterion("room_num <=", value, "roomNum");
            return (Criteria) this;
        }

        public Criteria andRoomNumLike(String value) {
            addCriterion("room_num like", value, "roomNum");
            return (Criteria) this;
        }

        public Criteria andRoomNumNotLike(String value) {
            addCriterion("room_num not like", value, "roomNum");
            return (Criteria) this;
        }

        public Criteria andRoomNumIn(List<String> values) {
            addCriterion("room_num in", values, "roomNum");
            return (Criteria) this;
        }

        public Criteria andRoomNumNotIn(List<String> values) {
            addCriterion("room_num not in", values, "roomNum");
            return (Criteria) this;
        }

        public Criteria andRoomNumBetween(String value1, String value2) {
            addCriterion("room_num between", value1, value2, "roomNum");
            return (Criteria) this;
        }

        public Criteria andRoomNumNotBetween(String value1, String value2) {
            addCriterion("room_num not between", value1, value2, "roomNum");
            return (Criteria) this;
        }

        public Criteria andRoomTypeIsNull() {
            addCriterion("room_type is null");
            return (Criteria) this;
        }

        public Criteria andRoomTypeIsNotNull() {
            addCriterion("room_type is not null");
            return (Criteria) this;
        }

        public Criteria andRoomTypeEqualTo(String value) {
            addCriterion("room_type =", value, "roomType");
            return (Criteria) this;
        }

        public Criteria andRoomTypeNotEqualTo(String value) {
            addCriterion("room_type <>", value, "roomType");
            return (Criteria) this;
        }

        public Criteria andRoomTypeGreaterThan(String value) {
            addCriterion("room_type >", value, "roomType");
            return (Criteria) this;
        }

        public Criteria andRoomTypeGreaterThanOrEqualTo(String value) {
            addCriterion("room_type >=", value, "roomType");
            return (Criteria) this;
        }

        public Criteria andRoomTypeLessThan(String value) {
            addCriterion("room_type <", value, "roomType");
            return (Criteria) this;
        }

        public Criteria andRoomTypeLessThanOrEqualTo(String value) {
            addCriterion("room_type <=", value, "roomType");
            return (Criteria) this;
        }

        public Criteria andRoomTypeLike(String value) {
            addCriterion("room_type like", value, "roomType");
            return (Criteria) this;
        }

        public Criteria andRoomTypeNotLike(String value) {
            addCriterion("room_type not like", value, "roomType");
            return (Criteria) this;
        }

        public Criteria andRoomTypeIn(List<String> values) {
            addCriterion("room_type in", values, "roomType");
            return (Criteria) this;
        }

        public Criteria andRoomTypeNotIn(List<String> values) {
            addCriterion("room_type not in", values, "roomType");
            return (Criteria) this;
        }

        public Criteria andRoomTypeBetween(String value1, String value2) {
            addCriterion("room_type between", value1, value2, "roomType");
            return (Criteria) this;
        }

        public Criteria andRoomTypeNotBetween(String value1, String value2) {
            addCriterion("room_type not between", value1, value2, "roomType");
            return (Criteria) this;
        }

        public Criteria andRoomFloorIsNull() {
            addCriterion("room_floor is null");
            return (Criteria) this;
        }

        public Criteria andRoomFloorIsNotNull() {
            addCriterion("room_floor is not null");
            return (Criteria) this;
        }

        public Criteria andRoomFloorEqualTo(String value) {
            addCriterion("room_floor =", value, "roomFloor");
            return (Criteria) this;
        }

        public Criteria andRoomFloorNotEqualTo(String value) {
            addCriterion("room_floor <>", value, "roomFloor");
            return (Criteria) this;
        }

        public Criteria andRoomFloorGreaterThan(String value) {
            addCriterion("room_floor >", value, "roomFloor");
            return (Criteria) this;
        }

        public Criteria andRoomFloorGreaterThanOrEqualTo(String value) {
            addCriterion("room_floor >=", value, "roomFloor");
            return (Criteria) this;
        }

        public Criteria andRoomFloorLessThan(String value) {
            addCriterion("room_floor <", value, "roomFloor");
            return (Criteria) this;
        }

        public Criteria andRoomFloorLessThanOrEqualTo(String value) {
            addCriterion("room_floor <=", value, "roomFloor");
            return (Criteria) this;
        }

        public Criteria andRoomFloorLike(String value) {
            addCriterion("room_floor like", value, "roomFloor");
            return (Criteria) this;
        }

        public Criteria andRoomFloorNotLike(String value) {
            addCriterion("room_floor not like", value, "roomFloor");
            return (Criteria) this;
        }

        public Criteria andRoomFloorIn(List<String> values) {
            addCriterion("room_floor in", values, "roomFloor");
            return (Criteria) this;
        }

        public Criteria andRoomFloorNotIn(List<String> values) {
            addCriterion("room_floor not in", values, "roomFloor");
            return (Criteria) this;
        }

        public Criteria andRoomFloorBetween(String value1, String value2) {
            addCriterion("room_floor between", value1, value2, "roomFloor");
            return (Criteria) this;
        }

        public Criteria andRoomFloorNotBetween(String value1, String value2) {
            addCriterion("room_floor not between", value1, value2, "roomFloor");
            return (Criteria) this;
        }

        public Criteria andRoomPriceIsNull() {
            addCriterion("room_price is null");
            return (Criteria) this;
        }

        public Criteria andRoomPriceIsNotNull() {
            addCriterion("room_price is not null");
            return (Criteria) this;
        }

        public Criteria andRoomPriceEqualTo(String value) {
            addCriterion("room_price =", value, "roomPrice");
            return (Criteria) this;
        }

        public Criteria andRoomPriceNotEqualTo(String value) {
            addCriterion("room_price <>", value, "roomPrice");
            return (Criteria) this;
        }

        public Criteria andRoomPriceGreaterThan(String value) {
            addCriterion("room_price >", value, "roomPrice");
            return (Criteria) this;
        }

        public Criteria andRoomPriceGreaterThanOrEqualTo(String value) {
            addCriterion("room_price >=", value, "roomPrice");
            return (Criteria) this;
        }

        public Criteria andRoomPriceLessThan(String value) {
            addCriterion("room_price <", value, "roomPrice");
            return (Criteria) this;
        }

        public Criteria andRoomPriceLessThanOrEqualTo(String value) {
            addCriterion("room_price <=", value, "roomPrice");
            return (Criteria) this;
        }

        public Criteria andRoomPriceLike(String value) {
            addCriterion("room_price like", value, "roomPrice");
            return (Criteria) this;
        }

        public Criteria andRoomPriceNotLike(String value) {
            addCriterion("room_price not like", value, "roomPrice");
            return (Criteria) this;
        }

        public Criteria andRoomPriceIn(List<String> values) {
            addCriterion("room_price in", values, "roomPrice");
            return (Criteria) this;
        }

        public Criteria andRoomPriceNotIn(List<String> values) {
            addCriterion("room_price not in", values, "roomPrice");
            return (Criteria) this;
        }

        public Criteria andRoomPriceBetween(String value1, String value2) {
            addCriterion("room_price between", value1, value2, "roomPrice");
            return (Criteria) this;
        }

        public Criteria andRoomPriceNotBetween(String value1, String value2) {
            addCriterion("room_price not between", value1, value2, "roomPrice");
            return (Criteria) this;
        }

        public Criteria andRoomRemarksIsNull() {
            addCriterion("room_remarks is null");
            return (Criteria) this;
        }

        public Criteria andRoomRemarksIsNotNull() {
            addCriterion("room_remarks is not null");
            return (Criteria) this;
        }

        public Criteria andRoomRemarksEqualTo(String value) {
            addCriterion("room_remarks =", value, "roomRemarks");
            return (Criteria) this;
        }

        public Criteria andRoomRemarksNotEqualTo(String value) {
            addCriterion("room_remarks <>", value, "roomRemarks");
            return (Criteria) this;
        }

        public Criteria andRoomRemarksGreaterThan(String value) {
            addCriterion("room_remarks >", value, "roomRemarks");
            return (Criteria) this;
        }

        public Criteria andRoomRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("room_remarks >=", value, "roomRemarks");
            return (Criteria) this;
        }

        public Criteria andRoomRemarksLessThan(String value) {
            addCriterion("room_remarks <", value, "roomRemarks");
            return (Criteria) this;
        }

        public Criteria andRoomRemarksLessThanOrEqualTo(String value) {
            addCriterion("room_remarks <=", value, "roomRemarks");
            return (Criteria) this;
        }

        public Criteria andRoomRemarksLike(String value) {
            addCriterion("room_remarks like", value, "roomRemarks");
            return (Criteria) this;
        }

        public Criteria andRoomRemarksNotLike(String value) {
            addCriterion("room_remarks not like", value, "roomRemarks");
            return (Criteria) this;
        }

        public Criteria andRoomRemarksIn(List<String> values) {
            addCriterion("room_remarks in", values, "roomRemarks");
            return (Criteria) this;
        }

        public Criteria andRoomRemarksNotIn(List<String> values) {
            addCriterion("room_remarks not in", values, "roomRemarks");
            return (Criteria) this;
        }

        public Criteria andRoomRemarksBetween(String value1, String value2) {
            addCriterion("room_remarks between", value1, value2, "roomRemarks");
            return (Criteria) this;
        }

        public Criteria andRoomRemarksNotBetween(String value1, String value2) {
            addCriterion("room_remarks not between", value1, value2, "roomRemarks");
            return (Criteria) this;
        }

        public Criteria andRoomStateIsNull() {
            addCriterion("room_state is null");
            return (Criteria) this;
        }

        public Criteria andRoomStateIsNotNull() {
            addCriterion("room_state is not null");
            return (Criteria) this;
        }

        public Criteria andRoomStateEqualTo(String value) {
            addCriterion("room_state =", value, "roomState");
            return (Criteria) this;
        }

        public Criteria andRoomStateNotEqualTo(String value) {
            addCriterion("room_state <>", value, "roomState");
            return (Criteria) this;
        }

        public Criteria andRoomStateGreaterThan(String value) {
            addCriterion("room_state >", value, "roomState");
            return (Criteria) this;
        }

        public Criteria andRoomStateGreaterThanOrEqualTo(String value) {
            addCriterion("room_state >=", value, "roomState");
            return (Criteria) this;
        }

        public Criteria andRoomStateLessThan(String value) {
            addCriterion("room_state <", value, "roomState");
            return (Criteria) this;
        }

        public Criteria andRoomStateLessThanOrEqualTo(String value) {
            addCriterion("room_state <=", value, "roomState");
            return (Criteria) this;
        }

        public Criteria andRoomStateLike(String value) {
            addCriterion("room_state like", value, "roomState");
            return (Criteria) this;
        }

        public Criteria andRoomStateNotLike(String value) {
            addCriterion("room_state not like", value, "roomState");
            return (Criteria) this;
        }

        public Criteria andRoomStateIn(List<String> values) {
            addCriterion("room_state in", values, "roomState");
            return (Criteria) this;
        }

        public Criteria andRoomStateNotIn(List<String> values) {
            addCriterion("room_state not in", values, "roomState");
            return (Criteria) this;
        }

        public Criteria andRoomStateBetween(String value1, String value2) {
            addCriterion("room_state between", value1, value2, "roomState");
            return (Criteria) this;
        }

        public Criteria andRoomStateNotBetween(String value1, String value2) {
            addCriterion("room_state not between", value1, value2, "roomState");
            return (Criteria) this;
        }

        public Criteria andRoomCreatetimeIsNull() {
            addCriterion("room_createtime is null");
            return (Criteria) this;
        }

        public Criteria andRoomCreatetimeIsNotNull() {
            addCriterion("room_createtime is not null");
            return (Criteria) this;
        }

        public Criteria andRoomCreatetimeEqualTo(String value) {
            addCriterion("room_createtime =", value, "roomCreatetime");
            return (Criteria) this;
        }

        public Criteria andRoomCreatetimeNotEqualTo(String value) {
            addCriterion("room_createtime <>", value, "roomCreatetime");
            return (Criteria) this;
        }

        public Criteria andRoomCreatetimeGreaterThan(String value) {
            addCriterion("room_createtime >", value, "roomCreatetime");
            return (Criteria) this;
        }

        public Criteria andRoomCreatetimeGreaterThanOrEqualTo(String value) {
            addCriterion("room_createtime >=", value, "roomCreatetime");
            return (Criteria) this;
        }

        public Criteria andRoomCreatetimeLessThan(String value) {
            addCriterion("room_createtime <", value, "roomCreatetime");
            return (Criteria) this;
        }

        public Criteria andRoomCreatetimeLessThanOrEqualTo(String value) {
            addCriterion("room_createtime <=", value, "roomCreatetime");
            return (Criteria) this;
        }

        public Criteria andRoomCreatetimeLike(String value) {
            addCriterion("room_createtime like", value, "roomCreatetime");
            return (Criteria) this;
        }

        public Criteria andRoomCreatetimeNotLike(String value) {
            addCriterion("room_createtime not like", value, "roomCreatetime");
            return (Criteria) this;
        }

        public Criteria andRoomCreatetimeIn(List<String> values) {
            addCriterion("room_createtime in", values, "roomCreatetime");
            return (Criteria) this;
        }

        public Criteria andRoomCreatetimeNotIn(List<String> values) {
            addCriterion("room_createtime not in", values, "roomCreatetime");
            return (Criteria) this;
        }

        public Criteria andRoomCreatetimeBetween(String value1, String value2) {
            addCriterion("room_createtime between", value1, value2, "roomCreatetime");
            return (Criteria) this;
        }

        public Criteria andRoomCreatetimeNotBetween(String value1, String value2) {
            addCriterion("room_createtime not between", value1, value2, "roomCreatetime");
            return (Criteria) this;
        }

        public Criteria andRoomModifytimeIsNull() {
            addCriterion("room_modifytime is null");
            return (Criteria) this;
        }

        public Criteria andRoomModifytimeIsNotNull() {
            addCriterion("room_modifytime is not null");
            return (Criteria) this;
        }

        public Criteria andRoomModifytimeEqualTo(String value) {
            addCriterion("room_modifytime =", value, "roomModifytime");
            return (Criteria) this;
        }

        public Criteria andRoomModifytimeNotEqualTo(String value) {
            addCriterion("room_modifytime <>", value, "roomModifytime");
            return (Criteria) this;
        }

        public Criteria andRoomModifytimeGreaterThan(String value) {
            addCriterion("room_modifytime >", value, "roomModifytime");
            return (Criteria) this;
        }

        public Criteria andRoomModifytimeGreaterThanOrEqualTo(String value) {
            addCriterion("room_modifytime >=", value, "roomModifytime");
            return (Criteria) this;
        }

        public Criteria andRoomModifytimeLessThan(String value) {
            addCriterion("room_modifytime <", value, "roomModifytime");
            return (Criteria) this;
        }

        public Criteria andRoomModifytimeLessThanOrEqualTo(String value) {
            addCriterion("room_modifytime <=", value, "roomModifytime");
            return (Criteria) this;
        }

        public Criteria andRoomModifytimeLike(String value) {
            addCriterion("room_modifytime like", value, "roomModifytime");
            return (Criteria) this;
        }

        public Criteria andRoomModifytimeNotLike(String value) {
            addCriterion("room_modifytime not like", value, "roomModifytime");
            return (Criteria) this;
        }

        public Criteria andRoomModifytimeIn(List<String> values) {
            addCriterion("room_modifytime in", values, "roomModifytime");
            return (Criteria) this;
        }

        public Criteria andRoomModifytimeNotIn(List<String> values) {
            addCriterion("room_modifytime not in", values, "roomModifytime");
            return (Criteria) this;
        }

        public Criteria andRoomModifytimeBetween(String value1, String value2) {
            addCriterion("room_modifytime between", value1, value2, "roomModifytime");
            return (Criteria) this;
        }

        public Criteria andRoomModifytimeNotBetween(String value1, String value2) {
            addCriterion("room_modifytime not between", value1, value2, "roomModifytime");
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