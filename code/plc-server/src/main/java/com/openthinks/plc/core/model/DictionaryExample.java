package com.openthinks.plc.core.model;

import java.util.ArrayList;
import java.util.List;

public class DictionaryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DictionaryExample() {
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCateoryIsNull() {
            addCriterion("cateory is null");
            return (Criteria) this;
        }

        public Criteria andCateoryIsNotNull() {
            addCriterion("cateory is not null");
            return (Criteria) this;
        }

        public Criteria andCateoryEqualTo(String value) {
            addCriterion("cateory =", value, "cateory");
            return (Criteria) this;
        }

        public Criteria andCateoryNotEqualTo(String value) {
            addCriterion("cateory <>", value, "cateory");
            return (Criteria) this;
        }

        public Criteria andCateoryGreaterThan(String value) {
            addCriterion("cateory >", value, "cateory");
            return (Criteria) this;
        }

        public Criteria andCateoryGreaterThanOrEqualTo(String value) {
            addCriterion("cateory >=", value, "cateory");
            return (Criteria) this;
        }

        public Criteria andCateoryLessThan(String value) {
            addCriterion("cateory <", value, "cateory");
            return (Criteria) this;
        }

        public Criteria andCateoryLessThanOrEqualTo(String value) {
            addCriterion("cateory <=", value, "cateory");
            return (Criteria) this;
        }

        public Criteria andCateoryLike(String value) {
            addCriterion("cateory like", value, "cateory");
            return (Criteria) this;
        }

        public Criteria andCateoryNotLike(String value) {
            addCriterion("cateory not like", value, "cateory");
            return (Criteria) this;
        }

        public Criteria andCateoryIn(List<String> values) {
            addCriterion("cateory in", values, "cateory");
            return (Criteria) this;
        }

        public Criteria andCateoryNotIn(List<String> values) {
            addCriterion("cateory not in", values, "cateory");
            return (Criteria) this;
        }

        public Criteria andCateoryBetween(String value1, String value2) {
            addCriterion("cateory between", value1, value2, "cateory");
            return (Criteria) this;
        }

        public Criteria andCateoryNotBetween(String value1, String value2) {
            addCriterion("cateory not between", value1, value2, "cateory");
            return (Criteria) this;
        }

        public Criteria andItemNameIsNull() {
            addCriterion("item_name is null");
            return (Criteria) this;
        }

        public Criteria andItemNameIsNotNull() {
            addCriterion("item_name is not null");
            return (Criteria) this;
        }

        public Criteria andItemNameEqualTo(String value) {
            addCriterion("item_name =", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameNotEqualTo(String value) {
            addCriterion("item_name <>", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameGreaterThan(String value) {
            addCriterion("item_name >", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameGreaterThanOrEqualTo(String value) {
            addCriterion("item_name >=", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameLessThan(String value) {
            addCriterion("item_name <", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameLessThanOrEqualTo(String value) {
            addCriterion("item_name <=", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameLike(String value) {
            addCriterion("item_name like", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameNotLike(String value) {
            addCriterion("item_name not like", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameIn(List<String> values) {
            addCriterion("item_name in", values, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameNotIn(List<String> values) {
            addCriterion("item_name not in", values, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameBetween(String value1, String value2) {
            addCriterion("item_name between", value1, value2, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameNotBetween(String value1, String value2) {
            addCriterion("item_name not between", value1, value2, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemValueIsNull() {
            addCriterion("item_value is null");
            return (Criteria) this;
        }

        public Criteria andItemValueIsNotNull() {
            addCriterion("item_value is not null");
            return (Criteria) this;
        }

        public Criteria andItemValueEqualTo(Integer value) {
            addCriterion("item_value =", value, "itemValue");
            return (Criteria) this;
        }

        public Criteria andItemValueNotEqualTo(Integer value) {
            addCriterion("item_value <>", value, "itemValue");
            return (Criteria) this;
        }

        public Criteria andItemValueGreaterThan(Integer value) {
            addCriterion("item_value >", value, "itemValue");
            return (Criteria) this;
        }

        public Criteria andItemValueGreaterThanOrEqualTo(Integer value) {
            addCriterion("item_value >=", value, "itemValue");
            return (Criteria) this;
        }

        public Criteria andItemValueLessThan(Integer value) {
            addCriterion("item_value <", value, "itemValue");
            return (Criteria) this;
        }

        public Criteria andItemValueLessThanOrEqualTo(Integer value) {
            addCriterion("item_value <=", value, "itemValue");
            return (Criteria) this;
        }

        public Criteria andItemValueIn(List<Integer> values) {
            addCriterion("item_value in", values, "itemValue");
            return (Criteria) this;
        }

        public Criteria andItemValueNotIn(List<Integer> values) {
            addCriterion("item_value not in", values, "itemValue");
            return (Criteria) this;
        }

        public Criteria andItemValueBetween(Integer value1, Integer value2) {
            addCriterion("item_value between", value1, value2, "itemValue");
            return (Criteria) this;
        }

        public Criteria andItemValueNotBetween(Integer value1, Integer value2) {
            addCriterion("item_value not between", value1, value2, "itemValue");
            return (Criteria) this;
        }

        public Criteria andItemDescIsNull() {
            addCriterion("item_desc is null");
            return (Criteria) this;
        }

        public Criteria andItemDescIsNotNull() {
            addCriterion("item_desc is not null");
            return (Criteria) this;
        }

        public Criteria andItemDescEqualTo(String value) {
            addCriterion("item_desc =", value, "itemDesc");
            return (Criteria) this;
        }

        public Criteria andItemDescNotEqualTo(String value) {
            addCriterion("item_desc <>", value, "itemDesc");
            return (Criteria) this;
        }

        public Criteria andItemDescGreaterThan(String value) {
            addCriterion("item_desc >", value, "itemDesc");
            return (Criteria) this;
        }

        public Criteria andItemDescGreaterThanOrEqualTo(String value) {
            addCriterion("item_desc >=", value, "itemDesc");
            return (Criteria) this;
        }

        public Criteria andItemDescLessThan(String value) {
            addCriterion("item_desc <", value, "itemDesc");
            return (Criteria) this;
        }

        public Criteria andItemDescLessThanOrEqualTo(String value) {
            addCriterion("item_desc <=", value, "itemDesc");
            return (Criteria) this;
        }

        public Criteria andItemDescLike(String value) {
            addCriterion("item_desc like", value, "itemDesc");
            return (Criteria) this;
        }

        public Criteria andItemDescNotLike(String value) {
            addCriterion("item_desc not like", value, "itemDesc");
            return (Criteria) this;
        }

        public Criteria andItemDescIn(List<String> values) {
            addCriterion("item_desc in", values, "itemDesc");
            return (Criteria) this;
        }

        public Criteria andItemDescNotIn(List<String> values) {
            addCriterion("item_desc not in", values, "itemDesc");
            return (Criteria) this;
        }

        public Criteria andItemDescBetween(String value1, String value2) {
            addCriterion("item_desc between", value1, value2, "itemDesc");
            return (Criteria) this;
        }

        public Criteria andItemDescNotBetween(String value1, String value2) {
            addCriterion("item_desc not between", value1, value2, "itemDesc");
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

        public Criteria orIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orCateoryIsNull() {
            addCriterion("cateory is null");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orCateoryIsNotNull() {
            addCriterion("cateory is not null");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orCateoryEqualTo(String value) {
            addCriterion("cateory =", value, "cateory");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orCateoryNotEqualTo(String value) {
            addCriterion("cateory <>", value, "cateory");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orCateoryGreaterThan(String value) {
            addCriterion("cateory >", value, "cateory");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orCateoryGreaterThanOrEqualTo(String value) {
            addCriterion("cateory >=", value, "cateory");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orCateoryLessThan(String value) {
            addCriterion("cateory <", value, "cateory");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orCateoryLessThanOrEqualTo(String value) {
            addCriterion("cateory <=", value, "cateory");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orCateoryLike(String value) {
            addCriterion("cateory like", value, "cateory");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orCateoryNotLike(String value) {
            addCriterion("cateory not like", value, "cateory");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orCateoryIn(List<String> values) {
            addCriterion("cateory in", values, "cateory");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orCateoryNotIn(List<String> values) {
            addCriterion("cateory not in", values, "cateory");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orCateoryBetween(String value1, String value2) {
            addCriterion("cateory between", value1, value2, "cateory");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orCateoryNotBetween(String value1, String value2) {
            addCriterion("cateory not between", value1, value2, "cateory");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orItemNameIsNull() {
            addCriterion("item_name is null");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orItemNameIsNotNull() {
            addCriterion("item_name is not null");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orItemNameEqualTo(String value) {
            addCriterion("item_name =", value, "itemName");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orItemNameNotEqualTo(String value) {
            addCriterion("item_name <>", value, "itemName");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orItemNameGreaterThan(String value) {
            addCriterion("item_name >", value, "itemName");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orItemNameGreaterThanOrEqualTo(String value) {
            addCriterion("item_name >=", value, "itemName");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orItemNameLessThan(String value) {
            addCriterion("item_name <", value, "itemName");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orItemNameLessThanOrEqualTo(String value) {
            addCriterion("item_name <=", value, "itemName");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orItemNameLike(String value) {
            addCriterion("item_name like", value, "itemName");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orItemNameNotLike(String value) {
            addCriterion("item_name not like", value, "itemName");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orItemNameIn(List<String> values) {
            addCriterion("item_name in", values, "itemName");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orItemNameNotIn(List<String> values) {
            addCriterion("item_name not in", values, "itemName");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orItemNameBetween(String value1, String value2) {
            addCriterion("item_name between", value1, value2, "itemName");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orItemNameNotBetween(String value1, String value2) {
            addCriterion("item_name not between", value1, value2, "itemName");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orItemValueIsNull() {
            addCriterion("item_value is null");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orItemValueIsNotNull() {
            addCriterion("item_value is not null");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orItemValueEqualTo(Integer value) {
            addCriterion("item_value =", value, "itemValue");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orItemValueNotEqualTo(Integer value) {
            addCriterion("item_value <>", value, "itemValue");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orItemValueGreaterThan(Integer value) {
            addCriterion("item_value >", value, "itemValue");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orItemValueGreaterThanOrEqualTo(Integer value) {
            addCriterion("item_value >=", value, "itemValue");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orItemValueLessThan(Integer value) {
            addCriterion("item_value <", value, "itemValue");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orItemValueLessThanOrEqualTo(Integer value) {
            addCriterion("item_value <=", value, "itemValue");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orItemValueIn(List<Integer> values) {
            addCriterion("item_value in", values, "itemValue");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orItemValueNotIn(List<Integer> values) {
            addCriterion("item_value not in", values, "itemValue");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orItemValueBetween(Integer value1, Integer value2) {
            addCriterion("item_value between", value1, value2, "itemValue");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orItemValueNotBetween(Integer value1, Integer value2) {
            addCriterion("item_value not between", value1, value2, "itemValue");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orItemDescIsNull() {
            addCriterion("item_desc is null");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orItemDescIsNotNull() {
            addCriterion("item_desc is not null");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orItemDescEqualTo(String value) {
            addCriterion("item_desc =", value, "itemDesc");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orItemDescNotEqualTo(String value) {
            addCriterion("item_desc <>", value, "itemDesc");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orItemDescGreaterThan(String value) {
            addCriterion("item_desc >", value, "itemDesc");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orItemDescGreaterThanOrEqualTo(String value) {
            addCriterion("item_desc >=", value, "itemDesc");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orItemDescLessThan(String value) {
            addCriterion("item_desc <", value, "itemDesc");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orItemDescLessThanOrEqualTo(String value) {
            addCriterion("item_desc <=", value, "itemDesc");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orItemDescLike(String value) {
            addCriterion("item_desc like", value, "itemDesc");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orItemDescNotLike(String value) {
            addCriterion("item_desc not like", value, "itemDesc");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orItemDescIn(List<String> values) {
            addCriterion("item_desc in", values, "itemDesc");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orItemDescNotIn(List<String> values) {
            addCriterion("item_desc not in", values, "itemDesc");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orItemDescBetween(String value1, String value2) {
            addCriterion("item_desc between", value1, value2, "itemDesc");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orItemDescNotBetween(String value1, String value2) {
            addCriterion("item_desc not between", value1, value2, "itemDesc");
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