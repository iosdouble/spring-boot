package com.nh.workflow.workflowsupport.dao.bean;

import java.util.ArrayList;
import java.util.List;

public class EventServiceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EventServiceExample() {
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

        public Criteria andEventIdIsNull() {
            addCriterion("event_id is null");
            return (Criteria) this;
        }

        public Criteria andEventIdIsNotNull() {
            addCriterion("event_id is not null");
            return (Criteria) this;
        }

        public Criteria andEventIdEqualTo(Integer value) {
            addCriterion("event_id =", value, "eventId");
            return (Criteria) this;
        }

        public Criteria andEventIdNotEqualTo(Integer value) {
            addCriterion("event_id <>", value, "eventId");
            return (Criteria) this;
        }

        public Criteria andEventIdGreaterThan(Integer value) {
            addCriterion("event_id >", value, "eventId");
            return (Criteria) this;
        }

        public Criteria andEventIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("event_id >=", value, "eventId");
            return (Criteria) this;
        }

        public Criteria andEventIdLessThan(Integer value) {
            addCriterion("event_id <", value, "eventId");
            return (Criteria) this;
        }

        public Criteria andEventIdLessThanOrEqualTo(Integer value) {
            addCriterion("event_id <=", value, "eventId");
            return (Criteria) this;
        }

        public Criteria andEventIdIn(List<Integer> values) {
            addCriterion("event_id in", values, "eventId");
            return (Criteria) this;
        }

        public Criteria andEventIdNotIn(List<Integer> values) {
            addCriterion("event_id not in", values, "eventId");
            return (Criteria) this;
        }

        public Criteria andEventIdBetween(Integer value1, Integer value2) {
            addCriterion("event_id between", value1, value2, "eventId");
            return (Criteria) this;
        }

        public Criteria andEventIdNotBetween(Integer value1, Integer value2) {
            addCriterion("event_id not between", value1, value2, "eventId");
            return (Criteria) this;
        }

        public Criteria andEventDescribeIsNull() {
            addCriterion("event_describe is null");
            return (Criteria) this;
        }

        public Criteria andEventDescribeIsNotNull() {
            addCriterion("event_describe is not null");
            return (Criteria) this;
        }

        public Criteria andEventDescribeEqualTo(String value) {
            addCriterion("event_describe =", value, "eventDescribe");
            return (Criteria) this;
        }

        public Criteria andEventDescribeNotEqualTo(String value) {
            addCriterion("event_describe <>", value, "eventDescribe");
            return (Criteria) this;
        }

        public Criteria andEventDescribeGreaterThan(String value) {
            addCriterion("event_describe >", value, "eventDescribe");
            return (Criteria) this;
        }

        public Criteria andEventDescribeGreaterThanOrEqualTo(String value) {
            addCriterion("event_describe >=", value, "eventDescribe");
            return (Criteria) this;
        }

        public Criteria andEventDescribeLessThan(String value) {
            addCriterion("event_describe <", value, "eventDescribe");
            return (Criteria) this;
        }

        public Criteria andEventDescribeLessThanOrEqualTo(String value) {
            addCriterion("event_describe <=", value, "eventDescribe");
            return (Criteria) this;
        }

        public Criteria andEventDescribeLike(String value) {
            addCriterion("event_describe like", value, "eventDescribe");
            return (Criteria) this;
        }

        public Criteria andEventDescribeNotLike(String value) {
            addCriterion("event_describe not like", value, "eventDescribe");
            return (Criteria) this;
        }

        public Criteria andEventDescribeIn(List<String> values) {
            addCriterion("event_describe in", values, "eventDescribe");
            return (Criteria) this;
        }

        public Criteria andEventDescribeNotIn(List<String> values) {
            addCriterion("event_describe not in", values, "eventDescribe");
            return (Criteria) this;
        }

        public Criteria andEventDescribeBetween(String value1, String value2) {
            addCriterion("event_describe between", value1, value2, "eventDescribe");
            return (Criteria) this;
        }

        public Criteria andEventDescribeNotBetween(String value1, String value2) {
            addCriterion("event_describe not between", value1, value2, "eventDescribe");
            return (Criteria) this;
        }

        public Criteria andEventNumberIsNull() {
            addCriterion("event_number is null");
            return (Criteria) this;
        }

        public Criteria andEventNumberIsNotNull() {
            addCriterion("event_number is not null");
            return (Criteria) this;
        }

        public Criteria andEventNumberEqualTo(Integer value) {
            addCriterion("event_number =", value, "eventNumber");
            return (Criteria) this;
        }

        public Criteria andEventNumberNotEqualTo(Integer value) {
            addCriterion("event_number <>", value, "eventNumber");
            return (Criteria) this;
        }

        public Criteria andEventNumberGreaterThan(Integer value) {
            addCriterion("event_number >", value, "eventNumber");
            return (Criteria) this;
        }

        public Criteria andEventNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("event_number >=", value, "eventNumber");
            return (Criteria) this;
        }

        public Criteria andEventNumberLessThan(Integer value) {
            addCriterion("event_number <", value, "eventNumber");
            return (Criteria) this;
        }

        public Criteria andEventNumberLessThanOrEqualTo(Integer value) {
            addCriterion("event_number <=", value, "eventNumber");
            return (Criteria) this;
        }

        public Criteria andEventNumberIn(List<Integer> values) {
            addCriterion("event_number in", values, "eventNumber");
            return (Criteria) this;
        }

        public Criteria andEventNumberNotIn(List<Integer> values) {
            addCriterion("event_number not in", values, "eventNumber");
            return (Criteria) this;
        }

        public Criteria andEventNumberBetween(Integer value1, Integer value2) {
            addCriterion("event_number between", value1, value2, "eventNumber");
            return (Criteria) this;
        }

        public Criteria andEventNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("event_number not between", value1, value2, "eventNumber");
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