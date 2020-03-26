package com.nh.workflow.workflowsupport.dao.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TaskServiceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TaskServiceExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andTaskIdIsNull() {
            addCriterion("task_id is null");
            return (Criteria) this;
        }

        public Criteria andTaskIdIsNotNull() {
            addCriterion("task_id is not null");
            return (Criteria) this;
        }

        public Criteria andTaskIdEqualTo(Integer value) {
            addCriterion("task_id =", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotEqualTo(Integer value) {
            addCriterion("task_id <>", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdGreaterThan(Integer value) {
            addCriterion("task_id >", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("task_id >=", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdLessThan(Integer value) {
            addCriterion("task_id <", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdLessThanOrEqualTo(Integer value) {
            addCriterion("task_id <=", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdIn(List<Integer> values) {
            addCriterion("task_id in", values, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotIn(List<Integer> values) {
            addCriterion("task_id not in", values, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdBetween(Integer value1, Integer value2) {
            addCriterion("task_id between", value1, value2, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotBetween(Integer value1, Integer value2) {
            addCriterion("task_id not between", value1, value2, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskStepIsNull() {
            addCriterion("task_step is null");
            return (Criteria) this;
        }

        public Criteria andTaskStepIsNotNull() {
            addCriterion("task_step is not null");
            return (Criteria) this;
        }

        public Criteria andTaskStepEqualTo(Integer value) {
            addCriterion("task_step =", value, "taskStep");
            return (Criteria) this;
        }

        public Criteria andTaskStepNotEqualTo(Integer value) {
            addCriterion("task_step <>", value, "taskStep");
            return (Criteria) this;
        }

        public Criteria andTaskStepGreaterThan(Integer value) {
            addCriterion("task_step >", value, "taskStep");
            return (Criteria) this;
        }

        public Criteria andTaskStepGreaterThanOrEqualTo(Integer value) {
            addCriterion("task_step >=", value, "taskStep");
            return (Criteria) this;
        }

        public Criteria andTaskStepLessThan(Integer value) {
            addCriterion("task_step <", value, "taskStep");
            return (Criteria) this;
        }

        public Criteria andTaskStepLessThanOrEqualTo(Integer value) {
            addCriterion("task_step <=", value, "taskStep");
            return (Criteria) this;
        }

        public Criteria andTaskStepIn(List<Integer> values) {
            addCriterion("task_step in", values, "taskStep");
            return (Criteria) this;
        }

        public Criteria andTaskStepNotIn(List<Integer> values) {
            addCriterion("task_step not in", values, "taskStep");
            return (Criteria) this;
        }

        public Criteria andTaskStepBetween(Integer value1, Integer value2) {
            addCriterion("task_step between", value1, value2, "taskStep");
            return (Criteria) this;
        }

        public Criteria andTaskStepNotBetween(Integer value1, Integer value2) {
            addCriterion("task_step not between", value1, value2, "taskStep");
            return (Criteria) this;
        }

        public Criteria andTaskCreateTimeIsNull() {
            addCriterion("task_create_time is null");
            return (Criteria) this;
        }

        public Criteria andTaskCreateTimeIsNotNull() {
            addCriterion("task_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andTaskCreateTimeEqualTo(Date value) {
            addCriterionForJDBCDate("task_create_time =", value, "taskCreateTime");
            return (Criteria) this;
        }

        public Criteria andTaskCreateTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("task_create_time <>", value, "taskCreateTime");
            return (Criteria) this;
        }

        public Criteria andTaskCreateTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("task_create_time >", value, "taskCreateTime");
            return (Criteria) this;
        }

        public Criteria andTaskCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("task_create_time >=", value, "taskCreateTime");
            return (Criteria) this;
        }

        public Criteria andTaskCreateTimeLessThan(Date value) {
            addCriterionForJDBCDate("task_create_time <", value, "taskCreateTime");
            return (Criteria) this;
        }

        public Criteria andTaskCreateTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("task_create_time <=", value, "taskCreateTime");
            return (Criteria) this;
        }

        public Criteria andTaskCreateTimeIn(List<Date> values) {
            addCriterionForJDBCDate("task_create_time in", values, "taskCreateTime");
            return (Criteria) this;
        }

        public Criteria andTaskCreateTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("task_create_time not in", values, "taskCreateTime");
            return (Criteria) this;
        }

        public Criteria andTaskCreateTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("task_create_time between", value1, value2, "taskCreateTime");
            return (Criteria) this;
        }

        public Criteria andTaskCreateTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("task_create_time not between", value1, value2, "taskCreateTime");
            return (Criteria) this;
        }

        public Criteria andTaskUpdateTimeIsNull() {
            addCriterion("task_update_time is null");
            return (Criteria) this;
        }

        public Criteria andTaskUpdateTimeIsNotNull() {
            addCriterion("task_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andTaskUpdateTimeEqualTo(Date value) {
            addCriterionForJDBCDate("task_update_time =", value, "taskUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTaskUpdateTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("task_update_time <>", value, "taskUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTaskUpdateTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("task_update_time >", value, "taskUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTaskUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("task_update_time >=", value, "taskUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTaskUpdateTimeLessThan(Date value) {
            addCriterionForJDBCDate("task_update_time <", value, "taskUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTaskUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("task_update_time <=", value, "taskUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTaskUpdateTimeIn(List<Date> values) {
            addCriterionForJDBCDate("task_update_time in", values, "taskUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTaskUpdateTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("task_update_time not in", values, "taskUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTaskUpdateTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("task_update_time between", value1, value2, "taskUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTaskUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("task_update_time not between", value1, value2, "taskUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTaskFinishTimeIsNull() {
            addCriterion("task_finish_time is null");
            return (Criteria) this;
        }

        public Criteria andTaskFinishTimeIsNotNull() {
            addCriterion("task_finish_time is not null");
            return (Criteria) this;
        }

        public Criteria andTaskFinishTimeEqualTo(Date value) {
            addCriterionForJDBCDate("task_finish_time =", value, "taskFinishTime");
            return (Criteria) this;
        }

        public Criteria andTaskFinishTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("task_finish_time <>", value, "taskFinishTime");
            return (Criteria) this;
        }

        public Criteria andTaskFinishTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("task_finish_time >", value, "taskFinishTime");
            return (Criteria) this;
        }

        public Criteria andTaskFinishTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("task_finish_time >=", value, "taskFinishTime");
            return (Criteria) this;
        }

        public Criteria andTaskFinishTimeLessThan(Date value) {
            addCriterionForJDBCDate("task_finish_time <", value, "taskFinishTime");
            return (Criteria) this;
        }

        public Criteria andTaskFinishTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("task_finish_time <=", value, "taskFinishTime");
            return (Criteria) this;
        }

        public Criteria andTaskFinishTimeIn(List<Date> values) {
            addCriterionForJDBCDate("task_finish_time in", values, "taskFinishTime");
            return (Criteria) this;
        }

        public Criteria andTaskFinishTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("task_finish_time not in", values, "taskFinishTime");
            return (Criteria) this;
        }

        public Criteria andTaskFinishTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("task_finish_time between", value1, value2, "taskFinishTime");
            return (Criteria) this;
        }

        public Criteria andTaskFinishTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("task_finish_time not between", value1, value2, "taskFinishTime");
            return (Criteria) this;
        }

        public Criteria andTaskEventFlagIsNull() {
            addCriterion("task_event_flag is null");
            return (Criteria) this;
        }

        public Criteria andTaskEventFlagIsNotNull() {
            addCriterion("task_event_flag is not null");
            return (Criteria) this;
        }

        public Criteria andTaskEventFlagEqualTo(Integer value) {
            addCriterion("task_event_flag =", value, "taskEventFlag");
            return (Criteria) this;
        }

        public Criteria andTaskEventFlagNotEqualTo(Integer value) {
            addCriterion("task_event_flag <>", value, "taskEventFlag");
            return (Criteria) this;
        }

        public Criteria andTaskEventFlagGreaterThan(Integer value) {
            addCriterion("task_event_flag >", value, "taskEventFlag");
            return (Criteria) this;
        }

        public Criteria andTaskEventFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("task_event_flag >=", value, "taskEventFlag");
            return (Criteria) this;
        }

        public Criteria andTaskEventFlagLessThan(Integer value) {
            addCriterion("task_event_flag <", value, "taskEventFlag");
            return (Criteria) this;
        }

        public Criteria andTaskEventFlagLessThanOrEqualTo(Integer value) {
            addCriterion("task_event_flag <=", value, "taskEventFlag");
            return (Criteria) this;
        }

        public Criteria andTaskEventFlagIn(List<Integer> values) {
            addCriterion("task_event_flag in", values, "taskEventFlag");
            return (Criteria) this;
        }

        public Criteria andTaskEventFlagNotIn(List<Integer> values) {
            addCriterion("task_event_flag not in", values, "taskEventFlag");
            return (Criteria) this;
        }

        public Criteria andTaskEventFlagBetween(Integer value1, Integer value2) {
            addCriterion("task_event_flag between", value1, value2, "taskEventFlag");
            return (Criteria) this;
        }

        public Criteria andTaskEventFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("task_event_flag not between", value1, value2, "taskEventFlag");
            return (Criteria) this;
        }

        public Criteria andTaskOperateMarkIsNull() {
            addCriterion("task_operate_mark is null");
            return (Criteria) this;
        }

        public Criteria andTaskOperateMarkIsNotNull() {
            addCriterion("task_operate_mark is not null");
            return (Criteria) this;
        }

        public Criteria andTaskOperateMarkEqualTo(Integer value) {
            addCriterion("task_operate_mark =", value, "taskOperateMark");
            return (Criteria) this;
        }

        public Criteria andTaskOperateMarkNotEqualTo(Integer value) {
            addCriterion("task_operate_mark <>", value, "taskOperateMark");
            return (Criteria) this;
        }

        public Criteria andTaskOperateMarkGreaterThan(Integer value) {
            addCriterion("task_operate_mark >", value, "taskOperateMark");
            return (Criteria) this;
        }

        public Criteria andTaskOperateMarkGreaterThanOrEqualTo(Integer value) {
            addCriterion("task_operate_mark >=", value, "taskOperateMark");
            return (Criteria) this;
        }

        public Criteria andTaskOperateMarkLessThan(Integer value) {
            addCriterion("task_operate_mark <", value, "taskOperateMark");
            return (Criteria) this;
        }

        public Criteria andTaskOperateMarkLessThanOrEqualTo(Integer value) {
            addCriterion("task_operate_mark <=", value, "taskOperateMark");
            return (Criteria) this;
        }

        public Criteria andTaskOperateMarkIn(List<Integer> values) {
            addCriterion("task_operate_mark in", values, "taskOperateMark");
            return (Criteria) this;
        }

        public Criteria andTaskOperateMarkNotIn(List<Integer> values) {
            addCriterion("task_operate_mark not in", values, "taskOperateMark");
            return (Criteria) this;
        }

        public Criteria andTaskOperateMarkBetween(Integer value1, Integer value2) {
            addCriterion("task_operate_mark between", value1, value2, "taskOperateMark");
            return (Criteria) this;
        }

        public Criteria andTaskOperateMarkNotBetween(Integer value1, Integer value2) {
            addCriterion("task_operate_mark not between", value1, value2, "taskOperateMark");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
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