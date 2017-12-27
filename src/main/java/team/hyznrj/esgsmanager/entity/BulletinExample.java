package team.hyznrj.esgsmanager.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BulletinExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BulletinExample() {
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

        public Criteria andBulletinidIsNull() {
            addCriterion("bulletinId is null");
            return (Criteria) this;
        }

        public Criteria andBulletinidIsNotNull() {
            addCriterion("bulletinId is not null");
            return (Criteria) this;
        }

        public Criteria andBulletinidEqualTo(Long value) {
            addCriterion("bulletinId =", value, "bulletinid");
            return (Criteria) this;
        }

        public Criteria andBulletinidNotEqualTo(Long value) {
            addCriterion("bulletinId <>", value, "bulletinid");
            return (Criteria) this;
        }

        public Criteria andBulletinidGreaterThan(Long value) {
            addCriterion("bulletinId >", value, "bulletinid");
            return (Criteria) this;
        }

        public Criteria andBulletinidGreaterThanOrEqualTo(Long value) {
            addCriterion("bulletinId >=", value, "bulletinid");
            return (Criteria) this;
        }

        public Criteria andBulletinidLessThan(Long value) {
            addCriterion("bulletinId <", value, "bulletinid");
            return (Criteria) this;
        }

        public Criteria andBulletinidLessThanOrEqualTo(Long value) {
            addCriterion("bulletinId <=", value, "bulletinid");
            return (Criteria) this;
        }

        public Criteria andBulletinidIn(List<Long> values) {
            addCriterion("bulletinId in", values, "bulletinid");
            return (Criteria) this;
        }

        public Criteria andBulletinidNotIn(List<Long> values) {
            addCriterion("bulletinId not in", values, "bulletinid");
            return (Criteria) this;
        }

        public Criteria andBulletinidBetween(Long value1, Long value2) {
            addCriterion("bulletinId between", value1, value2, "bulletinid");
            return (Criteria) this;
        }

        public Criteria andBulletinidNotBetween(Long value1, Long value2) {
            addCriterion("bulletinId not between", value1, value2, "bulletinid");
            return (Criteria) this;
        }

        public Criteria andBulletintypeIsNull() {
            addCriterion("bulletinType is null");
            return (Criteria) this;
        }

        public Criteria andBulletintypeIsNotNull() {
            addCriterion("bulletinType is not null");
            return (Criteria) this;
        }

        public Criteria andBulletintypeEqualTo(String value) {
            addCriterion("bulletinType =", value, "bulletintype");
            return (Criteria) this;
        }

        public Criteria andBulletintypeNotEqualTo(String value) {
            addCriterion("bulletinType <>", value, "bulletintype");
            return (Criteria) this;
        }

        public Criteria andBulletintypeGreaterThan(String value) {
            addCriterion("bulletinType >", value, "bulletintype");
            return (Criteria) this;
        }

        public Criteria andBulletintypeGreaterThanOrEqualTo(String value) {
            addCriterion("bulletinType >=", value, "bulletintype");
            return (Criteria) this;
        }

        public Criteria andBulletintypeLessThan(String value) {
            addCriterion("bulletinType <", value, "bulletintype");
            return (Criteria) this;
        }

        public Criteria andBulletintypeLessThanOrEqualTo(String value) {
            addCriterion("bulletinType <=", value, "bulletintype");
            return (Criteria) this;
        }

        public Criteria andBulletintypeLike(String value) {
            addCriterion("bulletinType like", value, "bulletintype");
            return (Criteria) this;
        }

        public Criteria andBulletintypeNotLike(String value) {
            addCriterion("bulletinType not like", value, "bulletintype");
            return (Criteria) this;
        }

        public Criteria andBulletintypeIn(List<String> values) {
            addCriterion("bulletinType in", values, "bulletintype");
            return (Criteria) this;
        }

        public Criteria andBulletintypeNotIn(List<String> values) {
            addCriterion("bulletinType not in", values, "bulletintype");
            return (Criteria) this;
        }

        public Criteria andBulletintypeBetween(String value1, String value2) {
            addCriterion("bulletinType between", value1, value2, "bulletintype");
            return (Criteria) this;
        }

        public Criteria andBulletintypeNotBetween(String value1, String value2) {
            addCriterion("bulletinType not between", value1, value2, "bulletintype");
            return (Criteria) this;
        }

        public Criteria andBulletintypepathIsNull() {
            addCriterion("bulletinTypePath is null");
            return (Criteria) this;
        }

        public Criteria andBulletintypepathIsNotNull() {
            addCriterion("bulletinTypePath is not null");
            return (Criteria) this;
        }

        public Criteria andBulletintypepathEqualTo(String value) {
            addCriterion("bulletinTypePath =", value, "bulletintypepath");
            return (Criteria) this;
        }

        public Criteria andBulletintypepathNotEqualTo(String value) {
            addCriterion("bulletinTypePath <>", value, "bulletintypepath");
            return (Criteria) this;
        }

        public Criteria andBulletintypepathGreaterThan(String value) {
            addCriterion("bulletinTypePath >", value, "bulletintypepath");
            return (Criteria) this;
        }

        public Criteria andBulletintypepathGreaterThanOrEqualTo(String value) {
            addCriterion("bulletinTypePath >=", value, "bulletintypepath");
            return (Criteria) this;
        }

        public Criteria andBulletintypepathLessThan(String value) {
            addCriterion("bulletinTypePath <", value, "bulletintypepath");
            return (Criteria) this;
        }

        public Criteria andBulletintypepathLessThanOrEqualTo(String value) {
            addCriterion("bulletinTypePath <=", value, "bulletintypepath");
            return (Criteria) this;
        }

        public Criteria andBulletintypepathLike(String value) {
            addCriterion("bulletinTypePath like", value, "bulletintypepath");
            return (Criteria) this;
        }

        public Criteria andBulletintypepathNotLike(String value) {
            addCriterion("bulletinTypePath not like", value, "bulletintypepath");
            return (Criteria) this;
        }

        public Criteria andBulletintypepathIn(List<String> values) {
            addCriterion("bulletinTypePath in", values, "bulletintypepath");
            return (Criteria) this;
        }

        public Criteria andBulletintypepathNotIn(List<String> values) {
            addCriterion("bulletinTypePath not in", values, "bulletintypepath");
            return (Criteria) this;
        }

        public Criteria andBulletintypepathBetween(String value1, String value2) {
            addCriterion("bulletinTypePath between", value1, value2, "bulletintypepath");
            return (Criteria) this;
        }

        public Criteria andBulletintypepathNotBetween(String value1, String value2) {
            addCriterion("bulletinTypePath not between", value1, value2, "bulletintypepath");
            return (Criteria) this;
        }

        public Criteria andAdminnameIsNull() {
            addCriterion("adminName is null");
            return (Criteria) this;
        }

        public Criteria andAdminnameIsNotNull() {
            addCriterion("adminName is not null");
            return (Criteria) this;
        }

        public Criteria andAdminnameEqualTo(String value) {
            addCriterion("adminName =", value, "adminname");
            return (Criteria) this;
        }

        public Criteria andAdminnameNotEqualTo(String value) {
            addCriterion("adminName <>", value, "adminname");
            return (Criteria) this;
        }

        public Criteria andAdminnameGreaterThan(String value) {
            addCriterion("adminName >", value, "adminname");
            return (Criteria) this;
        }

        public Criteria andAdminnameGreaterThanOrEqualTo(String value) {
            addCriterion("adminName >=", value, "adminname");
            return (Criteria) this;
        }

        public Criteria andAdminnameLessThan(String value) {
            addCriterion("adminName <", value, "adminname");
            return (Criteria) this;
        }

        public Criteria andAdminnameLessThanOrEqualTo(String value) {
            addCriterion("adminName <=", value, "adminname");
            return (Criteria) this;
        }

        public Criteria andAdminnameLike(String value) {
            addCriterion("adminName like", value, "adminname");
            return (Criteria) this;
        }

        public Criteria andAdminnameNotLike(String value) {
            addCriterion("adminName not like", value, "adminname");
            return (Criteria) this;
        }

        public Criteria andAdminnameIn(List<String> values) {
            addCriterion("adminName in", values, "adminname");
            return (Criteria) this;
        }

        public Criteria andAdminnameNotIn(List<String> values) {
            addCriterion("adminName not in", values, "adminname");
            return (Criteria) this;
        }

        public Criteria andAdminnameBetween(String value1, String value2) {
            addCriterion("adminName between", value1, value2, "adminname");
            return (Criteria) this;
        }

        public Criteria andAdminnameNotBetween(String value1, String value2) {
            addCriterion("adminName not between", value1, value2, "adminname");
            return (Criteria) this;
        }

        public Criteria andBulletincreatetimeIsNull() {
            addCriterion("bulletinCreateTime is null");
            return (Criteria) this;
        }

        public Criteria andBulletincreatetimeIsNotNull() {
            addCriterion("bulletinCreateTime is not null");
            return (Criteria) this;
        }

        public Criteria andBulletincreatetimeEqualTo(Date value) {
            addCriterion("bulletinCreateTime =", value, "bulletincreatetime");
            return (Criteria) this;
        }

        public Criteria andBulletincreatetimeNotEqualTo(Date value) {
            addCriterion("bulletinCreateTime <>", value, "bulletincreatetime");
            return (Criteria) this;
        }

        public Criteria andBulletincreatetimeGreaterThan(Date value) {
            addCriterion("bulletinCreateTime >", value, "bulletincreatetime");
            return (Criteria) this;
        }

        public Criteria andBulletincreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("bulletinCreateTime >=", value, "bulletincreatetime");
            return (Criteria) this;
        }

        public Criteria andBulletincreatetimeLessThan(Date value) {
            addCriterion("bulletinCreateTime <", value, "bulletincreatetime");
            return (Criteria) this;
        }

        public Criteria andBulletincreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("bulletinCreateTime <=", value, "bulletincreatetime");
            return (Criteria) this;
        }

        public Criteria andBulletincreatetimeIn(List<Date> values) {
            addCriterion("bulletinCreateTime in", values, "bulletincreatetime");
            return (Criteria) this;
        }

        public Criteria andBulletincreatetimeNotIn(List<Date> values) {
            addCriterion("bulletinCreateTime not in", values, "bulletincreatetime");
            return (Criteria) this;
        }

        public Criteria andBulletincreatetimeBetween(Date value1, Date value2) {
            addCriterion("bulletinCreateTime between", value1, value2, "bulletincreatetime");
            return (Criteria) this;
        }

        public Criteria andBulletincreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("bulletinCreateTime not between", value1, value2, "bulletincreatetime");
            return (Criteria) this;
        }

        public Criteria andBulletinedittimeIsNull() {
            addCriterion("bulletinEditTime is null");
            return (Criteria) this;
        }

        public Criteria andBulletinedittimeIsNotNull() {
            addCriterion("bulletinEditTime is not null");
            return (Criteria) this;
        }

        public Criteria andBulletinedittimeEqualTo(Date value) {
            addCriterion("bulletinEditTime =", value, "bulletinedittime");
            return (Criteria) this;
        }

        public Criteria andBulletinedittimeNotEqualTo(Date value) {
            addCriterion("bulletinEditTime <>", value, "bulletinedittime");
            return (Criteria) this;
        }

        public Criteria andBulletinedittimeGreaterThan(Date value) {
            addCriterion("bulletinEditTime >", value, "bulletinedittime");
            return (Criteria) this;
        }

        public Criteria andBulletinedittimeGreaterThanOrEqualTo(Date value) {
            addCriterion("bulletinEditTime >=", value, "bulletinedittime");
            return (Criteria) this;
        }

        public Criteria andBulletinedittimeLessThan(Date value) {
            addCriterion("bulletinEditTime <", value, "bulletinedittime");
            return (Criteria) this;
        }

        public Criteria andBulletinedittimeLessThanOrEqualTo(Date value) {
            addCriterion("bulletinEditTime <=", value, "bulletinedittime");
            return (Criteria) this;
        }

        public Criteria andBulletinedittimeIn(List<Date> values) {
            addCriterion("bulletinEditTime in", values, "bulletinedittime");
            return (Criteria) this;
        }

        public Criteria andBulletinedittimeNotIn(List<Date> values) {
            addCriterion("bulletinEditTime not in", values, "bulletinedittime");
            return (Criteria) this;
        }

        public Criteria andBulletinedittimeBetween(Date value1, Date value2) {
            addCriterion("bulletinEditTime between", value1, value2, "bulletinedittime");
            return (Criteria) this;
        }

        public Criteria andBulletinedittimeNotBetween(Date value1, Date value2) {
            addCriterion("bulletinEditTime not between", value1, value2, "bulletinedittime");
            return (Criteria) this;
        }

        public Criteria andBulletinstatusIsNull() {
            addCriterion("bulletinStatus is null");
            return (Criteria) this;
        }

        public Criteria andBulletinstatusIsNotNull() {
            addCriterion("bulletinStatus is not null");
            return (Criteria) this;
        }

        public Criteria andBulletinstatusEqualTo(Integer value) {
            addCriterion("bulletinStatus =", value, "bulletinstatus");
            return (Criteria) this;
        }

        public Criteria andBulletinstatusNotEqualTo(Integer value) {
            addCriterion("bulletinStatus <>", value, "bulletinstatus");
            return (Criteria) this;
        }

        public Criteria andBulletinstatusGreaterThan(Integer value) {
            addCriterion("bulletinStatus >", value, "bulletinstatus");
            return (Criteria) this;
        }

        public Criteria andBulletinstatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("bulletinStatus >=", value, "bulletinstatus");
            return (Criteria) this;
        }

        public Criteria andBulletinstatusLessThan(Integer value) {
            addCriterion("bulletinStatus <", value, "bulletinstatus");
            return (Criteria) this;
        }

        public Criteria andBulletinstatusLessThanOrEqualTo(Integer value) {
            addCriterion("bulletinStatus <=", value, "bulletinstatus");
            return (Criteria) this;
        }

        public Criteria andBulletinstatusIn(List<Integer> values) {
            addCriterion("bulletinStatus in", values, "bulletinstatus");
            return (Criteria) this;
        }

        public Criteria andBulletinstatusNotIn(List<Integer> values) {
            addCriterion("bulletinStatus not in", values, "bulletinstatus");
            return (Criteria) this;
        }

        public Criteria andBulletinstatusBetween(Integer value1, Integer value2) {
            addCriterion("bulletinStatus between", value1, value2, "bulletinstatus");
            return (Criteria) this;
        }

        public Criteria andBulletinstatusNotBetween(Integer value1, Integer value2) {
            addCriterion("bulletinStatus not between", value1, value2, "bulletinstatus");
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