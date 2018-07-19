package com.openthinks.plc.core.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class VehicleTrackOneExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VehicleTrackOneExample() {
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

        public Criteria andLatitudeIsNull() {
            addCriterion("latitude is null");
            return (Criteria) this;
        }

        public Criteria andLatitudeIsNotNull() {
            addCriterion("latitude is not null");
            return (Criteria) this;
        }

        public Criteria andLatitudeEqualTo(String value) {
            addCriterion("latitude =", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotEqualTo(String value) {
            addCriterion("latitude <>", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeGreaterThan(String value) {
            addCriterion("latitude >", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeGreaterThanOrEqualTo(String value) {
            addCriterion("latitude >=", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLessThan(String value) {
            addCriterion("latitude <", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLessThanOrEqualTo(String value) {
            addCriterion("latitude <=", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLike(String value) {
            addCriterion("latitude like", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotLike(String value) {
            addCriterion("latitude not like", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeIn(List<String> values) {
            addCriterion("latitude in", values, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotIn(List<String> values) {
            addCriterion("latitude not in", values, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeBetween(String value1, String value2) {
            addCriterion("latitude between", value1, value2, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotBetween(String value1, String value2) {
            addCriterion("latitude not between", value1, value2, "latitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeIsNull() {
            addCriterion("longitude is null");
            return (Criteria) this;
        }

        public Criteria andLongitudeIsNotNull() {
            addCriterion("longitude is not null");
            return (Criteria) this;
        }

        public Criteria andLongitudeEqualTo(String value) {
            addCriterion("longitude =", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotEqualTo(String value) {
            addCriterion("longitude <>", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeGreaterThan(String value) {
            addCriterion("longitude >", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeGreaterThanOrEqualTo(String value) {
            addCriterion("longitude >=", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLessThan(String value) {
            addCriterion("longitude <", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLessThanOrEqualTo(String value) {
            addCriterion("longitude <=", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLike(String value) {
            addCriterion("longitude like", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotLike(String value) {
            addCriterion("longitude not like", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeIn(List<String> values) {
            addCriterion("longitude in", values, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotIn(List<String> values) {
            addCriterion("longitude not in", values, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeBetween(String value1, String value2) {
            addCriterion("longitude between", value1, value2, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotBetween(String value1, String value2) {
            addCriterion("longitude not between", value1, value2, "longitude");
            return (Criteria) this;
        }

        public Criteria andCoordTypeIsNull() {
            addCriterion("coord_type is null");
            return (Criteria) this;
        }

        public Criteria andCoordTypeIsNotNull() {
            addCriterion("coord_type is not null");
            return (Criteria) this;
        }

        public Criteria andCoordTypeEqualTo(Byte value) {
            addCriterion("coord_type =", value, "coordType");
            return (Criteria) this;
        }

        public Criteria andCoordTypeNotEqualTo(Byte value) {
            addCriterion("coord_type <>", value, "coordType");
            return (Criteria) this;
        }

        public Criteria andCoordTypeGreaterThan(Byte value) {
            addCriterion("coord_type >", value, "coordType");
            return (Criteria) this;
        }

        public Criteria andCoordTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("coord_type >=", value, "coordType");
            return (Criteria) this;
        }

        public Criteria andCoordTypeLessThan(Byte value) {
            addCriterion("coord_type <", value, "coordType");
            return (Criteria) this;
        }

        public Criteria andCoordTypeLessThanOrEqualTo(Byte value) {
            addCriterion("coord_type <=", value, "coordType");
            return (Criteria) this;
        }

        public Criteria andCoordTypeIn(List<Byte> values) {
            addCriterion("coord_type in", values, "coordType");
            return (Criteria) this;
        }

        public Criteria andCoordTypeNotIn(List<Byte> values) {
            addCriterion("coord_type not in", values, "coordType");
            return (Criteria) this;
        }

        public Criteria andCoordTypeBetween(Byte value1, Byte value2) {
            addCriterion("coord_type between", value1, value2, "coordType");
            return (Criteria) this;
        }

        public Criteria andCoordTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("coord_type not between", value1, value2, "coordType");
            return (Criteria) this;
        }

        public Criteria andTrackTimeIsNull() {
            addCriterion("track_time is null");
            return (Criteria) this;
        }

        public Criteria andTrackTimeIsNotNull() {
            addCriterion("track_time is not null");
            return (Criteria) this;
        }

        public Criteria andTrackTimeEqualTo(Date value) {
            addCriterion("track_time =", value, "trackTime");
            return (Criteria) this;
        }

        public Criteria andTrackTimeNotEqualTo(Date value) {
            addCriterion("track_time <>", value, "trackTime");
            return (Criteria) this;
        }

        public Criteria andTrackTimeGreaterThan(Date value) {
            addCriterion("track_time >", value, "trackTime");
            return (Criteria) this;
        }

        public Criteria andTrackTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("track_time >=", value, "trackTime");
            return (Criteria) this;
        }

        public Criteria andTrackTimeLessThan(Date value) {
            addCriterion("track_time <", value, "trackTime");
            return (Criteria) this;
        }

        public Criteria andTrackTimeLessThanOrEqualTo(Date value) {
            addCriterion("track_time <=", value, "trackTime");
            return (Criteria) this;
        }

        public Criteria andTrackTimeIn(List<Date> values) {
            addCriterion("track_time in", values, "trackTime");
            return (Criteria) this;
        }

        public Criteria andTrackTimeNotIn(List<Date> values) {
            addCriterion("track_time not in", values, "trackTime");
            return (Criteria) this;
        }

        public Criteria andTrackTimeBetween(Date value1, Date value2) {
            addCriterion("track_time between", value1, value2, "trackTime");
            return (Criteria) this;
        }

        public Criteria andTrackTimeNotBetween(Date value1, Date value2) {
            addCriterion("track_time not between", value1, value2, "trackTime");
            return (Criteria) this;
        }

        public Criteria andYaliIsNull() {
            addCriterion("yali is null");
            return (Criteria) this;
        }

        public Criteria andYaliIsNotNull() {
            addCriterion("yali is not null");
            return (Criteria) this;
        }

        public Criteria andYaliEqualTo(String value) {
            addCriterion("yali =", value, "yali");
            return (Criteria) this;
        }

        public Criteria andYaliNotEqualTo(String value) {
            addCriterion("yali <>", value, "yali");
            return (Criteria) this;
        }

        public Criteria andYaliGreaterThan(String value) {
            addCriterion("yali >", value, "yali");
            return (Criteria) this;
        }

        public Criteria andYaliGreaterThanOrEqualTo(String value) {
            addCriterion("yali >=", value, "yali");
            return (Criteria) this;
        }

        public Criteria andYaliLessThan(String value) {
            addCriterion("yali <", value, "yali");
            return (Criteria) this;
        }

        public Criteria andYaliLessThanOrEqualTo(String value) {
            addCriterion("yali <=", value, "yali");
            return (Criteria) this;
        }

        public Criteria andYaliLike(String value) {
            addCriterion("yali like", value, "yali");
            return (Criteria) this;
        }

        public Criteria andYaliNotLike(String value) {
            addCriterion("yali not like", value, "yali");
            return (Criteria) this;
        }

        public Criteria andYaliIn(List<String> values) {
            addCriterion("yali in", values, "yali");
            return (Criteria) this;
        }

        public Criteria andYaliNotIn(List<String> values) {
            addCriterion("yali not in", values, "yali");
            return (Criteria) this;
        }

        public Criteria andYaliBetween(String value1, String value2) {
            addCriterion("yali between", value1, value2, "yali");
            return (Criteria) this;
        }

        public Criteria andYaliNotBetween(String value1, String value2) {
            addCriterion("yali not between", value1, value2, "yali");
            return (Criteria) this;
        }

        public Criteria andTempIsNull() {
            addCriterion("temp is null");
            return (Criteria) this;
        }

        public Criteria andTempIsNotNull() {
            addCriterion("temp is not null");
            return (Criteria) this;
        }

        public Criteria andTempEqualTo(String value) {
            addCriterion("temp =", value, "temp");
            return (Criteria) this;
        }

        public Criteria andTempNotEqualTo(String value) {
            addCriterion("temp <>", value, "temp");
            return (Criteria) this;
        }

        public Criteria andTempGreaterThan(String value) {
            addCriterion("temp >", value, "temp");
            return (Criteria) this;
        }

        public Criteria andTempGreaterThanOrEqualTo(String value) {
            addCriterion("temp >=", value, "temp");
            return (Criteria) this;
        }

        public Criteria andTempLessThan(String value) {
            addCriterion("temp <", value, "temp");
            return (Criteria) this;
        }

        public Criteria andTempLessThanOrEqualTo(String value) {
            addCriterion("temp <=", value, "temp");
            return (Criteria) this;
        }

        public Criteria andTempLike(String value) {
            addCriterion("temp like", value, "temp");
            return (Criteria) this;
        }

        public Criteria andTempNotLike(String value) {
            addCriterion("temp not like", value, "temp");
            return (Criteria) this;
        }

        public Criteria andTempIn(List<String> values) {
            addCriterion("temp in", values, "temp");
            return (Criteria) this;
        }

        public Criteria andTempNotIn(List<String> values) {
            addCriterion("temp not in", values, "temp");
            return (Criteria) this;
        }

        public Criteria andTempBetween(String value1, String value2) {
            addCriterion("temp between", value1, value2, "temp");
            return (Criteria) this;
        }

        public Criteria andTempNotBetween(String value1, String value2) {
            addCriterion("temp not between", value1, value2, "temp");
            return (Criteria) this;
        }

        public Criteria andShiduIsNull() {
            addCriterion("shidu is null");
            return (Criteria) this;
        }

        public Criteria andShiduIsNotNull() {
            addCriterion("shidu is not null");
            return (Criteria) this;
        }

        public Criteria andShiduEqualTo(String value) {
            addCriterion("shidu =", value, "shidu");
            return (Criteria) this;
        }

        public Criteria andShiduNotEqualTo(String value) {
            addCriterion("shidu <>", value, "shidu");
            return (Criteria) this;
        }

        public Criteria andShiduGreaterThan(String value) {
            addCriterion("shidu >", value, "shidu");
            return (Criteria) this;
        }

        public Criteria andShiduGreaterThanOrEqualTo(String value) {
            addCriterion("shidu >=", value, "shidu");
            return (Criteria) this;
        }

        public Criteria andShiduLessThan(String value) {
            addCriterion("shidu <", value, "shidu");
            return (Criteria) this;
        }

        public Criteria andShiduLessThanOrEqualTo(String value) {
            addCriterion("shidu <=", value, "shidu");
            return (Criteria) this;
        }

        public Criteria andShiduLike(String value) {
            addCriterion("shidu like", value, "shidu");
            return (Criteria) this;
        }

        public Criteria andShiduNotLike(String value) {
            addCriterion("shidu not like", value, "shidu");
            return (Criteria) this;
        }

        public Criteria andShiduIn(List<String> values) {
            addCriterion("shidu in", values, "shidu");
            return (Criteria) this;
        }

        public Criteria andShiduNotIn(List<String> values) {
            addCriterion("shidu not in", values, "shidu");
            return (Criteria) this;
        }

        public Criteria andShiduBetween(String value1, String value2) {
            addCriterion("shidu between", value1, value2, "shidu");
            return (Criteria) this;
        }

        public Criteria andShiduNotBetween(String value1, String value2) {
            addCriterion("shidu not between", value1, value2, "shidu");
            return (Criteria) this;
        }

        public Criteria andDoorStateIsNull() {
            addCriterion("door_state is null");
            return (Criteria) this;
        }

        public Criteria andDoorStateIsNotNull() {
            addCriterion("door_state is not null");
            return (Criteria) this;
        }

        public Criteria andDoorStateEqualTo(Integer value) {
            addCriterion("door_state =", value, "doorState");
            return (Criteria) this;
        }

        public Criteria andDoorStateNotEqualTo(Integer value) {
            addCriterion("door_state <>", value, "doorState");
            return (Criteria) this;
        }

        public Criteria andDoorStateGreaterThan(Integer value) {
            addCriterion("door_state >", value, "doorState");
            return (Criteria) this;
        }

        public Criteria andDoorStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("door_state >=", value, "doorState");
            return (Criteria) this;
        }

        public Criteria andDoorStateLessThan(Integer value) {
            addCriterion("door_state <", value, "doorState");
            return (Criteria) this;
        }

        public Criteria andDoorStateLessThanOrEqualTo(Integer value) {
            addCriterion("door_state <=", value, "doorState");
            return (Criteria) this;
        }

        public Criteria andDoorStateIn(List<Integer> values) {
            addCriterion("door_state in", values, "doorState");
            return (Criteria) this;
        }

        public Criteria andDoorStateNotIn(List<Integer> values) {
            addCriterion("door_state not in", values, "doorState");
            return (Criteria) this;
        }

        public Criteria andDoorStateBetween(Integer value1, Integer value2) {
            addCriterion("door_state between", value1, value2, "doorState");
            return (Criteria) this;
        }

        public Criteria andDoorStateNotBetween(Integer value1, Integer value2) {
            addCriterion("door_state not between", value1, value2, "doorState");
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

        public Criteria orLatitudeIsNull() {
            addCriterion("latitude is null");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orLatitudeIsNotNull() {
            addCriterion("latitude is not null");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orLatitudeEqualTo(String value) {
            addCriterion("latitude =", value, "latitude");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orLatitudeNotEqualTo(String value) {
            addCriterion("latitude <>", value, "latitude");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orLatitudeGreaterThan(String value) {
            addCriterion("latitude >", value, "latitude");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orLatitudeGreaterThanOrEqualTo(String value) {
            addCriterion("latitude >=", value, "latitude");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orLatitudeLessThan(String value) {
            addCriterion("latitude <", value, "latitude");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orLatitudeLessThanOrEqualTo(String value) {
            addCriterion("latitude <=", value, "latitude");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orLatitudeLike(String value) {
            addCriterion("latitude like", value, "latitude");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orLatitudeNotLike(String value) {
            addCriterion("latitude not like", value, "latitude");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orLatitudeIn(List<String> values) {
            addCriterion("latitude in", values, "latitude");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orLatitudeNotIn(List<String> values) {
            addCriterion("latitude not in", values, "latitude");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orLatitudeBetween(String value1, String value2) {
            addCriterion("latitude between", value1, value2, "latitude");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orLatitudeNotBetween(String value1, String value2) {
            addCriterion("latitude not between", value1, value2, "latitude");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orLongitudeIsNull() {
            addCriterion("longitude is null");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orLongitudeIsNotNull() {
            addCriterion("longitude is not null");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orLongitudeEqualTo(String value) {
            addCriterion("longitude =", value, "longitude");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orLongitudeNotEqualTo(String value) {
            addCriterion("longitude <>", value, "longitude");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orLongitudeGreaterThan(String value) {
            addCriterion("longitude >", value, "longitude");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orLongitudeGreaterThanOrEqualTo(String value) {
            addCriterion("longitude >=", value, "longitude");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orLongitudeLessThan(String value) {
            addCriterion("longitude <", value, "longitude");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orLongitudeLessThanOrEqualTo(String value) {
            addCriterion("longitude <=", value, "longitude");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orLongitudeLike(String value) {
            addCriterion("longitude like", value, "longitude");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orLongitudeNotLike(String value) {
            addCriterion("longitude not like", value, "longitude");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orLongitudeIn(List<String> values) {
            addCriterion("longitude in", values, "longitude");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orLongitudeNotIn(List<String> values) {
            addCriterion("longitude not in", values, "longitude");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orLongitudeBetween(String value1, String value2) {
            addCriterion("longitude between", value1, value2, "longitude");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orLongitudeNotBetween(String value1, String value2) {
            addCriterion("longitude not between", value1, value2, "longitude");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orCoordTypeIsNull() {
            addCriterion("coord_type is null");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orCoordTypeIsNotNull() {
            addCriterion("coord_type is not null");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orCoordTypeEqualTo(Byte value) {
            addCriterion("coord_type =", value, "coordType");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orCoordTypeNotEqualTo(Byte value) {
            addCriterion("coord_type <>", value, "coordType");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orCoordTypeGreaterThan(Byte value) {
            addCriterion("coord_type >", value, "coordType");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orCoordTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("coord_type >=", value, "coordType");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orCoordTypeLessThan(Byte value) {
            addCriterion("coord_type <", value, "coordType");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orCoordTypeLessThanOrEqualTo(Byte value) {
            addCriterion("coord_type <=", value, "coordType");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orCoordTypeIn(List<Byte> values) {
            addCriterion("coord_type in", values, "coordType");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orCoordTypeNotIn(List<Byte> values) {
            addCriterion("coord_type not in", values, "coordType");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orCoordTypeBetween(Byte value1, Byte value2) {
            addCriterion("coord_type between", value1, value2, "coordType");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orCoordTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("coord_type not between", value1, value2, "coordType");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orTrackTimeIsNull() {
            addCriterion("track_time is null");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orTrackTimeIsNotNull() {
            addCriterion("track_time is not null");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orTrackTimeEqualTo(Date value) {
            addCriterion("track_time =", value, "trackTime");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orTrackTimeNotEqualTo(Date value) {
            addCriterion("track_time <>", value, "trackTime");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orTrackTimeGreaterThan(Date value) {
            addCriterion("track_time >", value, "trackTime");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orTrackTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("track_time >=", value, "trackTime");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orTrackTimeLessThan(Date value) {
            addCriterion("track_time <", value, "trackTime");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orTrackTimeLessThanOrEqualTo(Date value) {
            addCriterion("track_time <=", value, "trackTime");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orTrackTimeIn(List<Date> values) {
            addCriterion("track_time in", values, "trackTime");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orTrackTimeNotIn(List<Date> values) {
            addCriterion("track_time not in", values, "trackTime");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orTrackTimeBetween(Date value1, Date value2) {
            addCriterion("track_time between", value1, value2, "trackTime");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orTrackTimeNotBetween(Date value1, Date value2) {
            addCriterion("track_time not between", value1, value2, "trackTime");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orYaliIsNull() {
            addCriterion("yali is null");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orYaliIsNotNull() {
            addCriterion("yali is not null");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orYaliEqualTo(String value) {
            addCriterion("yali =", value, "yali");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orYaliNotEqualTo(String value) {
            addCriterion("yali <>", value, "yali");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orYaliGreaterThan(String value) {
            addCriterion("yali >", value, "yali");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orYaliGreaterThanOrEqualTo(String value) {
            addCriterion("yali >=", value, "yali");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orYaliLessThan(String value) {
            addCriterion("yali <", value, "yali");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orYaliLessThanOrEqualTo(String value) {
            addCriterion("yali <=", value, "yali");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orYaliLike(String value) {
            addCriterion("yali like", value, "yali");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orYaliNotLike(String value) {
            addCriterion("yali not like", value, "yali");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orYaliIn(List<String> values) {
            addCriterion("yali in", values, "yali");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orYaliNotIn(List<String> values) {
            addCriterion("yali not in", values, "yali");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orYaliBetween(String value1, String value2) {
            addCriterion("yali between", value1, value2, "yali");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orYaliNotBetween(String value1, String value2) {
            addCriterion("yali not between", value1, value2, "yali");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orTempIsNull() {
            addCriterion("temp is null");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orTempIsNotNull() {
            addCriterion("temp is not null");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orTempEqualTo(String value) {
            addCriterion("temp =", value, "temp");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orTempNotEqualTo(String value) {
            addCriterion("temp <>", value, "temp");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orTempGreaterThan(String value) {
            addCriterion("temp >", value, "temp");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orTempGreaterThanOrEqualTo(String value) {
            addCriterion("temp >=", value, "temp");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orTempLessThan(String value) {
            addCriterion("temp <", value, "temp");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orTempLessThanOrEqualTo(String value) {
            addCriterion("temp <=", value, "temp");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orTempLike(String value) {
            addCriterion("temp like", value, "temp");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orTempNotLike(String value) {
            addCriterion("temp not like", value, "temp");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orTempIn(List<String> values) {
            addCriterion("temp in", values, "temp");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orTempNotIn(List<String> values) {
            addCriterion("temp not in", values, "temp");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orTempBetween(String value1, String value2) {
            addCriterion("temp between", value1, value2, "temp");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orTempNotBetween(String value1, String value2) {
            addCriterion("temp not between", value1, value2, "temp");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orShiduIsNull() {
            addCriterion("shidu is null");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orShiduIsNotNull() {
            addCriterion("shidu is not null");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orShiduEqualTo(String value) {
            addCriterion("shidu =", value, "shidu");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orShiduNotEqualTo(String value) {
            addCriterion("shidu <>", value, "shidu");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orShiduGreaterThan(String value) {
            addCriterion("shidu >", value, "shidu");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orShiduGreaterThanOrEqualTo(String value) {
            addCriterion("shidu >=", value, "shidu");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orShiduLessThan(String value) {
            addCriterion("shidu <", value, "shidu");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orShiduLessThanOrEqualTo(String value) {
            addCriterion("shidu <=", value, "shidu");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orShiduLike(String value) {
            addCriterion("shidu like", value, "shidu");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orShiduNotLike(String value) {
            addCriterion("shidu not like", value, "shidu");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orShiduIn(List<String> values) {
            addCriterion("shidu in", values, "shidu");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orShiduNotIn(List<String> values) {
            addCriterion("shidu not in", values, "shidu");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orShiduBetween(String value1, String value2) {
            addCriterion("shidu between", value1, value2, "shidu");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orShiduNotBetween(String value1, String value2) {
            addCriterion("shidu not between", value1, value2, "shidu");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orDoorStateIsNull() {
            addCriterion("door_state is null");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orDoorStateIsNotNull() {
            addCriterion("door_state is not null");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orDoorStateEqualTo(Integer value) {
            addCriterion("door_state =", value, "doorState");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orDoorStateNotEqualTo(Integer value) {
            addCriterion("door_state <>", value, "doorState");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orDoorStateGreaterThan(Integer value) {
            addCriterion("door_state >", value, "doorState");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orDoorStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("door_state >=", value, "doorState");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orDoorStateLessThan(Integer value) {
            addCriterion("door_state <", value, "doorState");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orDoorStateLessThanOrEqualTo(Integer value) {
            addCriterion("door_state <=", value, "doorState");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orDoorStateIn(List<Integer> values) {
            addCriterion("door_state in", values, "doorState");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orDoorStateNotIn(List<Integer> values) {
            addCriterion("door_state not in", values, "doorState");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orDoorStateBetween(Integer value1, Integer value2) {
            addCriterion("door_state between", value1, value2, "doorState");
            criteria.get(criteria.size()-1).setCriterionLogical("or");
            return (Criteria) this;
        }

        public Criteria orDoorStateNotBetween(Integer value1, Integer value2) {
            addCriterion("door_state not between", value1, value2, "doorState");
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