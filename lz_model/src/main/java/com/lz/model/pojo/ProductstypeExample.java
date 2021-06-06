package com.lz.model.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProductstypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductstypeExample() {
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

        public Criteria andProductstypeidIsNull() {
            addCriterion("productsTypeId is null");
            return (Criteria) this;
        }

        public Criteria andProductstypeidIsNotNull() {
            addCriterion("productsTypeId is not null");
            return (Criteria) this;
        }

        public Criteria andProductstypeidEqualTo(Integer value) {
            addCriterion("productsTypeId =", value, "productstypeid");
            return (Criteria) this;
        }

        public Criteria andProductstypeidNotEqualTo(Integer value) {
            addCriterion("productsTypeId <>", value, "productstypeid");
            return (Criteria) this;
        }

        public Criteria andProductstypeidGreaterThan(Integer value) {
            addCriterion("productsTypeId >", value, "productstypeid");
            return (Criteria) this;
        }

        public Criteria andProductstypeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("productsTypeId >=", value, "productstypeid");
            return (Criteria) this;
        }

        public Criteria andProductstypeidLessThan(Integer value) {
            addCriterion("productsTypeId <", value, "productstypeid");
            return (Criteria) this;
        }

        public Criteria andProductstypeidLessThanOrEqualTo(Integer value) {
            addCriterion("productsTypeId <=", value, "productstypeid");
            return (Criteria) this;
        }

        public Criteria andProductstypeidIn(List<Integer> values) {
            addCriterion("productsTypeId in", values, "productstypeid");
            return (Criteria) this;
        }

        public Criteria andProductstypeidNotIn(List<Integer> values) {
            addCriterion("productsTypeId not in", values, "productstypeid");
            return (Criteria) this;
        }

        public Criteria andProductstypeidBetween(Integer value1, Integer value2) {
            addCriterion("productsTypeId between", value1, value2, "productstypeid");
            return (Criteria) this;
        }

        public Criteria andProductstypeidNotBetween(Integer value1, Integer value2) {
            addCriterion("productsTypeId not between", value1, value2, "productstypeid");
            return (Criteria) this;
        }

        public Criteria andProductstypenameIsNull() {
            addCriterion("productsTypeName is null");
            return (Criteria) this;
        }

        public Criteria andProductstypenameIsNotNull() {
            addCriterion("productsTypeName is not null");
            return (Criteria) this;
        }

        public Criteria andProductstypenameEqualTo(String value) {
            addCriterion("productsTypeName =", value, "productstypename");
            return (Criteria) this;
        }

        public Criteria andProductstypenameNotEqualTo(String value) {
            addCriterion("productsTypeName <>", value, "productstypename");
            return (Criteria) this;
        }

        public Criteria andProductstypenameGreaterThan(String value) {
            addCriterion("productsTypeName >", value, "productstypename");
            return (Criteria) this;
        }

        public Criteria andProductstypenameGreaterThanOrEqualTo(String value) {
            addCriterion("productsTypeName >=", value, "productstypename");
            return (Criteria) this;
        }

        public Criteria andProductstypenameLessThan(String value) {
            addCriterion("productsTypeName <", value, "productstypename");
            return (Criteria) this;
        }

        public Criteria andProductstypenameLessThanOrEqualTo(String value) {
            addCriterion("productsTypeName <=", value, "productstypename");
            return (Criteria) this;
        }

        public Criteria andProductstypenameLike(String value) {
            addCriterion("productsTypeName like", value, "productstypename");
            return (Criteria) this;
        }

        public Criteria andProductstypenameNotLike(String value) {
            addCriterion("productsTypeName not like", value, "productstypename");
            return (Criteria) this;
        }

        public Criteria andProductstypenameIn(List<String> values) {
            addCriterion("productsTypeName in", values, "productstypename");
            return (Criteria) this;
        }

        public Criteria andProductstypenameNotIn(List<String> values) {
            addCriterion("productsTypeName not in", values, "productstypename");
            return (Criteria) this;
        }

        public Criteria andProductstypenameBetween(String value1, String value2) {
            addCriterion("productsTypeName between", value1, value2, "productstypename");
            return (Criteria) this;
        }

        public Criteria andProductstypenameNotBetween(String value1, String value2) {
            addCriterion("productsTypeName not between", value1, value2, "productstypename");
            return (Criteria) this;
        }

        public Criteria andProductstypecreatetimeIsNull() {
            addCriterion("productsTypeCreateTime is null");
            return (Criteria) this;
        }

        public Criteria andProductstypecreatetimeIsNotNull() {
            addCriterion("productsTypeCreateTime is not null");
            return (Criteria) this;
        }

        public Criteria andProductstypecreatetimeEqualTo(Date value) {
            addCriterion("productsTypeCreateTime =", value, "productstypecreatetime");
            return (Criteria) this;
        }

        public Criteria andProductstypecreatetimeNotEqualTo(Date value) {
            addCriterion("productsTypeCreateTime <>", value, "productstypecreatetime");
            return (Criteria) this;
        }

        public Criteria andProductstypecreatetimeGreaterThan(Date value) {
            addCriterion("productsTypeCreateTime >", value, "productstypecreatetime");
            return (Criteria) this;
        }

        public Criteria andProductstypecreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("productsTypeCreateTime >=", value, "productstypecreatetime");
            return (Criteria) this;
        }

        public Criteria andProductstypecreatetimeLessThan(Date value) {
            addCriterion("productsTypeCreateTime <", value, "productstypecreatetime");
            return (Criteria) this;
        }

        public Criteria andProductstypecreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("productsTypeCreateTime <=", value, "productstypecreatetime");
            return (Criteria) this;
        }

        public Criteria andProductstypecreatetimeIn(List<Date> values) {
            addCriterion("productsTypeCreateTime in", values, "productstypecreatetime");
            return (Criteria) this;
        }

        public Criteria andProductstypecreatetimeNotIn(List<Date> values) {
            addCriterion("productsTypeCreateTime not in", values, "productstypecreatetime");
            return (Criteria) this;
        }

        public Criteria andProductstypecreatetimeBetween(Date value1, Date value2) {
            addCriterion("productsTypeCreateTime between", value1, value2, "productstypecreatetime");
            return (Criteria) this;
        }

        public Criteria andProductstypecreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("productsTypeCreateTime not between", value1, value2, "productstypecreatetime");
            return (Criteria) this;
        }

        public Criteria andProductstypedescIsNull() {
            addCriterion("productsTypeDesc is null");
            return (Criteria) this;
        }

        public Criteria andProductstypedescIsNotNull() {
            addCriterion("productsTypeDesc is not null");
            return (Criteria) this;
        }

        public Criteria andProductstypedescEqualTo(String value) {
            addCriterion("productsTypeDesc =", value, "productstypedesc");
            return (Criteria) this;
        }

        public Criteria andProductstypedescNotEqualTo(String value) {
            addCriterion("productsTypeDesc <>", value, "productstypedesc");
            return (Criteria) this;
        }

        public Criteria andProductstypedescGreaterThan(String value) {
            addCriterion("productsTypeDesc >", value, "productstypedesc");
            return (Criteria) this;
        }

        public Criteria andProductstypedescGreaterThanOrEqualTo(String value) {
            addCriterion("productsTypeDesc >=", value, "productstypedesc");
            return (Criteria) this;
        }

        public Criteria andProductstypedescLessThan(String value) {
            addCriterion("productsTypeDesc <", value, "productstypedesc");
            return (Criteria) this;
        }

        public Criteria andProductstypedescLessThanOrEqualTo(String value) {
            addCriterion("productsTypeDesc <=", value, "productstypedesc");
            return (Criteria) this;
        }

        public Criteria andProductstypedescLike(String value) {
            addCriterion("productsTypeDesc like", value, "productstypedesc");
            return (Criteria) this;
        }

        public Criteria andProductstypedescNotLike(String value) {
            addCriterion("productsTypeDesc not like", value, "productstypedesc");
            return (Criteria) this;
        }

        public Criteria andProductstypedescIn(List<String> values) {
            addCriterion("productsTypeDesc in", values, "productstypedesc");
            return (Criteria) this;
        }

        public Criteria andProductstypedescNotIn(List<String> values) {
            addCriterion("productsTypeDesc not in", values, "productstypedesc");
            return (Criteria) this;
        }

        public Criteria andProductstypedescBetween(String value1, String value2) {
            addCriterion("productsTypeDesc between", value1, value2, "productstypedesc");
            return (Criteria) this;
        }

        public Criteria andProductstypedescNotBetween(String value1, String value2) {
            addCriterion("productsTypeDesc not between", value1, value2, "productstypedesc");
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