package com.lz.model.pojo;

import java.util.ArrayList;
import java.util.List;

public class MenusExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MenusExample() {
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

        public Criteria andMenuidIsNull() {
            addCriterion("menuId is null");
            return (Criteria) this;
        }

        public Criteria andMenuidIsNotNull() {
            addCriterion("menuId is not null");
            return (Criteria) this;
        }

        public Criteria andMenuidEqualTo(Integer value) {
            addCriterion("menuId =", value, "menuid");
            return (Criteria) this;
        }

        public Criteria andMenuidNotEqualTo(Integer value) {
            addCriterion("menuId <>", value, "menuid");
            return (Criteria) this;
        }

        public Criteria andMenuidGreaterThan(Integer value) {
            addCriterion("menuId >", value, "menuid");
            return (Criteria) this;
        }

        public Criteria andMenuidGreaterThanOrEqualTo(Integer value) {
            addCriterion("menuId >=", value, "menuid");
            return (Criteria) this;
        }

        public Criteria andMenuidLessThan(Integer value) {
            addCriterion("menuId <", value, "menuid");
            return (Criteria) this;
        }

        public Criteria andMenuidLessThanOrEqualTo(Integer value) {
            addCriterion("menuId <=", value, "menuid");
            return (Criteria) this;
        }

        public Criteria andMenuidIn(List<Integer> values) {
            addCriterion("menuId in", values, "menuid");
            return (Criteria) this;
        }

        public Criteria andMenuidNotIn(List<Integer> values) {
            addCriterion("menuId not in", values, "menuid");
            return (Criteria) this;
        }

        public Criteria andMenuidBetween(Integer value1, Integer value2) {
            addCriterion("menuId between", value1, value2, "menuid");
            return (Criteria) this;
        }

        public Criteria andMenuidNotBetween(Integer value1, Integer value2) {
            addCriterion("menuId not between", value1, value2, "menuid");
            return (Criteria) this;
        }

        public Criteria andMenuparentidIsNull() {
            addCriterion("menuParentId is null");
            return (Criteria) this;
        }

        public Criteria andMenuparentidIsNotNull() {
            addCriterion("menuParentId is not null");
            return (Criteria) this;
        }

        public Criteria andMenuparentidEqualTo(Integer value) {
            addCriterion("menuParentId =", value, "menuparentid");
            return (Criteria) this;
        }

        public Criteria andMenuparentidNotEqualTo(Integer value) {
            addCriterion("menuParentId <>", value, "menuparentid");
            return (Criteria) this;
        }

        public Criteria andMenuparentidGreaterThan(Integer value) {
            addCriterion("menuParentId >", value, "menuparentid");
            return (Criteria) this;
        }

        public Criteria andMenuparentidGreaterThanOrEqualTo(Integer value) {
            addCriterion("menuParentId >=", value, "menuparentid");
            return (Criteria) this;
        }

        public Criteria andMenuparentidLessThan(Integer value) {
            addCriterion("menuParentId <", value, "menuparentid");
            return (Criteria) this;
        }

        public Criteria andMenuparentidLessThanOrEqualTo(Integer value) {
            addCriterion("menuParentId <=", value, "menuparentid");
            return (Criteria) this;
        }

        public Criteria andMenuparentidIn(List<Integer> values) {
            addCriterion("menuParentId in", values, "menuparentid");
            return (Criteria) this;
        }

        public Criteria andMenuparentidNotIn(List<Integer> values) {
            addCriterion("menuParentId not in", values, "menuparentid");
            return (Criteria) this;
        }

        public Criteria andMenuparentidBetween(Integer value1, Integer value2) {
            addCriterion("menuParentId between", value1, value2, "menuparentid");
            return (Criteria) this;
        }

        public Criteria andMenuparentidNotBetween(Integer value1, Integer value2) {
            addCriterion("menuParentId not between", value1, value2, "menuparentid");
            return (Criteria) this;
        }

        public Criteria andMenunameIsNull() {
            addCriterion("menuName is null");
            return (Criteria) this;
        }

        public Criteria andMenunameIsNotNull() {
            addCriterion("menuName is not null");
            return (Criteria) this;
        }

        public Criteria andMenunameEqualTo(String value) {
            addCriterion("menuName =", value, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenunameNotEqualTo(String value) {
            addCriterion("menuName <>", value, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenunameGreaterThan(String value) {
            addCriterion("menuName >", value, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenunameGreaterThanOrEqualTo(String value) {
            addCriterion("menuName >=", value, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenunameLessThan(String value) {
            addCriterion("menuName <", value, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenunameLessThanOrEqualTo(String value) {
            addCriterion("menuName <=", value, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenunameLike(String value) {
            addCriterion("menuName like", value, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenunameNotLike(String value) {
            addCriterion("menuName not like", value, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenunameIn(List<String> values) {
            addCriterion("menuName in", values, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenunameNotIn(List<String> values) {
            addCriterion("menuName not in", values, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenunameBetween(String value1, String value2) {
            addCriterion("menuName between", value1, value2, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenunameNotBetween(String value1, String value2) {
            addCriterion("menuName not between", value1, value2, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenuurlIsNull() {
            addCriterion("menuUrl is null");
            return (Criteria) this;
        }

        public Criteria andMenuurlIsNotNull() {
            addCriterion("menuUrl is not null");
            return (Criteria) this;
        }

        public Criteria andMenuurlEqualTo(String value) {
            addCriterion("menuUrl =", value, "menuurl");
            return (Criteria) this;
        }

        public Criteria andMenuurlNotEqualTo(String value) {
            addCriterion("menuUrl <>", value, "menuurl");
            return (Criteria) this;
        }

        public Criteria andMenuurlGreaterThan(String value) {
            addCriterion("menuUrl >", value, "menuurl");
            return (Criteria) this;
        }

        public Criteria andMenuurlGreaterThanOrEqualTo(String value) {
            addCriterion("menuUrl >=", value, "menuurl");
            return (Criteria) this;
        }

        public Criteria andMenuurlLessThan(String value) {
            addCriterion("menuUrl <", value, "menuurl");
            return (Criteria) this;
        }

        public Criteria andMenuurlLessThanOrEqualTo(String value) {
            addCriterion("menuUrl <=", value, "menuurl");
            return (Criteria) this;
        }

        public Criteria andMenuurlLike(String value) {
            addCriterion("menuUrl like", value, "menuurl");
            return (Criteria) this;
        }

        public Criteria andMenuurlNotLike(String value) {
            addCriterion("menuUrl not like", value, "menuurl");
            return (Criteria) this;
        }

        public Criteria andMenuurlIn(List<String> values) {
            addCriterion("menuUrl in", values, "menuurl");
            return (Criteria) this;
        }

        public Criteria andMenuurlNotIn(List<String> values) {
            addCriterion("menuUrl not in", values, "menuurl");
            return (Criteria) this;
        }

        public Criteria andMenuurlBetween(String value1, String value2) {
            addCriterion("menuUrl between", value1, value2, "menuurl");
            return (Criteria) this;
        }

        public Criteria andMenuurlNotBetween(String value1, String value2) {
            addCriterion("menuUrl not between", value1, value2, "menuurl");
            return (Criteria) this;
        }

        public Criteria andMenuimageurlIsNull() {
            addCriterion("menuImageUrl is null");
            return (Criteria) this;
        }

        public Criteria andMenuimageurlIsNotNull() {
            addCriterion("menuImageUrl is not null");
            return (Criteria) this;
        }

        public Criteria andMenuimageurlEqualTo(String value) {
            addCriterion("menuImageUrl =", value, "menuimageurl");
            return (Criteria) this;
        }

        public Criteria andMenuimageurlNotEqualTo(String value) {
            addCriterion("menuImageUrl <>", value, "menuimageurl");
            return (Criteria) this;
        }

        public Criteria andMenuimageurlGreaterThan(String value) {
            addCriterion("menuImageUrl >", value, "menuimageurl");
            return (Criteria) this;
        }

        public Criteria andMenuimageurlGreaterThanOrEqualTo(String value) {
            addCriterion("menuImageUrl >=", value, "menuimageurl");
            return (Criteria) this;
        }

        public Criteria andMenuimageurlLessThan(String value) {
            addCriterion("menuImageUrl <", value, "menuimageurl");
            return (Criteria) this;
        }

        public Criteria andMenuimageurlLessThanOrEqualTo(String value) {
            addCriterion("menuImageUrl <=", value, "menuimageurl");
            return (Criteria) this;
        }

        public Criteria andMenuimageurlLike(String value) {
            addCriterion("menuImageUrl like", value, "menuimageurl");
            return (Criteria) this;
        }

        public Criteria andMenuimageurlNotLike(String value) {
            addCriterion("menuImageUrl not like", value, "menuimageurl");
            return (Criteria) this;
        }

        public Criteria andMenuimageurlIn(List<String> values) {
            addCriterion("menuImageUrl in", values, "menuimageurl");
            return (Criteria) this;
        }

        public Criteria andMenuimageurlNotIn(List<String> values) {
            addCriterion("menuImageUrl not in", values, "menuimageurl");
            return (Criteria) this;
        }

        public Criteria andMenuimageurlBetween(String value1, String value2) {
            addCriterion("menuImageUrl between", value1, value2, "menuimageurl");
            return (Criteria) this;
        }

        public Criteria andMenuimageurlNotBetween(String value1, String value2) {
            addCriterion("menuImageUrl not between", value1, value2, "menuimageurl");
            return (Criteria) this;
        }

        public Criteria andMenutipIsNull() {
            addCriterion("menuTIP is null");
            return (Criteria) this;
        }

        public Criteria andMenutipIsNotNull() {
            addCriterion("menuTIP is not null");
            return (Criteria) this;
        }

        public Criteria andMenutipEqualTo(String value) {
            addCriterion("menuTIP =", value, "menutip");
            return (Criteria) this;
        }

        public Criteria andMenutipNotEqualTo(String value) {
            addCriterion("menuTIP <>", value, "menutip");
            return (Criteria) this;
        }

        public Criteria andMenutipGreaterThan(String value) {
            addCriterion("menuTIP >", value, "menutip");
            return (Criteria) this;
        }

        public Criteria andMenutipGreaterThanOrEqualTo(String value) {
            addCriterion("menuTIP >=", value, "menutip");
            return (Criteria) this;
        }

        public Criteria andMenutipLessThan(String value) {
            addCriterion("menuTIP <", value, "menutip");
            return (Criteria) this;
        }

        public Criteria andMenutipLessThanOrEqualTo(String value) {
            addCriterion("menuTIP <=", value, "menutip");
            return (Criteria) this;
        }

        public Criteria andMenutipLike(String value) {
            addCriterion("menuTIP like", value, "menutip");
            return (Criteria) this;
        }

        public Criteria andMenutipNotLike(String value) {
            addCriterion("menuTIP not like", value, "menutip");
            return (Criteria) this;
        }

        public Criteria andMenutipIn(List<String> values) {
            addCriterion("menuTIP in", values, "menutip");
            return (Criteria) this;
        }

        public Criteria andMenutipNotIn(List<String> values) {
            addCriterion("menuTIP not in", values, "menutip");
            return (Criteria) this;
        }

        public Criteria andMenutipBetween(String value1, String value2) {
            addCriterion("menuTIP between", value1, value2, "menutip");
            return (Criteria) this;
        }

        public Criteria andMenutipNotBetween(String value1, String value2) {
            addCriterion("menuTIP not between", value1, value2, "menutip");
            return (Criteria) this;
        }

        public Criteria andMenustatusIsNull() {
            addCriterion("menuStatus is null");
            return (Criteria) this;
        }

        public Criteria andMenustatusIsNotNull() {
            addCriterion("menuStatus is not null");
            return (Criteria) this;
        }

        public Criteria andMenustatusEqualTo(Integer value) {
            addCriterion("menuStatus =", value, "menustatus");
            return (Criteria) this;
        }

        public Criteria andMenustatusNotEqualTo(Integer value) {
            addCriterion("menuStatus <>", value, "menustatus");
            return (Criteria) this;
        }

        public Criteria andMenustatusGreaterThan(Integer value) {
            addCriterion("menuStatus >", value, "menustatus");
            return (Criteria) this;
        }

        public Criteria andMenustatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("menuStatus >=", value, "menustatus");
            return (Criteria) this;
        }

        public Criteria andMenustatusLessThan(Integer value) {
            addCriterion("menuStatus <", value, "menustatus");
            return (Criteria) this;
        }

        public Criteria andMenustatusLessThanOrEqualTo(Integer value) {
            addCriterion("menuStatus <=", value, "menustatus");
            return (Criteria) this;
        }

        public Criteria andMenustatusIn(List<Integer> values) {
            addCriterion("menuStatus in", values, "menustatus");
            return (Criteria) this;
        }

        public Criteria andMenustatusNotIn(List<Integer> values) {
            addCriterion("menuStatus not in", values, "menustatus");
            return (Criteria) this;
        }

        public Criteria andMenustatusBetween(Integer value1, Integer value2) {
            addCriterion("menuStatus between", value1, value2, "menustatus");
            return (Criteria) this;
        }

        public Criteria andMenustatusNotBetween(Integer value1, Integer value2) {
            addCriterion("menuStatus not between", value1, value2, "menustatus");
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