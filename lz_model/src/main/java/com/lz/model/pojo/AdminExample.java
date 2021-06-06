package com.lz.model.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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

        public Criteria andAdminidEqualTo(Integer value) {
            addCriterion("adminId =", value, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidNotEqualTo(Integer value) {
            addCriterion("adminId <>", value, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidGreaterThan(Integer value) {
            addCriterion("adminId >", value, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidGreaterThanOrEqualTo(Integer value) {
            addCriterion("adminId >=", value, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidLessThan(Integer value) {
            addCriterion("adminId <", value, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidLessThanOrEqualTo(Integer value) {
            addCriterion("adminId <=", value, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidIn(List<Integer> values) {
            addCriterion("adminId in", values, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidNotIn(List<Integer> values) {
            addCriterion("adminId not in", values, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidBetween(Integer value1, Integer value2) {
            addCriterion("adminId between", value1, value2, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidNotBetween(Integer value1, Integer value2) {
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

        public Criteria andAdminimageIsNull() {
            addCriterion("adminImage is null");
            return (Criteria) this;
        }

        public Criteria andAdminimageIsNotNull() {
            addCriterion("adminImage is not null");
            return (Criteria) this;
        }

        public Criteria andAdminimageEqualTo(String value) {
            addCriterion("adminImage =", value, "adminimage");
            return (Criteria) this;
        }

        public Criteria andAdminimageNotEqualTo(String value) {
            addCriterion("adminImage <>", value, "adminimage");
            return (Criteria) this;
        }

        public Criteria andAdminimageGreaterThan(String value) {
            addCriterion("adminImage >", value, "adminimage");
            return (Criteria) this;
        }

        public Criteria andAdminimageGreaterThanOrEqualTo(String value) {
            addCriterion("adminImage >=", value, "adminimage");
            return (Criteria) this;
        }

        public Criteria andAdminimageLessThan(String value) {
            addCriterion("adminImage <", value, "adminimage");
            return (Criteria) this;
        }

        public Criteria andAdminimageLessThanOrEqualTo(String value) {
            addCriterion("adminImage <=", value, "adminimage");
            return (Criteria) this;
        }

        public Criteria andAdminimageLike(String value) {
            addCriterion("adminImage like", value, "adminimage");
            return (Criteria) this;
        }

        public Criteria andAdminimageNotLike(String value) {
            addCriterion("adminImage not like", value, "adminimage");
            return (Criteria) this;
        }

        public Criteria andAdminimageIn(List<String> values) {
            addCriterion("adminImage in", values, "adminimage");
            return (Criteria) this;
        }

        public Criteria andAdminimageNotIn(List<String> values) {
            addCriterion("adminImage not in", values, "adminimage");
            return (Criteria) this;
        }

        public Criteria andAdminimageBetween(String value1, String value2) {
            addCriterion("adminImage between", value1, value2, "adminimage");
            return (Criteria) this;
        }

        public Criteria andAdminimageNotBetween(String value1, String value2) {
            addCriterion("adminImage not between", value1, value2, "adminimage");
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
            addCriterion("adminPassWord is null");
            return (Criteria) this;
        }

        public Criteria andAdminpasswordIsNotNull() {
            addCriterion("adminPassWord is not null");
            return (Criteria) this;
        }

        public Criteria andAdminpasswordEqualTo(String value) {
            addCriterion("adminPassWord =", value, "adminpassword");
            return (Criteria) this;
        }

        public Criteria andAdminpasswordNotEqualTo(String value) {
            addCriterion("adminPassWord <>", value, "adminpassword");
            return (Criteria) this;
        }

        public Criteria andAdminpasswordGreaterThan(String value) {
            addCriterion("adminPassWord >", value, "adminpassword");
            return (Criteria) this;
        }

        public Criteria andAdminpasswordGreaterThanOrEqualTo(String value) {
            addCriterion("adminPassWord >=", value, "adminpassword");
            return (Criteria) this;
        }

        public Criteria andAdminpasswordLessThan(String value) {
            addCriterion("adminPassWord <", value, "adminpassword");
            return (Criteria) this;
        }

        public Criteria andAdminpasswordLessThanOrEqualTo(String value) {
            addCriterion("adminPassWord <=", value, "adminpassword");
            return (Criteria) this;
        }

        public Criteria andAdminpasswordLike(String value) {
            addCriterion("adminPassWord like", value, "adminpassword");
            return (Criteria) this;
        }

        public Criteria andAdminpasswordNotLike(String value) {
            addCriterion("adminPassWord not like", value, "adminpassword");
            return (Criteria) this;
        }

        public Criteria andAdminpasswordIn(List<String> values) {
            addCriterion("adminPassWord in", values, "adminpassword");
            return (Criteria) this;
        }

        public Criteria andAdminpasswordNotIn(List<String> values) {
            addCriterion("adminPassWord not in", values, "adminpassword");
            return (Criteria) this;
        }

        public Criteria andAdminpasswordBetween(String value1, String value2) {
            addCriterion("adminPassWord between", value1, value2, "adminpassword");
            return (Criteria) this;
        }

        public Criteria andAdminpasswordNotBetween(String value1, String value2) {
            addCriterion("adminPassWord not between", value1, value2, "adminpassword");
            return (Criteria) this;
        }

        public Criteria andAdmindetailsIsNull() {
            addCriterion("adminDetails is null");
            return (Criteria) this;
        }

        public Criteria andAdmindetailsIsNotNull() {
            addCriterion("adminDetails is not null");
            return (Criteria) this;
        }

        public Criteria andAdmindetailsEqualTo(String value) {
            addCriterion("adminDetails =", value, "admindetails");
            return (Criteria) this;
        }

        public Criteria andAdmindetailsNotEqualTo(String value) {
            addCriterion("adminDetails <>", value, "admindetails");
            return (Criteria) this;
        }

        public Criteria andAdmindetailsGreaterThan(String value) {
            addCriterion("adminDetails >", value, "admindetails");
            return (Criteria) this;
        }

        public Criteria andAdmindetailsGreaterThanOrEqualTo(String value) {
            addCriterion("adminDetails >=", value, "admindetails");
            return (Criteria) this;
        }

        public Criteria andAdmindetailsLessThan(String value) {
            addCriterion("adminDetails <", value, "admindetails");
            return (Criteria) this;
        }

        public Criteria andAdmindetailsLessThanOrEqualTo(String value) {
            addCriterion("adminDetails <=", value, "admindetails");
            return (Criteria) this;
        }

        public Criteria andAdmindetailsLike(String value) {
            addCriterion("adminDetails like", value, "admindetails");
            return (Criteria) this;
        }

        public Criteria andAdmindetailsNotLike(String value) {
            addCriterion("adminDetails not like", value, "admindetails");
            return (Criteria) this;
        }

        public Criteria andAdmindetailsIn(List<String> values) {
            addCriterion("adminDetails in", values, "admindetails");
            return (Criteria) this;
        }

        public Criteria andAdmindetailsNotIn(List<String> values) {
            addCriterion("adminDetails not in", values, "admindetails");
            return (Criteria) this;
        }

        public Criteria andAdmindetailsBetween(String value1, String value2) {
            addCriterion("adminDetails between", value1, value2, "admindetails");
            return (Criteria) this;
        }

        public Criteria andAdmindetailsNotBetween(String value1, String value2) {
            addCriterion("adminDetails not between", value1, value2, "admindetails");
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

        public Criteria andAdminaddressIsNull() {
            addCriterion("adminAddress is null");
            return (Criteria) this;
        }

        public Criteria andAdminaddressIsNotNull() {
            addCriterion("adminAddress is not null");
            return (Criteria) this;
        }

        public Criteria andAdminaddressEqualTo(String value) {
            addCriterion("adminAddress =", value, "adminaddress");
            return (Criteria) this;
        }

        public Criteria andAdminaddressNotEqualTo(String value) {
            addCriterion("adminAddress <>", value, "adminaddress");
            return (Criteria) this;
        }

        public Criteria andAdminaddressGreaterThan(String value) {
            addCriterion("adminAddress >", value, "adminaddress");
            return (Criteria) this;
        }

        public Criteria andAdminaddressGreaterThanOrEqualTo(String value) {
            addCriterion("adminAddress >=", value, "adminaddress");
            return (Criteria) this;
        }

        public Criteria andAdminaddressLessThan(String value) {
            addCriterion("adminAddress <", value, "adminaddress");
            return (Criteria) this;
        }

        public Criteria andAdminaddressLessThanOrEqualTo(String value) {
            addCriterion("adminAddress <=", value, "adminaddress");
            return (Criteria) this;
        }

        public Criteria andAdminaddressLike(String value) {
            addCriterion("adminAddress like", value, "adminaddress");
            return (Criteria) this;
        }

        public Criteria andAdminaddressNotLike(String value) {
            addCriterion("adminAddress not like", value, "adminaddress");
            return (Criteria) this;
        }

        public Criteria andAdminaddressIn(List<String> values) {
            addCriterion("adminAddress in", values, "adminaddress");
            return (Criteria) this;
        }

        public Criteria andAdminaddressNotIn(List<String> values) {
            addCriterion("adminAddress not in", values, "adminaddress");
            return (Criteria) this;
        }

        public Criteria andAdminaddressBetween(String value1, String value2) {
            addCriterion("adminAddress between", value1, value2, "adminaddress");
            return (Criteria) this;
        }

        public Criteria andAdminaddressNotBetween(String value1, String value2) {
            addCriterion("adminAddress not between", value1, value2, "adminaddress");
            return (Criteria) this;
        }

        public Criteria andAdmincreatedateIsNull() {
            addCriterion("adminCreateDate is null");
            return (Criteria) this;
        }

        public Criteria andAdmincreatedateIsNotNull() {
            addCriterion("adminCreateDate is not null");
            return (Criteria) this;
        }

        public Criteria andAdmincreatedateEqualTo(Date value) {
            addCriterion("adminCreateDate =", value, "admincreatedate");
            return (Criteria) this;
        }

        public Criteria andAdmincreatedateNotEqualTo(Date value) {
            addCriterion("adminCreateDate <>", value, "admincreatedate");
            return (Criteria) this;
        }

        public Criteria andAdmincreatedateGreaterThan(Date value) {
            addCriterion("adminCreateDate >", value, "admincreatedate");
            return (Criteria) this;
        }

        public Criteria andAdmincreatedateGreaterThanOrEqualTo(Date value) {
            addCriterion("adminCreateDate >=", value, "admincreatedate");
            return (Criteria) this;
        }

        public Criteria andAdmincreatedateLessThan(Date value) {
            addCriterion("adminCreateDate <", value, "admincreatedate");
            return (Criteria) this;
        }

        public Criteria andAdmincreatedateLessThanOrEqualTo(Date value) {
            addCriterion("adminCreateDate <=", value, "admincreatedate");
            return (Criteria) this;
        }

        public Criteria andAdmincreatedateIn(List<Date> values) {
            addCriterion("adminCreateDate in", values, "admincreatedate");
            return (Criteria) this;
        }

        public Criteria andAdmincreatedateNotIn(List<Date> values) {
            addCriterion("adminCreateDate not in", values, "admincreatedate");
            return (Criteria) this;
        }

        public Criteria andAdmincreatedateBetween(Date value1, Date value2) {
            addCriterion("adminCreateDate between", value1, value2, "admincreatedate");
            return (Criteria) this;
        }

        public Criteria andAdmincreatedateNotBetween(Date value1, Date value2) {
            addCriterion("adminCreateDate not between", value1, value2, "admincreatedate");
            return (Criteria) this;
        }

        public Criteria andAdminstateIsNull() {
            addCriterion("adminState is null");
            return (Criteria) this;
        }

        public Criteria andAdminstateIsNotNull() {
            addCriterion("adminState is not null");
            return (Criteria) this;
        }

        public Criteria andAdminstateEqualTo(Integer value) {
            addCriterion("adminState =", value, "adminstate");
            return (Criteria) this;
        }

        public Criteria andAdminstateNotEqualTo(Integer value) {
            addCriterion("adminState <>", value, "adminstate");
            return (Criteria) this;
        }

        public Criteria andAdminstateGreaterThan(Integer value) {
            addCriterion("adminState >", value, "adminstate");
            return (Criteria) this;
        }

        public Criteria andAdminstateGreaterThanOrEqualTo(Integer value) {
            addCriterion("adminState >=", value, "adminstate");
            return (Criteria) this;
        }

        public Criteria andAdminstateLessThan(Integer value) {
            addCriterion("adminState <", value, "adminstate");
            return (Criteria) this;
        }

        public Criteria andAdminstateLessThanOrEqualTo(Integer value) {
            addCriterion("adminState <=", value, "adminstate");
            return (Criteria) this;
        }

        public Criteria andAdminstateIn(List<Integer> values) {
            addCriterion("adminState in", values, "adminstate");
            return (Criteria) this;
        }

        public Criteria andAdminstateNotIn(List<Integer> values) {
            addCriterion("adminState not in", values, "adminstate");
            return (Criteria) this;
        }

        public Criteria andAdminstateBetween(Integer value1, Integer value2) {
            addCriterion("adminState between", value1, value2, "adminstate");
            return (Criteria) this;
        }

        public Criteria andAdminstateNotBetween(Integer value1, Integer value2) {
            addCriterion("adminState not between", value1, value2, "adminstate");
            return (Criteria) this;
        }

        public Criteria andAdminthestoreidIsNull() {
            addCriterion("adminTheStoreId is null");
            return (Criteria) this;
        }

        public Criteria andAdminthestoreidIsNotNull() {
            addCriterion("adminTheStoreId is not null");
            return (Criteria) this;
        }

        public Criteria andAdminthestoreidEqualTo(Integer value) {
            addCriterion("adminTheStoreId =", value, "adminthestoreid");
            return (Criteria) this;
        }

        public Criteria andAdminthestoreidNotEqualTo(Integer value) {
            addCriterion("adminTheStoreId <>", value, "adminthestoreid");
            return (Criteria) this;
        }

        public Criteria andAdminthestoreidGreaterThan(Integer value) {
            addCriterion("adminTheStoreId >", value, "adminthestoreid");
            return (Criteria) this;
        }

        public Criteria andAdminthestoreidGreaterThanOrEqualTo(Integer value) {
            addCriterion("adminTheStoreId >=", value, "adminthestoreid");
            return (Criteria) this;
        }

        public Criteria andAdminthestoreidLessThan(Integer value) {
            addCriterion("adminTheStoreId <", value, "adminthestoreid");
            return (Criteria) this;
        }

        public Criteria andAdminthestoreidLessThanOrEqualTo(Integer value) {
            addCriterion("adminTheStoreId <=", value, "adminthestoreid");
            return (Criteria) this;
        }

        public Criteria andAdminthestoreidIn(List<Integer> values) {
            addCriterion("adminTheStoreId in", values, "adminthestoreid");
            return (Criteria) this;
        }

        public Criteria andAdminthestoreidNotIn(List<Integer> values) {
            addCriterion("adminTheStoreId not in", values, "adminthestoreid");
            return (Criteria) this;
        }

        public Criteria andAdminthestoreidBetween(Integer value1, Integer value2) {
            addCriterion("adminTheStoreId between", value1, value2, "adminthestoreid");
            return (Criteria) this;
        }

        public Criteria andAdminthestoreidNotBetween(Integer value1, Integer value2) {
            addCriterion("adminTheStoreId not between", value1, value2, "adminthestoreid");
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