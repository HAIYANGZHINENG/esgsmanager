package team.hyznrj.esgsmanager.entity;

import java.util.ArrayList;
import java.util.List;

public class JurisdictionExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table jurisdiction
     *
     * @mbggenerated Wed Dec 27 09:21:05 CST 2017
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table jurisdiction
     *
     * @mbggenerated Wed Dec 27 09:21:05 CST 2017
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table jurisdiction
     *
     * @mbggenerated Wed Dec 27 09:21:05 CST 2017
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jurisdiction
     *
     * @mbggenerated Wed Dec 27 09:21:05 CST 2017
     */
    public JurisdictionExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jurisdiction
     *
     * @mbggenerated Wed Dec 27 09:21:05 CST 2017
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jurisdiction
     *
     * @mbggenerated Wed Dec 27 09:21:05 CST 2017
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jurisdiction
     *
     * @mbggenerated Wed Dec 27 09:21:05 CST 2017
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jurisdiction
     *
     * @mbggenerated Wed Dec 27 09:21:05 CST 2017
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jurisdiction
     *
     * @mbggenerated Wed Dec 27 09:21:05 CST 2017
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jurisdiction
     *
     * @mbggenerated Wed Dec 27 09:21:05 CST 2017
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jurisdiction
     *
     * @mbggenerated Wed Dec 27 09:21:05 CST 2017
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jurisdiction
     *
     * @mbggenerated Wed Dec 27 09:21:05 CST 2017
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jurisdiction
     *
     * @mbggenerated Wed Dec 27 09:21:05 CST 2017
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jurisdiction
     *
     * @mbggenerated Wed Dec 27 09:21:05 CST 2017
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table jurisdiction
     *
     * @mbggenerated Wed Dec 27 09:21:05 CST 2017
     */
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

        public Criteria andJurisdictionnameIsNull() {
            addCriterion("jurisdictionName is null");
            return (Criteria) this;
        }

        public Criteria andJurisdictionnameIsNotNull() {
            addCriterion("jurisdictionName is not null");
            return (Criteria) this;
        }

        public Criteria andJurisdictionnameEqualTo(String value) {
            addCriterion("jurisdictionName =", value, "jurisdictionname");
            return (Criteria) this;
        }

        public Criteria andJurisdictionnameNotEqualTo(String value) {
            addCriterion("jurisdictionName <>", value, "jurisdictionname");
            return (Criteria) this;
        }

        public Criteria andJurisdictionnameGreaterThan(String value) {
            addCriterion("jurisdictionName >", value, "jurisdictionname");
            return (Criteria) this;
        }

        public Criteria andJurisdictionnameGreaterThanOrEqualTo(String value) {
            addCriterion("jurisdictionName >=", value, "jurisdictionname");
            return (Criteria) this;
        }

        public Criteria andJurisdictionnameLessThan(String value) {
            addCriterion("jurisdictionName <", value, "jurisdictionname");
            return (Criteria) this;
        }

        public Criteria andJurisdictionnameLessThanOrEqualTo(String value) {
            addCriterion("jurisdictionName <=", value, "jurisdictionname");
            return (Criteria) this;
        }

        public Criteria andJurisdictionnameLike(String value) {
            addCriterion("jurisdictionName like", value, "jurisdictionname");
            return (Criteria) this;
        }

        public Criteria andJurisdictionnameNotLike(String value) {
            addCriterion("jurisdictionName not like", value, "jurisdictionname");
            return (Criteria) this;
        }

        public Criteria andJurisdictionnameIn(List<String> values) {
            addCriterion("jurisdictionName in", values, "jurisdictionname");
            return (Criteria) this;
        }

        public Criteria andJurisdictionnameNotIn(List<String> values) {
            addCriterion("jurisdictionName not in", values, "jurisdictionname");
            return (Criteria) this;
        }

        public Criteria andJurisdictionnameBetween(String value1, String value2) {
            addCriterion("jurisdictionName between", value1, value2, "jurisdictionname");
            return (Criteria) this;
        }

        public Criteria andJurisdictionnameNotBetween(String value1, String value2) {
            addCriterion("jurisdictionName not between", value1, value2, "jurisdictionname");
            return (Criteria) this;
        }

        public Criteria andFinenessnameIsNull() {
            addCriterion("finenessName is null");
            return (Criteria) this;
        }

        public Criteria andFinenessnameIsNotNull() {
            addCriterion("finenessName is not null");
            return (Criteria) this;
        }

        public Criteria andFinenessnameEqualTo(String value) {
            addCriterion("finenessName =", value, "finenessname");
            return (Criteria) this;
        }

        public Criteria andFinenessnameNotEqualTo(String value) {
            addCriterion("finenessName <>", value, "finenessname");
            return (Criteria) this;
        }

        public Criteria andFinenessnameGreaterThan(String value) {
            addCriterion("finenessName >", value, "finenessname");
            return (Criteria) this;
        }

        public Criteria andFinenessnameGreaterThanOrEqualTo(String value) {
            addCriterion("finenessName >=", value, "finenessname");
            return (Criteria) this;
        }

        public Criteria andFinenessnameLessThan(String value) {
            addCriterion("finenessName <", value, "finenessname");
            return (Criteria) this;
        }

        public Criteria andFinenessnameLessThanOrEqualTo(String value) {
            addCriterion("finenessName <=", value, "finenessname");
            return (Criteria) this;
        }

        public Criteria andFinenessnameLike(String value) {
            addCriterion("finenessName like", value, "finenessname");
            return (Criteria) this;
        }

        public Criteria andFinenessnameNotLike(String value) {
            addCriterion("finenessName not like", value, "finenessname");
            return (Criteria) this;
        }

        public Criteria andFinenessnameIn(List<String> values) {
            addCriterion("finenessName in", values, "finenessname");
            return (Criteria) this;
        }

        public Criteria andFinenessnameNotIn(List<String> values) {
            addCriterion("finenessName not in", values, "finenessname");
            return (Criteria) this;
        }

        public Criteria andFinenessnameBetween(String value1, String value2) {
            addCriterion("finenessName between", value1, value2, "finenessname");
            return (Criteria) this;
        }

        public Criteria andFinenessnameNotBetween(String value1, String value2) {
            addCriterion("finenessName not between", value1, value2, "finenessname");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table jurisdiction
     *
     * @mbggenerated do_not_delete_during_merge Wed Dec 27 09:21:05 CST 2017
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table jurisdiction
     *
     * @mbggenerated Wed Dec 27 09:21:05 CST 2017
     */
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