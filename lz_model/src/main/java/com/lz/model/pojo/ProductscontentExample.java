package com.lz.model.pojo;

import java.util.ArrayList;
import java.util.List;

public class ProductscontentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductscontentExample() {
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

        public Criteria andProductscontentidIsNull() {
            addCriterion("productsContentId is null");
            return (Criteria) this;
        }

        public Criteria andProductscontentidIsNotNull() {
            addCriterion("productsContentId is not null");
            return (Criteria) this;
        }

        public Criteria andProductscontentidEqualTo(Integer value) {
            addCriterion("productsContentId =", value, "productscontentid");
            return (Criteria) this;
        }

        public Criteria andProductscontentidNotEqualTo(Integer value) {
            addCriterion("productsContentId <>", value, "productscontentid");
            return (Criteria) this;
        }

        public Criteria andProductscontentidGreaterThan(Integer value) {
            addCriterion("productsContentId >", value, "productscontentid");
            return (Criteria) this;
        }

        public Criteria andProductscontentidGreaterThanOrEqualTo(Integer value) {
            addCriterion("productsContentId >=", value, "productscontentid");
            return (Criteria) this;
        }

        public Criteria andProductscontentidLessThan(Integer value) {
            addCriterion("productsContentId <", value, "productscontentid");
            return (Criteria) this;
        }

        public Criteria andProductscontentidLessThanOrEqualTo(Integer value) {
            addCriterion("productsContentId <=", value, "productscontentid");
            return (Criteria) this;
        }

        public Criteria andProductscontentidIn(List<Integer> values) {
            addCriterion("productsContentId in", values, "productscontentid");
            return (Criteria) this;
        }

        public Criteria andProductscontentidNotIn(List<Integer> values) {
            addCriterion("productsContentId not in", values, "productscontentid");
            return (Criteria) this;
        }

        public Criteria andProductscontentidBetween(Integer value1, Integer value2) {
            addCriterion("productsContentId between", value1, value2, "productscontentid");
            return (Criteria) this;
        }

        public Criteria andProductscontentidNotBetween(Integer value1, Integer value2) {
            addCriterion("productsContentId not between", value1, value2, "productscontentid");
            return (Criteria) this;
        }

        public Criteria andProductscontentkeyIsNull() {
            addCriterion("productsContentkey is null");
            return (Criteria) this;
        }

        public Criteria andProductscontentkeyIsNotNull() {
            addCriterion("productsContentkey is not null");
            return (Criteria) this;
        }

        public Criteria andProductscontentkeyEqualTo(String value) {
            addCriterion("productsContentkey =", value, "productscontentkey");
            return (Criteria) this;
        }

        public Criteria andProductscontentkeyNotEqualTo(String value) {
            addCriterion("productsContentkey <>", value, "productscontentkey");
            return (Criteria) this;
        }

        public Criteria andProductscontentkeyGreaterThan(String value) {
            addCriterion("productsContentkey >", value, "productscontentkey");
            return (Criteria) this;
        }

        public Criteria andProductscontentkeyGreaterThanOrEqualTo(String value) {
            addCriterion("productsContentkey >=", value, "productscontentkey");
            return (Criteria) this;
        }

        public Criteria andProductscontentkeyLessThan(String value) {
            addCriterion("productsContentkey <", value, "productscontentkey");
            return (Criteria) this;
        }

        public Criteria andProductscontentkeyLessThanOrEqualTo(String value) {
            addCriterion("productsContentkey <=", value, "productscontentkey");
            return (Criteria) this;
        }

        public Criteria andProductscontentkeyLike(String value) {
            addCriterion("productsContentkey like", value, "productscontentkey");
            return (Criteria) this;
        }

        public Criteria andProductscontentkeyNotLike(String value) {
            addCriterion("productsContentkey not like", value, "productscontentkey");
            return (Criteria) this;
        }

        public Criteria andProductscontentkeyIn(List<String> values) {
            addCriterion("productsContentkey in", values, "productscontentkey");
            return (Criteria) this;
        }

        public Criteria andProductscontentkeyNotIn(List<String> values) {
            addCriterion("productsContentkey not in", values, "productscontentkey");
            return (Criteria) this;
        }

        public Criteria andProductscontentkeyBetween(String value1, String value2) {
            addCriterion("productsContentkey between", value1, value2, "productscontentkey");
            return (Criteria) this;
        }

        public Criteria andProductscontentkeyNotBetween(String value1, String value2) {
            addCriterion("productsContentkey not between", value1, value2, "productscontentkey");
            return (Criteria) this;
        }

        public Criteria andProductscontentvalueIsNull() {
            addCriterion("productsContentValue is null");
            return (Criteria) this;
        }

        public Criteria andProductscontentvalueIsNotNull() {
            addCriterion("productsContentValue is not null");
            return (Criteria) this;
        }

        public Criteria andProductscontentvalueEqualTo(String value) {
            addCriterion("productsContentValue =", value, "productscontentvalue");
            return (Criteria) this;
        }

        public Criteria andProductscontentvalueNotEqualTo(String value) {
            addCriterion("productsContentValue <>", value, "productscontentvalue");
            return (Criteria) this;
        }

        public Criteria andProductscontentvalueGreaterThan(String value) {
            addCriterion("productsContentValue >", value, "productscontentvalue");
            return (Criteria) this;
        }

        public Criteria andProductscontentvalueGreaterThanOrEqualTo(String value) {
            addCriterion("productsContentValue >=", value, "productscontentvalue");
            return (Criteria) this;
        }

        public Criteria andProductscontentvalueLessThan(String value) {
            addCriterion("productsContentValue <", value, "productscontentvalue");
            return (Criteria) this;
        }

        public Criteria andProductscontentvalueLessThanOrEqualTo(String value) {
            addCriterion("productsContentValue <=", value, "productscontentvalue");
            return (Criteria) this;
        }

        public Criteria andProductscontentvalueLike(String value) {
            addCriterion("productsContentValue like", value, "productscontentvalue");
            return (Criteria) this;
        }

        public Criteria andProductscontentvalueNotLike(String value) {
            addCriterion("productsContentValue not like", value, "productscontentvalue");
            return (Criteria) this;
        }

        public Criteria andProductscontentvalueIn(List<String> values) {
            addCriterion("productsContentValue in", values, "productscontentvalue");
            return (Criteria) this;
        }

        public Criteria andProductscontentvalueNotIn(List<String> values) {
            addCriterion("productsContentValue not in", values, "productscontentvalue");
            return (Criteria) this;
        }

        public Criteria andProductscontentvalueBetween(String value1, String value2) {
            addCriterion("productsContentValue between", value1, value2, "productscontentvalue");
            return (Criteria) this;
        }

        public Criteria andProductscontentvalueNotBetween(String value1, String value2) {
            addCriterion("productsContentValue not between", value1, value2, "productscontentvalue");
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