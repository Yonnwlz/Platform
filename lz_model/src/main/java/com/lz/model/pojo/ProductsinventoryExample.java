package com.lz.model.pojo;

import java.util.ArrayList;
import java.util.List;

public class ProductsinventoryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductsinventoryExample() {
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

        public Criteria andInventoryserialnumberIsNull() {
            addCriterion("inventorySerialNumber is null");
            return (Criteria) this;
        }

        public Criteria andInventoryserialnumberIsNotNull() {
            addCriterion("inventorySerialNumber is not null");
            return (Criteria) this;
        }

        public Criteria andInventoryserialnumberEqualTo(String value) {
            addCriterion("inventorySerialNumber =", value, "inventoryserialnumber");
            return (Criteria) this;
        }

        public Criteria andInventoryserialnumberNotEqualTo(String value) {
            addCriterion("inventorySerialNumber <>", value, "inventoryserialnumber");
            return (Criteria) this;
        }

        public Criteria andInventoryserialnumberGreaterThan(String value) {
            addCriterion("inventorySerialNumber >", value, "inventoryserialnumber");
            return (Criteria) this;
        }

        public Criteria andInventoryserialnumberGreaterThanOrEqualTo(String value) {
            addCriterion("inventorySerialNumber >=", value, "inventoryserialnumber");
            return (Criteria) this;
        }

        public Criteria andInventoryserialnumberLessThan(String value) {
            addCriterion("inventorySerialNumber <", value, "inventoryserialnumber");
            return (Criteria) this;
        }

        public Criteria andInventoryserialnumberLessThanOrEqualTo(String value) {
            addCriterion("inventorySerialNumber <=", value, "inventoryserialnumber");
            return (Criteria) this;
        }

        public Criteria andInventoryserialnumberLike(String value) {
            addCriterion("inventorySerialNumber like", value, "inventoryserialnumber");
            return (Criteria) this;
        }

        public Criteria andInventoryserialnumberNotLike(String value) {
            addCriterion("inventorySerialNumber not like", value, "inventoryserialnumber");
            return (Criteria) this;
        }

        public Criteria andInventoryserialnumberIn(List<String> values) {
            addCriterion("inventorySerialNumber in", values, "inventoryserialnumber");
            return (Criteria) this;
        }

        public Criteria andInventoryserialnumberNotIn(List<String> values) {
            addCriterion("inventorySerialNumber not in", values, "inventoryserialnumber");
            return (Criteria) this;
        }

        public Criteria andInventoryserialnumberBetween(String value1, String value2) {
            addCriterion("inventorySerialNumber between", value1, value2, "inventoryserialnumber");
            return (Criteria) this;
        }

        public Criteria andInventoryserialnumberNotBetween(String value1, String value2) {
            addCriterion("inventorySerialNumber not between", value1, value2, "inventoryserialnumber");
            return (Criteria) this;
        }

        public Criteria andInventorynumberIsNull() {
            addCriterion("inventoryNumber is null");
            return (Criteria) this;
        }

        public Criteria andInventorynumberIsNotNull() {
            addCriterion("inventoryNumber is not null");
            return (Criteria) this;
        }

        public Criteria andInventorynumberEqualTo(Integer value) {
            addCriterion("inventoryNumber =", value, "inventorynumber");
            return (Criteria) this;
        }

        public Criteria andInventorynumberNotEqualTo(Integer value) {
            addCriterion("inventoryNumber <>", value, "inventorynumber");
            return (Criteria) this;
        }

        public Criteria andInventorynumberGreaterThan(Integer value) {
            addCriterion("inventoryNumber >", value, "inventorynumber");
            return (Criteria) this;
        }

        public Criteria andInventorynumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("inventoryNumber >=", value, "inventorynumber");
            return (Criteria) this;
        }

        public Criteria andInventorynumberLessThan(Integer value) {
            addCriterion("inventoryNumber <", value, "inventorynumber");
            return (Criteria) this;
        }

        public Criteria andInventorynumberLessThanOrEqualTo(Integer value) {
            addCriterion("inventoryNumber <=", value, "inventorynumber");
            return (Criteria) this;
        }

        public Criteria andInventorynumberIn(List<Integer> values) {
            addCriterion("inventoryNumber in", values, "inventorynumber");
            return (Criteria) this;
        }

        public Criteria andInventorynumberNotIn(List<Integer> values) {
            addCriterion("inventoryNumber not in", values, "inventorynumber");
            return (Criteria) this;
        }

        public Criteria andInventorynumberBetween(Integer value1, Integer value2) {
            addCriterion("inventoryNumber between", value1, value2, "inventorynumber");
            return (Criteria) this;
        }

        public Criteria andInventorynumberNotBetween(Integer value1, Integer value2) {
            addCriterion("inventoryNumber not between", value1, value2, "inventorynumber");
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