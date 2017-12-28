package team.hyznrj.esgsmanager.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @ClassName  AdminExample 
 * @Description  TODO 
 * @author 何伟涛
 * @date   2017年12月27日下午10:26:33
 */
public class AdminExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AdminExample() {
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

        public Criteria andAdminidIsNull() {
            addCriterion("adminId is null");
            return (Criteria) this;
        }

        public Criteria andAdminidIsNotNull() {
            addCriterion("adminId is not null");
            return (Criteria) this;
        }

        public Criteria andAdminidEqualTo(Long value) {
            addCriterion("adminId =", value, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidNotEqualTo(Long value) {
            addCriterion("adminId <>", value, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidGreaterThan(Long value) {
            addCriterion("adminId >", value, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidGreaterThanOrEqualTo(Long value) {
            addCriterion("adminId >=", value, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidLessThan(Long value) {
            addCriterion("adminId <", value, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidLessThanOrEqualTo(Long value) {
            addCriterion("adminId <=", value, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidIn(List<Long> values) {
            addCriterion("adminId in", values, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidNotIn(List<Long> values) {
            addCriterion("adminId not in", values, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidBetween(Long value1, Long value2) {
            addCriterion("adminId between", value1, value2, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidNotBetween(Long value1, Long value2) {
            addCriterion("adminId not between", value1, value2, "adminid");
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

        public Criteria andAdminphoneIsNull() {
            addCriterion("adminPhone is null");
            return (Criteria) this;
        }

        public Criteria andAdminphoneIsNotNull() {
            addCriterion("adminPhone is not null");
            return (Criteria) this;
        }

        public Criteria andAdminphoneEqualTo(String value) {
            addCriterion("adminPhone =", value, "adminphone");
            return (Criteria) this;
        }

        public Criteria andAdminphoneNotEqualTo(String value) {
            addCriterion("adminPhone <>", value, "adminphone");
            return (Criteria) this;
        }

        public Criteria andAdminphoneGreaterThan(String value) {
            addCriterion("adminPhone >", value, "adminphone");
            return (Criteria) this;
        }

        public Criteria andAdminphoneGreaterThanOrEqualTo(String value) {
            addCriterion("adminPhone >=", value, "adminphone");
            return (Criteria) this;
        }

        public Criteria andAdminphoneLessThan(String value) {
            addCriterion("adminPhone <", value, "adminphone");
            return (Criteria) this;
        }

        public Criteria andAdminphoneLessThanOrEqualTo(String value) {
            addCriterion("adminPhone <=", value, "adminphone");
            return (Criteria) this;
        }

        public Criteria andAdminphoneLike(String value) {
            addCriterion("adminPhone like", value, "adminphone");
            return (Criteria) this;
        }

        public Criteria andAdminphoneNotLike(String value) {
            addCriterion("adminPhone not like", value, "adminphone");
            return (Criteria) this;
        }

        public Criteria andAdminphoneIn(List<String> values) {
            addCriterion("adminPhone in", values, "adminphone");
            return (Criteria) this;
        }

        public Criteria andAdminphoneNotIn(List<String> values) {
            addCriterion("adminPhone not in", values, "adminphone");
            return (Criteria) this;
        }

        public Criteria andAdminphoneBetween(String value1, String value2) {
            addCriterion("adminPhone between", value1, value2, "adminphone");
            return (Criteria) this;
        }

        public Criteria andAdminphoneNotBetween(String value1, String value2) {
            addCriterion("adminPhone not between", value1, value2, "adminphone");
            return (Criteria) this;
        }

        public Criteria andAdminemailIsNull() {
            addCriterion("adminEmail is null");
            return (Criteria) this;
        }

        public Criteria andAdminemailIsNotNull() {
            addCriterion("adminEmail is not null");
            return (Criteria) this;
        }

        public Criteria andAdminemailEqualTo(String value) {
            addCriterion("adminEmail =", value, "adminemail");
            return (Criteria) this;
        }

        public Criteria andAdminemailNotEqualTo(String value) {
            addCriterion("adminEmail <>", value, "adminemail");
            return (Criteria) this;
        }

        public Criteria andAdminemailGreaterThan(String value) {
            addCriterion("adminEmail >", value, "adminemail");
            return (Criteria) this;
        }

        public Criteria andAdminemailGreaterThanOrEqualTo(String value) {
            addCriterion("adminEmail >=", value, "adminemail");
            return (Criteria) this;
        }

        public Criteria andAdminemailLessThan(String value) {
            addCriterion("adminEmail <", value, "adminemail");
            return (Criteria) this;
        }

        public Criteria andAdminemailLessThanOrEqualTo(String value) {
            addCriterion("adminEmail <=", value, "adminemail");
            return (Criteria) this;
        }

        public Criteria andAdminemailLike(String value) {
            addCriterion("adminEmail like", value, "adminemail");
            return (Criteria) this;
        }

        public Criteria andAdminemailNotLike(String value) {
            addCriterion("adminEmail not like", value, "adminemail");
            return (Criteria) this;
        }

        public Criteria andAdminemailIn(List<String> values) {
            addCriterion("adminEmail in", values, "adminemail");
            return (Criteria) this;
        }

        public Criteria andAdminemailNotIn(List<String> values) {
            addCriterion("adminEmail not in", values, "adminemail");
            return (Criteria) this;
        }

        public Criteria andAdminemailBetween(String value1, String value2) {
            addCriterion("adminEmail between", value1, value2, "adminemail");
            return (Criteria) this;
        }

        public Criteria andAdminemailNotBetween(String value1, String value2) {
            addCriterion("adminEmail not between", value1, value2, "adminemail");
            return (Criteria) this;
        }

        public Criteria andAdminaccountIsNull() {
            addCriterion("adminAccount is null");
            return (Criteria) this;
        }

        public Criteria andAdminaccountIsNotNull() {
            addCriterion("adminAccount is not null");
            return (Criteria) this;
        }

        public Criteria andAdminaccountEqualTo(String value) {
            addCriterion("adminAccount =", value, "adminaccount");
            return (Criteria) this;
        }

        public Criteria andAdminaccountNotEqualTo(String value) {
            addCriterion("adminAccount <>", value, "adminaccount");
            return (Criteria) this;
        }

        public Criteria andAdminaccountGreaterThan(String value) {
            addCriterion("adminAccount >", value, "adminaccount");
            return (Criteria) this;
        }

        public Criteria andAdminaccountGreaterThanOrEqualTo(String value) {
            addCriterion("adminAccount >=", value, "adminaccount");
            return (Criteria) this;
        }

        public Criteria andAdminaccountLessThan(String value) {
            addCriterion("adminAccount <", value, "adminaccount");
            return (Criteria) this;
        }

        public Criteria andAdminaccountLessThanOrEqualTo(String value) {
            addCriterion("adminAccount <=", value, "adminaccount");
            return (Criteria) this;
        }

        public Criteria andAdminaccountLike(String value) {
            addCriterion("adminAccount like", value, "adminaccount");
            return (Criteria) this;
        }

        public Criteria andAdminaccountNotLike(String value) {
            addCriterion("adminAccount not like", value, "adminaccount");
            return (Criteria) this;
        }

        public Criteria andAdminaccountIn(List<String> values) {
            addCriterion("adminAccount in", values, "adminaccount");
            return (Criteria) this;
        }

        public Criteria andAdminaccountNotIn(List<String> values) {
            addCriterion("adminAccount not in", values, "adminaccount");
            return (Criteria) this;
        }

        public Criteria andAdminaccountBetween(String value1, String value2) {
            addCriterion("adminAccount between", value1, value2, "adminaccount");
            return (Criteria) this;
        }

        public Criteria andAdminaccountNotBetween(String value1, String value2) {
            addCriterion("adminAccount not between", value1, value2, "adminaccount");
            return (Criteria) this;
        }

        public Criteria andAdminpasswordIsNull() {
            addCriterion("adminPassword is null");
            return (Criteria) this;
        }

        public Criteria andAdminpasswordIsNotNull() {
            addCriterion("adminPassword is not null");
            return (Criteria) this;
        }

        public Criteria andAdminpasswordEqualTo(String value) {
            addCriterion("adminPassword =", value, "adminpassword");
            return (Criteria) this;
        }

        public Criteria andAdminpasswordNotEqualTo(String value) {
            addCriterion("adminPassword <>", value, "adminpassword");
            return (Criteria) this;
        }

        public Criteria andAdminpasswordGreaterThan(String value) {
            addCriterion("adminPassword >", value, "adminpassword");
            return (Criteria) this;
        }

        public Criteria andAdminpasswordGreaterThanOrEqualTo(String value) {
            addCriterion("adminPassword >=", value, "adminpassword");
            return (Criteria) this;
        }

        public Criteria andAdminpasswordLessThan(String value) {
            addCriterion("adminPassword <", value, "adminpassword");
            return (Criteria) this;
        }

        public Criteria andAdminpasswordLessThanOrEqualTo(String value) {
            addCriterion("adminPassword <=", value, "adminpassword");
            return (Criteria) this;
        }

        public Criteria andAdminpasswordLike(String value) {
            addCriterion("adminPassword like", value, "adminpassword");
            return (Criteria) this;
        }

        public Criteria andAdminpasswordNotLike(String value) {
            addCriterion("adminPassword not like", value, "adminpassword");
            return (Criteria) this;
        }

        public Criteria andAdminpasswordIn(List<String> values) {
            addCriterion("adminPassword in", values, "adminpassword");
            return (Criteria) this;
        }

        public Criteria andAdminpasswordNotIn(List<String> values) {
            addCriterion("adminPassword not in", values, "adminpassword");
            return (Criteria) this;
        }

        public Criteria andAdminpasswordBetween(String value1, String value2) {
            addCriterion("adminPassword between", value1, value2, "adminpassword");
            return (Criteria) this;
        }

        public Criteria andAdminpasswordNotBetween(String value1, String value2) {
            addCriterion("adminPassword not between", value1, value2, "adminpassword");
            return (Criteria) this;
        }

        public Criteria andAdminstatusIsNull() {
            addCriterion("adminStatus is null");
            return (Criteria) this;
        }

        public Criteria andAdminstatusIsNotNull() {
            addCriterion("adminStatus is not null");
            return (Criteria) this;
        }

        public Criteria andAdminstatusEqualTo(Integer value) {
            addCriterion("adminStatus =", value, "adminstatus");
            return (Criteria) this;
        }

        public Criteria andAdminstatusNotEqualTo(Integer value) {
            addCriterion("adminStatus <>", value, "adminstatus");
            return (Criteria) this;
        }

        public Criteria andAdminstatusGreaterThan(Integer value) {
            addCriterion("adminStatus >", value, "adminstatus");
            return (Criteria) this;
        }

        public Criteria andAdminstatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("adminStatus >=", value, "adminstatus");
            return (Criteria) this;
        }

        public Criteria andAdminstatusLessThan(Integer value) {
            addCriterion("adminStatus <", value, "adminstatus");
            return (Criteria) this;
        }

        public Criteria andAdminstatusLessThanOrEqualTo(Integer value) {
            addCriterion("adminStatus <=", value, "adminstatus");
            return (Criteria) this;
        }

        public Criteria andAdminstatusIn(List<Integer> values) {
            addCriterion("adminStatus in", values, "adminstatus");
            return (Criteria) this;
        }

        public Criteria andAdminstatusNotIn(List<Integer> values) {
            addCriterion("adminStatus not in", values, "adminstatus");
            return (Criteria) this;
        }

        public Criteria andAdminstatusBetween(Integer value1, Integer value2) {
            addCriterion("adminStatus between", value1, value2, "adminstatus");
            return (Criteria) this;
        }

        public Criteria andAdminstatusNotBetween(Integer value1, Integer value2) {
            addCriterion("adminStatus not between", value1, value2, "adminstatus");
            return (Criteria) this;
        }

        public Criteria andAdminjurisdictionIsNull() {
            addCriterion("adminJurisdiction is null");
            return (Criteria) this;
        }

        public Criteria andAdminjurisdictionIsNotNull() {
            addCriterion("adminJurisdiction is not null");
            return (Criteria) this;
        }

        public Criteria andAdminjurisdictionEqualTo(String value) {
            addCriterion("adminJurisdiction =", value, "adminjurisdiction");
            return (Criteria) this;
        }

        public Criteria andAdminjurisdictionNotEqualTo(String value) {
            addCriterion("adminJurisdiction <>", value, "adminjurisdiction");
            return (Criteria) this;
        }

        public Criteria andAdminjurisdictionGreaterThan(String value) {
            addCriterion("adminJurisdiction >", value, "adminjurisdiction");
            return (Criteria) this;
        }

        public Criteria andAdminjurisdictionGreaterThanOrEqualTo(String value) {
            addCriterion("adminJurisdiction >=", value, "adminjurisdiction");
            return (Criteria) this;
        }

        public Criteria andAdminjurisdictionLessThan(String value) {
            addCriterion("adminJurisdiction <", value, "adminjurisdiction");
            return (Criteria) this;
        }

        public Criteria andAdminjurisdictionLessThanOrEqualTo(String value) {
            addCriterion("adminJurisdiction <=", value, "adminjurisdiction");
            return (Criteria) this;
        }

        public Criteria andAdminjurisdictionLike(String value) {
            addCriterion("adminJurisdiction like", value, "adminjurisdiction");
            return (Criteria) this;
        }

        public Criteria andAdminjurisdictionNotLike(String value) {
            addCriterion("adminJurisdiction not like", value, "adminjurisdiction");
            return (Criteria) this;
        }

        public Criteria andAdminjurisdictionIn(List<String> values) {
            addCriterion("adminJurisdiction in", values, "adminjurisdiction");
            return (Criteria) this;
        }

        public Criteria andAdminjurisdictionNotIn(List<String> values) {
            addCriterion("adminJurisdiction not in", values, "adminjurisdiction");
            return (Criteria) this;
        }

        public Criteria andAdminjurisdictionBetween(String value1, String value2) {
            addCriterion("adminJurisdiction between", value1, value2, "adminjurisdiction");
            return (Criteria) this;
        }

        public Criteria andAdminjurisdictionNotBetween(String value1, String value2) {
            addCriterion("adminJurisdiction not between", value1, value2, "adminjurisdiction");
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