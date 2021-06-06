package com.lz.model.pojo;

import java.util.ArrayList;
import java.util.List;

public class ProductsimageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductsimageExample() {
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

        public Criteria andProductsimagesidIsNull() {
            addCriterion("productsImagesId is null");
            return (Criteria) this;
        }

        public Criteria andProductsimagesidIsNotNull() {
            addCriterion("productsImagesId is not null");
            return (Criteria) this;
        }

        public Criteria andProductsimagesidEqualTo(Integer value) {
            addCriterion("productsImagesId =", value, "productsimagesid");
            return (Criteria) this;
        }

        public Criteria andProductsimagesidNotEqualTo(Integer value) {
            addCriterion("productsImagesId <>", value, "productsimagesid");
            return (Criteria) this;
        }

        public Criteria andProductsimagesidGreaterThan(Integer value) {
            addCriterion("productsImagesId >", value, "productsimagesid");
            return (Criteria) this;
        }

        public Criteria andProductsimagesidGreaterThanOrEqualTo(Integer value) {
            addCriterion("productsImagesId >=", value, "productsimagesid");
            return (Criteria) this;
        }

        public Criteria andProductsimagesidLessThan(Integer value) {
            addCriterion("productsImagesId <", value, "productsimagesid");
            return (Criteria) this;
        }

        public Criteria andProductsimagesidLessThanOrEqualTo(Integer value) {
            addCriterion("productsImagesId <=", value, "productsimagesid");
            return (Criteria) this;
        }

        public Criteria andProductsimagesidIn(List<Integer> values) {
            addCriterion("productsImagesId in", values, "productsimagesid");
            return (Criteria) this;
        }

        public Criteria andProductsimagesidNotIn(List<Integer> values) {
            addCriterion("productsImagesId not in", values, "productsimagesid");
            return (Criteria) this;
        }

        public Criteria andProductsimagesidBetween(Integer value1, Integer value2) {
            addCriterion("productsImagesId between", value1, value2, "productsimagesid");
            return (Criteria) this;
        }

        public Criteria andProductsimagesidNotBetween(Integer value1, Integer value2) {
            addCriterion("productsImagesId not between", value1, value2, "productsimagesid");
            return (Criteria) this;
        }

        public Criteria andProductsimagesurlIsNull() {
            addCriterion("productsImagesUrl is null");
            return (Criteria) this;
        }

        public Criteria andProductsimagesurlIsNotNull() {
            addCriterion("productsImagesUrl is not null");
            return (Criteria) this;
        }

        public Criteria andProductsimagesurlEqualTo(String value) {
            addCriterion("productsImagesUrl =", value, "productsimagesurl");
            return (Criteria) this;
        }

        public Criteria andProductsimagesurlNotEqualTo(String value) {
            addCriterion("productsImagesUrl <>", value, "productsimagesurl");
            return (Criteria) this;
        }

        public Criteria andProductsimagesurlGreaterThan(String value) {
            addCriterion("productsImagesUrl >", value, "productsimagesurl");
            return (Criteria) this;
        }

        public Criteria andProductsimagesurlGreaterThanOrEqualTo(String value) {
            addCriterion("productsImagesUrl >=", value, "productsimagesurl");
            return (Criteria) this;
        }

        public Criteria andProductsimagesurlLessThan(String value) {
            addCriterion("productsImagesUrl <", value, "productsimagesurl");
            return (Criteria) this;
        }

        public Criteria andProductsimagesurlLessThanOrEqualTo(String value) {
            addCriterion("productsImagesUrl <=", value, "productsimagesurl");
            return (Criteria) this;
        }

        public Criteria andProductsimagesurlLike(String value) {
            addCriterion("productsImagesUrl like", value, "productsimagesurl");
            return (Criteria) this;
        }

        public Criteria andProductsimagesurlNotLike(String value) {
            addCriterion("productsImagesUrl not like", value, "productsimagesurl");
            return (Criteria) this;
        }

        public Criteria andProductsimagesurlIn(List<String> values) {
            addCriterion("productsImagesUrl in", values, "productsimagesurl");
            return (Criteria) this;
        }

        public Criteria andProductsimagesurlNotIn(List<String> values) {
            addCriterion("productsImagesUrl not in", values, "productsimagesurl");
            return (Criteria) this;
        }

        public Criteria andProductsimagesurlBetween(String value1, String value2) {
            addCriterion("productsImagesUrl between", value1, value2, "productsimagesurl");
            return (Criteria) this;
        }

        public Criteria andProductsimagesurlNotBetween(String value1, String value2) {
            addCriterion("productsImagesUrl not between", value1, value2, "productsimagesurl");
            return (Criteria) this;
        }

        public Criteria andProductsimagesdescIsNull() {
            addCriterion("productsImagesDesc is null");
            return (Criteria) this;
        }

        public Criteria andProductsimagesdescIsNotNull() {
            addCriterion("productsImagesDesc is not null");
            return (Criteria) this;
        }

        public Criteria andProductsimagesdescEqualTo(String value) {
            addCriterion("productsImagesDesc =", value, "productsimagesdesc");
            return (Criteria) this;
        }

        public Criteria andProductsimagesdescNotEqualTo(String value) {
            addCriterion("productsImagesDesc <>", value, "productsimagesdesc");
            return (Criteria) this;
        }

        public Criteria andProductsimagesdescGreaterThan(String value) {
            addCriterion("productsImagesDesc >", value, "productsimagesdesc");
            return (Criteria) this;
        }

        public Criteria andProductsimagesdescGreaterThanOrEqualTo(String value) {
            addCriterion("productsImagesDesc >=", value, "productsimagesdesc");
            return (Criteria) this;
        }

        public Criteria andProductsimagesdescLessThan(String value) {
            addCriterion("productsImagesDesc <", value, "productsimagesdesc");
            return (Criteria) this;
        }

        public Criteria andProductsimagesdescLessThanOrEqualTo(String value) {
            addCriterion("productsImagesDesc <=", value, "productsimagesdesc");
            return (Criteria) this;
        }

        public Criteria andProductsimagesdescLike(String value) {
            addCriterion("productsImagesDesc like", value, "productsimagesdesc");
            return (Criteria) this;
        }

        public Criteria andProductsimagesdescNotLike(String value) {
            addCriterion("productsImagesDesc not like", value, "productsimagesdesc");
            return (Criteria) this;
        }

        public Criteria andProductsimagesdescIn(List<String> values) {
            addCriterion("productsImagesDesc in", values, "productsimagesdesc");
            return (Criteria) this;
        }

        public Criteria andProductsimagesdescNotIn(List<String> values) {
            addCriterion("productsImagesDesc not in", values, "productsimagesdesc");
            return (Criteria) this;
        }

        public Criteria andProductsimagesdescBetween(String value1, String value2) {
            addCriterion("productsImagesDesc between", value1, value2, "productsimagesdesc");
            return (Criteria) this;
        }

        public Criteria andProductsimagesdescNotBetween(String value1, String value2) {
            addCriterion("productsImagesDesc not between", value1, value2, "productsimagesdesc");
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