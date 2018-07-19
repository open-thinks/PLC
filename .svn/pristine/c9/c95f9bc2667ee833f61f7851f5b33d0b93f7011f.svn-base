package com.openthinks.plc.core.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ShippingsVwExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ShippingsVwExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andShipDateIsNull() {
            addCriterion("ship_date is null");
            return (Criteria) this;
        }

        public Criteria andShipDateIsNotNull() {
            addCriterion("ship_date is not null");
            return (Criteria) this;
        }

        public Criteria andShipDateEqualTo(Date value) {
            addCriterionForJDBCDate("ship_date =", value, "shipDate");
            return (Criteria) this;
        }

        public Criteria andShipDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("ship_date <>", value, "shipDate");
            return (Criteria) this;
        }

        public Criteria andShipDateGreaterThan(Date value) {
            addCriterionForJDBCDate("ship_date >", value, "shipDate");
            return (Criteria) this;
        }

        public Criteria andShipDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ship_date >=", value, "shipDate");
            return (Criteria) this;
        }

        public Criteria andShipDateLessThan(Date value) {
            addCriterionForJDBCDate("ship_date <", value, "shipDate");
            return (Criteria) this;
        }

        public Criteria andShipDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ship_date <=", value, "shipDate");
            return (Criteria) this;
        }

        public Criteria andShipDateIn(List<Date> values) {
            addCriterionForJDBCDate("ship_date in", values, "shipDate");
            return (Criteria) this;
        }

        public Criteria andShipDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("ship_date not in", values, "shipDate");
            return (Criteria) this;
        }

        public Criteria andShipDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ship_date between", value1, value2, "shipDate");
            return (Criteria) this;
        }

        public Criteria andShipDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ship_date not between", value1, value2, "shipDate");
            return (Criteria) this;
        }

        public Criteria andVehicleIdIsNull() {
            addCriterion("vehicle_id is null");
            return (Criteria) this;
        }

        public Criteria andVehicleIdIsNotNull() {
            addCriterion("vehicle_id is not null");
            return (Criteria) this;
        }

        public Criteria andVehicleIdEqualTo(Long value) {
            addCriterion("vehicle_id =", value, "vehicleId");
            return (Criteria) this;
        }

        public Criteria andVehicleIdNotEqualTo(Long value) {
            addCriterion("vehicle_id <>", value, "vehicleId");
            return (Criteria) this;
        }

        public Criteria andVehicleIdGreaterThan(Long value) {
            addCriterion("vehicle_id >", value, "vehicleId");
            return (Criteria) this;
        }

        public Criteria andVehicleIdGreaterThanOrEqualTo(Long value) {
            addCriterion("vehicle_id >=", value, "vehicleId");
            return (Criteria) this;
        }

        public Criteria andVehicleIdLessThan(Long value) {
            addCriterion("vehicle_id <", value, "vehicleId");
            return (Criteria) this;
        }

        public Criteria andVehicleIdLessThanOrEqualTo(Long value) {
            addCriterion("vehicle_id <=", value, "vehicleId");
            return (Criteria) this;
        }

        public Criteria andVehicleIdIn(List<Long> values) {
            addCriterion("vehicle_id in", values, "vehicleId");
            return (Criteria) this;
        }

        public Criteria andVehicleIdNotIn(List<Long> values) {
            addCriterion("vehicle_id not in", values, "vehicleId");
            return (Criteria) this;
        }

        public Criteria andVehicleIdBetween(Long value1, Long value2) {
            addCriterion("vehicle_id between", value1, value2, "vehicleId");
            return (Criteria) this;
        }

        public Criteria andVehicleIdNotBetween(Long value1, Long value2) {
            addCriterion("vehicle_id not between", value1, value2, "vehicleId");
            return (Criteria) this;
        }

        public Criteria andFromIdIsNull() {
            addCriterion("from_id is null");
            return (Criteria) this;
        }

        public Criteria andFromIdIsNotNull() {
            addCriterion("from_id is not null");
            return (Criteria) this;
        }

        public Criteria andFromIdEqualTo(Long value) {
            addCriterion("from_id =", value, "fromId");
            return (Criteria) this;
        }

        public Criteria andFromIdNotEqualTo(Long value) {
            addCriterion("from_id <>", value, "fromId");
            return (Criteria) this;
        }

        public Criteria andFromIdGreaterThan(Long value) {
            addCriterion("from_id >", value, "fromId");
            return (Criteria) this;
        }

        public Criteria andFromIdGreaterThanOrEqualTo(Long value) {
            addCriterion("from_id >=", value, "fromId");
            return (Criteria) this;
        }

        public Criteria andFromIdLessThan(Long value) {
            addCriterion("from_id <", value, "fromId");
            return (Criteria) this;
        }

        public Criteria andFromIdLessThanOrEqualTo(Long value) {
            addCriterion("from_id <=", value, "fromId");
            return (Criteria) this;
        }

        public Criteria andFromIdIn(List<Long> values) {
            addCriterion("from_id in", values, "fromId");
            return (Criteria) this;
        }

        public Criteria andFromIdNotIn(List<Long> values) {
            addCriterion("from_id not in", values, "fromId");
            return (Criteria) this;
        }

        public Criteria andFromIdBetween(Long value1, Long value2) {
            addCriterion("from_id between", value1, value2, "fromId");
            return (Criteria) this;
        }

        public Criteria andFromIdNotBetween(Long value1, Long value2) {
            addCriterion("from_id not between", value1, value2, "fromId");
            return (Criteria) this;
        }

        public Criteria andToIdIsNull() {
            addCriterion("to_id is null");
            return (Criteria) this;
        }

        public Criteria andToIdIsNotNull() {
            addCriterion("to_id is not null");
            return (Criteria) this;
        }

        public Criteria andToIdEqualTo(Long value) {
            addCriterion("to_id =", value, "toId");
            return (Criteria) this;
        }

        public Criteria andToIdNotEqualTo(Long value) {
            addCriterion("to_id <>", value, "toId");
            return (Criteria) this;
        }

        public Criteria andToIdGreaterThan(Long value) {
            addCriterion("to_id >", value, "toId");
            return (Criteria) this;
        }

        public Criteria andToIdGreaterThanOrEqualTo(Long value) {
            addCriterion("to_id >=", value, "toId");
            return (Criteria) this;
        }

        public Criteria andToIdLessThan(Long value) {
            addCriterion("to_id <", value, "toId");
            return (Criteria) this;
        }

        public Criteria andToIdLessThanOrEqualTo(Long value) {
            addCriterion("to_id <=", value, "toId");
            return (Criteria) this;
        }

        public Criteria andToIdIn(List<Long> values) {
            addCriterion("to_id in", values, "toId");
            return (Criteria) this;
        }

        public Criteria andToIdNotIn(List<Long> values) {
            addCriterion("to_id not in", values, "toId");
            return (Criteria) this;
        }

        public Criteria andToIdBetween(Long value1, Long value2) {
            addCriterion("to_id between", value1, value2, "toId");
            return (Criteria) this;
        }

        public Criteria andToIdNotBetween(Long value1, Long value2) {
            addCriterion("to_id not between", value1, value2, "toId");
            return (Criteria) this;
        }

        public Criteria andShipStatusIsNull() {
            addCriterion("ship_status is null");
            return (Criteria) this;
        }

        public Criteria andShipStatusIsNotNull() {
            addCriterion("ship_status is not null");
            return (Criteria) this;
        }

        public Criteria andShipStatusEqualTo(Byte value) {
            addCriterion("ship_status =", value, "shipStatus");
            return (Criteria) this;
        }

        public Criteria andShipStatusNotEqualTo(Byte value) {
            addCriterion("ship_status <>", value, "shipStatus");
            return (Criteria) this;
        }

        public Criteria andShipStatusGreaterThan(Byte value) {
            addCriterion("ship_status >", value, "shipStatus");
            return (Criteria) this;
        }

        public Criteria andShipStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("ship_status >=", value, "shipStatus");
            return (Criteria) this;
        }

        public Criteria andShipStatusLessThan(Byte value) {
            addCriterion("ship_status <", value, "shipStatus");
            return (Criteria) this;
        }

        public Criteria andShipStatusLessThanOrEqualTo(Byte value) {
            addCriterion("ship_status <=", value, "shipStatus");
            return (Criteria) this;
        }

        public Criteria andShipStatusIn(List<Byte> values) {
            addCriterion("ship_status in", values, "shipStatus");
            return (Criteria) this;
        }

        public Criteria andShipStatusNotIn(List<Byte> values) {
            addCriterion("ship_status not in", values, "shipStatus");
            return (Criteria) this;
        }

        public Criteria andShipStatusBetween(Byte value1, Byte value2) {
            addCriterion("ship_status between", value1, value2, "shipStatus");
            return (Criteria) this;
        }

        public Criteria andShipStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("ship_status not between", value1, value2, "shipStatus");
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

        public Criteria andLastModifyIsNull() {
            addCriterion("last_modify is null");
            return (Criteria) this;
        }

        public Criteria andLastModifyIsNotNull() {
            addCriterion("last_modify is not null");
            return (Criteria) this;
        }

        public Criteria andLastModifyEqualTo(Date value) {
            addCriterion("last_modify =", value, "lastModify");
            return (Criteria) this;
        }

        public Criteria andLastModifyNotEqualTo(Date value) {
            addCriterion("last_modify <>", value, "lastModify");
            return (Criteria) this;
        }

        public Criteria andLastModifyGreaterThan(Date value) {
            addCriterion("last_modify >", value, "lastModify");
            return (Criteria) this;
        }

        public Criteria andLastModifyGreaterThanOrEqualTo(Date value) {
            addCriterion("last_modify >=", value, "lastModify");
            return (Criteria) this;
        }

        public Criteria andLastModifyLessThan(Date value) {
            addCriterion("last_modify <", value, "lastModify");
            return (Criteria) this;
        }

        public Criteria andLastModifyLessThanOrEqualTo(Date value) {
            addCriterion("last_modify <=", value, "lastModify");
            return (Criteria) this;
        }

        public Criteria andLastModifyIn(List<Date> values) {
            addCriterion("last_modify in", values, "lastModify");
            return (Criteria) this;
        }

        public Criteria andLastModifyNotIn(List<Date> values) {
            addCriterion("last_modify not in", values, "lastModify");
            return (Criteria) this;
        }

        public Criteria andLastModifyBetween(Date value1, Date value2) {
            addCriterion("last_modify between", value1, value2, "lastModify");
            return (Criteria) this;
        }

        public Criteria andLastModifyNotBetween(Date value1, Date value2) {
            addCriterion("last_modify not between", value1, value2, "lastModify");
            return (Criteria) this;
        }

        public Criteria andFromNameIsNull() {
            addCriterion("from_name is null");
            return (Criteria) this;
        }

        public Criteria andFromNameIsNotNull() {
            addCriterion("from_name is not null");
            return (Criteria) this;
        }

        public Criteria andFromNameEqualTo(String value) {
            addCriterion("from_name =", value, "fromName");
            return (Criteria) this;
        }

        public Criteria andFromNameNotEqualTo(String value) {
            addCriterion("from_name <>", value, "fromName");
            return (Criteria) this;
        }

        public Criteria andFromNameGreaterThan(String value) {
            addCriterion("from_name >", value, "fromName");
            return (Criteria) this;
        }

        public Criteria andFromNameGreaterThanOrEqualTo(String value) {
            addCriterion("from_name >=", value, "fromName");
            return (Criteria) this;
        }

        public Criteria andFromNameLessThan(String value) {
            addCriterion("from_name <", value, "fromName");
            return (Criteria) this;
        }

        public Criteria andFromNameLessThanOrEqualTo(String value) {
            addCriterion("from_name <=", value, "fromName");
            return (Criteria) this;
        }

        public Criteria andFromNameLike(String value) {
            addCriterion("from_name like", value, "fromName");
            return (Criteria) this;
        }

        public Criteria andFromNameNotLike(String value) {
            addCriterion("from_name not like", value, "fromName");
            return (Criteria) this;
        }

        public Criteria andFromNameIn(List<String> values) {
            addCriterion("from_name in", values, "fromName");
            return (Criteria) this;
        }

        public Criteria andFromNameNotIn(List<String> values) {
            addCriterion("from_name not in", values, "fromName");
            return (Criteria) this;
        }

        public Criteria andFromNameBetween(String value1, String value2) {
            addCriterion("from_name between", value1, value2, "fromName");
            return (Criteria) this;
        }

        public Criteria andFromNameNotBetween(String value1, String value2) {
            addCriterion("from_name not between", value1, value2, "fromName");
            return (Criteria) this;
        }

        public Criteria andFromLatitudeIsNull() {
            addCriterion("from_latitude is null");
            return (Criteria) this;
        }

        public Criteria andFromLatitudeIsNotNull() {
            addCriterion("from_latitude is not null");
            return (Criteria) this;
        }

        public Criteria andFromLatitudeEqualTo(String value) {
            addCriterion("from_latitude =", value, "fromLatitude");
            return (Criteria) this;
        }

        public Criteria andFromLatitudeNotEqualTo(String value) {
            addCriterion("from_latitude <>", value, "fromLatitude");
            return (Criteria) this;
        }

        public Criteria andFromLatitudeGreaterThan(String value) {
            addCriterion("from_latitude >", value, "fromLatitude");
            return (Criteria) this;
        }

        public Criteria andFromLatitudeGreaterThanOrEqualTo(String value) {
            addCriterion("from_latitude >=", value, "fromLatitude");
            return (Criteria) this;
        }

        public Criteria andFromLatitudeLessThan(String value) {
            addCriterion("from_latitude <", value, "fromLatitude");
            return (Criteria) this;
        }

        public Criteria andFromLatitudeLessThanOrEqualTo(String value) {
            addCriterion("from_latitude <=", value, "fromLatitude");
            return (Criteria) this;
        }

        public Criteria andFromLatitudeLike(String value) {
            addCriterion("from_latitude like", value, "fromLatitude");
            return (Criteria) this;
        }

        public Criteria andFromLatitudeNotLike(String value) {
            addCriterion("from_latitude not like", value, "fromLatitude");
            return (Criteria) this;
        }

        public Criteria andFromLatitudeIn(List<String> values) {
            addCriterion("from_latitude in", values, "fromLatitude");
            return (Criteria) this;
        }

        public Criteria andFromLatitudeNotIn(List<String> values) {
            addCriterion("from_latitude not in", values, "fromLatitude");
            return (Criteria) this;
        }

        public Criteria andFromLatitudeBetween(String value1, String value2) {
            addCriterion("from_latitude between", value1, value2, "fromLatitude");
            return (Criteria) this;
        }

        public Criteria andFromLatitudeNotBetween(String value1, String value2) {
            addCriterion("from_latitude not between", value1, value2, "fromLatitude");
            return (Criteria) this;
        }

        public Criteria andFromLongitudeIsNull() {
            addCriterion("from_longitude is null");
            return (Criteria) this;
        }

        public Criteria andFromLongitudeIsNotNull() {
            addCriterion("from_longitude is not null");
            return (Criteria) this;
        }

        public Criteria andFromLongitudeEqualTo(String value) {
            addCriterion("from_longitude =", value, "fromLongitude");
            return (Criteria) this;
        }

        public Criteria andFromLongitudeNotEqualTo(String value) {
            addCriterion("from_longitude <>", value, "fromLongitude");
            return (Criteria) this;
        }

        public Criteria andFromLongitudeGreaterThan(String value) {
            addCriterion("from_longitude >", value, "fromLongitude");
            return (Criteria) this;
        }

        public Criteria andFromLongitudeGreaterThanOrEqualTo(String value) {
            addCriterion("from_longitude >=", value, "fromLongitude");
            return (Criteria) this;
        }

        public Criteria andFromLongitudeLessThan(String value) {
            addCriterion("from_longitude <", value, "fromLongitude");
            return (Criteria) this;
        }

        public Criteria andFromLongitudeLessThanOrEqualTo(String value) {
            addCriterion("from_longitude <=", value, "fromLongitude");
            return (Criteria) this;
        }

        public Criteria andFromLongitudeLike(String value) {
            addCriterion("from_longitude like", value, "fromLongitude");
            return (Criteria) this;
        }

        public Criteria andFromLongitudeNotLike(String value) {
            addCriterion("from_longitude not like", value, "fromLongitude");
            return (Criteria) this;
        }

        public Criteria andFromLongitudeIn(List<String> values) {
            addCriterion("from_longitude in", values, "fromLongitude");
            return (Criteria) this;
        }

        public Criteria andFromLongitudeNotIn(List<String> values) {
            addCriterion("from_longitude not in", values, "fromLongitude");
            return (Criteria) this;
        }

        public Criteria andFromLongitudeBetween(String value1, String value2) {
            addCriterion("from_longitude between", value1, value2, "fromLongitude");
            return (Criteria) this;
        }

        public Criteria andFromLongitudeNotBetween(String value1, String value2) {
            addCriterion("from_longitude not between", value1, value2, "fromLongitude");
            return (Criteria) this;
        }

        public Criteria andFromCoordTypeIsNull() {
            addCriterion("from_coord_type is null");
            return (Criteria) this;
        }

        public Criteria andFromCoordTypeIsNotNull() {
            addCriterion("from_coord_type is not null");
            return (Criteria) this;
        }

        public Criteria andFromCoordTypeEqualTo(Byte value) {
            addCriterion("from_coord_type =", value, "fromCoordType");
            return (Criteria) this;
        }

        public Criteria andFromCoordTypeNotEqualTo(Byte value) {
            addCriterion("from_coord_type <>", value, "fromCoordType");
            return (Criteria) this;
        }

        public Criteria andFromCoordTypeGreaterThan(Byte value) {
            addCriterion("from_coord_type >", value, "fromCoordType");
            return (Criteria) this;
        }

        public Criteria andFromCoordTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("from_coord_type >=", value, "fromCoordType");
            return (Criteria) this;
        }

        public Criteria andFromCoordTypeLessThan(Byte value) {
            addCriterion("from_coord_type <", value, "fromCoordType");
            return (Criteria) this;
        }

        public Criteria andFromCoordTypeLessThanOrEqualTo(Byte value) {
            addCriterion("from_coord_type <=", value, "fromCoordType");
            return (Criteria) this;
        }

        public Criteria andFromCoordTypeIn(List<Byte> values) {
            addCriterion("from_coord_type in", values, "fromCoordType");
            return (Criteria) this;
        }

        public Criteria andFromCoordTypeNotIn(List<Byte> values) {
            addCriterion("from_coord_type not in", values, "fromCoordType");
            return (Criteria) this;
        }

        public Criteria andFromCoordTypeBetween(Byte value1, Byte value2) {
            addCriterion("from_coord_type between", value1, value2, "fromCoordType");
            return (Criteria) this;
        }

        public Criteria andFromCoordTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("from_coord_type not between", value1, value2, "fromCoordType");
            return (Criteria) this;
        }

        public Criteria andFromLocationTypeIsNull() {
            addCriterion("from_location_type is null");
            return (Criteria) this;
        }

        public Criteria andFromLocationTypeIsNotNull() {
            addCriterion("from_location_type is not null");
            return (Criteria) this;
        }

        public Criteria andFromLocationTypeEqualTo(Byte value) {
            addCriterion("from_location_type =", value, "fromLocationType");
            return (Criteria) this;
        }

        public Criteria andFromLocationTypeNotEqualTo(Byte value) {
            addCriterion("from_location_type <>", value, "fromLocationType");
            return (Criteria) this;
        }

        public Criteria andFromLocationTypeGreaterThan(Byte value) {
            addCriterion("from_location_type >", value, "fromLocationType");
            return (Criteria) this;
        }

        public Criteria andFromLocationTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("from_location_type >=", value, "fromLocationType");
            return (Criteria) this;
        }

        public Criteria andFromLocationTypeLessThan(Byte value) {
            addCriterion("from_location_type <", value, "fromLocationType");
            return (Criteria) this;
        }

        public Criteria andFromLocationTypeLessThanOrEqualTo(Byte value) {
            addCriterion("from_location_type <=", value, "fromLocationType");
            return (Criteria) this;
        }

        public Criteria andFromLocationTypeIn(List<Byte> values) {
            addCriterion("from_location_type in", values, "fromLocationType");
            return (Criteria) this;
        }

        public Criteria andFromLocationTypeNotIn(List<Byte> values) {
            addCriterion("from_location_type not in", values, "fromLocationType");
            return (Criteria) this;
        }

        public Criteria andFromLocationTypeBetween(Byte value1, Byte value2) {
            addCriterion("from_location_type between", value1, value2, "fromLocationType");
            return (Criteria) this;
        }

        public Criteria andFromLocationTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("from_location_type not between", value1, value2, "fromLocationType");
            return (Criteria) this;
        }

        public Criteria andFromProvinceIsNull() {
            addCriterion("from_province is null");
            return (Criteria) this;
        }

        public Criteria andFromProvinceIsNotNull() {
            addCriterion("from_province is not null");
            return (Criteria) this;
        }

        public Criteria andFromProvinceEqualTo(String value) {
            addCriterion("from_province =", value, "fromProvince");
            return (Criteria) this;
        }

        public Criteria andFromProvinceNotEqualTo(String value) {
            addCriterion("from_province <>", value, "fromProvince");
            return (Criteria) this;
        }

        public Criteria andFromProvinceGreaterThan(String value) {
            addCriterion("from_province >", value, "fromProvince");
            return (Criteria) this;
        }

        public Criteria andFromProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("from_province >=", value, "fromProvince");
            return (Criteria) this;
        }

        public Criteria andFromProvinceLessThan(String value) {
            addCriterion("from_province <", value, "fromProvince");
            return (Criteria) this;
        }

        public Criteria andFromProvinceLessThanOrEqualTo(String value) {
            addCriterion("from_province <=", value, "fromProvince");
            return (Criteria) this;
        }

        public Criteria andFromProvinceLike(String value) {
            addCriterion("from_province like", value, "fromProvince");
            return (Criteria) this;
        }

        public Criteria andFromProvinceNotLike(String value) {
            addCriterion("from_province not like", value, "fromProvince");
            return (Criteria) this;
        }

        public Criteria andFromProvinceIn(List<String> values) {
            addCriterion("from_province in", values, "fromProvince");
            return (Criteria) this;
        }

        public Criteria andFromProvinceNotIn(List<String> values) {
            addCriterion("from_province not in", values, "fromProvince");
            return (Criteria) this;
        }

        public Criteria andFromProvinceBetween(String value1, String value2) {
            addCriterion("from_province between", value1, value2, "fromProvince");
            return (Criteria) this;
        }

        public Criteria andFromProvinceNotBetween(String value1, String value2) {
            addCriterion("from_province not between", value1, value2, "fromProvince");
            return (Criteria) this;
        }

        public Criteria andFromCityIsNull() {
            addCriterion("from_city is null");
            return (Criteria) this;
        }

        public Criteria andFromCityIsNotNull() {
            addCriterion("from_city is not null");
            return (Criteria) this;
        }

        public Criteria andFromCityEqualTo(String value) {
            addCriterion("from_city =", value, "fromCity");
            return (Criteria) this;
        }

        public Criteria andFromCityNotEqualTo(String value) {
            addCriterion("from_city <>", value, "fromCity");
            return (Criteria) this;
        }

        public Criteria andFromCityGreaterThan(String value) {
            addCriterion("from_city >", value, "fromCity");
            return (Criteria) this;
        }

        public Criteria andFromCityGreaterThanOrEqualTo(String value) {
            addCriterion("from_city >=", value, "fromCity");
            return (Criteria) this;
        }

        public Criteria andFromCityLessThan(String value) {
            addCriterion("from_city <", value, "fromCity");
            return (Criteria) this;
        }

        public Criteria andFromCityLessThanOrEqualTo(String value) {
            addCriterion("from_city <=", value, "fromCity");
            return (Criteria) this;
        }

        public Criteria andFromCityLike(String value) {
            addCriterion("from_city like", value, "fromCity");
            return (Criteria) this;
        }

        public Criteria andFromCityNotLike(String value) {
            addCriterion("from_city not like", value, "fromCity");
            return (Criteria) this;
        }

        public Criteria andFromCityIn(List<String> values) {
            addCriterion("from_city in", values, "fromCity");
            return (Criteria) this;
        }

        public Criteria andFromCityNotIn(List<String> values) {
            addCriterion("from_city not in", values, "fromCity");
            return (Criteria) this;
        }

        public Criteria andFromCityBetween(String value1, String value2) {
            addCriterion("from_city between", value1, value2, "fromCity");
            return (Criteria) this;
        }

        public Criteria andFromCityNotBetween(String value1, String value2) {
            addCriterion("from_city not between", value1, value2, "fromCity");
            return (Criteria) this;
        }

        public Criteria andFromAddressIsNull() {
            addCriterion("from_address is null");
            return (Criteria) this;
        }

        public Criteria andFromAddressIsNotNull() {
            addCriterion("from_address is not null");
            return (Criteria) this;
        }

        public Criteria andFromAddressEqualTo(String value) {
            addCriterion("from_address =", value, "fromAddress");
            return (Criteria) this;
        }

        public Criteria andFromAddressNotEqualTo(String value) {
            addCriterion("from_address <>", value, "fromAddress");
            return (Criteria) this;
        }

        public Criteria andFromAddressGreaterThan(String value) {
            addCriterion("from_address >", value, "fromAddress");
            return (Criteria) this;
        }

        public Criteria andFromAddressGreaterThanOrEqualTo(String value) {
            addCriterion("from_address >=", value, "fromAddress");
            return (Criteria) this;
        }

        public Criteria andFromAddressLessThan(String value) {
            addCriterion("from_address <", value, "fromAddress");
            return (Criteria) this;
        }

        public Criteria andFromAddressLessThanOrEqualTo(String value) {
            addCriterion("from_address <=", value, "fromAddress");
            return (Criteria) this;
        }

        public Criteria andFromAddressLike(String value) {
            addCriterion("from_address like", value, "fromAddress");
            return (Criteria) this;
        }

        public Criteria andFromAddressNotLike(String value) {
            addCriterion("from_address not like", value, "fromAddress");
            return (Criteria) this;
        }

        public Criteria andFromAddressIn(List<String> values) {
            addCriterion("from_address in", values, "fromAddress");
            return (Criteria) this;
        }

        public Criteria andFromAddressNotIn(List<String> values) {
            addCriterion("from_address not in", values, "fromAddress");
            return (Criteria) this;
        }

        public Criteria andFromAddressBetween(String value1, String value2) {
            addCriterion("from_address between", value1, value2, "fromAddress");
            return (Criteria) this;
        }

        public Criteria andFromAddressNotBetween(String value1, String value2) {
            addCriterion("from_address not between", value1, value2, "fromAddress");
            return (Criteria) this;
        }

        public Criteria andToNameIsNull() {
            addCriterion("to_name is null");
            return (Criteria) this;
        }

        public Criteria andToNameIsNotNull() {
            addCriterion("to_name is not null");
            return (Criteria) this;
        }

        public Criteria andToNameEqualTo(String value) {
            addCriterion("to_name =", value, "toName");
            return (Criteria) this;
        }

        public Criteria andToNameNotEqualTo(String value) {
            addCriterion("to_name <>", value, "toName");
            return (Criteria) this;
        }

        public Criteria andToNameGreaterThan(String value) {
            addCriterion("to_name >", value, "toName");
            return (Criteria) this;
        }

        public Criteria andToNameGreaterThanOrEqualTo(String value) {
            addCriterion("to_name >=", value, "toName");
            return (Criteria) this;
        }

        public Criteria andToNameLessThan(String value) {
            addCriterion("to_name <", value, "toName");
            return (Criteria) this;
        }

        public Criteria andToNameLessThanOrEqualTo(String value) {
            addCriterion("to_name <=", value, "toName");
            return (Criteria) this;
        }

        public Criteria andToNameLike(String value) {
            addCriterion("to_name like", value, "toName");
            return (Criteria) this;
        }

        public Criteria andToNameNotLike(String value) {
            addCriterion("to_name not like", value, "toName");
            return (Criteria) this;
        }

        public Criteria andToNameIn(List<String> values) {
            addCriterion("to_name in", values, "toName");
            return (Criteria) this;
        }

        public Criteria andToNameNotIn(List<String> values) {
            addCriterion("to_name not in", values, "toName");
            return (Criteria) this;
        }

        public Criteria andToNameBetween(String value1, String value2) {
            addCriterion("to_name between", value1, value2, "toName");
            return (Criteria) this;
        }

        public Criteria andToNameNotBetween(String value1, String value2) {
            addCriterion("to_name not between", value1, value2, "toName");
            return (Criteria) this;
        }

        public Criteria andToLatitudeIsNull() {
            addCriterion("to_latitude is null");
            return (Criteria) this;
        }

        public Criteria andToLatitudeIsNotNull() {
            addCriterion("to_latitude is not null");
            return (Criteria) this;
        }

        public Criteria andToLatitudeEqualTo(String value) {
            addCriterion("to_latitude =", value, "toLatitude");
            return (Criteria) this;
        }

        public Criteria andToLatitudeNotEqualTo(String value) {
            addCriterion("to_latitude <>", value, "toLatitude");
            return (Criteria) this;
        }

        public Criteria andToLatitudeGreaterThan(String value) {
            addCriterion("to_latitude >", value, "toLatitude");
            return (Criteria) this;
        }

        public Criteria andToLatitudeGreaterThanOrEqualTo(String value) {
            addCriterion("to_latitude >=", value, "toLatitude");
            return (Criteria) this;
        }

        public Criteria andToLatitudeLessThan(String value) {
            addCriterion("to_latitude <", value, "toLatitude");
            return (Criteria) this;
        }

        public Criteria andToLatitudeLessThanOrEqualTo(String value) {
            addCriterion("to_latitude <=", value, "toLatitude");
            return (Criteria) this;
        }

        public Criteria andToLatitudeLike(String value) {
            addCriterion("to_latitude like", value, "toLatitude");
            return (Criteria) this;
        }

        public Criteria andToLatitudeNotLike(String value) {
            addCriterion("to_latitude not like", value, "toLatitude");
            return (Criteria) this;
        }

        public Criteria andToLatitudeIn(List<String> values) {
            addCriterion("to_latitude in", values, "toLatitude");
            return (Criteria) this;
        }

        public Criteria andToLatitudeNotIn(List<String> values) {
            addCriterion("to_latitude not in", values, "toLatitude");
            return (Criteria) this;
        }

        public Criteria andToLatitudeBetween(String value1, String value2) {
            addCriterion("to_latitude between", value1, value2, "toLatitude");
            return (Criteria) this;
        }

        public Criteria andToLatitudeNotBetween(String value1, String value2) {
            addCriterion("to_latitude not between", value1, value2, "toLatitude");
            return (Criteria) this;
        }

        public Criteria andToLongitudeIsNull() {
            addCriterion("to_longitude is null");
            return (Criteria) this;
        }

        public Criteria andToLongitudeIsNotNull() {
            addCriterion("to_longitude is not null");
            return (Criteria) this;
        }

        public Criteria andToLongitudeEqualTo(String value) {
            addCriterion("to_longitude =", value, "toLongitude");
            return (Criteria) this;
        }

        public Criteria andToLongitudeNotEqualTo(String value) {
            addCriterion("to_longitude <>", value, "toLongitude");
            return (Criteria) this;
        }

        public Criteria andToLongitudeGreaterThan(String value) {
            addCriterion("to_longitude >", value, "toLongitude");
            return (Criteria) this;
        }

        public Criteria andToLongitudeGreaterThanOrEqualTo(String value) {
            addCriterion("to_longitude >=", value, "toLongitude");
            return (Criteria) this;
        }

        public Criteria andToLongitudeLessThan(String value) {
            addCriterion("to_longitude <", value, "toLongitude");
            return (Criteria) this;
        }

        public Criteria andToLongitudeLessThanOrEqualTo(String value) {
            addCriterion("to_longitude <=", value, "toLongitude");
            return (Criteria) this;
        }

        public Criteria andToLongitudeLike(String value) {
            addCriterion("to_longitude like", value, "toLongitude");
            return (Criteria) this;
        }

        public Criteria andToLongitudeNotLike(String value) {
            addCriterion("to_longitude not like", value, "toLongitude");
            return (Criteria) this;
        }

        public Criteria andToLongitudeIn(List<String> values) {
            addCriterion("to_longitude in", values, "toLongitude");
            return (Criteria) this;
        }

        public Criteria andToLongitudeNotIn(List<String> values) {
            addCriterion("to_longitude not in", values, "toLongitude");
            return (Criteria) this;
        }

        public Criteria andToLongitudeBetween(String value1, String value2) {
            addCriterion("to_longitude between", value1, value2, "toLongitude");
            return (Criteria) this;
        }

        public Criteria andToLongitudeNotBetween(String value1, String value2) {
            addCriterion("to_longitude not between", value1, value2, "toLongitude");
            return (Criteria) this;
        }

        public Criteria andToCoordTypeIsNull() {
            addCriterion("to_coord_type is null");
            return (Criteria) this;
        }

        public Criteria andToCoordTypeIsNotNull() {
            addCriterion("to_coord_type is not null");
            return (Criteria) this;
        }

        public Criteria andToCoordTypeEqualTo(Byte value) {
            addCriterion("to_coord_type =", value, "toCoordType");
            return (Criteria) this;
        }

        public Criteria andToCoordTypeNotEqualTo(Byte value) {
            addCriterion("to_coord_type <>", value, "toCoordType");
            return (Criteria) this;
        }

        public Criteria andToCoordTypeGreaterThan(Byte value) {
            addCriterion("to_coord_type >", value, "toCoordType");
            return (Criteria) this;
        }

        public Criteria andToCoordTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("to_coord_type >=", value, "toCoordType");
            return (Criteria) this;
        }

        public Criteria andToCoordTypeLessThan(Byte value) {
            addCriterion("to_coord_type <", value, "toCoordType");
            return (Criteria) this;
        }

        public Criteria andToCoordTypeLessThanOrEqualTo(Byte value) {
            addCriterion("to_coord_type <=", value, "toCoordType");
            return (Criteria) this;
        }

        public Criteria andToCoordTypeIn(List<Byte> values) {
            addCriterion("to_coord_type in", values, "toCoordType");
            return (Criteria) this;
        }

        public Criteria andToCoordTypeNotIn(List<Byte> values) {
            addCriterion("to_coord_type not in", values, "toCoordType");
            return (Criteria) this;
        }

        public Criteria andToCoordTypeBetween(Byte value1, Byte value2) {
            addCriterion("to_coord_type between", value1, value2, "toCoordType");
            return (Criteria) this;
        }

        public Criteria andToCoordTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("to_coord_type not between", value1, value2, "toCoordType");
            return (Criteria) this;
        }

        public Criteria andToLocationTypeIsNull() {
            addCriterion("to_location_type is null");
            return (Criteria) this;
        }

        public Criteria andToLocationTypeIsNotNull() {
            addCriterion("to_location_type is not null");
            return (Criteria) this;
        }

        public Criteria andToLocationTypeEqualTo(Byte value) {
            addCriterion("to_location_type =", value, "toLocationType");
            return (Criteria) this;
        }

        public Criteria andToLocationTypeNotEqualTo(Byte value) {
            addCriterion("to_location_type <>", value, "toLocationType");
            return (Criteria) this;
        }

        public Criteria andToLocationTypeGreaterThan(Byte value) {
            addCriterion("to_location_type >", value, "toLocationType");
            return (Criteria) this;
        }

        public Criteria andToLocationTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("to_location_type >=", value, "toLocationType");
            return (Criteria) this;
        }

        public Criteria andToLocationTypeLessThan(Byte value) {
            addCriterion("to_location_type <", value, "toLocationType");
            return (Criteria) this;
        }

        public Criteria andToLocationTypeLessThanOrEqualTo(Byte value) {
            addCriterion("to_location_type <=", value, "toLocationType");
            return (Criteria) this;
        }

        public Criteria andToLocationTypeIn(List<Byte> values) {
            addCriterion("to_location_type in", values, "toLocationType");
            return (Criteria) this;
        }

        public Criteria andToLocationTypeNotIn(List<Byte> values) {
            addCriterion("to_location_type not in", values, "toLocationType");
            return (Criteria) this;
        }

        public Criteria andToLocationTypeBetween(Byte value1, Byte value2) {
            addCriterion("to_location_type between", value1, value2, "toLocationType");
            return (Criteria) this;
        }

        public Criteria andToLocationTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("to_location_type not between", value1, value2, "toLocationType");
            return (Criteria) this;
        }

        public Criteria andToProvinceIsNull() {
            addCriterion("to_province is null");
            return (Criteria) this;
        }

        public Criteria andToProvinceIsNotNull() {
            addCriterion("to_province is not null");
            return (Criteria) this;
        }

        public Criteria andToProvinceEqualTo(String value) {
            addCriterion("to_province =", value, "toProvince");
            return (Criteria) this;
        }

        public Criteria andToProvinceNotEqualTo(String value) {
            addCriterion("to_province <>", value, "toProvince");
            return (Criteria) this;
        }

        public Criteria andToProvinceGreaterThan(String value) {
            addCriterion("to_province >", value, "toProvince");
            return (Criteria) this;
        }

        public Criteria andToProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("to_province >=", value, "toProvince");
            return (Criteria) this;
        }

        public Criteria andToProvinceLessThan(String value) {
            addCriterion("to_province <", value, "toProvince");
            return (Criteria) this;
        }

        public Criteria andToProvinceLessThanOrEqualTo(String value) {
            addCriterion("to_province <=", value, "toProvince");
            return (Criteria) this;
        }

        public Criteria andToProvinceLike(String value) {
            addCriterion("to_province like", value, "toProvince");
            return (Criteria) this;
        }

        public Criteria andToProvinceNotLike(String value) {
            addCriterion("to_province not like", value, "toProvince");
            return (Criteria) this;
        }

        public Criteria andToProvinceIn(List<String> values) {
            addCriterion("to_province in", values, "toProvince");
            return (Criteria) this;
        }

        public Criteria andToProvinceNotIn(List<String> values) {
            addCriterion("to_province not in", values, "toProvince");
            return (Criteria) this;
        }

        public Criteria andToProvinceBetween(String value1, String value2) {
            addCriterion("to_province between", value1, value2, "toProvince");
            return (Criteria) this;
        }

        public Criteria andToProvinceNotBetween(String value1, String value2) {
            addCriterion("to_province not between", value1, value2, "toProvince");
            return (Criteria) this;
        }

        public Criteria andToCityIsNull() {
            addCriterion("to_city is null");
            return (Criteria) this;
        }

        public Criteria andToCityIsNotNull() {
            addCriterion("to_city is not null");
            return (Criteria) this;
        }

        public Criteria andToCityEqualTo(String value) {
            addCriterion("to_city =", value, "toCity");
            return (Criteria) this;
        }

        public Criteria andToCityNotEqualTo(String value) {
            addCriterion("to_city <>", value, "toCity");
            return (Criteria) this;
        }

        public Criteria andToCityGreaterThan(String value) {
            addCriterion("to_city >", value, "toCity");
            return (Criteria) this;
        }

        public Criteria andToCityGreaterThanOrEqualTo(String value) {
            addCriterion("to_city >=", value, "toCity");
            return (Criteria) this;
        }

        public Criteria andToCityLessThan(String value) {
            addCriterion("to_city <", value, "toCity");
            return (Criteria) this;
        }

        public Criteria andToCityLessThanOrEqualTo(String value) {
            addCriterion("to_city <=", value, "toCity");
            return (Criteria) this;
        }

        public Criteria andToCityLike(String value) {
            addCriterion("to_city like", value, "toCity");
            return (Criteria) this;
        }

        public Criteria andToCityNotLike(String value) {
            addCriterion("to_city not like", value, "toCity");
            return (Criteria) this;
        }

        public Criteria andToCityIn(List<String> values) {
            addCriterion("to_city in", values, "toCity");
            return (Criteria) this;
        }

        public Criteria andToCityNotIn(List<String> values) {
            addCriterion("to_city not in", values, "toCity");
            return (Criteria) this;
        }

        public Criteria andToCityBetween(String value1, String value2) {
            addCriterion("to_city between", value1, value2, "toCity");
            return (Criteria) this;
        }

        public Criteria andToCityNotBetween(String value1, String value2) {
            addCriterion("to_city not between", value1, value2, "toCity");
            return (Criteria) this;
        }

        public Criteria andToAddressIsNull() {
            addCriterion("to_address is null");
            return (Criteria) this;
        }

        public Criteria andToAddressIsNotNull() {
            addCriterion("to_address is not null");
            return (Criteria) this;
        }

        public Criteria andToAddressEqualTo(String value) {
            addCriterion("to_address =", value, "toAddress");
            return (Criteria) this;
        }

        public Criteria andToAddressNotEqualTo(String value) {
            addCriterion("to_address <>", value, "toAddress");
            return (Criteria) this;
        }

        public Criteria andToAddressGreaterThan(String value) {
            addCriterion("to_address >", value, "toAddress");
            return (Criteria) this;
        }

        public Criteria andToAddressGreaterThanOrEqualTo(String value) {
            addCriterion("to_address >=", value, "toAddress");
            return (Criteria) this;
        }

        public Criteria andToAddressLessThan(String value) {
            addCriterion("to_address <", value, "toAddress");
            return (Criteria) this;
        }

        public Criteria andToAddressLessThanOrEqualTo(String value) {
            addCriterion("to_address <=", value, "toAddress");
            return (Criteria) this;
        }

        public Criteria andToAddressLike(String value) {
            addCriterion("to_address like", value, "toAddress");
            return (Criteria) this;
        }

        public Criteria andToAddressNotLike(String value) {
            addCriterion("to_address not like", value, "toAddress");
            return (Criteria) this;
        }

        public Criteria andToAddressIn(List<String> values) {
            addCriterion("to_address in", values, "toAddress");
            return (Criteria) this;
        }

        public Criteria andToAddressNotIn(List<String> values) {
            addCriterion("to_address not in", values, "toAddress");
            return (Criteria) this;
        }

        public Criteria andToAddressBetween(String value1, String value2) {
            addCriterion("to_address between", value1, value2, "toAddress");
            return (Criteria) this;
        }

        public Criteria andToAddressNotBetween(String value1, String value2) {
            addCriterion("to_address not between", value1, value2, "toAddress");
            return (Criteria) this;
        }

        public Criteria andShipStatusNameIsNull() {
            addCriterion("ship_status_name is null");
            return (Criteria) this;
        }

        public Criteria andShipStatusNameIsNotNull() {
            addCriterion("ship_status_name is not null");
            return (Criteria) this;
        }

        public Criteria andShipStatusNameEqualTo(String value) {
            addCriterion("ship_status_name =", value, "shipStatusName");
            return (Criteria) this;
        }

        public Criteria andShipStatusNameNotEqualTo(String value) {
            addCriterion("ship_status_name <>", value, "shipStatusName");
            return (Criteria) this;
        }

        public Criteria andShipStatusNameGreaterThan(String value) {
            addCriterion("ship_status_name >", value, "shipStatusName");
            return (Criteria) this;
        }

        public Criteria andShipStatusNameGreaterThanOrEqualTo(String value) {
            addCriterion("ship_status_name >=", value, "shipStatusName");
            return (Criteria) this;
        }

        public Criteria andShipStatusNameLessThan(String value) {
            addCriterion("ship_status_name <", value, "shipStatusName");
            return (Criteria) this;
        }

        public Criteria andShipStatusNameLessThanOrEqualTo(String value) {
            addCriterion("ship_status_name <=", value, "shipStatusName");
            return (Criteria) this;
        }

        public Criteria andShipStatusNameLike(String value) {
            addCriterion("ship_status_name like", value, "shipStatusName");
            return (Criteria) this;
        }

        public Criteria andShipStatusNameNotLike(String value) {
            addCriterion("ship_status_name not like", value, "shipStatusName");
            return (Criteria) this;
        }

        public Criteria andShipStatusNameIn(List<String> values) {
            addCriterion("ship_status_name in", values, "shipStatusName");
            return (Criteria) this;
        }

        public Criteria andShipStatusNameNotIn(List<String> values) {
            addCriterion("ship_status_name not in", values, "shipStatusName");
            return (Criteria) this;
        }

        public Criteria andShipStatusNameBetween(String value1, String value2) {
            addCriterion("ship_status_name between", value1, value2, "shipStatusName");
            return (Criteria) this;
        }

        public Criteria andShipStatusNameNotBetween(String value1, String value2) {
            addCriterion("ship_status_name not between", value1, value2, "shipStatusName");
            return (Criteria) this;
        }

        public Criteria andShipStatusDescIsNull() {
            addCriterion("ship_status_desc is null");
            return (Criteria) this;
        }

        public Criteria andShipStatusDescIsNotNull() {
            addCriterion("ship_status_desc is not null");
            return (Criteria) this;
        }

        public Criteria andShipStatusDescEqualTo(String value) {
            addCriterion("ship_status_desc =", value, "shipStatusDesc");
            return (Criteria) this;
        }

        public Criteria andShipStatusDescNotEqualTo(String value) {
            addCriterion("ship_status_desc <>", value, "shipStatusDesc");
            return (Criteria) this;
        }

        public Criteria andShipStatusDescGreaterThan(String value) {
            addCriterion("ship_status_desc >", value, "shipStatusDesc");
            return (Criteria) this;
        }

        public Criteria andShipStatusDescGreaterThanOrEqualTo(String value) {
            addCriterion("ship_status_desc >=", value, "shipStatusDesc");
            return (Criteria) this;
        }

        public Criteria andShipStatusDescLessThan(String value) {
            addCriterion("ship_status_desc <", value, "shipStatusDesc");
            return (Criteria) this;
        }

        public Criteria andShipStatusDescLessThanOrEqualTo(String value) {
            addCriterion("ship_status_desc <=", value, "shipStatusDesc");
            return (Criteria) this;
        }

        public Criteria andShipStatusDescLike(String value) {
            addCriterion("ship_status_desc like", value, "shipStatusDesc");
            return (Criteria) this;
        }

        public Criteria andShipStatusDescNotLike(String value) {
            addCriterion("ship_status_desc not like", value, "shipStatusDesc");
            return (Criteria) this;
        }

        public Criteria andShipStatusDescIn(List<String> values) {
            addCriterion("ship_status_desc in", values, "shipStatusDesc");
            return (Criteria) this;
        }

        public Criteria andShipStatusDescNotIn(List<String> values) {
            addCriterion("ship_status_desc not in", values, "shipStatusDesc");
            return (Criteria) this;
        }

        public Criteria andShipStatusDescBetween(String value1, String value2) {
            addCriterion("ship_status_desc between", value1, value2, "shipStatusDesc");
            return (Criteria) this;
        }

        public Criteria andShipStatusDescNotBetween(String value1, String value2) {
            addCriterion("ship_status_desc not between", value1, value2, "shipStatusDesc");
            return (Criteria) this;
        }

        public Criteria andVehicleNoIsNull() {
            addCriterion("vehicle_no is null");
            return (Criteria) this;
        }

        public Criteria andVehicleNoIsNotNull() {
            addCriterion("vehicle_no is not null");
            return (Criteria) this;
        }

        public Criteria andVehicleNoEqualTo(String value) {
            addCriterion("vehicle_no =", value, "vehicleNo");
            return (Criteria) this;
        }

        public Criteria andVehicleNoNotEqualTo(String value) {
            addCriterion("vehicle_no <>", value, "vehicleNo");
            return (Criteria) this;
        }

        public Criteria andVehicleNoGreaterThan(String value) {
            addCriterion("vehicle_no >", value, "vehicleNo");
            return (Criteria) this;
        }

        public Criteria andVehicleNoGreaterThanOrEqualTo(String value) {
            addCriterion("vehicle_no >=", value, "vehicleNo");
            return (Criteria) this;
        }

        public Criteria andVehicleNoLessThan(String value) {
            addCriterion("vehicle_no <", value, "vehicleNo");
            return (Criteria) this;
        }

        public Criteria andVehicleNoLessThanOrEqualTo(String value) {
            addCriterion("vehicle_no <=", value, "vehicleNo");
            return (Criteria) this;
        }

        public Criteria andVehicleNoLike(String value) {
            addCriterion("vehicle_no like", value, "vehicleNo");
            return (Criteria) this;
        }

        public Criteria andVehicleNoNotLike(String value) {
            addCriterion("vehicle_no not like", value, "vehicleNo");
            return (Criteria) this;
        }

        public Criteria andVehicleNoIn(List<String> values) {
            addCriterion("vehicle_no in", values, "vehicleNo");
            return (Criteria) this;
        }

        public Criteria andVehicleNoNotIn(List<String> values) {
            addCriterion("vehicle_no not in", values, "vehicleNo");
            return (Criteria) this;
        }

        public Criteria andVehicleNoBetween(String value1, String value2) {
            addCriterion("vehicle_no between", value1, value2, "vehicleNo");
            return (Criteria) this;
        }

        public Criteria andVehicleNoNotBetween(String value1, String value2) {
            addCriterion("vehicle_no not between", value1, value2, "vehicleNo");
            return (Criteria) this;
        }

        public Criteria andVehicleCompanyIsNull() {
            addCriterion("vehicle_company is null");
            return (Criteria) this;
        }

        public Criteria andVehicleCompanyIsNotNull() {
            addCriterion("vehicle_company is not null");
            return (Criteria) this;
        }

        public Criteria andVehicleCompanyEqualTo(String value) {
            addCriterion("vehicle_company =", value, "vehicleCompany");
            return (Criteria) this;
        }

        public Criteria andVehicleCompanyNotEqualTo(String value) {
            addCriterion("vehicle_company <>", value, "vehicleCompany");
            return (Criteria) this;
        }

        public Criteria andVehicleCompanyGreaterThan(String value) {
            addCriterion("vehicle_company >", value, "vehicleCompany");
            return (Criteria) this;
        }

        public Criteria andVehicleCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("vehicle_company >=", value, "vehicleCompany");
            return (Criteria) this;
        }

        public Criteria andVehicleCompanyLessThan(String value) {
            addCriterion("vehicle_company <", value, "vehicleCompany");
            return (Criteria) this;
        }

        public Criteria andVehicleCompanyLessThanOrEqualTo(String value) {
            addCriterion("vehicle_company <=", value, "vehicleCompany");
            return (Criteria) this;
        }

        public Criteria andVehicleCompanyLike(String value) {
            addCriterion("vehicle_company like", value, "vehicleCompany");
            return (Criteria) this;
        }

        public Criteria andVehicleCompanyNotLike(String value) {
            addCriterion("vehicle_company not like", value, "vehicleCompany");
            return (Criteria) this;
        }

        public Criteria andVehicleCompanyIn(List<String> values) {
            addCriterion("vehicle_company in", values, "vehicleCompany");
            return (Criteria) this;
        }

        public Criteria andVehicleCompanyNotIn(List<String> values) {
            addCriterion("vehicle_company not in", values, "vehicleCompany");
            return (Criteria) this;
        }

        public Criteria andVehicleCompanyBetween(String value1, String value2) {
            addCriterion("vehicle_company between", value1, value2, "vehicleCompany");
            return (Criteria) this;
        }

        public Criteria andVehicleCompanyNotBetween(String value1, String value2) {
            addCriterion("vehicle_company not between", value1, value2, "vehicleCompany");
            return (Criteria) this;
        }

        public Criteria andVehicleDriverIsNull() {
            addCriterion("vehicle_driver is null");
            return (Criteria) this;
        }

        public Criteria andVehicleDriverIsNotNull() {
            addCriterion("vehicle_driver is not null");
            return (Criteria) this;
        }

        public Criteria andVehicleDriverEqualTo(String value) {
            addCriterion("vehicle_driver =", value, "vehicleDriver");
            return (Criteria) this;
        }

        public Criteria andVehicleDriverNotEqualTo(String value) {
            addCriterion("vehicle_driver <>", value, "vehicleDriver");
            return (Criteria) this;
        }

        public Criteria andVehicleDriverGreaterThan(String value) {
            addCriterion("vehicle_driver >", value, "vehicleDriver");
            return (Criteria) this;
        }

        public Criteria andVehicleDriverGreaterThanOrEqualTo(String value) {
            addCriterion("vehicle_driver >=", value, "vehicleDriver");
            return (Criteria) this;
        }

        public Criteria andVehicleDriverLessThan(String value) {
            addCriterion("vehicle_driver <", value, "vehicleDriver");
            return (Criteria) this;
        }

        public Criteria andVehicleDriverLessThanOrEqualTo(String value) {
            addCriterion("vehicle_driver <=", value, "vehicleDriver");
            return (Criteria) this;
        }

        public Criteria andVehicleDriverLike(String value) {
            addCriterion("vehicle_driver like", value, "vehicleDriver");
            return (Criteria) this;
        }

        public Criteria andVehicleDriverNotLike(String value) {
            addCriterion("vehicle_driver not like", value, "vehicleDriver");
            return (Criteria) this;
        }

        public Criteria andVehicleDriverIn(List<String> values) {
            addCriterion("vehicle_driver in", values, "vehicleDriver");
            return (Criteria) this;
        }

        public Criteria andVehicleDriverNotIn(List<String> values) {
            addCriterion("vehicle_driver not in", values, "vehicleDriver");
            return (Criteria) this;
        }

        public Criteria andVehicleDriverBetween(String value1, String value2) {
            addCriterion("vehicle_driver between", value1, value2, "vehicleDriver");
            return (Criteria) this;
        }

        public Criteria andVehicleDriverNotBetween(String value1, String value2) {
            addCriterion("vehicle_driver not between", value1, value2, "vehicleDriver");
            return (Criteria) this;
        }

        public Criteria andVehicleTypeIsNull() {
            addCriterion("vehicle_type is null");
            return (Criteria) this;
        }

        public Criteria andVehicleTypeIsNotNull() {
            addCriterion("vehicle_type is not null");
            return (Criteria) this;
        }

        public Criteria andVehicleTypeEqualTo(Byte value) {
            addCriterion("vehicle_type =", value, "vehicleType");
            return (Criteria) this;
        }

        public Criteria andVehicleTypeNotEqualTo(Byte value) {
            addCriterion("vehicle_type <>", value, "vehicleType");
            return (Criteria) this;
        }

        public Criteria andVehicleTypeGreaterThan(Byte value) {
            addCriterion("vehicle_type >", value, "vehicleType");
            return (Criteria) this;
        }

        public Criteria andVehicleTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("vehicle_type >=", value, "vehicleType");
            return (Criteria) this;
        }

        public Criteria andVehicleTypeLessThan(Byte value) {
            addCriterion("vehicle_type <", value, "vehicleType");
            return (Criteria) this;
        }

        public Criteria andVehicleTypeLessThanOrEqualTo(Byte value) {
            addCriterion("vehicle_type <=", value, "vehicleType");
            return (Criteria) this;
        }

        public Criteria andVehicleTypeIn(List<Byte> values) {
            addCriterion("vehicle_type in", values, "vehicleType");
            return (Criteria) this;
        }

        public Criteria andVehicleTypeNotIn(List<Byte> values) {
            addCriterion("vehicle_type not in", values, "vehicleType");
            return (Criteria) this;
        }

        public Criteria andVehicleTypeBetween(Byte value1, Byte value2) {
            addCriterion("vehicle_type between", value1, value2, "vehicleType");
            return (Criteria) this;
        }

        public Criteria andVehicleTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("vehicle_type not between", value1, value2, "vehicleType");
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

        public Criteria orShipDateIsNull() {
            addCriterion("ship_date is null");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orShipDateIsNotNull() {
            addCriterion("ship_date is not null");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orShipDateEqualTo(Date value) {
            addCriterionForJDBCDate("ship_date =", value, "shipDate");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orShipDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("ship_date <>", value, "shipDate");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orShipDateGreaterThan(Date value) {
            addCriterionForJDBCDate("ship_date >", value, "shipDate");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orShipDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ship_date >=", value, "shipDate");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orShipDateLessThan(Date value) {
            addCriterionForJDBCDate("ship_date <", value, "shipDate");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orShipDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ship_date <=", value, "shipDate");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orShipDateIn(List<Date> values) {
            addCriterionForJDBCDate("ship_date in", values, "shipDate");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orShipDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("ship_date not in", values, "shipDate");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orShipDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ship_date between", value1, value2, "shipDate");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orShipDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ship_date not between", value1, value2, "shipDate");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orVehicleIdIsNull() {
            addCriterion("vehicle_id is null");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orVehicleIdIsNotNull() {
            addCriterion("vehicle_id is not null");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orVehicleIdEqualTo(Long value) {
            addCriterion("vehicle_id =", value, "vehicleId");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orVehicleIdNotEqualTo(Long value) {
            addCriterion("vehicle_id <>", value, "vehicleId");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orVehicleIdGreaterThan(Long value) {
            addCriterion("vehicle_id >", value, "vehicleId");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orVehicleIdGreaterThanOrEqualTo(Long value) {
            addCriterion("vehicle_id >=", value, "vehicleId");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orVehicleIdLessThan(Long value) {
            addCriterion("vehicle_id <", value, "vehicleId");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orVehicleIdLessThanOrEqualTo(Long value) {
            addCriterion("vehicle_id <=", value, "vehicleId");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orVehicleIdIn(List<Long> values) {
            addCriterion("vehicle_id in", values, "vehicleId");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orVehicleIdNotIn(List<Long> values) {
            addCriterion("vehicle_id not in", values, "vehicleId");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orVehicleIdBetween(Long value1, Long value2) {
            addCriterion("vehicle_id between", value1, value2, "vehicleId");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orVehicleIdNotBetween(Long value1, Long value2) {
            addCriterion("vehicle_id not between", value1, value2, "vehicleId");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orFromIdIsNull() {
            addCriterion("from_id is null");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orFromIdIsNotNull() {
            addCriterion("from_id is not null");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orFromIdEqualTo(Long value) {
            addCriterion("from_id =", value, "fromId");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orFromIdNotEqualTo(Long value) {
            addCriterion("from_id <>", value, "fromId");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orFromIdGreaterThan(Long value) {
            addCriterion("from_id >", value, "fromId");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orFromIdGreaterThanOrEqualTo(Long value) {
            addCriterion("from_id >=", value, "fromId");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orFromIdLessThan(Long value) {
            addCriterion("from_id <", value, "fromId");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orFromIdLessThanOrEqualTo(Long value) {
            addCriterion("from_id <=", value, "fromId");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orFromIdIn(List<Long> values) {
            addCriterion("from_id in", values, "fromId");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orFromIdNotIn(List<Long> values) {
            addCriterion("from_id not in", values, "fromId");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orFromIdBetween(Long value1, Long value2) {
            addCriterion("from_id between", value1, value2, "fromId");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orFromIdNotBetween(Long value1, Long value2) {
            addCriterion("from_id not between", value1, value2, "fromId");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orToIdIsNull() {
            addCriterion("to_id is null");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orToIdIsNotNull() {
            addCriterion("to_id is not null");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orToIdEqualTo(Long value) {
            addCriterion("to_id =", value, "toId");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orToIdNotEqualTo(Long value) {
            addCriterion("to_id <>", value, "toId");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orToIdGreaterThan(Long value) {
            addCriterion("to_id >", value, "toId");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orToIdGreaterThanOrEqualTo(Long value) {
            addCriterion("to_id >=", value, "toId");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orToIdLessThan(Long value) {
            addCriterion("to_id <", value, "toId");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orToIdLessThanOrEqualTo(Long value) {
            addCriterion("to_id <=", value, "toId");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orToIdIn(List<Long> values) {
            addCriterion("to_id in", values, "toId");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orToIdNotIn(List<Long> values) {
            addCriterion("to_id not in", values, "toId");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orToIdBetween(Long value1, Long value2) {
            addCriterion("to_id between", value1, value2, "toId");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orToIdNotBetween(Long value1, Long value2) {
            addCriterion("to_id not between", value1, value2, "toId");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orShipStatusIsNull() {
            addCriterion("ship_status is null");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orShipStatusIsNotNull() {
            addCriterion("ship_status is not null");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orShipStatusEqualTo(Byte value) {
            addCriterion("ship_status =", value, "shipStatus");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orShipStatusNotEqualTo(Byte value) {
            addCriterion("ship_status <>", value, "shipStatus");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orShipStatusGreaterThan(Byte value) {
            addCriterion("ship_status >", value, "shipStatus");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orShipStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("ship_status >=", value, "shipStatus");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orShipStatusLessThan(Byte value) {
            addCriterion("ship_status <", value, "shipStatus");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orShipStatusLessThanOrEqualTo(Byte value) {
            addCriterion("ship_status <=", value, "shipStatus");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orShipStatusIn(List<Byte> values) {
            addCriterion("ship_status in", values, "shipStatus");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orShipStatusNotIn(List<Byte> values) {
            addCriterion("ship_status not in", values, "shipStatus");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orShipStatusBetween(Byte value1, Byte value2) {
            addCriterion("ship_status between", value1, value2, "shipStatus");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orShipStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("ship_status not between", value1, value2, "shipStatus");
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

        public Criteria orLastModifyIsNull() {
            addCriterion("last_modify is null");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orLastModifyIsNotNull() {
            addCriterion("last_modify is not null");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orLastModifyEqualTo(Date value) {
            addCriterion("last_modify =", value, "lastModify");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orLastModifyNotEqualTo(Date value) {
            addCriterion("last_modify <>", value, "lastModify");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orLastModifyGreaterThan(Date value) {
            addCriterion("last_modify >", value, "lastModify");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orLastModifyGreaterThanOrEqualTo(Date value) {
            addCriterion("last_modify >=", value, "lastModify");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orLastModifyLessThan(Date value) {
            addCriterion("last_modify <", value, "lastModify");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orLastModifyLessThanOrEqualTo(Date value) {
            addCriterion("last_modify <=", value, "lastModify");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orLastModifyIn(List<Date> values) {
            addCriterion("last_modify in", values, "lastModify");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orLastModifyNotIn(List<Date> values) {
            addCriterion("last_modify not in", values, "lastModify");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orLastModifyBetween(Date value1, Date value2) {
            addCriterion("last_modify between", value1, value2, "lastModify");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orLastModifyNotBetween(Date value1, Date value2) {
            addCriterion("last_modify not between", value1, value2, "lastModify");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orFromNameIsNull() {
            addCriterion("from_name is null");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orFromNameIsNotNull() {
            addCriterion("from_name is not null");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orFromNameEqualTo(String value) {
            addCriterion("from_name =", value, "fromName");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orFromNameNotEqualTo(String value) {
            addCriterion("from_name <>", value, "fromName");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orFromNameGreaterThan(String value) {
            addCriterion("from_name >", value, "fromName");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orFromNameGreaterThanOrEqualTo(String value) {
            addCriterion("from_name >=", value, "fromName");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orFromNameLessThan(String value) {
            addCriterion("from_name <", value, "fromName");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orFromNameLessThanOrEqualTo(String value) {
            addCriterion("from_name <=", value, "fromName");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orFromNameLike(String value) {
            addCriterion("from_name like", value, "fromName");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orFromNameNotLike(String value) {
            addCriterion("from_name not like", value, "fromName");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orFromNameIn(List<String> values) {
            addCriterion("from_name in", values, "fromName");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orFromNameNotIn(List<String> values) {
            addCriterion("from_name not in", values, "fromName");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orFromNameBetween(String value1, String value2) {
            addCriterion("from_name between", value1, value2, "fromName");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orFromNameNotBetween(String value1, String value2) {
            addCriterion("from_name not between", value1, value2, "fromName");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orFromLatitudeIsNull() {
            addCriterion("from_latitude is null");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orFromLatitudeIsNotNull() {
            addCriterion("from_latitude is not null");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orFromLatitudeEqualTo(String value) {
            addCriterion("from_latitude =", value, "fromLatitude");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orFromLatitudeNotEqualTo(String value) {
            addCriterion("from_latitude <>", value, "fromLatitude");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orFromLatitudeGreaterThan(String value) {
            addCriterion("from_latitude >", value, "fromLatitude");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orFromLatitudeGreaterThanOrEqualTo(String value) {
            addCriterion("from_latitude >=", value, "fromLatitude");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orFromLatitudeLessThan(String value) {
            addCriterion("from_latitude <", value, "fromLatitude");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orFromLatitudeLessThanOrEqualTo(String value) {
            addCriterion("from_latitude <=", value, "fromLatitude");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orFromLatitudeLike(String value) {
            addCriterion("from_latitude like", value, "fromLatitude");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orFromLatitudeNotLike(String value) {
            addCriterion("from_latitude not like", value, "fromLatitude");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orFromLatitudeIn(List<String> values) {
            addCriterion("from_latitude in", values, "fromLatitude");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orFromLatitudeNotIn(List<String> values) {
            addCriterion("from_latitude not in", values, "fromLatitude");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orFromLatitudeBetween(String value1, String value2) {
            addCriterion("from_latitude between", value1, value2, "fromLatitude");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orFromLatitudeNotBetween(String value1, String value2) {
            addCriterion("from_latitude not between", value1, value2, "fromLatitude");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orFromLongitudeIsNull() {
            addCriterion("from_longitude is null");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orFromLongitudeIsNotNull() {
            addCriterion("from_longitude is not null");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orFromLongitudeEqualTo(String value) {
            addCriterion("from_longitude =", value, "fromLongitude");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orFromLongitudeNotEqualTo(String value) {
            addCriterion("from_longitude <>", value, "fromLongitude");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orFromLongitudeGreaterThan(String value) {
            addCriterion("from_longitude >", value, "fromLongitude");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orFromLongitudeGreaterThanOrEqualTo(String value) {
            addCriterion("from_longitude >=", value, "fromLongitude");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orFromLongitudeLessThan(String value) {
            addCriterion("from_longitude <", value, "fromLongitude");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orFromLongitudeLessThanOrEqualTo(String value) {
            addCriterion("from_longitude <=", value, "fromLongitude");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orFromLongitudeLike(String value) {
            addCriterion("from_longitude like", value, "fromLongitude");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orFromLongitudeNotLike(String value) {
            addCriterion("from_longitude not like", value, "fromLongitude");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orFromLongitudeIn(List<String> values) {
            addCriterion("from_longitude in", values, "fromLongitude");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orFromLongitudeNotIn(List<String> values) {
            addCriterion("from_longitude not in", values, "fromLongitude");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orFromLongitudeBetween(String value1, String value2) {
            addCriterion("from_longitude between", value1, value2, "fromLongitude");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orFromLongitudeNotBetween(String value1, String value2) {
            addCriterion("from_longitude not between", value1, value2, "fromLongitude");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orFromCoordTypeIsNull() {
            addCriterion("from_coord_type is null");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orFromCoordTypeIsNotNull() {
            addCriterion("from_coord_type is not null");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orFromCoordTypeEqualTo(Byte value) {
            addCriterion("from_coord_type =", value, "fromCoordType");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orFromCoordTypeNotEqualTo(Byte value) {
            addCriterion("from_coord_type <>", value, "fromCoordType");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orFromCoordTypeGreaterThan(Byte value) {
            addCriterion("from_coord_type >", value, "fromCoordType");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orFromCoordTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("from_coord_type >=", value, "fromCoordType");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orFromCoordTypeLessThan(Byte value) {
            addCriterion("from_coord_type <", value, "fromCoordType");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orFromCoordTypeLessThanOrEqualTo(Byte value) {
            addCriterion("from_coord_type <=", value, "fromCoordType");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orFromCoordTypeIn(List<Byte> values) {
            addCriterion("from_coord_type in", values, "fromCoordType");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orFromCoordTypeNotIn(List<Byte> values) {
            addCriterion("from_coord_type not in", values, "fromCoordType");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orFromCoordTypeBetween(Byte value1, Byte value2) {
            addCriterion("from_coord_type between", value1, value2, "fromCoordType");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orFromCoordTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("from_coord_type not between", value1, value2, "fromCoordType");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orFromLocationTypeIsNull() {
            addCriterion("from_location_type is null");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orFromLocationTypeIsNotNull() {
            addCriterion("from_location_type is not null");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orFromLocationTypeEqualTo(Byte value) {
            addCriterion("from_location_type =", value, "fromLocationType");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orFromLocationTypeNotEqualTo(Byte value) {
            addCriterion("from_location_type <>", value, "fromLocationType");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orFromLocationTypeGreaterThan(Byte value) {
            addCriterion("from_location_type >", value, "fromLocationType");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orFromLocationTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("from_location_type >=", value, "fromLocationType");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orFromLocationTypeLessThan(Byte value) {
            addCriterion("from_location_type <", value, "fromLocationType");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orFromLocationTypeLessThanOrEqualTo(Byte value) {
            addCriterion("from_location_type <=", value, "fromLocationType");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orFromLocationTypeIn(List<Byte> values) {
            addCriterion("from_location_type in", values, "fromLocationType");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orFromLocationTypeNotIn(List<Byte> values) {
            addCriterion("from_location_type not in", values, "fromLocationType");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orFromLocationTypeBetween(Byte value1, Byte value2) {
            addCriterion("from_location_type between", value1, value2, "fromLocationType");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orFromLocationTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("from_location_type not between", value1, value2, "fromLocationType");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orFromProvinceIsNull() {
            addCriterion("from_province is null");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orFromProvinceIsNotNull() {
            addCriterion("from_province is not null");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orFromProvinceEqualTo(String value) {
            addCriterion("from_province =", value, "fromProvince");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orFromProvinceNotEqualTo(String value) {
            addCriterion("from_province <>", value, "fromProvince");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orFromProvinceGreaterThan(String value) {
            addCriterion("from_province >", value, "fromProvince");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orFromProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("from_province >=", value, "fromProvince");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orFromProvinceLessThan(String value) {
            addCriterion("from_province <", value, "fromProvince");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orFromProvinceLessThanOrEqualTo(String value) {
            addCriterion("from_province <=", value, "fromProvince");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orFromProvinceLike(String value) {
            addCriterion("from_province like", value, "fromProvince");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orFromProvinceNotLike(String value) {
            addCriterion("from_province not like", value, "fromProvince");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orFromProvinceIn(List<String> values) {
            addCriterion("from_province in", values, "fromProvince");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orFromProvinceNotIn(List<String> values) {
            addCriterion("from_province not in", values, "fromProvince");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orFromProvinceBetween(String value1, String value2) {
            addCriterion("from_province between", value1, value2, "fromProvince");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orFromProvinceNotBetween(String value1, String value2) {
            addCriterion("from_province not between", value1, value2, "fromProvince");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orFromCityIsNull() {
            addCriterion("from_city is null");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orFromCityIsNotNull() {
            addCriterion("from_city is not null");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orFromCityEqualTo(String value) {
            addCriterion("from_city =", value, "fromCity");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orFromCityNotEqualTo(String value) {
            addCriterion("from_city <>", value, "fromCity");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orFromCityGreaterThan(String value) {
            addCriterion("from_city >", value, "fromCity");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orFromCityGreaterThanOrEqualTo(String value) {
            addCriterion("from_city >=", value, "fromCity");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orFromCityLessThan(String value) {
            addCriterion("from_city <", value, "fromCity");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orFromCityLessThanOrEqualTo(String value) {
            addCriterion("from_city <=", value, "fromCity");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orFromCityLike(String value) {
            addCriterion("from_city like", value, "fromCity");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orFromCityNotLike(String value) {
            addCriterion("from_city not like", value, "fromCity");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orFromCityIn(List<String> values) {
            addCriterion("from_city in", values, "fromCity");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orFromCityNotIn(List<String> values) {
            addCriterion("from_city not in", values, "fromCity");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orFromCityBetween(String value1, String value2) {
            addCriterion("from_city between", value1, value2, "fromCity");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orFromCityNotBetween(String value1, String value2) {
            addCriterion("from_city not between", value1, value2, "fromCity");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orFromAddressIsNull() {
            addCriterion("from_address is null");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orFromAddressIsNotNull() {
            addCriterion("from_address is not null");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orFromAddressEqualTo(String value) {
            addCriterion("from_address =", value, "fromAddress");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orFromAddressNotEqualTo(String value) {
            addCriterion("from_address <>", value, "fromAddress");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orFromAddressGreaterThan(String value) {
            addCriterion("from_address >", value, "fromAddress");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orFromAddressGreaterThanOrEqualTo(String value) {
            addCriterion("from_address >=", value, "fromAddress");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orFromAddressLessThan(String value) {
            addCriterion("from_address <", value, "fromAddress");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orFromAddressLessThanOrEqualTo(String value) {
            addCriterion("from_address <=", value, "fromAddress");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orFromAddressLike(String value) {
            addCriterion("from_address like", value, "fromAddress");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orFromAddressNotLike(String value) {
            addCriterion("from_address not like", value, "fromAddress");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orFromAddressIn(List<String> values) {
            addCriterion("from_address in", values, "fromAddress");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orFromAddressNotIn(List<String> values) {
            addCriterion("from_address not in", values, "fromAddress");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orFromAddressBetween(String value1, String value2) {
            addCriterion("from_address between", value1, value2, "fromAddress");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orFromAddressNotBetween(String value1, String value2) {
            addCriterion("from_address not between", value1, value2, "fromAddress");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orToNameIsNull() {
            addCriterion("to_name is null");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orToNameIsNotNull() {
            addCriterion("to_name is not null");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orToNameEqualTo(String value) {
            addCriterion("to_name =", value, "toName");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orToNameNotEqualTo(String value) {
            addCriterion("to_name <>", value, "toName");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orToNameGreaterThan(String value) {
            addCriterion("to_name >", value, "toName");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orToNameGreaterThanOrEqualTo(String value) {
            addCriterion("to_name >=", value, "toName");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orToNameLessThan(String value) {
            addCriterion("to_name <", value, "toName");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orToNameLessThanOrEqualTo(String value) {
            addCriterion("to_name <=", value, "toName");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orToNameLike(String value) {
            addCriterion("to_name like", value, "toName");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orToNameNotLike(String value) {
            addCriterion("to_name not like", value, "toName");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orToNameIn(List<String> values) {
            addCriterion("to_name in", values, "toName");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orToNameNotIn(List<String> values) {
            addCriterion("to_name not in", values, "toName");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orToNameBetween(String value1, String value2) {
            addCriterion("to_name between", value1, value2, "toName");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orToNameNotBetween(String value1, String value2) {
            addCriterion("to_name not between", value1, value2, "toName");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orToLatitudeIsNull() {
            addCriterion("to_latitude is null");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orToLatitudeIsNotNull() {
            addCriterion("to_latitude is not null");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orToLatitudeEqualTo(String value) {
            addCriterion("to_latitude =", value, "toLatitude");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orToLatitudeNotEqualTo(String value) {
            addCriterion("to_latitude <>", value, "toLatitude");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orToLatitudeGreaterThan(String value) {
            addCriterion("to_latitude >", value, "toLatitude");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orToLatitudeGreaterThanOrEqualTo(String value) {
            addCriterion("to_latitude >=", value, "toLatitude");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orToLatitudeLessThan(String value) {
            addCriterion("to_latitude <", value, "toLatitude");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orToLatitudeLessThanOrEqualTo(String value) {
            addCriterion("to_latitude <=", value, "toLatitude");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orToLatitudeLike(String value) {
            addCriterion("to_latitude like", value, "toLatitude");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orToLatitudeNotLike(String value) {
            addCriterion("to_latitude not like", value, "toLatitude");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orToLatitudeIn(List<String> values) {
            addCriterion("to_latitude in", values, "toLatitude");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orToLatitudeNotIn(List<String> values) {
            addCriterion("to_latitude not in", values, "toLatitude");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orToLatitudeBetween(String value1, String value2) {
            addCriterion("to_latitude between", value1, value2, "toLatitude");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orToLatitudeNotBetween(String value1, String value2) {
            addCriterion("to_latitude not between", value1, value2, "toLatitude");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orToLongitudeIsNull() {
            addCriterion("to_longitude is null");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orToLongitudeIsNotNull() {
            addCriterion("to_longitude is not null");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orToLongitudeEqualTo(String value) {
            addCriterion("to_longitude =", value, "toLongitude");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orToLongitudeNotEqualTo(String value) {
            addCriterion("to_longitude <>", value, "toLongitude");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orToLongitudeGreaterThan(String value) {
            addCriterion("to_longitude >", value, "toLongitude");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orToLongitudeGreaterThanOrEqualTo(String value) {
            addCriterion("to_longitude >=", value, "toLongitude");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orToLongitudeLessThan(String value) {
            addCriterion("to_longitude <", value, "toLongitude");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orToLongitudeLessThanOrEqualTo(String value) {
            addCriterion("to_longitude <=", value, "toLongitude");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orToLongitudeLike(String value) {
            addCriterion("to_longitude like", value, "toLongitude");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orToLongitudeNotLike(String value) {
            addCriterion("to_longitude not like", value, "toLongitude");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orToLongitudeIn(List<String> values) {
            addCriterion("to_longitude in", values, "toLongitude");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orToLongitudeNotIn(List<String> values) {
            addCriterion("to_longitude not in", values, "toLongitude");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orToLongitudeBetween(String value1, String value2) {
            addCriterion("to_longitude between", value1, value2, "toLongitude");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orToLongitudeNotBetween(String value1, String value2) {
            addCriterion("to_longitude not between", value1, value2, "toLongitude");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orToCoordTypeIsNull() {
            addCriterion("to_coord_type is null");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orToCoordTypeIsNotNull() {
            addCriterion("to_coord_type is not null");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orToCoordTypeEqualTo(Byte value) {
            addCriterion("to_coord_type =", value, "toCoordType");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orToCoordTypeNotEqualTo(Byte value) {
            addCriterion("to_coord_type <>", value, "toCoordType");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orToCoordTypeGreaterThan(Byte value) {
            addCriterion("to_coord_type >", value, "toCoordType");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orToCoordTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("to_coord_type >=", value, "toCoordType");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orToCoordTypeLessThan(Byte value) {
            addCriterion("to_coord_type <", value, "toCoordType");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orToCoordTypeLessThanOrEqualTo(Byte value) {
            addCriterion("to_coord_type <=", value, "toCoordType");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orToCoordTypeIn(List<Byte> values) {
            addCriterion("to_coord_type in", values, "toCoordType");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orToCoordTypeNotIn(List<Byte> values) {
            addCriterion("to_coord_type not in", values, "toCoordType");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orToCoordTypeBetween(Byte value1, Byte value2) {
            addCriterion("to_coord_type between", value1, value2, "toCoordType");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orToCoordTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("to_coord_type not between", value1, value2, "toCoordType");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orToLocationTypeIsNull() {
            addCriterion("to_location_type is null");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orToLocationTypeIsNotNull() {
            addCriterion("to_location_type is not null");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orToLocationTypeEqualTo(Byte value) {
            addCriterion("to_location_type =", value, "toLocationType");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orToLocationTypeNotEqualTo(Byte value) {
            addCriterion("to_location_type <>", value, "toLocationType");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orToLocationTypeGreaterThan(Byte value) {
            addCriterion("to_location_type >", value, "toLocationType");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orToLocationTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("to_location_type >=", value, "toLocationType");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orToLocationTypeLessThan(Byte value) {
            addCriterion("to_location_type <", value, "toLocationType");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orToLocationTypeLessThanOrEqualTo(Byte value) {
            addCriterion("to_location_type <=", value, "toLocationType");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orToLocationTypeIn(List<Byte> values) {
            addCriterion("to_location_type in", values, "toLocationType");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orToLocationTypeNotIn(List<Byte> values) {
            addCriterion("to_location_type not in", values, "toLocationType");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orToLocationTypeBetween(Byte value1, Byte value2) {
            addCriterion("to_location_type between", value1, value2, "toLocationType");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orToLocationTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("to_location_type not between", value1, value2, "toLocationType");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orToProvinceIsNull() {
            addCriterion("to_province is null");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orToProvinceIsNotNull() {
            addCriterion("to_province is not null");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orToProvinceEqualTo(String value) {
            addCriterion("to_province =", value, "toProvince");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orToProvinceNotEqualTo(String value) {
            addCriterion("to_province <>", value, "toProvince");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orToProvinceGreaterThan(String value) {
            addCriterion("to_province >", value, "toProvince");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orToProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("to_province >=", value, "toProvince");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orToProvinceLessThan(String value) {
            addCriterion("to_province <", value, "toProvince");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orToProvinceLessThanOrEqualTo(String value) {
            addCriterion("to_province <=", value, "toProvince");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orToProvinceLike(String value) {
            addCriterion("to_province like", value, "toProvince");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orToProvinceNotLike(String value) {
            addCriterion("to_province not like", value, "toProvince");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orToProvinceIn(List<String> values) {
            addCriterion("to_province in", values, "toProvince");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orToProvinceNotIn(List<String> values) {
            addCriterion("to_province not in", values, "toProvince");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orToProvinceBetween(String value1, String value2) {
            addCriterion("to_province between", value1, value2, "toProvince");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orToProvinceNotBetween(String value1, String value2) {
            addCriterion("to_province not between", value1, value2, "toProvince");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orToCityIsNull() {
            addCriterion("to_city is null");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orToCityIsNotNull() {
            addCriterion("to_city is not null");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orToCityEqualTo(String value) {
            addCriterion("to_city =", value, "toCity");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orToCityNotEqualTo(String value) {
            addCriterion("to_city <>", value, "toCity");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orToCityGreaterThan(String value) {
            addCriterion("to_city >", value, "toCity");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orToCityGreaterThanOrEqualTo(String value) {
            addCriterion("to_city >=", value, "toCity");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orToCityLessThan(String value) {
            addCriterion("to_city <", value, "toCity");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orToCityLessThanOrEqualTo(String value) {
            addCriterion("to_city <=", value, "toCity");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orToCityLike(String value) {
            addCriterion("to_city like", value, "toCity");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orToCityNotLike(String value) {
            addCriterion("to_city not like", value, "toCity");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orToCityIn(List<String> values) {
            addCriterion("to_city in", values, "toCity");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orToCityNotIn(List<String> values) {
            addCriterion("to_city not in", values, "toCity");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orToCityBetween(String value1, String value2) {
            addCriterion("to_city between", value1, value2, "toCity");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orToCityNotBetween(String value1, String value2) {
            addCriterion("to_city not between", value1, value2, "toCity");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orToAddressIsNull() {
            addCriterion("to_address is null");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orToAddressIsNotNull() {
            addCriterion("to_address is not null");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orToAddressEqualTo(String value) {
            addCriterion("to_address =", value, "toAddress");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orToAddressNotEqualTo(String value) {
            addCriterion("to_address <>", value, "toAddress");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orToAddressGreaterThan(String value) {
            addCriterion("to_address >", value, "toAddress");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orToAddressGreaterThanOrEqualTo(String value) {
            addCriterion("to_address >=", value, "toAddress");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orToAddressLessThan(String value) {
            addCriterion("to_address <", value, "toAddress");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orToAddressLessThanOrEqualTo(String value) {
            addCriterion("to_address <=", value, "toAddress");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orToAddressLike(String value) {
            addCriterion("to_address like", value, "toAddress");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orToAddressNotLike(String value) {
            addCriterion("to_address not like", value, "toAddress");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orToAddressIn(List<String> values) {
            addCriterion("to_address in", values, "toAddress");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orToAddressNotIn(List<String> values) {
            addCriterion("to_address not in", values, "toAddress");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orToAddressBetween(String value1, String value2) {
            addCriterion("to_address between", value1, value2, "toAddress");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orToAddressNotBetween(String value1, String value2) {
            addCriterion("to_address not between", value1, value2, "toAddress");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orShipStatusNameIsNull() {
            addCriterion("ship_status_name is null");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orShipStatusNameIsNotNull() {
            addCriterion("ship_status_name is not null");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orShipStatusNameEqualTo(String value) {
            addCriterion("ship_status_name =", value, "shipStatusName");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orShipStatusNameNotEqualTo(String value) {
            addCriterion("ship_status_name <>", value, "shipStatusName");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orShipStatusNameGreaterThan(String value) {
            addCriterion("ship_status_name >", value, "shipStatusName");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orShipStatusNameGreaterThanOrEqualTo(String value) {
            addCriterion("ship_status_name >=", value, "shipStatusName");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orShipStatusNameLessThan(String value) {
            addCriterion("ship_status_name <", value, "shipStatusName");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orShipStatusNameLessThanOrEqualTo(String value) {
            addCriterion("ship_status_name <=", value, "shipStatusName");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orShipStatusNameLike(String value) {
            addCriterion("ship_status_name like", value, "shipStatusName");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orShipStatusNameNotLike(String value) {
            addCriterion("ship_status_name not like", value, "shipStatusName");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orShipStatusNameIn(List<String> values) {
            addCriterion("ship_status_name in", values, "shipStatusName");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orShipStatusNameNotIn(List<String> values) {
            addCriterion("ship_status_name not in", values, "shipStatusName");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orShipStatusNameBetween(String value1, String value2) {
            addCriterion("ship_status_name between", value1, value2, "shipStatusName");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orShipStatusNameNotBetween(String value1, String value2) {
            addCriterion("ship_status_name not between", value1, value2, "shipStatusName");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orShipStatusDescIsNull() {
            addCriterion("ship_status_desc is null");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orShipStatusDescIsNotNull() {
            addCriterion("ship_status_desc is not null");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orShipStatusDescEqualTo(String value) {
            addCriterion("ship_status_desc =", value, "shipStatusDesc");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orShipStatusDescNotEqualTo(String value) {
            addCriterion("ship_status_desc <>", value, "shipStatusDesc");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orShipStatusDescGreaterThan(String value) {
            addCriterion("ship_status_desc >", value, "shipStatusDesc");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orShipStatusDescGreaterThanOrEqualTo(String value) {
            addCriterion("ship_status_desc >=", value, "shipStatusDesc");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orShipStatusDescLessThan(String value) {
            addCriterion("ship_status_desc <", value, "shipStatusDesc");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orShipStatusDescLessThanOrEqualTo(String value) {
            addCriterion("ship_status_desc <=", value, "shipStatusDesc");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orShipStatusDescLike(String value) {
            addCriterion("ship_status_desc like", value, "shipStatusDesc");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orShipStatusDescNotLike(String value) {
            addCriterion("ship_status_desc not like", value, "shipStatusDesc");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orShipStatusDescIn(List<String> values) {
            addCriterion("ship_status_desc in", values, "shipStatusDesc");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orShipStatusDescNotIn(List<String> values) {
            addCriterion("ship_status_desc not in", values, "shipStatusDesc");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orShipStatusDescBetween(String value1, String value2) {
            addCriterion("ship_status_desc between", value1, value2, "shipStatusDesc");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orShipStatusDescNotBetween(String value1, String value2) {
            addCriterion("ship_status_desc not between", value1, value2, "shipStatusDesc");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orVehicleNoIsNull() {
            addCriterion("vehicle_no is null");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orVehicleNoIsNotNull() {
            addCriterion("vehicle_no is not null");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orVehicleNoEqualTo(String value) {
            addCriterion("vehicle_no =", value, "vehicleNo");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orVehicleNoNotEqualTo(String value) {
            addCriterion("vehicle_no <>", value, "vehicleNo");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orVehicleNoGreaterThan(String value) {
            addCriterion("vehicle_no >", value, "vehicleNo");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orVehicleNoGreaterThanOrEqualTo(String value) {
            addCriterion("vehicle_no >=", value, "vehicleNo");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orVehicleNoLessThan(String value) {
            addCriterion("vehicle_no <", value, "vehicleNo");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orVehicleNoLessThanOrEqualTo(String value) {
            addCriterion("vehicle_no <=", value, "vehicleNo");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orVehicleNoLike(String value) {
            addCriterion("vehicle_no like", value, "vehicleNo");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orVehicleNoNotLike(String value) {
            addCriterion("vehicle_no not like", value, "vehicleNo");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orVehicleNoIn(List<String> values) {
            addCriterion("vehicle_no in", values, "vehicleNo");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orVehicleNoNotIn(List<String> values) {
            addCriterion("vehicle_no not in", values, "vehicleNo");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orVehicleNoBetween(String value1, String value2) {
            addCriterion("vehicle_no between", value1, value2, "vehicleNo");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orVehicleNoNotBetween(String value1, String value2) {
            addCriterion("vehicle_no not between", value1, value2, "vehicleNo");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orVehicleCompanyIsNull() {
            addCriterion("vehicle_company is null");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orVehicleCompanyIsNotNull() {
            addCriterion("vehicle_company is not null");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orVehicleCompanyEqualTo(String value) {
            addCriterion("vehicle_company =", value, "vehicleCompany");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orVehicleCompanyNotEqualTo(String value) {
            addCriterion("vehicle_company <>", value, "vehicleCompany");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orVehicleCompanyGreaterThan(String value) {
            addCriterion("vehicle_company >", value, "vehicleCompany");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orVehicleCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("vehicle_company >=", value, "vehicleCompany");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orVehicleCompanyLessThan(String value) {
            addCriterion("vehicle_company <", value, "vehicleCompany");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orVehicleCompanyLessThanOrEqualTo(String value) {
            addCriterion("vehicle_company <=", value, "vehicleCompany");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orVehicleCompanyLike(String value) {
            addCriterion("vehicle_company like", value, "vehicleCompany");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orVehicleCompanyNotLike(String value) {
            addCriterion("vehicle_company not like", value, "vehicleCompany");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orVehicleCompanyIn(List<String> values) {
            addCriterion("vehicle_company in", values, "vehicleCompany");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orVehicleCompanyNotIn(List<String> values) {
            addCriterion("vehicle_company not in", values, "vehicleCompany");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orVehicleCompanyBetween(String value1, String value2) {
            addCriterion("vehicle_company between", value1, value2, "vehicleCompany");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orVehicleCompanyNotBetween(String value1, String value2) {
            addCriterion("vehicle_company not between", value1, value2, "vehicleCompany");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orVehicleDriverIsNull() {
            addCriterion("vehicle_driver is null");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orVehicleDriverIsNotNull() {
            addCriterion("vehicle_driver is not null");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orVehicleDriverEqualTo(String value) {
            addCriterion("vehicle_driver =", value, "vehicleDriver");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orVehicleDriverNotEqualTo(String value) {
            addCriterion("vehicle_driver <>", value, "vehicleDriver");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orVehicleDriverGreaterThan(String value) {
            addCriterion("vehicle_driver >", value, "vehicleDriver");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orVehicleDriverGreaterThanOrEqualTo(String value) {
            addCriterion("vehicle_driver >=", value, "vehicleDriver");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orVehicleDriverLessThan(String value) {
            addCriterion("vehicle_driver <", value, "vehicleDriver");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orVehicleDriverLessThanOrEqualTo(String value) {
            addCriterion("vehicle_driver <=", value, "vehicleDriver");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orVehicleDriverLike(String value) {
            addCriterion("vehicle_driver like", value, "vehicleDriver");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orVehicleDriverNotLike(String value) {
            addCriterion("vehicle_driver not like", value, "vehicleDriver");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orVehicleDriverIn(List<String> values) {
            addCriterion("vehicle_driver in", values, "vehicleDriver");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orVehicleDriverNotIn(List<String> values) {
            addCriterion("vehicle_driver not in", values, "vehicleDriver");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orVehicleDriverBetween(String value1, String value2) {
            addCriterion("vehicle_driver between", value1, value2, "vehicleDriver");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orVehicleDriverNotBetween(String value1, String value2) {
            addCriterion("vehicle_driver not between", value1, value2, "vehicleDriver");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orVehicleTypeIsNull() {
            addCriterion("vehicle_type is null");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orVehicleTypeIsNotNull() {
            addCriterion("vehicle_type is not null");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orVehicleTypeEqualTo(Byte value) {
            addCriterion("vehicle_type =", value, "vehicleType");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orVehicleTypeNotEqualTo(Byte value) {
            addCriterion("vehicle_type <>", value, "vehicleType");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orVehicleTypeGreaterThan(Byte value) {
            addCriterion("vehicle_type >", value, "vehicleType");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orVehicleTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("vehicle_type >=", value, "vehicleType");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orVehicleTypeLessThan(Byte value) {
            addCriterion("vehicle_type <", value, "vehicleType");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orVehicleTypeLessThanOrEqualTo(Byte value) {
            addCriterion("vehicle_type <=", value, "vehicleType");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orVehicleTypeIn(List<Byte> values) {
            addCriterion("vehicle_type in", values, "vehicleType");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orVehicleTypeNotIn(List<Byte> values) {
            addCriterion("vehicle_type not in", values, "vehicleType");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orVehicleTypeBetween(Byte value1, Byte value2) {
            addCriterion("vehicle_type between", value1, value2, "vehicleType");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orVehicleTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("vehicle_type not between", value1, value2, "vehicleType");
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