package com.openthinks.plc.core.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PackTrackExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PackTrackExample() {
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

        public Criteria andShipIdIsNull() {
            addCriterion("ship_id is null");
            return (Criteria) this;
        }

        public Criteria andShipIdIsNotNull() {
            addCriterion("ship_id is not null");
            return (Criteria) this;
        }

        public Criteria andShipIdEqualTo(Long value) {
            addCriterion("ship_id =", value, "shipId");
            return (Criteria) this;
        }

        public Criteria andShipIdNotEqualTo(Long value) {
            addCriterion("ship_id <>", value, "shipId");
            return (Criteria) this;
        }

        public Criteria andShipIdGreaterThan(Long value) {
            addCriterion("ship_id >", value, "shipId");
            return (Criteria) this;
        }

        public Criteria andShipIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ship_id >=", value, "shipId");
            return (Criteria) this;
        }

        public Criteria andShipIdLessThan(Long value) {
            addCriterion("ship_id <", value, "shipId");
            return (Criteria) this;
        }

        public Criteria andShipIdLessThanOrEqualTo(Long value) {
            addCriterion("ship_id <=", value, "shipId");
            return (Criteria) this;
        }

        public Criteria andShipIdIn(List<Long> values) {
            addCriterion("ship_id in", values, "shipId");
            return (Criteria) this;
        }

        public Criteria andShipIdNotIn(List<Long> values) {
            addCriterion("ship_id not in", values, "shipId");
            return (Criteria) this;
        }

        public Criteria andShipIdBetween(Long value1, Long value2) {
            addCriterion("ship_id between", value1, value2, "shipId");
            return (Criteria) this;
        }

        public Criteria andShipIdNotBetween(Long value1, Long value2) {
            addCriterion("ship_id not between", value1, value2, "shipId");
            return (Criteria) this;
        }

        public Criteria andPackIdIsNull() {
            addCriterion("pack_id is null");
            return (Criteria) this;
        }

        public Criteria andPackIdIsNotNull() {
            addCriterion("pack_id is not null");
            return (Criteria) this;
        }

        public Criteria andPackIdEqualTo(Long value) {
            addCriterion("pack_id =", value, "packId");
            return (Criteria) this;
        }

        public Criteria andPackIdNotEqualTo(Long value) {
            addCriterion("pack_id <>", value, "packId");
            return (Criteria) this;
        }

        public Criteria andPackIdGreaterThan(Long value) {
            addCriterion("pack_id >", value, "packId");
            return (Criteria) this;
        }

        public Criteria andPackIdGreaterThanOrEqualTo(Long value) {
            addCriterion("pack_id >=", value, "packId");
            return (Criteria) this;
        }

        public Criteria andPackIdLessThan(Long value) {
            addCriterion("pack_id <", value, "packId");
            return (Criteria) this;
        }

        public Criteria andPackIdLessThanOrEqualTo(Long value) {
            addCriterion("pack_id <=", value, "packId");
            return (Criteria) this;
        }

        public Criteria andPackIdIn(List<Long> values) {
            addCriterion("pack_id in", values, "packId");
            return (Criteria) this;
        }

        public Criteria andPackIdNotIn(List<Long> values) {
            addCriterion("pack_id not in", values, "packId");
            return (Criteria) this;
        }

        public Criteria andPackIdBetween(Long value1, Long value2) {
            addCriterion("pack_id between", value1, value2, "packId");
            return (Criteria) this;
        }

        public Criteria andPackIdNotBetween(Long value1, Long value2) {
            addCriterion("pack_id not between", value1, value2, "packId");
            return (Criteria) this;
        }

        public Criteria andTrackDateIsNull() {
            addCriterion("track_date is null");
            return (Criteria) this;
        }

        public Criteria andTrackDateIsNotNull() {
            addCriterion("track_date is not null");
            return (Criteria) this;
        }

        public Criteria andTrackDateEqualTo(Date value) {
            addCriterion("track_date =", value, "trackDate");
            return (Criteria) this;
        }

        public Criteria andTrackDateNotEqualTo(Date value) {
            addCriterion("track_date <>", value, "trackDate");
            return (Criteria) this;
        }

        public Criteria andTrackDateGreaterThan(Date value) {
            addCriterion("track_date >", value, "trackDate");
            return (Criteria) this;
        }

        public Criteria andTrackDateGreaterThanOrEqualTo(Date value) {
            addCriterion("track_date >=", value, "trackDate");
            return (Criteria) this;
        }

        public Criteria andTrackDateLessThan(Date value) {
            addCriterion("track_date <", value, "trackDate");
            return (Criteria) this;
        }

        public Criteria andTrackDateLessThanOrEqualTo(Date value) {
            addCriterion("track_date <=", value, "trackDate");
            return (Criteria) this;
        }

        public Criteria andTrackDateIn(List<Date> values) {
            addCriterion("track_date in", values, "trackDate");
            return (Criteria) this;
        }

        public Criteria andTrackDateNotIn(List<Date> values) {
            addCriterion("track_date not in", values, "trackDate");
            return (Criteria) this;
        }

        public Criteria andTrackDateBetween(Date value1, Date value2) {
            addCriterion("track_date between", value1, value2, "trackDate");
            return (Criteria) this;
        }

        public Criteria andTrackDateNotBetween(Date value1, Date value2) {
            addCriterion("track_date not between", value1, value2, "trackDate");
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

        public Criteria orShipIdIsNull() {
            addCriterion("ship_id is null");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orShipIdIsNotNull() {
            addCriterion("ship_id is not null");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orShipIdEqualTo(Long value) {
            addCriterion("ship_id =", value, "shipId");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orShipIdNotEqualTo(Long value) {
            addCriterion("ship_id <>", value, "shipId");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orShipIdGreaterThan(Long value) {
            addCriterion("ship_id >", value, "shipId");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orShipIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ship_id >=", value, "shipId");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orShipIdLessThan(Long value) {
            addCriterion("ship_id <", value, "shipId");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orShipIdLessThanOrEqualTo(Long value) {
            addCriterion("ship_id <=", value, "shipId");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orShipIdIn(List<Long> values) {
            addCriterion("ship_id in", values, "shipId");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orShipIdNotIn(List<Long> values) {
            addCriterion("ship_id not in", values, "shipId");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orShipIdBetween(Long value1, Long value2) {
            addCriterion("ship_id between", value1, value2, "shipId");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orShipIdNotBetween(Long value1, Long value2) {
            addCriterion("ship_id not between", value1, value2, "shipId");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orPackIdIsNull() {
            addCriterion("pack_id is null");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orPackIdIsNotNull() {
            addCriterion("pack_id is not null");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orPackIdEqualTo(Long value) {
            addCriterion("pack_id =", value, "packId");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orPackIdNotEqualTo(Long value) {
            addCriterion("pack_id <>", value, "packId");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orPackIdGreaterThan(Long value) {
            addCriterion("pack_id >", value, "packId");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orPackIdGreaterThanOrEqualTo(Long value) {
            addCriterion("pack_id >=", value, "packId");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orPackIdLessThan(Long value) {
            addCriterion("pack_id <", value, "packId");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orPackIdLessThanOrEqualTo(Long value) {
            addCriterion("pack_id <=", value, "packId");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orPackIdIn(List<Long> values) {
            addCriterion("pack_id in", values, "packId");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orPackIdNotIn(List<Long> values) {
            addCriterion("pack_id not in", values, "packId");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orPackIdBetween(Long value1, Long value2) {
            addCriterion("pack_id between", value1, value2, "packId");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orPackIdNotBetween(Long value1, Long value2) {
            addCriterion("pack_id not between", value1, value2, "packId");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orTrackDateIsNull() {
            addCriterion("track_date is null");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orTrackDateIsNotNull() {
            addCriterion("track_date is not null");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orTrackDateEqualTo(Date value) {
            addCriterion("track_date =", value, "trackDate");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orTrackDateNotEqualTo(Date value) {
            addCriterion("track_date <>", value, "trackDate");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orTrackDateGreaterThan(Date value) {
            addCriterion("track_date >", value, "trackDate");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orTrackDateGreaterThanOrEqualTo(Date value) {
            addCriterion("track_date >=", value, "trackDate");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orTrackDateLessThan(Date value) {
            addCriterion("track_date <", value, "trackDate");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orTrackDateLessThanOrEqualTo(Date value) {
            addCriterion("track_date <=", value, "trackDate");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orTrackDateIn(List<Date> values) {
            addCriterion("track_date in", values, "trackDate");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orTrackDateNotIn(List<Date> values) {
            addCriterion("track_date not in", values, "trackDate");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orTrackDateBetween(Date value1, Date value2) {
            addCriterion("track_date between", value1, value2, "trackDate");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orTrackDateNotBetween(Date value1, Date value2) {
            addCriterion("track_date not between", value1, value2, "trackDate");
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