package com.lz.model.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProductsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductsExample() {
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

        public Criteria andProductsnumberIsNull() {
            addCriterion("productsNumber is null");
            return (Criteria) this;
        }

        public Criteria andProductsnumberIsNotNull() {
            addCriterion("productsNumber is not null");
            return (Criteria) this;
        }

        public Criteria andProductsnumberEqualTo(String value) {
            addCriterion("productsNumber =", value, "productsnumber");
            return (Criteria) this;
        }

        public Criteria andProductsnumberNotEqualTo(String value) {
            addCriterion("productsNumber <>", value, "productsnumber");
            return (Criteria) this;
        }

        public Criteria andProductsnumberGreaterThan(String value) {
            addCriterion("productsNumber >", value, "productsnumber");
            return (Criteria) this;
        }

        public Criteria andProductsnumberGreaterThanOrEqualTo(String value) {
            addCriterion("productsNumber >=", value, "productsnumber");
            return (Criteria) this;
        }

        public Criteria andProductsnumberLessThan(String value) {
            addCriterion("productsNumber <", value, "productsnumber");
            return (Criteria) this;
        }

        public Criteria andProductsnumberLessThanOrEqualTo(String value) {
            addCriterion("productsNumber <=", value, "productsnumber");
            return (Criteria) this;
        }

        public Criteria andProductsnumberLike(String value) {
            addCriterion("productsNumber like", value, "productsnumber");
            return (Criteria) this;
        }

        public Criteria andProductsnumberNotLike(String value) {
            addCriterion("productsNumber not like", value, "productsnumber");
            return (Criteria) this;
        }

        public Criteria andProductsnumberIn(List<String> values) {
            addCriterion("productsNumber in", values, "productsnumber");
            return (Criteria) this;
        }

        public Criteria andProductsnumberNotIn(List<String> values) {
            addCriterion("productsNumber not in", values, "productsnumber");
            return (Criteria) this;
        }

        public Criteria andProductsnumberBetween(String value1, String value2) {
            addCriterion("productsNumber between", value1, value2, "productsnumber");
            return (Criteria) this;
        }

        public Criteria andProductsnumberNotBetween(String value1, String value2) {
            addCriterion("productsNumber not between", value1, value2, "productsnumber");
            return (Criteria) this;
        }

        public Criteria andProductsnameIsNull() {
            addCriterion("productsName is null");
            return (Criteria) this;
        }

        public Criteria andProductsnameIsNotNull() {
            addCriterion("productsName is not null");
            return (Criteria) this;
        }

        public Criteria andProductsnameEqualTo(String value) {
            addCriterion("productsName =", value, "productsname");
            return (Criteria) this;
        }

        public Criteria andProductsnameNotEqualTo(String value) {
            addCriterion("productsName <>", value, "productsname");
            return (Criteria) this;
        }

        public Criteria andProductsnameGreaterThan(String value) {
            addCriterion("productsName >", value, "productsname");
            return (Criteria) this;
        }

        public Criteria andProductsnameGreaterThanOrEqualTo(String value) {
            addCriterion("productsName >=", value, "productsname");
            return (Criteria) this;
        }

        public Criteria andProductsnameLessThan(String value) {
            addCriterion("productsName <", value, "productsname");
            return (Criteria) this;
        }

        public Criteria andProductsnameLessThanOrEqualTo(String value) {
            addCriterion("productsName <=", value, "productsname");
            return (Criteria) this;
        }

        public Criteria andProductsnameLike(String value) {
            addCriterion("productsName like", value, "productsname");
            return (Criteria) this;
        }

        public Criteria andProductsnameNotLike(String value) {
            addCriterion("productsName not like", value, "productsname");
            return (Criteria) this;
        }

        public Criteria andProductsnameIn(List<String> values) {
            addCriterion("productsName in", values, "productsname");
            return (Criteria) this;
        }

        public Criteria andProductsnameNotIn(List<String> values) {
            addCriterion("productsName not in", values, "productsname");
            return (Criteria) this;
        }

        public Criteria andProductsnameBetween(String value1, String value2) {
            addCriterion("productsName between", value1, value2, "productsname");
            return (Criteria) this;
        }

        public Criteria andProductsnameNotBetween(String value1, String value2) {
            addCriterion("productsName not between", value1, value2, "productsname");
            return (Criteria) this;
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

        public Criteria andProductpriceIsNull() {
            addCriterion("productPrice is null");
            return (Criteria) this;
        }

        public Criteria andProductpriceIsNotNull() {
            addCriterion("productPrice is not null");
            return (Criteria) this;
        }

        public Criteria andProductpriceEqualTo(BigDecimal value) {
            addCriterion("productPrice =", value, "productprice");
            return (Criteria) this;
        }

        public Criteria andProductpriceNotEqualTo(BigDecimal value) {
            addCriterion("productPrice <>", value, "productprice");
            return (Criteria) this;
        }

        public Criteria andProductpriceGreaterThan(BigDecimal value) {
            addCriterion("productPrice >", value, "productprice");
            return (Criteria) this;
        }

        public Criteria andProductpriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("productPrice >=", value, "productprice");
            return (Criteria) this;
        }

        public Criteria andProductpriceLessThan(BigDecimal value) {
            addCriterion("productPrice <", value, "productprice");
            return (Criteria) this;
        }

        public Criteria andProductpriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("productPrice <=", value, "productprice");
            return (Criteria) this;
        }

        public Criteria andProductpriceIn(List<BigDecimal> values) {
            addCriterion("productPrice in", values, "productprice");
            return (Criteria) this;
        }

        public Criteria andProductpriceNotIn(List<BigDecimal> values) {
            addCriterion("productPrice not in", values, "productprice");
            return (Criteria) this;
        }

        public Criteria andProductpriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("productPrice between", value1, value2, "productprice");
            return (Criteria) this;
        }

        public Criteria andProductpriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("productPrice not between", value1, value2, "productprice");
            return (Criteria) this;
        }

        public Criteria andProductcontentidIsNull() {
            addCriterion("productContentId is null");
            return (Criteria) this;
        }

        public Criteria andProductcontentidIsNotNull() {
            addCriterion("productContentId is not null");
            return (Criteria) this;
        }

        public Criteria andProductcontentidEqualTo(Integer value) {
            addCriterion("productContentId =", value, "productcontentid");
            return (Criteria) this;
        }

        public Criteria andProductcontentidNotEqualTo(Integer value) {
            addCriterion("productContentId <>", value, "productcontentid");
            return (Criteria) this;
        }

        public Criteria andProductcontentidGreaterThan(Integer value) {
            addCriterion("productContentId >", value, "productcontentid");
            return (Criteria) this;
        }

        public Criteria andProductcontentidGreaterThanOrEqualTo(Integer value) {
            addCriterion("productContentId >=", value, "productcontentid");
            return (Criteria) this;
        }

        public Criteria andProductcontentidLessThan(Integer value) {
            addCriterion("productContentId <", value, "productcontentid");
            return (Criteria) this;
        }

        public Criteria andProductcontentidLessThanOrEqualTo(Integer value) {
            addCriterion("productContentId <=", value, "productcontentid");
            return (Criteria) this;
        }

        public Criteria andProductcontentidIn(List<Integer> values) {
            addCriterion("productContentId in", values, "productcontentid");
            return (Criteria) this;
        }

        public Criteria andProductcontentidNotIn(List<Integer> values) {
            addCriterion("productContentId not in", values, "productcontentid");
            return (Criteria) this;
        }

        public Criteria andProductcontentidBetween(Integer value1, Integer value2) {
            addCriterion("productContentId between", value1, value2, "productcontentid");
            return (Criteria) this;
        }

        public Criteria andProductcontentidNotBetween(Integer value1, Integer value2) {
            addCriterion("productContentId not between", value1, value2, "productcontentid");
            return (Criteria) this;
        }

        public Criteria andProductnumbersalesIsNull() {
            addCriterion("productNumberSales is null");
            return (Criteria) this;
        }

        public Criteria andProductnumbersalesIsNotNull() {
            addCriterion("productNumberSales is not null");
            return (Criteria) this;
        }

        public Criteria andProductnumbersalesEqualTo(Integer value) {
            addCriterion("productNumberSales =", value, "productnumbersales");
            return (Criteria) this;
        }

        public Criteria andProductnumbersalesNotEqualTo(Integer value) {
            addCriterion("productNumberSales <>", value, "productnumbersales");
            return (Criteria) this;
        }

        public Criteria andProductnumbersalesGreaterThan(Integer value) {
            addCriterion("productNumberSales >", value, "productnumbersales");
            return (Criteria) this;
        }

        public Criteria andProductnumbersalesGreaterThanOrEqualTo(Integer value) {
            addCriterion("productNumberSales >=", value, "productnumbersales");
            return (Criteria) this;
        }

        public Criteria andProductnumbersalesLessThan(Integer value) {
            addCriterion("productNumberSales <", value, "productnumbersales");
            return (Criteria) this;
        }

        public Criteria andProductnumbersalesLessThanOrEqualTo(Integer value) {
            addCriterion("productNumberSales <=", value, "productnumbersales");
            return (Criteria) this;
        }

        public Criteria andProductnumbersalesIn(List<Integer> values) {
            addCriterion("productNumberSales in", values, "productnumbersales");
            return (Criteria) this;
        }

        public Criteria andProductnumbersalesNotIn(List<Integer> values) {
            addCriterion("productNumberSales not in", values, "productnumbersales");
            return (Criteria) this;
        }

        public Criteria andProductnumbersalesBetween(Integer value1, Integer value2) {
            addCriterion("productNumberSales between", value1, value2, "productnumbersales");
            return (Criteria) this;
        }

        public Criteria andProductnumbersalesNotBetween(Integer value1, Integer value2) {
            addCriterion("productNumberSales not between", value1, value2, "productnumbersales");
            return (Criteria) this;
        }

        public Criteria andProductthestoreidIsNull() {
            addCriterion("productThestoreId is null");
            return (Criteria) this;
        }

        public Criteria andProductthestoreidIsNotNull() {
            addCriterion("productThestoreId is not null");
            return (Criteria) this;
        }

        public Criteria andProductthestoreidEqualTo(Integer value) {
            addCriterion("productThestoreId =", value, "productthestoreid");
            return (Criteria) this;
        }

        public Criteria andProductthestoreidNotEqualTo(Integer value) {
            addCriterion("productThestoreId <>", value, "productthestoreid");
            return (Criteria) this;
        }

        public Criteria andProductthestoreidGreaterThan(Integer value) {
            addCriterion("productThestoreId >", value, "productthestoreid");
            return (Criteria) this;
        }

        public Criteria andProductthestoreidGreaterThanOrEqualTo(Integer value) {
            addCriterion("productThestoreId >=", value, "productthestoreid");
            return (Criteria) this;
        }

        public Criteria andProductthestoreidLessThan(Integer value) {
            addCriterion("productThestoreId <", value, "productthestoreid");
            return (Criteria) this;
        }

        public Criteria andProductthestoreidLessThanOrEqualTo(Integer value) {
            addCriterion("productThestoreId <=", value, "productthestoreid");
            return (Criteria) this;
        }

        public Criteria andProductthestoreidIn(List<Integer> values) {
            addCriterion("productThestoreId in", values, "productthestoreid");
            return (Criteria) this;
        }

        public Criteria andProductthestoreidNotIn(List<Integer> values) {
            addCriterion("productThestoreId not in", values, "productthestoreid");
            return (Criteria) this;
        }

        public Criteria andProductthestoreidBetween(Integer value1, Integer value2) {
            addCriterion("productThestoreId between", value1, value2, "productthestoreid");
            return (Criteria) this;
        }

        public Criteria andProductthestoreidNotBetween(Integer value1, Integer value2) {
            addCriterion("productThestoreId not between", value1, value2, "productthestoreid");
            return (Criteria) this;
        }

        public Criteria andProductcreatetimeIsNull() {
            addCriterion("productCreatetime is null");
            return (Criteria) this;
        }

        public Criteria andProductcreatetimeIsNotNull() {
            addCriterion("productCreatetime is not null");
            return (Criteria) this;
        }

        public Criteria andProductcreatetimeEqualTo(Date value) {
            addCriterion("productCreatetime =", value, "productcreatetime");
            return (Criteria) this;
        }

        public Criteria andProductcreatetimeNotEqualTo(Date value) {
            addCriterion("productCreatetime <>", value, "productcreatetime");
            return (Criteria) this;
        }

        public Criteria andProductcreatetimeGreaterThan(Date value) {
            addCriterion("productCreatetime >", value, "productcreatetime");
            return (Criteria) this;
        }

        public Criteria andProductcreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("productCreatetime >=", value, "productcreatetime");
            return (Criteria) this;
        }

        public Criteria andProductcreatetimeLessThan(Date value) {
            addCriterion("productCreatetime <", value, "productcreatetime");
            return (Criteria) this;
        }

        public Criteria andProductcreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("productCreatetime <=", value, "productcreatetime");
            return (Criteria) this;
        }

        public Criteria andProductcreatetimeIn(List<Date> values) {
            addCriterion("productCreatetime in", values, "productcreatetime");
            return (Criteria) this;
        }

        public Criteria andProductcreatetimeNotIn(List<Date> values) {
            addCriterion("productCreatetime not in", values, "productcreatetime");
            return (Criteria) this;
        }

        public Criteria andProductcreatetimeBetween(Date value1, Date value2) {
            addCriterion("productCreatetime between", value1, value2, "productcreatetime");
            return (Criteria) this;
        }

        public Criteria andProductcreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("productCreatetime not between", value1, value2, "productcreatetime");
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