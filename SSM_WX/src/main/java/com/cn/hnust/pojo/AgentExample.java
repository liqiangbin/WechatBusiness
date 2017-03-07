package com.cn.hnust.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class AgentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AgentExample() {
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

        protected void addCriterionForJDBCTime(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Time(value.getTime()), property);
        }

        protected void addCriterionForJDBCTime(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Time> timeList = new ArrayList<java.sql.Time>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                timeList.add(new java.sql.Time(iter.next().getTime()));
            }
            addCriterion(condition, timeList, property);
        }

        protected void addCriterionForJDBCTime(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Time(value1.getTime()), new java.sql.Time(value2.getTime()), property);
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

        public Criteria andTelIsNull() {
            addCriterion("tel is null");
            return (Criteria) this;
        }

        public Criteria andTelIsNotNull() {
            addCriterion("tel is not null");
            return (Criteria) this;
        }

        public Criteria andTelEqualTo(String value) {
            addCriterion("tel =", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotEqualTo(String value) {
            addCriterion("tel <>", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThan(String value) {
            addCriterion("tel >", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThanOrEqualTo(String value) {
            addCriterion("tel >=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThan(String value) {
            addCriterion("tel <", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThanOrEqualTo(String value) {
            addCriterion("tel <=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLike(String value) {
            addCriterion("tel like", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotLike(String value) {
            addCriterion("tel not like", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelIn(List<String> values) {
            addCriterion("tel in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotIn(List<String> values) {
            addCriterion("tel not in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelBetween(String value1, String value2) {
            addCriterion("tel between", value1, value2, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotBetween(String value1, String value2) {
            addCriterion("tel not between", value1, value2, "tel");
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

        public Criteria andLeaderid1IsNull() {
            addCriterion("leaderID1 is null");
            return (Criteria) this;
        }

        public Criteria andLeaderid1IsNotNull() {
            addCriterion("leaderID1 is not null");
            return (Criteria) this;
        }

        public Criteria andLeaderid1EqualTo(Integer value) {
            addCriterion("leaderID1 =", value, "leaderid1");
            return (Criteria) this;
        }

        public Criteria andLeaderid1NotEqualTo(Integer value) {
            addCriterion("leaderID1 <>", value, "leaderid1");
            return (Criteria) this;
        }

        public Criteria andLeaderid1GreaterThan(Integer value) {
            addCriterion("leaderID1 >", value, "leaderid1");
            return (Criteria) this;
        }

        public Criteria andLeaderid1GreaterThanOrEqualTo(Integer value) {
            addCriterion("leaderID1 >=", value, "leaderid1");
            return (Criteria) this;
        }

        public Criteria andLeaderid1LessThan(Integer value) {
            addCriterion("leaderID1 <", value, "leaderid1");
            return (Criteria) this;
        }

        public Criteria andLeaderid1LessThanOrEqualTo(Integer value) {
            addCriterion("leaderID1 <=", value, "leaderid1");
            return (Criteria) this;
        }

        public Criteria andLeaderid1In(List<Integer> values) {
            addCriterion("leaderID1 in", values, "leaderid1");
            return (Criteria) this;
        }

        public Criteria andLeaderid1NotIn(List<Integer> values) {
            addCriterion("leaderID1 not in", values, "leaderid1");
            return (Criteria) this;
        }

        public Criteria andLeaderid1Between(Integer value1, Integer value2) {
            addCriterion("leaderID1 between", value1, value2, "leaderid1");
            return (Criteria) this;
        }

        public Criteria andLeaderid1NotBetween(Integer value1, Integer value2) {
            addCriterion("leaderID1 not between", value1, value2, "leaderid1");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type not between", value1, value2, "type");
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
            addCriterionForJDBCTime("createtime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterionForJDBCTime("createtime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterionForJDBCTime("createtime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("createtime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterionForJDBCTime("createtime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("createtime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterionForJDBCTime("createtime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterionForJDBCTime("createtime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("createtime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("createtime not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andLeaderid2IsNull() {
            addCriterion("leaderID2 is null");
            return (Criteria) this;
        }

        public Criteria andLeaderid2IsNotNull() {
            addCriterion("leaderID2 is not null");
            return (Criteria) this;
        }

        public Criteria andLeaderid2EqualTo(Integer value) {
            addCriterion("leaderID2 =", value, "leaderid2");
            return (Criteria) this;
        }

        public Criteria andLeaderid2NotEqualTo(Integer value) {
            addCriterion("leaderID2 <>", value, "leaderid2");
            return (Criteria) this;
        }

        public Criteria andLeaderid2GreaterThan(Integer value) {
            addCriterion("leaderID2 >", value, "leaderid2");
            return (Criteria) this;
        }

        public Criteria andLeaderid2GreaterThanOrEqualTo(Integer value) {
            addCriterion("leaderID2 >=", value, "leaderid2");
            return (Criteria) this;
        }

        public Criteria andLeaderid2LessThan(Integer value) {
            addCriterion("leaderID2 <", value, "leaderid2");
            return (Criteria) this;
        }

        public Criteria andLeaderid2LessThanOrEqualTo(Integer value) {
            addCriterion("leaderID2 <=", value, "leaderid2");
            return (Criteria) this;
        }

        public Criteria andLeaderid2In(List<Integer> values) {
            addCriterion("leaderID2 in", values, "leaderid2");
            return (Criteria) this;
        }

        public Criteria andLeaderid2NotIn(List<Integer> values) {
            addCriterion("leaderID2 not in", values, "leaderid2");
            return (Criteria) this;
        }

        public Criteria andLeaderid2Between(Integer value1, Integer value2) {
            addCriterion("leaderID2 between", value1, value2, "leaderid2");
            return (Criteria) this;
        }

        public Criteria andLeaderid2NotBetween(Integer value1, Integer value2) {
            addCriterion("leaderID2 not between", value1, value2, "leaderid2");
            return (Criteria) this;
        }

        public Criteria andLevelIsNull() {
            addCriterion("level is null");
            return (Criteria) this;
        }

        public Criteria andLevelIsNotNull() {
            addCriterion("level is not null");
            return (Criteria) this;
        }

        public Criteria andLevelEqualTo(Integer value) {
            addCriterion("level =", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotEqualTo(Integer value) {
            addCriterion("level <>", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThan(Integer value) {
            addCriterion("level >", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("level >=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThan(Integer value) {
            addCriterion("level <", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThanOrEqualTo(Integer value) {
            addCriterion("level <=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelIn(List<Integer> values) {
            addCriterion("level in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotIn(List<Integer> values) {
            addCriterion("level not in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelBetween(Integer value1, Integer value2) {
            addCriterion("level between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("level not between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andCountSubAgentsIsNull() {
            addCriterion("count_sub_agents is null");
            return (Criteria) this;
        }

        public Criteria andCountSubAgentsIsNotNull() {
            addCriterion("count_sub_agents is not null");
            return (Criteria) this;
        }

        public Criteria andCountSubAgentsEqualTo(Integer value) {
            addCriterion("count_sub_agents =", value, "countSubAgents");
            return (Criteria) this;
        }

        public Criteria andCountSubAgentsNotEqualTo(Integer value) {
            addCriterion("count_sub_agents <>", value, "countSubAgents");
            return (Criteria) this;
        }

        public Criteria andCountSubAgentsGreaterThan(Integer value) {
            addCriterion("count_sub_agents >", value, "countSubAgents");
            return (Criteria) this;
        }

        public Criteria andCountSubAgentsGreaterThanOrEqualTo(Integer value) {
            addCriterion("count_sub_agents >=", value, "countSubAgents");
            return (Criteria) this;
        }

        public Criteria andCountSubAgentsLessThan(Integer value) {
            addCriterion("count_sub_agents <", value, "countSubAgents");
            return (Criteria) this;
        }

        public Criteria andCountSubAgentsLessThanOrEqualTo(Integer value) {
            addCriterion("count_sub_agents <=", value, "countSubAgents");
            return (Criteria) this;
        }

        public Criteria andCountSubAgentsIn(List<Integer> values) {
            addCriterion("count_sub_agents in", values, "countSubAgents");
            return (Criteria) this;
        }

        public Criteria andCountSubAgentsNotIn(List<Integer> values) {
            addCriterion("count_sub_agents not in", values, "countSubAgents");
            return (Criteria) this;
        }

        public Criteria andCountSubAgentsBetween(Integer value1, Integer value2) {
            addCriterion("count_sub_agents between", value1, value2, "countSubAgents");
            return (Criteria) this;
        }

        public Criteria andCountSubAgentsNotBetween(Integer value1, Integer value2) {
            addCriterion("count_sub_agents not between", value1, value2, "countSubAgents");
            return (Criteria) this;
        }

        public Criteria andCountUserIsNull() {
            addCriterion("count_user is null");
            return (Criteria) this;
        }

        public Criteria andCountUserIsNotNull() {
            addCriterion("count_user is not null");
            return (Criteria) this;
        }

        public Criteria andCountUserEqualTo(Integer value) {
            addCriterion("count_user =", value, "countUser");
            return (Criteria) this;
        }

        public Criteria andCountUserNotEqualTo(Integer value) {
            addCriterion("count_user <>", value, "countUser");
            return (Criteria) this;
        }

        public Criteria andCountUserGreaterThan(Integer value) {
            addCriterion("count_user >", value, "countUser");
            return (Criteria) this;
        }

        public Criteria andCountUserGreaterThanOrEqualTo(Integer value) {
            addCriterion("count_user >=", value, "countUser");
            return (Criteria) this;
        }

        public Criteria andCountUserLessThan(Integer value) {
            addCriterion("count_user <", value, "countUser");
            return (Criteria) this;
        }

        public Criteria andCountUserLessThanOrEqualTo(Integer value) {
            addCriterion("count_user <=", value, "countUser");
            return (Criteria) this;
        }

        public Criteria andCountUserIn(List<Integer> values) {
            addCriterion("count_user in", values, "countUser");
            return (Criteria) this;
        }

        public Criteria andCountUserNotIn(List<Integer> values) {
            addCriterion("count_user not in", values, "countUser");
            return (Criteria) this;
        }

        public Criteria andCountUserBetween(Integer value1, Integer value2) {
            addCriterion("count_user between", value1, value2, "countUser");
            return (Criteria) this;
        }

        public Criteria andCountUserNotBetween(Integer value1, Integer value2) {
            addCriterion("count_user not between", value1, value2, "countUser");
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