package com.pojo;

import java.util.ArrayList;
import java.util.List;

public class StaffExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StaffExample() {
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

        public Criteria andStaffIdIsNull() {
            addCriterion("staff_id is null");
            return (Criteria) this;
        }

        public Criteria andStaffIdIsNotNull() {
            addCriterion("staff_id is not null");
            return (Criteria) this;
        }

        public Criteria andStaffIdEqualTo(String value) {
            addCriterion("staff_id =", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdNotEqualTo(String value) {
            addCriterion("staff_id <>", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdGreaterThan(String value) {
            addCriterion("staff_id >", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdGreaterThanOrEqualTo(String value) {
            addCriterion("staff_id >=", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdLessThan(String value) {
            addCriterion("staff_id <", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdLessThanOrEqualTo(String value) {
            addCriterion("staff_id <=", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdLike(String value) {
            addCriterion("staff_id like", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdNotLike(String value) {
            addCriterion("staff_id not like", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdIn(List<String> values) {
            addCriterion("staff_id in", values, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdNotIn(List<String> values) {
            addCriterion("staff_id not in", values, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdBetween(String value1, String value2) {
            addCriterion("staff_id between", value1, value2, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdNotBetween(String value1, String value2) {
            addCriterion("staff_id not between", value1, value2, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffNumIsNull() {
            addCriterion("staff_num is null");
            return (Criteria) this;
        }

        public Criteria andStaffNumIsNotNull() {
            addCriterion("staff_num is not null");
            return (Criteria) this;
        }

        public Criteria andStaffNumEqualTo(String value) {
            addCriterion("staff_num =", value, "staffNum");
            return (Criteria) this;
        }

        public Criteria andStaffNumNotEqualTo(String value) {
            addCriterion("staff_num <>", value, "staffNum");
            return (Criteria) this;
        }

        public Criteria andStaffNumGreaterThan(String value) {
            addCriterion("staff_num >", value, "staffNum");
            return (Criteria) this;
        }

        public Criteria andStaffNumGreaterThanOrEqualTo(String value) {
            addCriterion("staff_num >=", value, "staffNum");
            return (Criteria) this;
        }

        public Criteria andStaffNumLessThan(String value) {
            addCriterion("staff_num <", value, "staffNum");
            return (Criteria) this;
        }

        public Criteria andStaffNumLessThanOrEqualTo(String value) {
            addCriterion("staff_num <=", value, "staffNum");
            return (Criteria) this;
        }

        public Criteria andStaffNumLike(String value) {
            addCriterion("staff_num like", value, "staffNum");
            return (Criteria) this;
        }

        public Criteria andStaffNumNotLike(String value) {
            addCriterion("staff_num not like", value, "staffNum");
            return (Criteria) this;
        }

        public Criteria andStaffNumIn(List<String> values) {
            addCriterion("staff_num in", values, "staffNum");
            return (Criteria) this;
        }

        public Criteria andStaffNumNotIn(List<String> values) {
            addCriterion("staff_num not in", values, "staffNum");
            return (Criteria) this;
        }

        public Criteria andStaffNumBetween(String value1, String value2) {
            addCriterion("staff_num between", value1, value2, "staffNum");
            return (Criteria) this;
        }

        public Criteria andStaffNumNotBetween(String value1, String value2) {
            addCriterion("staff_num not between", value1, value2, "staffNum");
            return (Criteria) this;
        }

        public Criteria andStaffPasswordIsNull() {
            addCriterion("staff_password is null");
            return (Criteria) this;
        }

        public Criteria andStaffPasswordIsNotNull() {
            addCriterion("staff_password is not null");
            return (Criteria) this;
        }

        public Criteria andStaffPasswordEqualTo(String value) {
            addCriterion("staff_password =", value, "staffPassword");
            return (Criteria) this;
        }

        public Criteria andStaffPasswordNotEqualTo(String value) {
            addCriterion("staff_password <>", value, "staffPassword");
            return (Criteria) this;
        }

        public Criteria andStaffPasswordGreaterThan(String value) {
            addCriterion("staff_password >", value, "staffPassword");
            return (Criteria) this;
        }

        public Criteria andStaffPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("staff_password >=", value, "staffPassword");
            return (Criteria) this;
        }

        public Criteria andStaffPasswordLessThan(String value) {
            addCriterion("staff_password <", value, "staffPassword");
            return (Criteria) this;
        }

        public Criteria andStaffPasswordLessThanOrEqualTo(String value) {
            addCriterion("staff_password <=", value, "staffPassword");
            return (Criteria) this;
        }

        public Criteria andStaffPasswordLike(String value) {
            addCriterion("staff_password like", value, "staffPassword");
            return (Criteria) this;
        }

        public Criteria andStaffPasswordNotLike(String value) {
            addCriterion("staff_password not like", value, "staffPassword");
            return (Criteria) this;
        }

        public Criteria andStaffPasswordIn(List<String> values) {
            addCriterion("staff_password in", values, "staffPassword");
            return (Criteria) this;
        }

        public Criteria andStaffPasswordNotIn(List<String> values) {
            addCriterion("staff_password not in", values, "staffPassword");
            return (Criteria) this;
        }

        public Criteria andStaffPasswordBetween(String value1, String value2) {
            addCriterion("staff_password between", value1, value2, "staffPassword");
            return (Criteria) this;
        }

        public Criteria andStaffPasswordNotBetween(String value1, String value2) {
            addCriterion("staff_password not between", value1, value2, "staffPassword");
            return (Criteria) this;
        }

        public Criteria andStaffWorkclassIsNull() {
            addCriterion("staff_workclass is null");
            return (Criteria) this;
        }

        public Criteria andStaffWorkclassIsNotNull() {
            addCriterion("staff_workclass is not null");
            return (Criteria) this;
        }

        public Criteria andStaffWorkclassEqualTo(String value) {
            addCriterion("staff_workclass =", value, "staffWorkclass");
            return (Criteria) this;
        }

        public Criteria andStaffWorkclassNotEqualTo(String value) {
            addCriterion("staff_workclass <>", value, "staffWorkclass");
            return (Criteria) this;
        }

        public Criteria andStaffWorkclassGreaterThan(String value) {
            addCriterion("staff_workclass >", value, "staffWorkclass");
            return (Criteria) this;
        }

        public Criteria andStaffWorkclassGreaterThanOrEqualTo(String value) {
            addCriterion("staff_workclass >=", value, "staffWorkclass");
            return (Criteria) this;
        }

        public Criteria andStaffWorkclassLessThan(String value) {
            addCriterion("staff_workclass <", value, "staffWorkclass");
            return (Criteria) this;
        }

        public Criteria andStaffWorkclassLessThanOrEqualTo(String value) {
            addCriterion("staff_workclass <=", value, "staffWorkclass");
            return (Criteria) this;
        }

        public Criteria andStaffWorkclassLike(String value) {
            addCriterion("staff_workclass like", value, "staffWorkclass");
            return (Criteria) this;
        }

        public Criteria andStaffWorkclassNotLike(String value) {
            addCriterion("staff_workclass not like", value, "staffWorkclass");
            return (Criteria) this;
        }

        public Criteria andStaffWorkclassIn(List<String> values) {
            addCriterion("staff_workclass in", values, "staffWorkclass");
            return (Criteria) this;
        }

        public Criteria andStaffWorkclassNotIn(List<String> values) {
            addCriterion("staff_workclass not in", values, "staffWorkclass");
            return (Criteria) this;
        }

        public Criteria andStaffWorkclassBetween(String value1, String value2) {
            addCriterion("staff_workclass between", value1, value2, "staffWorkclass");
            return (Criteria) this;
        }

        public Criteria andStaffWorkclassNotBetween(String value1, String value2) {
            addCriterion("staff_workclass not between", value1, value2, "staffWorkclass");
            return (Criteria) this;
        }

        public Criteria andStaffNameIsNull() {
            addCriterion("staff_name is null");
            return (Criteria) this;
        }

        public Criteria andStaffNameIsNotNull() {
            addCriterion("staff_name is not null");
            return (Criteria) this;
        }

        public Criteria andStaffNameEqualTo(String value) {
            addCriterion("staff_name =", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameNotEqualTo(String value) {
            addCriterion("staff_name <>", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameGreaterThan(String value) {
            addCriterion("staff_name >", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameGreaterThanOrEqualTo(String value) {
            addCriterion("staff_name >=", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameLessThan(String value) {
            addCriterion("staff_name <", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameLessThanOrEqualTo(String value) {
            addCriterion("staff_name <=", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameLike(String value) {
            addCriterion("staff_name like", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameNotLike(String value) {
            addCriterion("staff_name not like", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameIn(List<String> values) {
            addCriterion("staff_name in", values, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameNotIn(List<String> values) {
            addCriterion("staff_name not in", values, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameBetween(String value1, String value2) {
            addCriterion("staff_name between", value1, value2, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameNotBetween(String value1, String value2) {
            addCriterion("staff_name not between", value1, value2, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffSexIsNull() {
            addCriterion("staff_sex is null");
            return (Criteria) this;
        }

        public Criteria andStaffSexIsNotNull() {
            addCriterion("staff_sex is not null");
            return (Criteria) this;
        }

        public Criteria andStaffSexEqualTo(String value) {
            addCriterion("staff_sex =", value, "staffSex");
            return (Criteria) this;
        }

        public Criteria andStaffSexNotEqualTo(String value) {
            addCriterion("staff_sex <>", value, "staffSex");
            return (Criteria) this;
        }

        public Criteria andStaffSexGreaterThan(String value) {
            addCriterion("staff_sex >", value, "staffSex");
            return (Criteria) this;
        }

        public Criteria andStaffSexGreaterThanOrEqualTo(String value) {
            addCriterion("staff_sex >=", value, "staffSex");
            return (Criteria) this;
        }

        public Criteria andStaffSexLessThan(String value) {
            addCriterion("staff_sex <", value, "staffSex");
            return (Criteria) this;
        }

        public Criteria andStaffSexLessThanOrEqualTo(String value) {
            addCriterion("staff_sex <=", value, "staffSex");
            return (Criteria) this;
        }

        public Criteria andStaffSexLike(String value) {
            addCriterion("staff_sex like", value, "staffSex");
            return (Criteria) this;
        }

        public Criteria andStaffSexNotLike(String value) {
            addCriterion("staff_sex not like", value, "staffSex");
            return (Criteria) this;
        }

        public Criteria andStaffSexIn(List<String> values) {
            addCriterion("staff_sex in", values, "staffSex");
            return (Criteria) this;
        }

        public Criteria andStaffSexNotIn(List<String> values) {
            addCriterion("staff_sex not in", values, "staffSex");
            return (Criteria) this;
        }

        public Criteria andStaffSexBetween(String value1, String value2) {
            addCriterion("staff_sex between", value1, value2, "staffSex");
            return (Criteria) this;
        }

        public Criteria andStaffSexNotBetween(String value1, String value2) {
            addCriterion("staff_sex not between", value1, value2, "staffSex");
            return (Criteria) this;
        }

        public Criteria andStaffEntrytimeIsNull() {
            addCriterion("staff_entrytime is null");
            return (Criteria) this;
        }

        public Criteria andStaffEntrytimeIsNotNull() {
            addCriterion("staff_entrytime is not null");
            return (Criteria) this;
        }

        public Criteria andStaffEntrytimeEqualTo(String value) {
            addCriterion("staff_entrytime =", value, "staffEntrytime");
            return (Criteria) this;
        }

        public Criteria andStaffEntrytimeNotEqualTo(String value) {
            addCriterion("staff_entrytime <>", value, "staffEntrytime");
            return (Criteria) this;
        }

        public Criteria andStaffEntrytimeGreaterThan(String value) {
            addCriterion("staff_entrytime >", value, "staffEntrytime");
            return (Criteria) this;
        }

        public Criteria andStaffEntrytimeGreaterThanOrEqualTo(String value) {
            addCriterion("staff_entrytime >=", value, "staffEntrytime");
            return (Criteria) this;
        }

        public Criteria andStaffEntrytimeLessThan(String value) {
            addCriterion("staff_entrytime <", value, "staffEntrytime");
            return (Criteria) this;
        }

        public Criteria andStaffEntrytimeLessThanOrEqualTo(String value) {
            addCriterion("staff_entrytime <=", value, "staffEntrytime");
            return (Criteria) this;
        }

        public Criteria andStaffEntrytimeLike(String value) {
            addCriterion("staff_entrytime like", value, "staffEntrytime");
            return (Criteria) this;
        }

        public Criteria andStaffEntrytimeNotLike(String value) {
            addCriterion("staff_entrytime not like", value, "staffEntrytime");
            return (Criteria) this;
        }

        public Criteria andStaffEntrytimeIn(List<String> values) {
            addCriterion("staff_entrytime in", values, "staffEntrytime");
            return (Criteria) this;
        }

        public Criteria andStaffEntrytimeNotIn(List<String> values) {
            addCriterion("staff_entrytime not in", values, "staffEntrytime");
            return (Criteria) this;
        }

        public Criteria andStaffEntrytimeBetween(String value1, String value2) {
            addCriterion("staff_entrytime between", value1, value2, "staffEntrytime");
            return (Criteria) this;
        }

        public Criteria andStaffEntrytimeNotBetween(String value1, String value2) {
            addCriterion("staff_entrytime not between", value1, value2, "staffEntrytime");
            return (Criteria) this;
        }

        public Criteria andStaffPositionIsNull() {
            addCriterion("staff_position is null");
            return (Criteria) this;
        }

        public Criteria andStaffPositionIsNotNull() {
            addCriterion("staff_position is not null");
            return (Criteria) this;
        }

        public Criteria andStaffPositionEqualTo(String value) {
            addCriterion("staff_position =", value, "staffPosition");
            return (Criteria) this;
        }

        public Criteria andStaffPositionNotEqualTo(String value) {
            addCriterion("staff_position <>", value, "staffPosition");
            return (Criteria) this;
        }

        public Criteria andStaffPositionGreaterThan(String value) {
            addCriterion("staff_position >", value, "staffPosition");
            return (Criteria) this;
        }

        public Criteria andStaffPositionGreaterThanOrEqualTo(String value) {
            addCriterion("staff_position >=", value, "staffPosition");
            return (Criteria) this;
        }

        public Criteria andStaffPositionLessThan(String value) {
            addCriterion("staff_position <", value, "staffPosition");
            return (Criteria) this;
        }

        public Criteria andStaffPositionLessThanOrEqualTo(String value) {
            addCriterion("staff_position <=", value, "staffPosition");
            return (Criteria) this;
        }

        public Criteria andStaffPositionLike(String value) {
            addCriterion("staff_position like", value, "staffPosition");
            return (Criteria) this;
        }

        public Criteria andStaffPositionNotLike(String value) {
            addCriterion("staff_position not like", value, "staffPosition");
            return (Criteria) this;
        }

        public Criteria andStaffPositionIn(List<String> values) {
            addCriterion("staff_position in", values, "staffPosition");
            return (Criteria) this;
        }

        public Criteria andStaffPositionNotIn(List<String> values) {
            addCriterion("staff_position not in", values, "staffPosition");
            return (Criteria) this;
        }

        public Criteria andStaffPositionBetween(String value1, String value2) {
            addCriterion("staff_position between", value1, value2, "staffPosition");
            return (Criteria) this;
        }

        public Criteria andStaffPositionNotBetween(String value1, String value2) {
            addCriterion("staff_position not between", value1, value2, "staffPosition");
            return (Criteria) this;
        }

        public Criteria andStaffCreatetimeIsNull() {
            addCriterion("staff_createtime is null");
            return (Criteria) this;
        }

        public Criteria andStaffCreatetimeIsNotNull() {
            addCriterion("staff_createtime is not null");
            return (Criteria) this;
        }

        public Criteria andStaffCreatetimeEqualTo(String value) {
            addCriterion("staff_createtime =", value, "staffCreatetime");
            return (Criteria) this;
        }

        public Criteria andStaffCreatetimeNotEqualTo(String value) {
            addCriterion("staff_createtime <>", value, "staffCreatetime");
            return (Criteria) this;
        }

        public Criteria andStaffCreatetimeGreaterThan(String value) {
            addCriterion("staff_createtime >", value, "staffCreatetime");
            return (Criteria) this;
        }

        public Criteria andStaffCreatetimeGreaterThanOrEqualTo(String value) {
            addCriterion("staff_createtime >=", value, "staffCreatetime");
            return (Criteria) this;
        }

        public Criteria andStaffCreatetimeLessThan(String value) {
            addCriterion("staff_createtime <", value, "staffCreatetime");
            return (Criteria) this;
        }

        public Criteria andStaffCreatetimeLessThanOrEqualTo(String value) {
            addCriterion("staff_createtime <=", value, "staffCreatetime");
            return (Criteria) this;
        }

        public Criteria andStaffCreatetimeLike(String value) {
            addCriterion("staff_createtime like", value, "staffCreatetime");
            return (Criteria) this;
        }

        public Criteria andStaffCreatetimeNotLike(String value) {
            addCriterion("staff_createtime not like", value, "staffCreatetime");
            return (Criteria) this;
        }

        public Criteria andStaffCreatetimeIn(List<String> values) {
            addCriterion("staff_createtime in", values, "staffCreatetime");
            return (Criteria) this;
        }

        public Criteria andStaffCreatetimeNotIn(List<String> values) {
            addCriterion("staff_createtime not in", values, "staffCreatetime");
            return (Criteria) this;
        }

        public Criteria andStaffCreatetimeBetween(String value1, String value2) {
            addCriterion("staff_createtime between", value1, value2, "staffCreatetime");
            return (Criteria) this;
        }

        public Criteria andStaffCreatetimeNotBetween(String value1, String value2) {
            addCriterion("staff_createtime not between", value1, value2, "staffCreatetime");
            return (Criteria) this;
        }

        public Criteria andStaffModifytimeIsNull() {
            addCriterion("staff_modifytime is null");
            return (Criteria) this;
        }

        public Criteria andStaffModifytimeIsNotNull() {
            addCriterion("staff_modifytime is not null");
            return (Criteria) this;
        }

        public Criteria andStaffModifytimeEqualTo(String value) {
            addCriterion("staff_modifytime =", value, "staffModifytime");
            return (Criteria) this;
        }

        public Criteria andStaffModifytimeNotEqualTo(String value) {
            addCriterion("staff_modifytime <>", value, "staffModifytime");
            return (Criteria) this;
        }

        public Criteria andStaffModifytimeGreaterThan(String value) {
            addCriterion("staff_modifytime >", value, "staffModifytime");
            return (Criteria) this;
        }

        public Criteria andStaffModifytimeGreaterThanOrEqualTo(String value) {
            addCriterion("staff_modifytime >=", value, "staffModifytime");
            return (Criteria) this;
        }

        public Criteria andStaffModifytimeLessThan(String value) {
            addCriterion("staff_modifytime <", value, "staffModifytime");
            return (Criteria) this;
        }

        public Criteria andStaffModifytimeLessThanOrEqualTo(String value) {
            addCriterion("staff_modifytime <=", value, "staffModifytime");
            return (Criteria) this;
        }

        public Criteria andStaffModifytimeLike(String value) {
            addCriterion("staff_modifytime like", value, "staffModifytime");
            return (Criteria) this;
        }

        public Criteria andStaffModifytimeNotLike(String value) {
            addCriterion("staff_modifytime not like", value, "staffModifytime");
            return (Criteria) this;
        }

        public Criteria andStaffModifytimeIn(List<String> values) {
            addCriterion("staff_modifytime in", values, "staffModifytime");
            return (Criteria) this;
        }

        public Criteria andStaffModifytimeNotIn(List<String> values) {
            addCriterion("staff_modifytime not in", values, "staffModifytime");
            return (Criteria) this;
        }

        public Criteria andStaffModifytimeBetween(String value1, String value2) {
            addCriterion("staff_modifytime between", value1, value2, "staffModifytime");
            return (Criteria) this;
        }

        public Criteria andStaffModifytimeNotBetween(String value1, String value2) {
            addCriterion("staff_modifytime not between", value1, value2, "staffModifytime");
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