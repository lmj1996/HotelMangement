package com.pojo;

import java.util.ArrayList;
import java.util.List;

public class HotelRegisterExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HotelRegisterExample() {
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

        public Criteria andHotelRegisterIdIsNull() {
            addCriterion("hotel_register_id is null");
            return (Criteria) this;
        }

        public Criteria andHotelRegisterIdIsNotNull() {
            addCriterion("hotel_register_id is not null");
            return (Criteria) this;
        }

        public Criteria andHotelRegisterIdEqualTo(String value) {
            addCriterion("hotel_register_id =", value, "hotelRegisterId");
            return (Criteria) this;
        }

        public Criteria andHotelRegisterIdNotEqualTo(String value) {
            addCriterion("hotel_register_id <>", value, "hotelRegisterId");
            return (Criteria) this;
        }

        public Criteria andHotelRegisterIdGreaterThan(String value) {
            addCriterion("hotel_register_id >", value, "hotelRegisterId");
            return (Criteria) this;
        }

        public Criteria andHotelRegisterIdGreaterThanOrEqualTo(String value) {
            addCriterion("hotel_register_id >=", value, "hotelRegisterId");
            return (Criteria) this;
        }

        public Criteria andHotelRegisterIdLessThan(String value) {
            addCriterion("hotel_register_id <", value, "hotelRegisterId");
            return (Criteria) this;
        }

        public Criteria andHotelRegisterIdLessThanOrEqualTo(String value) {
            addCriterion("hotel_register_id <=", value, "hotelRegisterId");
            return (Criteria) this;
        }

        public Criteria andHotelRegisterIdLike(String value) {
            addCriterion("hotel_register_id like", value, "hotelRegisterId");
            return (Criteria) this;
        }

        public Criteria andHotelRegisterIdNotLike(String value) {
            addCriterion("hotel_register_id not like", value, "hotelRegisterId");
            return (Criteria) this;
        }

        public Criteria andHotelRegisterIdIn(List<String> values) {
            addCriterion("hotel_register_id in", values, "hotelRegisterId");
            return (Criteria) this;
        }

        public Criteria andHotelRegisterIdNotIn(List<String> values) {
            addCriterion("hotel_register_id not in", values, "hotelRegisterId");
            return (Criteria) this;
        }

        public Criteria andHotelRegisterIdBetween(String value1, String value2) {
            addCriterion("hotel_register_id between", value1, value2, "hotelRegisterId");
            return (Criteria) this;
        }

        public Criteria andHotelRegisterIdNotBetween(String value1, String value2) {
            addCriterion("hotel_register_id not between", value1, value2, "hotelRegisterId");
            return (Criteria) this;
        }

        public Criteria andHotelRegisterCustomerIsNull() {
            addCriterion("hotel_register_customer is null");
            return (Criteria) this;
        }

        public Criteria andHotelRegisterCustomerIsNotNull() {
            addCriterion("hotel_register_customer is not null");
            return (Criteria) this;
        }

        public Criteria andHotelRegisterCustomerEqualTo(String value) {
            addCriterion("hotel_register_customer =", value, "hotelRegisterCustomer");
            return (Criteria) this;
        }

        public Criteria andHotelRegisterCustomerNotEqualTo(String value) {
            addCriterion("hotel_register_customer <>", value, "hotelRegisterCustomer");
            return (Criteria) this;
        }

        public Criteria andHotelRegisterCustomerGreaterThan(String value) {
            addCriterion("hotel_register_customer >", value, "hotelRegisterCustomer");
            return (Criteria) this;
        }

        public Criteria andHotelRegisterCustomerGreaterThanOrEqualTo(String value) {
            addCriterion("hotel_register_customer >=", value, "hotelRegisterCustomer");
            return (Criteria) this;
        }

        public Criteria andHotelRegisterCustomerLessThan(String value) {
            addCriterion("hotel_register_customer <", value, "hotelRegisterCustomer");
            return (Criteria) this;
        }

        public Criteria andHotelRegisterCustomerLessThanOrEqualTo(String value) {
            addCriterion("hotel_register_customer <=", value, "hotelRegisterCustomer");
            return (Criteria) this;
        }

        public Criteria andHotelRegisterCustomerLike(String value) {
            addCriterion("hotel_register_customer like", value, "hotelRegisterCustomer");
            return (Criteria) this;
        }

        public Criteria andHotelRegisterCustomerNotLike(String value) {
            addCriterion("hotel_register_customer not like", value, "hotelRegisterCustomer");
            return (Criteria) this;
        }

        public Criteria andHotelRegisterCustomerIn(List<String> values) {
            addCriterion("hotel_register_customer in", values, "hotelRegisterCustomer");
            return (Criteria) this;
        }

        public Criteria andHotelRegisterCustomerNotIn(List<String> values) {
            addCriterion("hotel_register_customer not in", values, "hotelRegisterCustomer");
            return (Criteria) this;
        }

        public Criteria andHotelRegisterCustomerBetween(String value1, String value2) {
            addCriterion("hotel_register_customer between", value1, value2, "hotelRegisterCustomer");
            return (Criteria) this;
        }

        public Criteria andHotelRegisterCustomerNotBetween(String value1, String value2) {
            addCriterion("hotel_register_customer not between", value1, value2, "hotelRegisterCustomer");
            return (Criteria) this;
        }

        public Criteria andHotelRegisterRoomIsNull() {
            addCriterion("hotel_register_room is null");
            return (Criteria) this;
        }

        public Criteria andHotelRegisterRoomIsNotNull() {
            addCriterion("hotel_register_room is not null");
            return (Criteria) this;
        }

        public Criteria andHotelRegisterRoomEqualTo(String value) {
            addCriterion("hotel_register_room =", value, "hotelRegisterRoom");
            return (Criteria) this;
        }

        public Criteria andHotelRegisterRoomNotEqualTo(String value) {
            addCriterion("hotel_register_room <>", value, "hotelRegisterRoom");
            return (Criteria) this;
        }

        public Criteria andHotelRegisterRoomGreaterThan(String value) {
            addCriterion("hotel_register_room >", value, "hotelRegisterRoom");
            return (Criteria) this;
        }

        public Criteria andHotelRegisterRoomGreaterThanOrEqualTo(String value) {
            addCriterion("hotel_register_room >=", value, "hotelRegisterRoom");
            return (Criteria) this;
        }

        public Criteria andHotelRegisterRoomLessThan(String value) {
            addCriterion("hotel_register_room <", value, "hotelRegisterRoom");
            return (Criteria) this;
        }

        public Criteria andHotelRegisterRoomLessThanOrEqualTo(String value) {
            addCriterion("hotel_register_room <=", value, "hotelRegisterRoom");
            return (Criteria) this;
        }

        public Criteria andHotelRegisterRoomLike(String value) {
            addCriterion("hotel_register_room like", value, "hotelRegisterRoom");
            return (Criteria) this;
        }

        public Criteria andHotelRegisterRoomNotLike(String value) {
            addCriterion("hotel_register_room not like", value, "hotelRegisterRoom");
            return (Criteria) this;
        }

        public Criteria andHotelRegisterRoomIn(List<String> values) {
            addCriterion("hotel_register_room in", values, "hotelRegisterRoom");
            return (Criteria) this;
        }

        public Criteria andHotelRegisterRoomNotIn(List<String> values) {
            addCriterion("hotel_register_room not in", values, "hotelRegisterRoom");
            return (Criteria) this;
        }

        public Criteria andHotelRegisterRoomBetween(String value1, String value2) {
            addCriterion("hotel_register_room between", value1, value2, "hotelRegisterRoom");
            return (Criteria) this;
        }

        public Criteria andHotelRegisterRoomNotBetween(String value1, String value2) {
            addCriterion("hotel_register_room not between", value1, value2, "hotelRegisterRoom");
            return (Criteria) this;
        }

        public Criteria andHotelRegisterChargingwayIsNull() {
            addCriterion("hotel_register_chargingway is null");
            return (Criteria) this;
        }

        public Criteria andHotelRegisterChargingwayIsNotNull() {
            addCriterion("hotel_register_chargingway is not null");
            return (Criteria) this;
        }

        public Criteria andHotelRegisterChargingwayEqualTo(String value) {
            addCriterion("hotel_register_chargingway =", value, "hotelRegisterChargingway");
            return (Criteria) this;
        }

        public Criteria andHotelRegisterChargingwayNotEqualTo(String value) {
            addCriterion("hotel_register_chargingway <>", value, "hotelRegisterChargingway");
            return (Criteria) this;
        }

        public Criteria andHotelRegisterChargingwayGreaterThan(String value) {
            addCriterion("hotel_register_chargingway >", value, "hotelRegisterChargingway");
            return (Criteria) this;
        }

        public Criteria andHotelRegisterChargingwayGreaterThanOrEqualTo(String value) {
            addCriterion("hotel_register_chargingway >=", value, "hotelRegisterChargingway");
            return (Criteria) this;
        }

        public Criteria andHotelRegisterChargingwayLessThan(String value) {
            addCriterion("hotel_register_chargingway <", value, "hotelRegisterChargingway");
            return (Criteria) this;
        }

        public Criteria andHotelRegisterChargingwayLessThanOrEqualTo(String value) {
            addCriterion("hotel_register_chargingway <=", value, "hotelRegisterChargingway");
            return (Criteria) this;
        }

        public Criteria andHotelRegisterChargingwayLike(String value) {
            addCriterion("hotel_register_chargingway like", value, "hotelRegisterChargingway");
            return (Criteria) this;
        }

        public Criteria andHotelRegisterChargingwayNotLike(String value) {
            addCriterion("hotel_register_chargingway not like", value, "hotelRegisterChargingway");
            return (Criteria) this;
        }

        public Criteria andHotelRegisterChargingwayIn(List<String> values) {
            addCriterion("hotel_register_chargingway in", values, "hotelRegisterChargingway");
            return (Criteria) this;
        }

        public Criteria andHotelRegisterChargingwayNotIn(List<String> values) {
            addCriterion("hotel_register_chargingway not in", values, "hotelRegisterChargingway");
            return (Criteria) this;
        }

        public Criteria andHotelRegisterChargingwayBetween(String value1, String value2) {
            addCriterion("hotel_register_chargingway between", value1, value2, "hotelRegisterChargingway");
            return (Criteria) this;
        }

        public Criteria andHotelRegisterChargingwayNotBetween(String value1, String value2) {
            addCriterion("hotel_register_chargingway not between", value1, value2, "hotelRegisterChargingway");
            return (Criteria) this;
        }

        public Criteria andHotelRegisterStarttimeIsNull() {
            addCriterion("hotel_register_starttime is null");
            return (Criteria) this;
        }

        public Criteria andHotelRegisterStarttimeIsNotNull() {
            addCriterion("hotel_register_starttime is not null");
            return (Criteria) this;
        }

        public Criteria andHotelRegisterStarttimeEqualTo(String value) {
            addCriterion("hotel_register_starttime =", value, "hotelRegisterStarttime");
            return (Criteria) this;
        }

        public Criteria andHotelRegisterStarttimeNotEqualTo(String value) {
            addCriterion("hotel_register_starttime <>", value, "hotelRegisterStarttime");
            return (Criteria) this;
        }

        public Criteria andHotelRegisterStarttimeGreaterThan(String value) {
            addCriterion("hotel_register_starttime >", value, "hotelRegisterStarttime");
            return (Criteria) this;
        }

        public Criteria andHotelRegisterStarttimeGreaterThanOrEqualTo(String value) {
            addCriterion("hotel_register_starttime >=", value, "hotelRegisterStarttime");
            return (Criteria) this;
        }

        public Criteria andHotelRegisterStarttimeLessThan(String value) {
            addCriterion("hotel_register_starttime <", value, "hotelRegisterStarttime");
            return (Criteria) this;
        }

        public Criteria andHotelRegisterStarttimeLessThanOrEqualTo(String value) {
            addCriterion("hotel_register_starttime <=", value, "hotelRegisterStarttime");
            return (Criteria) this;
        }

        public Criteria andHotelRegisterStarttimeLike(String value) {
            addCriterion("hotel_register_starttime like", value, "hotelRegisterStarttime");
            return (Criteria) this;
        }

        public Criteria andHotelRegisterStarttimeNotLike(String value) {
            addCriterion("hotel_register_starttime not like", value, "hotelRegisterStarttime");
            return (Criteria) this;
        }

        public Criteria andHotelRegisterStarttimeIn(List<String> values) {
            addCriterion("hotel_register_starttime in", values, "hotelRegisterStarttime");
            return (Criteria) this;
        }

        public Criteria andHotelRegisterStarttimeNotIn(List<String> values) {
            addCriterion("hotel_register_starttime not in", values, "hotelRegisterStarttime");
            return (Criteria) this;
        }

        public Criteria andHotelRegisterStarttimeBetween(String value1, String value2) {
            addCriterion("hotel_register_starttime between", value1, value2, "hotelRegisterStarttime");
            return (Criteria) this;
        }

        public Criteria andHotelRegisterStarttimeNotBetween(String value1, String value2) {
            addCriterion("hotel_register_starttime not between", value1, value2, "hotelRegisterStarttime");
            return (Criteria) this;
        }

        public Criteria andHotelRegisterEndtimeIsNull() {
            addCriterion("hotel_register_endtime is null");
            return (Criteria) this;
        }

        public Criteria andHotelRegisterEndtimeIsNotNull() {
            addCriterion("hotel_register_endtime is not null");
            return (Criteria) this;
        }

        public Criteria andHotelRegisterEndtimeEqualTo(String value) {
            addCriterion("hotel_register_endtime =", value, "hotelRegisterEndtime");
            return (Criteria) this;
        }

        public Criteria andHotelRegisterEndtimeNotEqualTo(String value) {
            addCriterion("hotel_register_endtime <>", value, "hotelRegisterEndtime");
            return (Criteria) this;
        }

        public Criteria andHotelRegisterEndtimeGreaterThan(String value) {
            addCriterion("hotel_register_endtime >", value, "hotelRegisterEndtime");
            return (Criteria) this;
        }

        public Criteria andHotelRegisterEndtimeGreaterThanOrEqualTo(String value) {
            addCriterion("hotel_register_endtime >=", value, "hotelRegisterEndtime");
            return (Criteria) this;
        }

        public Criteria andHotelRegisterEndtimeLessThan(String value) {
            addCriterion("hotel_register_endtime <", value, "hotelRegisterEndtime");
            return (Criteria) this;
        }

        public Criteria andHotelRegisterEndtimeLessThanOrEqualTo(String value) {
            addCriterion("hotel_register_endtime <=", value, "hotelRegisterEndtime");
            return (Criteria) this;
        }

        public Criteria andHotelRegisterEndtimeLike(String value) {
            addCriterion("hotel_register_endtime like", value, "hotelRegisterEndtime");
            return (Criteria) this;
        }

        public Criteria andHotelRegisterEndtimeNotLike(String value) {
            addCriterion("hotel_register_endtime not like", value, "hotelRegisterEndtime");
            return (Criteria) this;
        }

        public Criteria andHotelRegisterEndtimeIn(List<String> values) {
            addCriterion("hotel_register_endtime in", values, "hotelRegisterEndtime");
            return (Criteria) this;
        }

        public Criteria andHotelRegisterEndtimeNotIn(List<String> values) {
            addCriterion("hotel_register_endtime not in", values, "hotelRegisterEndtime");
            return (Criteria) this;
        }

        public Criteria andHotelRegisterEndtimeBetween(String value1, String value2) {
            addCriterion("hotel_register_endtime between", value1, value2, "hotelRegisterEndtime");
            return (Criteria) this;
        }

        public Criteria andHotelRegisterEndtimeNotBetween(String value1, String value2) {
            addCriterion("hotel_register_endtime not between", value1, value2, "hotelRegisterEndtime");
            return (Criteria) this;
        }

        public Criteria andHotelRegisterSecurityIsNull() {
            addCriterion("hotel_register_security is null");
            return (Criteria) this;
        }

        public Criteria andHotelRegisterSecurityIsNotNull() {
            addCriterion("hotel_register_security is not null");
            return (Criteria) this;
        }

        public Criteria andHotelRegisterSecurityEqualTo(String value) {
            addCriterion("hotel_register_security =", value, "hotelRegisterSecurity");
            return (Criteria) this;
        }

        public Criteria andHotelRegisterSecurityNotEqualTo(String value) {
            addCriterion("hotel_register_security <>", value, "hotelRegisterSecurity");
            return (Criteria) this;
        }

        public Criteria andHotelRegisterSecurityGreaterThan(String value) {
            addCriterion("hotel_register_security >", value, "hotelRegisterSecurity");
            return (Criteria) this;
        }

        public Criteria andHotelRegisterSecurityGreaterThanOrEqualTo(String value) {
            addCriterion("hotel_register_security >=", value, "hotelRegisterSecurity");
            return (Criteria) this;
        }

        public Criteria andHotelRegisterSecurityLessThan(String value) {
            addCriterion("hotel_register_security <", value, "hotelRegisterSecurity");
            return (Criteria) this;
        }

        public Criteria andHotelRegisterSecurityLessThanOrEqualTo(String value) {
            addCriterion("hotel_register_security <=", value, "hotelRegisterSecurity");
            return (Criteria) this;
        }

        public Criteria andHotelRegisterSecurityLike(String value) {
            addCriterion("hotel_register_security like", value, "hotelRegisterSecurity");
            return (Criteria) this;
        }

        public Criteria andHotelRegisterSecurityNotLike(String value) {
            addCriterion("hotel_register_security not like", value, "hotelRegisterSecurity");
            return (Criteria) this;
        }

        public Criteria andHotelRegisterSecurityIn(List<String> values) {
            addCriterion("hotel_register_security in", values, "hotelRegisterSecurity");
            return (Criteria) this;
        }

        public Criteria andHotelRegisterSecurityNotIn(List<String> values) {
            addCriterion("hotel_register_security not in", values, "hotelRegisterSecurity");
            return (Criteria) this;
        }

        public Criteria andHotelRegisterSecurityBetween(String value1, String value2) {
            addCriterion("hotel_register_security between", value1, value2, "hotelRegisterSecurity");
            return (Criteria) this;
        }

        public Criteria andHotelRegisterSecurityNotBetween(String value1, String value2) {
            addCriterion("hotel_register_security not between", value1, value2, "hotelRegisterSecurity");
            return (Criteria) this;
        }

        public Criteria andHotelRegisterTotalpriceIsNull() {
            addCriterion("hotel_register_totalprice is null");
            return (Criteria) this;
        }

        public Criteria andHotelRegisterTotalpriceIsNotNull() {
            addCriterion("hotel_register_totalprice is not null");
            return (Criteria) this;
        }

        public Criteria andHotelRegisterTotalpriceEqualTo(String value) {
            addCriterion("hotel_register_totalprice =", value, "hotelRegisterTotalprice");
            return (Criteria) this;
        }

        public Criteria andHotelRegisterTotalpriceNotEqualTo(String value) {
            addCriterion("hotel_register_totalprice <>", value, "hotelRegisterTotalprice");
            return (Criteria) this;
        }

        public Criteria andHotelRegisterTotalpriceGreaterThan(String value) {
            addCriterion("hotel_register_totalprice >", value, "hotelRegisterTotalprice");
            return (Criteria) this;
        }

        public Criteria andHotelRegisterTotalpriceGreaterThanOrEqualTo(String value) {
            addCriterion("hotel_register_totalprice >=", value, "hotelRegisterTotalprice");
            return (Criteria) this;
        }

        public Criteria andHotelRegisterTotalpriceLessThan(String value) {
            addCriterion("hotel_register_totalprice <", value, "hotelRegisterTotalprice");
            return (Criteria) this;
        }

        public Criteria andHotelRegisterTotalpriceLessThanOrEqualTo(String value) {
            addCriterion("hotel_register_totalprice <=", value, "hotelRegisterTotalprice");
            return (Criteria) this;
        }

        public Criteria andHotelRegisterTotalpriceLike(String value) {
            addCriterion("hotel_register_totalprice like", value, "hotelRegisterTotalprice");
            return (Criteria) this;
        }

        public Criteria andHotelRegisterTotalpriceNotLike(String value) {
            addCriterion("hotel_register_totalprice not like", value, "hotelRegisterTotalprice");
            return (Criteria) this;
        }

        public Criteria andHotelRegisterTotalpriceIn(List<String> values) {
            addCriterion("hotel_register_totalprice in", values, "hotelRegisterTotalprice");
            return (Criteria) this;
        }

        public Criteria andHotelRegisterTotalpriceNotIn(List<String> values) {
            addCriterion("hotel_register_totalprice not in", values, "hotelRegisterTotalprice");
            return (Criteria) this;
        }

        public Criteria andHotelRegisterTotalpriceBetween(String value1, String value2) {
            addCriterion("hotel_register_totalprice between", value1, value2, "hotelRegisterTotalprice");
            return (Criteria) this;
        }

        public Criteria andHotelRegisterTotalpriceNotBetween(String value1, String value2) {
            addCriterion("hotel_register_totalprice not between", value1, value2, "hotelRegisterTotalprice");
            return (Criteria) this;
        }

        public Criteria andHotelRegisterCreatetimeIsNull() {
            addCriterion("hotel_register_createtime is null");
            return (Criteria) this;
        }

        public Criteria andHotelRegisterCreatetimeIsNotNull() {
            addCriterion("hotel_register_createtime is not null");
            return (Criteria) this;
        }

        public Criteria andHotelRegisterCreatetimeEqualTo(String value) {
            addCriterion("hotel_register_createtime =", value, "hotelRegisterCreatetime");
            return (Criteria) this;
        }

        public Criteria andHotelRegisterCreatetimeNotEqualTo(String value) {
            addCriterion("hotel_register_createtime <>", value, "hotelRegisterCreatetime");
            return (Criteria) this;
        }

        public Criteria andHotelRegisterCreatetimeGreaterThan(String value) {
            addCriterion("hotel_register_createtime >", value, "hotelRegisterCreatetime");
            return (Criteria) this;
        }

        public Criteria andHotelRegisterCreatetimeGreaterThanOrEqualTo(String value) {
            addCriterion("hotel_register_createtime >=", value, "hotelRegisterCreatetime");
            return (Criteria) this;
        }

        public Criteria andHotelRegisterCreatetimeLessThan(String value) {
            addCriterion("hotel_register_createtime <", value, "hotelRegisterCreatetime");
            return (Criteria) this;
        }

        public Criteria andHotelRegisterCreatetimeLessThanOrEqualTo(String value) {
            addCriterion("hotel_register_createtime <=", value, "hotelRegisterCreatetime");
            return (Criteria) this;
        }

        public Criteria andHotelRegisterCreatetimeLike(String value) {
            addCriterion("hotel_register_createtime like", value, "hotelRegisterCreatetime");
            return (Criteria) this;
        }

        public Criteria andHotelRegisterCreatetimeNotLike(String value) {
            addCriterion("hotel_register_createtime not like", value, "hotelRegisterCreatetime");
            return (Criteria) this;
        }

        public Criteria andHotelRegisterCreatetimeIn(List<String> values) {
            addCriterion("hotel_register_createtime in", values, "hotelRegisterCreatetime");
            return (Criteria) this;
        }

        public Criteria andHotelRegisterCreatetimeNotIn(List<String> values) {
            addCriterion("hotel_register_createtime not in", values, "hotelRegisterCreatetime");
            return (Criteria) this;
        }

        public Criteria andHotelRegisterCreatetimeBetween(String value1, String value2) {
            addCriterion("hotel_register_createtime between", value1, value2, "hotelRegisterCreatetime");
            return (Criteria) this;
        }

        public Criteria andHotelRegisterCreatetimeNotBetween(String value1, String value2) {
            addCriterion("hotel_register_createtime not between", value1, value2, "hotelRegisterCreatetime");
            return (Criteria) this;
        }

        public Criteria andHotelRegisterModifytimeIsNull() {
            addCriterion("hotel_register_modifytime is null");
            return (Criteria) this;
        }

        public Criteria andHotelRegisterModifytimeIsNotNull() {
            addCriterion("hotel_register_modifytime is not null");
            return (Criteria) this;
        }

        public Criteria andHotelRegisterModifytimeEqualTo(String value) {
            addCriterion("hotel_register_modifytime =", value, "hotelRegisterModifytime");
            return (Criteria) this;
        }

        public Criteria andHotelRegisterModifytimeNotEqualTo(String value) {
            addCriterion("hotel_register_modifytime <>", value, "hotelRegisterModifytime");
            return (Criteria) this;
        }

        public Criteria andHotelRegisterModifytimeGreaterThan(String value) {
            addCriterion("hotel_register_modifytime >", value, "hotelRegisterModifytime");
            return (Criteria) this;
        }

        public Criteria andHotelRegisterModifytimeGreaterThanOrEqualTo(String value) {
            addCriterion("hotel_register_modifytime >=", value, "hotelRegisterModifytime");
            return (Criteria) this;
        }

        public Criteria andHotelRegisterModifytimeLessThan(String value) {
            addCriterion("hotel_register_modifytime <", value, "hotelRegisterModifytime");
            return (Criteria) this;
        }

        public Criteria andHotelRegisterModifytimeLessThanOrEqualTo(String value) {
            addCriterion("hotel_register_modifytime <=", value, "hotelRegisterModifytime");
            return (Criteria) this;
        }

        public Criteria andHotelRegisterModifytimeLike(String value) {
            addCriterion("hotel_register_modifytime like", value, "hotelRegisterModifytime");
            return (Criteria) this;
        }

        public Criteria andHotelRegisterModifytimeNotLike(String value) {
            addCriterion("hotel_register_modifytime not like", value, "hotelRegisterModifytime");
            return (Criteria) this;
        }

        public Criteria andHotelRegisterModifytimeIn(List<String> values) {
            addCriterion("hotel_register_modifytime in", values, "hotelRegisterModifytime");
            return (Criteria) this;
        }

        public Criteria andHotelRegisterModifytimeNotIn(List<String> values) {
            addCriterion("hotel_register_modifytime not in", values, "hotelRegisterModifytime");
            return (Criteria) this;
        }

        public Criteria andHotelRegisterModifytimeBetween(String value1, String value2) {
            addCriterion("hotel_register_modifytime between", value1, value2, "hotelRegisterModifytime");
            return (Criteria) this;
        }

        public Criteria andHotelRegisterModifytimeNotBetween(String value1, String value2) {
            addCriterion("hotel_register_modifytime not between", value1, value2, "hotelRegisterModifytime");
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