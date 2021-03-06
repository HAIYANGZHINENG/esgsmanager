package team.hyznrj.esgsmanager.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @ClassName  UserinfoExample 
 * @Description  TODO 
 * @author 何伟涛
 * @date   2017年12月27日下午10:27:51
 */
public class UserinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserinfoExample() {
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

        public Criteria andUseridIsNull() {
            addCriterion("userId is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userId is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Long value) {
            addCriterion("userId =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Long value) {
            addCriterion("userId <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Long value) {
            addCriterion("userId >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Long value) {
            addCriterion("userId >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Long value) {
            addCriterion("userId <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Long value) {
            addCriterion("userId <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Long> values) {
            addCriterion("userId in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Long> values) {
            addCriterion("userId not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Long value1, Long value2) {
            addCriterion("userId between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Long value1, Long value2) {
            addCriterion("userId not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseradressIsNull() {
            addCriterion("userAdress is null");
            return (Criteria) this;
        }

        public Criteria andUseradressIsNotNull() {
            addCriterion("userAdress is not null");
            return (Criteria) this;
        }

        public Criteria andUseradressEqualTo(String value) {
            addCriterion("userAdress =", value, "useradress");
            return (Criteria) this;
        }

        public Criteria andUseradressNotEqualTo(String value) {
            addCriterion("userAdress <>", value, "useradress");
            return (Criteria) this;
        }

        public Criteria andUseradressGreaterThan(String value) {
            addCriterion("userAdress >", value, "useradress");
            return (Criteria) this;
        }

        public Criteria andUseradressGreaterThanOrEqualTo(String value) {
            addCriterion("userAdress >=", value, "useradress");
            return (Criteria) this;
        }

        public Criteria andUseradressLessThan(String value) {
            addCriterion("userAdress <", value, "useradress");
            return (Criteria) this;
        }

        public Criteria andUseradressLessThanOrEqualTo(String value) {
            addCriterion("userAdress <=", value, "useradress");
            return (Criteria) this;
        }

        public Criteria andUseradressLike(String value) {
            addCriterion("userAdress like", value, "useradress");
            return (Criteria) this;
        }

        public Criteria andUseradressNotLike(String value) {
            addCriterion("userAdress not like", value, "useradress");
            return (Criteria) this;
        }

        public Criteria andUseradressIn(List<String> values) {
            addCriterion("userAdress in", values, "useradress");
            return (Criteria) this;
        }

        public Criteria andUseradressNotIn(List<String> values) {
            addCriterion("userAdress not in", values, "useradress");
            return (Criteria) this;
        }

        public Criteria andUseradressBetween(String value1, String value2) {
            addCriterion("userAdress between", value1, value2, "useradress");
            return (Criteria) this;
        }

        public Criteria andUseradressNotBetween(String value1, String value2) {
            addCriterion("userAdress not between", value1, value2, "useradress");
            return (Criteria) this;
        }

        public Criteria andUsersexIsNull() {
            addCriterion("userSex is null");
            return (Criteria) this;
        }

        public Criteria andUsersexIsNotNull() {
            addCriterion("userSex is not null");
            return (Criteria) this;
        }

        public Criteria andUsersexEqualTo(String value) {
            addCriterion("userSex =", value, "usersex");
            return (Criteria) this;
        }

        public Criteria andUsersexNotEqualTo(String value) {
            addCriterion("userSex <>", value, "usersex");
            return (Criteria) this;
        }

        public Criteria andUsersexGreaterThan(String value) {
            addCriterion("userSex >", value, "usersex");
            return (Criteria) this;
        }

        public Criteria andUsersexGreaterThanOrEqualTo(String value) {
            addCriterion("userSex >=", value, "usersex");
            return (Criteria) this;
        }

        public Criteria andUsersexLessThan(String value) {
            addCriterion("userSex <", value, "usersex");
            return (Criteria) this;
        }

        public Criteria andUsersexLessThanOrEqualTo(String value) {
            addCriterion("userSex <=", value, "usersex");
            return (Criteria) this;
        }

        public Criteria andUsersexLike(String value) {
            addCriterion("userSex like", value, "usersex");
            return (Criteria) this;
        }

        public Criteria andUsersexNotLike(String value) {
            addCriterion("userSex not like", value, "usersex");
            return (Criteria) this;
        }

        public Criteria andUsersexIn(List<String> values) {
            addCriterion("userSex in", values, "usersex");
            return (Criteria) this;
        }

        public Criteria andUsersexNotIn(List<String> values) {
            addCriterion("userSex not in", values, "usersex");
            return (Criteria) this;
        }

        public Criteria andUsersexBetween(String value1, String value2) {
            addCriterion("userSex between", value1, value2, "usersex");
            return (Criteria) this;
        }

        public Criteria andUsersexNotBetween(String value1, String value2) {
            addCriterion("userSex not between", value1, value2, "usersex");
            return (Criteria) this;
        }

        public Criteria andUsereducationIsNull() {
            addCriterion("userEducation is null");
            return (Criteria) this;
        }

        public Criteria andUsereducationIsNotNull() {
            addCriterion("userEducation is not null");
            return (Criteria) this;
        }

        public Criteria andUsereducationEqualTo(String value) {
            addCriterion("userEducation =", value, "usereducation");
            return (Criteria) this;
        }

        public Criteria andUsereducationNotEqualTo(String value) {
            addCriterion("userEducation <>", value, "usereducation");
            return (Criteria) this;
        }

        public Criteria andUsereducationGreaterThan(String value) {
            addCriterion("userEducation >", value, "usereducation");
            return (Criteria) this;
        }

        public Criteria andUsereducationGreaterThanOrEqualTo(String value) {
            addCriterion("userEducation >=", value, "usereducation");
            return (Criteria) this;
        }

        public Criteria andUsereducationLessThan(String value) {
            addCriterion("userEducation <", value, "usereducation");
            return (Criteria) this;
        }

        public Criteria andUsereducationLessThanOrEqualTo(String value) {
            addCriterion("userEducation <=", value, "usereducation");
            return (Criteria) this;
        }

        public Criteria andUsereducationLike(String value) {
            addCriterion("userEducation like", value, "usereducation");
            return (Criteria) this;
        }

        public Criteria andUsereducationNotLike(String value) {
            addCriterion("userEducation not like", value, "usereducation");
            return (Criteria) this;
        }

        public Criteria andUsereducationIn(List<String> values) {
            addCriterion("userEducation in", values, "usereducation");
            return (Criteria) this;
        }

        public Criteria andUsereducationNotIn(List<String> values) {
            addCriterion("userEducation not in", values, "usereducation");
            return (Criteria) this;
        }

        public Criteria andUsereducationBetween(String value1, String value2) {
            addCriterion("userEducation between", value1, value2, "usereducation");
            return (Criteria) this;
        }

        public Criteria andUsereducationNotBetween(String value1, String value2) {
            addCriterion("userEducation not between", value1, value2, "usereducation");
            return (Criteria) this;
        }

        public Criteria andUserresearchareaIsNull() {
            addCriterion("userResearchArea is null");
            return (Criteria) this;
        }

        public Criteria andUserresearchareaIsNotNull() {
            addCriterion("userResearchArea is not null");
            return (Criteria) this;
        }

        public Criteria andUserresearchareaEqualTo(String value) {
            addCriterion("userResearchArea =", value, "userresearcharea");
            return (Criteria) this;
        }

        public Criteria andUserresearchareaNotEqualTo(String value) {
            addCriterion("userResearchArea <>", value, "userresearcharea");
            return (Criteria) this;
        }

        public Criteria andUserresearchareaGreaterThan(String value) {
            addCriterion("userResearchArea >", value, "userresearcharea");
            return (Criteria) this;
        }

        public Criteria andUserresearchareaGreaterThanOrEqualTo(String value) {
            addCriterion("userResearchArea >=", value, "userresearcharea");
            return (Criteria) this;
        }

        public Criteria andUserresearchareaLessThan(String value) {
            addCriterion("userResearchArea <", value, "userresearcharea");
            return (Criteria) this;
        }

        public Criteria andUserresearchareaLessThanOrEqualTo(String value) {
            addCriterion("userResearchArea <=", value, "userresearcharea");
            return (Criteria) this;
        }

        public Criteria andUserresearchareaLike(String value) {
            addCriterion("userResearchArea like", value, "userresearcharea");
            return (Criteria) this;
        }

        public Criteria andUserresearchareaNotLike(String value) {
            addCriterion("userResearchArea not like", value, "userresearcharea");
            return (Criteria) this;
        }

        public Criteria andUserresearchareaIn(List<String> values) {
            addCriterion("userResearchArea in", values, "userresearcharea");
            return (Criteria) this;
        }

        public Criteria andUserresearchareaNotIn(List<String> values) {
            addCriterion("userResearchArea not in", values, "userresearcharea");
            return (Criteria) this;
        }

        public Criteria andUserresearchareaBetween(String value1, String value2) {
            addCriterion("userResearchArea between", value1, value2, "userresearcharea");
            return (Criteria) this;
        }

        public Criteria andUserresearchareaNotBetween(String value1, String value2) {
            addCriterion("userResearchArea not between", value1, value2, "userresearcharea");
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