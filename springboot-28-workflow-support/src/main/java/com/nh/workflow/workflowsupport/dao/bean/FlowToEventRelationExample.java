package com.nh.workflow.workflowsupport.dao.bean;

import java.util.ArrayList;
import java.util.List;

public class FlowToEventRelationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FlowToEventRelationExample() {
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

        public Criteria andRealIdIsNull() {
            addCriterion("real_id is null");
            return (Criteria) this;
        }

        public Criteria andRealIdIsNotNull() {
            addCriterion("real_id is not null");
            return (Criteria) this;
        }

        public Criteria andRealIdEqualTo(Integer value) {
            addCriterion("real_id =", value, "realId");
            return (Criteria) this;
        }

        public Criteria andRealIdNotEqualTo(Integer value) {
            addCriterion("real_id <>", value, "realId");
            return (Criteria) this;
        }

        public Criteria andRealIdGreaterThan(Integer value) {
            addCriterion("real_id >", value, "realId");
            return (Criteria) this;
        }

        public Criteria andRealIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("real_id >=", value, "realId");
            return (Criteria) this;
        }

        public Criteria andRealIdLessThan(Integer value) {
            addCriterion("real_id <", value, "realId");
            return (Criteria) this;
        }

        public Criteria andRealIdLessThanOrEqualTo(Integer value) {
            addCriterion("real_id <=", value, "realId");
            return (Criteria) this;
        }

        public Criteria andRealIdIn(List<Integer> values) {
            addCriterion("real_id in", values, "realId");
            return (Criteria) this;
        }

        public Criteria andRealIdNotIn(List<Integer> values) {
            addCriterion("real_id not in", values, "realId");
            return (Criteria) this;
        }

        public Criteria andRealIdBetween(Integer value1, Integer value2) {
            addCriterion("real_id between", value1, value2, "realId");
            return (Criteria) this;
        }

        public Criteria andRealIdNotBetween(Integer value1, Integer value2) {
            addCriterion("real_id not between", value1, value2, "realId");
            return (Criteria) this;
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

        public Criteria andFlowStepIsNull() {
            addCriterion("flow_step is null");
            return (Criteria) this;
        }

        public Criteria andFlowStepIsNotNull() {
            addCriterion("flow_step is not null");
            return (Criteria) this;
        }

        public Criteria andFlowStepEqualTo(Integer value) {
            addCriterion("flow_step =", value, "flowStep");
            return (Criteria) this;
        }

        public Criteria andFlowStepNotEqualTo(Integer value) {
            addCriterion("flow_step <>", value, "flowStep");
            return (Criteria) this;
        }

        public Criteria andFlowStepGreaterThan(Integer value) {
            addCriterion("flow_step >", value, "flowStep");
            return (Criteria) this;
        }

        public Criteria andFlowStepGreaterThanOrEqualTo(Integer value) {
            addCriterion("flow_step >=", value, "flowStep");
            return (Criteria) this;
        }

        public Criteria andFlowStepLessThan(Integer value) {
            addCriterion("flow_step <", value, "flowStep");
            return (Criteria) this;
        }

        public Criteria andFlowStepLessThanOrEqualTo(Integer value) {
            addCriterion("flow_step <=", value, "flowStep");
            return (Criteria) this;
        }

        public Criteria andFlowStepIn(List<Integer> values) {
            addCriterion("flow_step in", values, "flowStep");
            return (Criteria) this;
        }

        public Criteria andFlowStepNotIn(List<Integer> values) {
            addCriterion("flow_step not in", values, "flowStep");
            return (Criteria) this;
        }

        public Criteria andFlowStepBetween(Integer value1, Integer value2) {
            addCriterion("flow_step between", value1, value2, "flowStep");
            return (Criteria) this;
        }

        public Criteria andFlowStepNotBetween(Integer value1, Integer value2) {
            addCriterion("flow_step not between", value1, value2, "flowStep");
            return (Criteria) this;
        }

        public Criteria andFlowStepEventIdIsNull() {
            addCriterion("flow_step_event_id is null");
            return (Criteria) this;
        }

        public Criteria andFlowStepEventIdIsNotNull() {
            addCriterion("flow_step_event_id is not null");
            return (Criteria) this;
        }

        public Criteria andFlowStepEventIdEqualTo(Integer value) {
            addCriterion("flow_step_event_id =", value, "flowStepEventId");
            return (Criteria) this;
        }

        public Criteria andFlowStepEventIdNotEqualTo(Integer value) {
            addCriterion("flow_step_event_id <>", value, "flowStepEventId");
            return (Criteria) this;
        }

        public Criteria andFlowStepEventIdGreaterThan(Integer value) {
            addCriterion("flow_step_event_id >", value, "flowStepEventId");
            return (Criteria) this;
        }

        public Criteria andFlowStepEventIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("flow_step_event_id >=", value, "flowStepEventId");
            return (Criteria) this;
        }

        public Criteria andFlowStepEventIdLessThan(Integer value) {
            addCriterion("flow_step_event_id <", value, "flowStepEventId");
            return (Criteria) this;
        }

        public Criteria andFlowStepEventIdLessThanOrEqualTo(Integer value) {
            addCriterion("flow_step_event_id <=", value, "flowStepEventId");
            return (Criteria) this;
        }

        public Criteria andFlowStepEventIdIn(List<Integer> values) {
            addCriterion("flow_step_event_id in", values, "flowStepEventId");
            return (Criteria) this;
        }

        public Criteria andFlowStepEventIdNotIn(List<Integer> values) {
            addCriterion("flow_step_event_id not in", values, "flowStepEventId");
            return (Criteria) this;
        }

        public Criteria andFlowStepEventIdBetween(Integer value1, Integer value2) {
            addCriterion("flow_step_event_id between", value1, value2, "flowStepEventId");
            return (Criteria) this;
        }

        public Criteria andFlowStepEventIdNotBetween(Integer value1, Integer value2) {
            addCriterion("flow_step_event_id not between", value1, value2, "flowStepEventId");
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