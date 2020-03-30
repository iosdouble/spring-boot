package com.nh.workflow.workflowsupport.dao.bean;

import java.util.ArrayList;
import java.util.List;

public class FlowServiceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FlowServiceExample() {
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

        public Criteria andFlowIdIsNull() {
            addCriterion("flow_id is null");
            return (Criteria) this;
        }

        public Criteria andFlowIdIsNotNull() {
            addCriterion("flow_id is not null");
            return (Criteria) this;
        }

        public Criteria andFlowIdEqualTo(Integer value) {
            addCriterion("flow_id =", value, "flowId");
            return (Criteria) this;
        }

        public Criteria andFlowIdNotEqualTo(Integer value) {
            addCriterion("flow_id <>", value, "flowId");
            return (Criteria) this;
        }

        public Criteria andFlowIdGreaterThan(Integer value) {
            addCriterion("flow_id >", value, "flowId");
            return (Criteria) this;
        }

        public Criteria andFlowIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("flow_id >=", value, "flowId");
            return (Criteria) this;
        }

        public Criteria andFlowIdLessThan(Integer value) {
            addCriterion("flow_id <", value, "flowId");
            return (Criteria) this;
        }

        public Criteria andFlowIdLessThanOrEqualTo(Integer value) {
            addCriterion("flow_id <=", value, "flowId");
            return (Criteria) this;
        }

        public Criteria andFlowIdIn(List<Integer> values) {
            addCriterion("flow_id in", values, "flowId");
            return (Criteria) this;
        }

        public Criteria andFlowIdNotIn(List<Integer> values) {
            addCriterion("flow_id not in", values, "flowId");
            return (Criteria) this;
        }

        public Criteria andFlowIdBetween(Integer value1, Integer value2) {
            addCriterion("flow_id between", value1, value2, "flowId");
            return (Criteria) this;
        }

        public Criteria andFlowIdNotBetween(Integer value1, Integer value2) {
            addCriterion("flow_id not between", value1, value2, "flowId");
            return (Criteria) this;
        }

        public Criteria andFlowAllEventNumberIsNull() {
            addCriterion("flow_all_event_number is null");
            return (Criteria) this;
        }

        public Criteria andFlowAllEventNumberIsNotNull() {
            addCriterion("flow_all_event_number is not null");
            return (Criteria) this;
        }

        public Criteria andFlowAllEventNumberEqualTo(Integer value) {
            addCriterion("flow_all_event_number =", value, "flowAllEventNumber");
            return (Criteria) this;
        }

        public Criteria andFlowAllEventNumberNotEqualTo(Integer value) {
            addCriterion("flow_all_event_number <>", value, "flowAllEventNumber");
            return (Criteria) this;
        }

        public Criteria andFlowAllEventNumberGreaterThan(Integer value) {
            addCriterion("flow_all_event_number >", value, "flowAllEventNumber");
            return (Criteria) this;
        }

        public Criteria andFlowAllEventNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("flow_all_event_number >=", value, "flowAllEventNumber");
            return (Criteria) this;
        }

        public Criteria andFlowAllEventNumberLessThan(Integer value) {
            addCriterion("flow_all_event_number <", value, "flowAllEventNumber");
            return (Criteria) this;
        }

        public Criteria andFlowAllEventNumberLessThanOrEqualTo(Integer value) {
            addCriterion("flow_all_event_number <=", value, "flowAllEventNumber");
            return (Criteria) this;
        }

        public Criteria andFlowAllEventNumberIn(List<Integer> values) {
            addCriterion("flow_all_event_number in", values, "flowAllEventNumber");
            return (Criteria) this;
        }

        public Criteria andFlowAllEventNumberNotIn(List<Integer> values) {
            addCriterion("flow_all_event_number not in", values, "flowAllEventNumber");
            return (Criteria) this;
        }

        public Criteria andFlowAllEventNumberBetween(Integer value1, Integer value2) {
            addCriterion("flow_all_event_number between", value1, value2, "flowAllEventNumber");
            return (Criteria) this;
        }

        public Criteria andFlowAllEventNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("flow_all_event_number not between", value1, value2, "flowAllEventNumber");
            return (Criteria) this;
        }

        public Criteria andFlowDescribeIsNull() {
            addCriterion("flow_describe is null");
            return (Criteria) this;
        }

        public Criteria andFlowDescribeIsNotNull() {
            addCriterion("flow_describe is not null");
            return (Criteria) this;
        }

        public Criteria andFlowDescribeEqualTo(String value) {
            addCriterion("flow_describe =", value, "flowDescribe");
            return (Criteria) this;
        }

        public Criteria andFlowDescribeNotEqualTo(String value) {
            addCriterion("flow_describe <>", value, "flowDescribe");
            return (Criteria) this;
        }

        public Criteria andFlowDescribeGreaterThan(String value) {
            addCriterion("flow_describe >", value, "flowDescribe");
            return (Criteria) this;
        }

        public Criteria andFlowDescribeGreaterThanOrEqualTo(String value) {
            addCriterion("flow_describe >=", value, "flowDescribe");
            return (Criteria) this;
        }

        public Criteria andFlowDescribeLessThan(String value) {
            addCriterion("flow_describe <", value, "flowDescribe");
            return (Criteria) this;
        }

        public Criteria andFlowDescribeLessThanOrEqualTo(String value) {
            addCriterion("flow_describe <=", value, "flowDescribe");
            return (Criteria) this;
        }

        public Criteria andFlowDescribeLike(String value) {
            addCriterion("flow_describe like", value, "flowDescribe");
            return (Criteria) this;
        }

        public Criteria andFlowDescribeNotLike(String value) {
            addCriterion("flow_describe not like", value, "flowDescribe");
            return (Criteria) this;
        }

        public Criteria andFlowDescribeIn(List<String> values) {
            addCriterion("flow_describe in", values, "flowDescribe");
            return (Criteria) this;
        }

        public Criteria andFlowDescribeNotIn(List<String> values) {
            addCriterion("flow_describe not in", values, "flowDescribe");
            return (Criteria) this;
        }

        public Criteria andFlowDescribeBetween(String value1, String value2) {
            addCriterion("flow_describe between", value1, value2, "flowDescribe");
            return (Criteria) this;
        }

        public Criteria andFlowDescribeNotBetween(String value1, String value2) {
            addCriterion("flow_describe not between", value1, value2, "flowDescribe");
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