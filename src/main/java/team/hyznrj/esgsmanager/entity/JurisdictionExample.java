package team.hyznrj.esgsmanager.entity;

import java.util.ArrayList;
import java.util.List;
/**
 * 
 * @ClassName  JurisdictionExample 
 * @Description  TODO 
 * @author 何伟涛
 * @date   2017年12月27日下午10:27:11
 */
public class JurisdictionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public JurisdictionExample() {
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