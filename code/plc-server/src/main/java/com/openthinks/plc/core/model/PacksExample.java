package com.openthinks.plc.core.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PacksExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PacksExample() {
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

    public Criteria and() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        criteria.setCriteriaLogical("and");
        return criteria;
    }

    public void and(Criteria criteria) {
        oredCriteria.add(criteria);
        criteria.setCriteriaLogical("and");
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        /**advaned where clause predicate logic, can be and or or.*/
        private String criteriaLogical = "or";

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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andSupplierIsNull() {
            addCriterion("supplier is null");
            return (Criteria) this;
        }

        public Criteria andSupplierIsNotNull() {
            addCriterion("supplier is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierEqualTo(String value) {
            addCriterion("supplier =", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierNotEqualTo(String value) {
            addCriterion("supplier <>", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierGreaterThan(String value) {
            addCriterion("supplier >", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierGreaterThanOrEqualTo(String value) {
            addCriterion("supplier >=", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierLessThan(String value) {
            addCriterion("supplier <", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierLessThanOrEqualTo(String value) {
            addCriterion("supplier <=", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierLike(String value) {
            addCriterion("supplier like", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierNotLike(String value) {
            addCriterion("supplier not like", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierIn(List<String> values) {
            addCriterion("supplier in", values, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierNotIn(List<String> values) {
            addCriterion("supplier not in", values, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierBetween(String value1, String value2) {
            addCriterion("supplier between", value1, value2, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierNotBetween(String value1, String value2) {
            addCriterion("supplier not between", value1, value2, "supplier");
            return (Criteria) this;
        }

        public Criteria andPackStatusIsNull() {
            addCriterion("pack_status is null");
            return (Criteria) this;
        }

        public Criteria andPackStatusIsNotNull() {
            addCriterion("pack_status is not null");
            return (Criteria) this;
        }

        public Criteria andPackStatusEqualTo(Byte value) {
            addCriterion("pack_status =", value, "packStatus");
            return (Criteria) this;
        }

        public Criteria andPackStatusNotEqualTo(Byte value) {
            addCriterion("pack_status <>", value, "packStatus");
            return (Criteria) this;
        }

        public Criteria andPackStatusGreaterThan(Byte value) {
            addCriterion("pack_status >", value, "packStatus");
            return (Criteria) this;
        }

        public Criteria andPackStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("pack_status >=", value, "packStatus");
            return (Criteria) this;
        }

        public Criteria andPackStatusLessThan(Byte value) {
            addCriterion("pack_status <", value, "packStatus");
            return (Criteria) this;
        }

        public Criteria andPackStatusLessThanOrEqualTo(Byte value) {
            addCriterion("pack_status <=", value, "packStatus");
            return (Criteria) this;
        }

        public Criteria andPackStatusIn(List<Byte> values) {
            addCriterion("pack_status in", values, "packStatus");
            return (Criteria) this;
        }

        public Criteria andPackStatusNotIn(List<Byte> values) {
            addCriterion("pack_status not in", values, "packStatus");
            return (Criteria) this;
        }

        public Criteria andPackStatusBetween(Byte value1, Byte value2) {
            addCriterion("pack_status between", value1, value2, "packStatus");
            return (Criteria) this;
        }

        public Criteria andPackStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("pack_status not between", value1, value2, "packStatus");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("create_date is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("create_date is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterion("create_date =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("create_date <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("create_date >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("create_date >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("create_date <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("create_date <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterion("create_date in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterion("create_date not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterion("create_date between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("create_date not between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andGenericSubquery(String subQueryClause) {
            addCriterion(subQueryClause);
            return (Criteria) this;
        }

        public void setCriteriaLogical(String logic) {
            this.criteriaLogical = logic;
        }

        public String getCriteriaLogical() {
            return this.criteriaLogical;
        }

        public Criteria orIdIsNull() {
            addCriterion("id is null");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orIdIsNotNull() {
            addCriterion("id is not null");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orSupplierIsNull() {
            addCriterion("supplier is null");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orSupplierIsNotNull() {
            addCriterion("supplier is not null");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orSupplierEqualTo(String value) {
            addCriterion("supplier =", value, "supplier");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orSupplierNotEqualTo(String value) {
            addCriterion("supplier <>", value, "supplier");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orSupplierGreaterThan(String value) {
            addCriterion("supplier >", value, "supplier");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orSupplierGreaterThanOrEqualTo(String value) {
            addCriterion("supplier >=", value, "supplier");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orSupplierLessThan(String value) {
            addCriterion("supplier <", value, "supplier");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orSupplierLessThanOrEqualTo(String value) {
            addCriterion("supplier <=", value, "supplier");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orSupplierLike(String value) {
            addCriterion("supplier like", value, "supplier");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orSupplierNotLike(String value) {
            addCriterion("supplier not like", value, "supplier");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orSupplierIn(List<String> values) {
            addCriterion("supplier in", values, "supplier");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orSupplierNotIn(List<String> values) {
            addCriterion("supplier not in", values, "supplier");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orSupplierBetween(String value1, String value2) {
            addCriterion("supplier between", value1, value2, "supplier");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orSupplierNotBetween(String value1, String value2) {
            addCriterion("supplier not between", value1, value2, "supplier");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orPackStatusIsNull() {
            addCriterion("pack_status is null");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orPackStatusIsNotNull() {
            addCriterion("pack_status is not null");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orPackStatusEqualTo(Byte value) {
            addCriterion("pack_status =", value, "packStatus");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orPackStatusNotEqualTo(Byte value) {
            addCriterion("pack_status <>", value, "packStatus");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orPackStatusGreaterThan(Byte value) {
            addCriterion("pack_status >", value, "packStatus");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orPackStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("pack_status >=", value, "packStatus");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orPackStatusLessThan(Byte value) {
            addCriterion("pack_status <", value, "packStatus");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orPackStatusLessThanOrEqualTo(Byte value) {
            addCriterion("pack_status <=", value, "packStatus");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orPackStatusIn(List<Byte> values) {
            addCriterion("pack_status in", values, "packStatus");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orPackStatusNotIn(List<Byte> values) {
            addCriterion("pack_status not in", values, "packStatus");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orPackStatusBetween(Byte value1, Byte value2) {
            addCriterion("pack_status between", value1, value2, "packStatus");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orPackStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("pack_status not between", value1, value2, "packStatus");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orCreateDateIsNull() {
            addCriterion("create_date is null");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orCreateDateIsNotNull() {
            addCriterion("create_date is not null");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orCreateDateEqualTo(Date value) {
            addCriterion("create_date =", value, "createDate");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orCreateDateNotEqualTo(Date value) {
            addCriterion("create_date <>", value, "createDate");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orCreateDateGreaterThan(Date value) {
            addCriterion("create_date >", value, "createDate");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("create_date >=", value, "createDate");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orCreateDateLessThan(Date value) {
            addCriterion("create_date <", value, "createDate");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("create_date <=", value, "createDate");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orCreateDateIn(List<Date> values) {
            addCriterion("create_date in", values, "createDate");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orCreateDateNotIn(List<Date> values) {
            addCriterion("create_date not in", values, "createDate");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orCreateDateBetween(Date value1, Date value2) {
            addCriterion("create_date between", value1, value2, "createDate");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("create_date not between", value1, value2, "createDate");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orGenericSubquery(String subQueryClause) {
            addCriterion(subQueryClause);
            criteria.get(criteria.size()-1).setCriterionLogical("or");
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

        /**advaned where clause predicate logic, can be and or or. RESERVED!*/
        private String criterionLogical = "and";

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

        public void setCriterionLogical(String logic) {
            this.criterionLogical = logic;
        }

        public String getCriterionLogical() {
            return this.criterionLogical;
        }
    }
}