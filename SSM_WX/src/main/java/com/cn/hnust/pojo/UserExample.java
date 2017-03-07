package com.cn.hnust.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andWeixinIsNull() {
            addCriterion("weixin is null");
            return (Criteria) this;
        }

        public Criteria andWeixinIsNotNull() {
            addCriterion("weixin is not null");
            return (Criteria) this;
        }

        public Criteria andWeixinEqualTo(String value) {
            addCriterion("weixin =", value, "weixin");
            return (Criteria) this;
        }
        
        public Criteria andAgentWeixinEqualTo(String value) {
            addCriterion("agentweixin =", value, "agentweixin");
            return (Criteria) this;
        }

        public Criteria andWeixinNotEqualTo(String value) {
            addCriterion("weixin <>", value, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinGreaterThan(String value) {
            addCriterion("weixin >", value, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinGreaterThanOrEqualTo(String value) {
            addCriterion("weixin >=", value, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinLessThan(String value) {
            addCriterion("weixin <", value, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinLessThanOrEqualTo(String value) {
            addCriterion("weixin <=", value, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinLike(String value) {
            addCriterion("weixin like", value, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinNotLike(String value) {
            addCriterion("weixin not like", value, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinIn(List<String> values) {
            addCriterion("weixin in", values, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinNotIn(List<String> values) {
            addCriterion("weixin not in", values, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinBetween(String value1, String value2) {
            addCriterion("weixin between", value1, value2, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinNotBetween(String value1, String value2) {
            addCriterion("weixin not between", value1, value2, "weixin");
            return (Criteria) this;
        }

        public Criteria andRefereeWeixinIsNull() {
            addCriterion("referee_weixin is null");
            return (Criteria) this;
        }

        public Criteria andRefereeWeixinIsNotNull() {
            addCriterion("referee_weixin is not null");
            return (Criteria) this;
        }

        public Criteria andRefereeWeixinEqualTo(String value) {
            addCriterion("referee_weixin =", value, "refereeWeixin");
            return (Criteria) this;
        }

        public Criteria andRefereeWeixinNotEqualTo(String value) {
            addCriterion("referee_weixin <>", value, "refereeWeixin");
            return (Criteria) this;
        }

        public Criteria andRefereeWeixinGreaterThan(String value) {
            addCriterion("referee_weixin >", value, "refereeWeixin");
            return (Criteria) this;
        }

        public Criteria andRefereeWeixinGreaterThanOrEqualTo(String value) {
            addCriterion("referee_weixin >=", value, "refereeWeixin");
            return (Criteria) this;
        }

        public Criteria andRefereeWeixinLessThan(String value) {
            addCriterion("referee_weixin <", value, "refereeWeixin");
            return (Criteria) this;
        }

        public Criteria andRefereeWeixinLessThanOrEqualTo(String value) {
            addCriterion("referee_weixin <=", value, "refereeWeixin");
            return (Criteria) this;
        }

        public Criteria andRefereeWeixinLike(String value) {
            addCriterion("referee_weixin like", value, "refereeWeixin");
            return (Criteria) this;
        }

        public Criteria andRefereeWeixinNotLike(String value) {
            addCriterion("referee_weixin not like", value, "refereeWeixin");
            return (Criteria) this;
        }

        public Criteria andRefereeWeixinIn(List<String> values) {
            addCriterion("referee_weixin in", values, "refereeWeixin");
            return (Criteria) this;
        }

        public Criteria andRefereeWeixinNotIn(List<String> values) {
            addCriterion("referee_weixin not in", values, "refereeWeixin");
            return (Criteria) this;
        }

        public Criteria andRefereeWeixinBetween(String value1, String value2) {
            addCriterion("referee_weixin between", value1, value2, "refereeWeixin");
            return (Criteria) this;
        }

        public Criteria andRefereeWeixinNotBetween(String value1, String value2) {
            addCriterion("referee_weixin not between", value1, value2, "refereeWeixin");
            return (Criteria) this;
        }

        public Criteria andTelIsNull() {
            addCriterion("tel is null");
            return (Criteria) this;
        }

        public Criteria andTelIsNotNull() {
            addCriterion("tel is not null");
            return (Criteria) this;
        }

        public Criteria andTelEqualTo(Integer value) {
            addCriterion("tel =", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotEqualTo(Integer value) {
            addCriterion("tel <>", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThan(Integer value) {
            addCriterion("tel >", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThanOrEqualTo(Integer value) {
            addCriterion("tel >=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThan(Integer value) {
            addCriterion("tel <", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThanOrEqualTo(Integer value) {
            addCriterion("tel <=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelIn(List<Integer> values) {
            addCriterion("tel in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotIn(List<Integer> values) {
            addCriterion("tel not in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelBetween(Integer value1, Integer value2) {
            addCriterion("tel between", value1, value2, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotBetween(Integer value1, Integer value2) {
            addCriterion("tel not between", value1, value2, "tel");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createtime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createtime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("createtime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("createtime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("createtime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createtime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("createtime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("createtime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("createtime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("createtime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("createtime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("createtime not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andRefereeweixinIsNull() {
            addCriterion("refereeweixin is null");
            return (Criteria) this;
        }

        public Criteria andRefereeweixinIsNotNull() {
            addCriterion("refereeweixin is not null");
            return (Criteria) this;
        }

        public Criteria andRefereeweixinEqualTo(Integer value) {
            addCriterion("refereeweixin =", value, "refereeweixin");
            return (Criteria) this;
        }

        public Criteria andRefereeweixinNotEqualTo(Integer value) {
            addCriterion("refereeweixin <>", value, "refereeweixin");
            return (Criteria) this;
        }

        public Criteria andRefereeweixinGreaterThan(Integer value) {
            addCriterion("refereeweixin >", value, "refereeweixin");
            return (Criteria) this;
        }

        public Criteria andRefereeweixinGreaterThanOrEqualTo(Integer value) {
            addCriterion("refereeweixin >=", value, "refereeweixin");
            return (Criteria) this;
        }

        public Criteria andRefereeweixinLessThan(Integer value) {
            addCriterion("refereeweixin <", value, "refereeweixin");
            return (Criteria) this;
        }

        public Criteria andRefereeweixinLessThanOrEqualTo(Integer value) {
            addCriterion("refereeweixin <=", value, "refereeweixin");
            return (Criteria) this;
        }

        public Criteria andRefereeweixinIn(List<Integer> values) {
            addCriterion("refereeweixin in", values, "refereeweixin");
            return (Criteria) this;
        }

        public Criteria andRefereeweixinNotIn(List<Integer> values) {
            addCriterion("refereeweixin not in", values, "refereeweixin");
            return (Criteria) this;
        }

        public Criteria andRefereeweixinBetween(Integer value1, Integer value2) {
            addCriterion("refereeweixin between", value1, value2, "refereeweixin");
            return (Criteria) this;
        }

        public Criteria andRefereeweixinNotBetween(Integer value1, Integer value2) {
            addCriterion("refereeweixin not between", value1, value2, "refereeweixin");
            return (Criteria) this;
        }

        public Criteria andLeaderidIsNull() {
            addCriterion("leaderID is null");
            return (Criteria) this;
        }

        public Criteria andLeaderidIsNotNull() {
            addCriterion("leaderID is not null");
            return (Criteria) this;
        }

        public Criteria andLeaderidEqualTo(Integer value) {
            addCriterion("leaderID =", value, "leaderid");
            return (Criteria) this;
        }

        public Criteria andLeaderidNotEqualTo(Integer value) {
            addCriterion("leaderID <>", value, "leaderid");
            return (Criteria) this;
        }

        public Criteria andLeaderidGreaterThan(Integer value) {
            addCriterion("leaderID >", value, "leaderid");
            return (Criteria) this;
        }

        public Criteria andLeaderidGreaterThanOrEqualTo(Integer value) {
            addCriterion("leaderID >=", value, "leaderid");
            return (Criteria) this;
        }

        public Criteria andLeaderidLessThan(Integer value) {
            addCriterion("leaderID <", value, "leaderid");
            return (Criteria) this;
        }

        public Criteria andLeaderidLessThanOrEqualTo(Integer value) {
            addCriterion("leaderID <=", value, "leaderid");
            return (Criteria) this;
        }

        public Criteria andLeaderidIn(List<Integer> values) {
            addCriterion("leaderID in", values, "leaderid");
            return (Criteria) this;
        }

        public Criteria andLeaderidNotIn(List<Integer> values) {
            addCriterion("leaderID not in", values, "leaderid");
            return (Criteria) this;
        }

        public Criteria andLeaderidBetween(Integer value1, Integer value2) {
            addCriterion("leaderID between", value1, value2, "leaderid");
            return (Criteria) this;
        }

        public Criteria andLeaderidNotBetween(Integer value1, Integer value2) {
            addCriterion("leaderID not between", value1, value2, "leaderid");
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