package com.swagger.idoc.po;

import java.util.ArrayList;
import java.util.List;

public class TDocRespParamExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TDocRespParamExample() {
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

        public Criteria andPathItemIdIsNull() {
            addCriterion("path_item_id is null");
            return (Criteria) this;
        }

        public Criteria andPathItemIdIsNotNull() {
            addCriterion("path_item_id is not null");
            return (Criteria) this;
        }

        public Criteria andPathItemIdEqualTo(Integer value) {
            addCriterion("path_item_id =", value, "pathItemId");
            return (Criteria) this;
        }

        public Criteria andPathItemIdNotEqualTo(Integer value) {
            addCriterion("path_item_id <>", value, "pathItemId");
            return (Criteria) this;
        }

        public Criteria andPathItemIdGreaterThan(Integer value) {
            addCriterion("path_item_id >", value, "pathItemId");
            return (Criteria) this;
        }

        public Criteria andPathItemIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("path_item_id >=", value, "pathItemId");
            return (Criteria) this;
        }

        public Criteria andPathItemIdLessThan(Integer value) {
            addCriterion("path_item_id <", value, "pathItemId");
            return (Criteria) this;
        }

        public Criteria andPathItemIdLessThanOrEqualTo(Integer value) {
            addCriterion("path_item_id <=", value, "pathItemId");
            return (Criteria) this;
        }

        public Criteria andPathItemIdIn(List<Integer> values) {
            addCriterion("path_item_id in", values, "pathItemId");
            return (Criteria) this;
        }

        public Criteria andPathItemIdNotIn(List<Integer> values) {
            addCriterion("path_item_id not in", values, "pathItemId");
            return (Criteria) this;
        }

        public Criteria andPathItemIdBetween(Integer value1, Integer value2) {
            addCriterion("path_item_id between", value1, value2, "pathItemId");
            return (Criteria) this;
        }

        public Criteria andPathItemIdNotBetween(Integer value1, Integer value2) {
            addCriterion("path_item_id not between", value1, value2, "pathItemId");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andCutIsNull() {
            addCriterion("cut is null");
            return (Criteria) this;
        }

        public Criteria andCutIsNotNull() {
            addCriterion("cut is not null");
            return (Criteria) this;
        }

        public Criteria andCutEqualTo(String value) {
            addCriterion("cut =", value, "cut");
            return (Criteria) this;
        }

        public Criteria andCutNotEqualTo(String value) {
            addCriterion("cut <>", value, "cut");
            return (Criteria) this;
        }

        public Criteria andCutGreaterThan(String value) {
            addCriterion("cut >", value, "cut");
            return (Criteria) this;
        }

        public Criteria andCutGreaterThanOrEqualTo(String value) {
            addCriterion("cut >=", value, "cut");
            return (Criteria) this;
        }

        public Criteria andCutLessThan(String value) {
            addCriterion("cut <", value, "cut");
            return (Criteria) this;
        }

        public Criteria andCutLessThanOrEqualTo(String value) {
            addCriterion("cut <=", value, "cut");
            return (Criteria) this;
        }

        public Criteria andCutLike(String value) {
            addCriterion("cut like", value, "cut");
            return (Criteria) this;
        }

        public Criteria andCutNotLike(String value) {
            addCriterion("cut not like", value, "cut");
            return (Criteria) this;
        }

        public Criteria andCutIn(List<String> values) {
            addCriterion("cut in", values, "cut");
            return (Criteria) this;
        }

        public Criteria andCutNotIn(List<String> values) {
            addCriterion("cut not in", values, "cut");
            return (Criteria) this;
        }

        public Criteria andCutBetween(String value1, String value2) {
            addCriterion("cut between", value1, value2, "cut");
            return (Criteria) this;
        }

        public Criteria andCutNotBetween(String value1, String value2) {
            addCriterion("cut not between", value1, value2, "cut");
            return (Criteria) this;
        }

        public Criteria andRefIdIsNull() {
            addCriterion("ref_id is null");
            return (Criteria) this;
        }

        public Criteria andRefIdIsNotNull() {
            addCriterion("ref_id is not null");
            return (Criteria) this;
        }

        public Criteria andRefIdEqualTo(Integer value) {
            addCriterion("ref_id =", value, "refId");
            return (Criteria) this;
        }

        public Criteria andRefIdNotEqualTo(Integer value) {
            addCriterion("ref_id <>", value, "refId");
            return (Criteria) this;
        }

        public Criteria andRefIdGreaterThan(Integer value) {
            addCriterion("ref_id >", value, "refId");
            return (Criteria) this;
        }

        public Criteria andRefIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ref_id >=", value, "refId");
            return (Criteria) this;
        }

        public Criteria andRefIdLessThan(Integer value) {
            addCriterion("ref_id <", value, "refId");
            return (Criteria) this;
        }

        public Criteria andRefIdLessThanOrEqualTo(Integer value) {
            addCriterion("ref_id <=", value, "refId");
            return (Criteria) this;
        }

        public Criteria andRefIdIn(List<Integer> values) {
            addCriterion("ref_id in", values, "refId");
            return (Criteria) this;
        }

        public Criteria andRefIdNotIn(List<Integer> values) {
            addCriterion("ref_id not in", values, "refId");
            return (Criteria) this;
        }

        public Criteria andRefIdBetween(Integer value1, Integer value2) {
            addCriterion("ref_id between", value1, value2, "refId");
            return (Criteria) this;
        }

        public Criteria andRefIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ref_id not between", value1, value2, "refId");
            return (Criteria) this;
        }

        public Criteria andIsArrIsNull() {
            addCriterion("is_arr is null");
            return (Criteria) this;
        }

        public Criteria andIsArrIsNotNull() {
            addCriterion("is_arr is not null");
            return (Criteria) this;
        }

        public Criteria andIsArrEqualTo(Boolean value) {
            addCriterion("is_arr =", value, "isArr");
            return (Criteria) this;
        }

        public Criteria andIsArrNotEqualTo(Boolean value) {
            addCriterion("is_arr <>", value, "isArr");
            return (Criteria) this;
        }

        public Criteria andIsArrGreaterThan(Boolean value) {
            addCriterion("is_arr >", value, "isArr");
            return (Criteria) this;
        }

        public Criteria andIsArrGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_arr >=", value, "isArr");
            return (Criteria) this;
        }

        public Criteria andIsArrLessThan(Boolean value) {
            addCriterion("is_arr <", value, "isArr");
            return (Criteria) this;
        }

        public Criteria andIsArrLessThanOrEqualTo(Boolean value) {
            addCriterion("is_arr <=", value, "isArr");
            return (Criteria) this;
        }

        public Criteria andIsArrIn(List<Boolean> values) {
            addCriterion("is_arr in", values, "isArr");
            return (Criteria) this;
        }

        public Criteria andIsArrNotIn(List<Boolean> values) {
            addCriterion("is_arr not in", values, "isArr");
            return (Criteria) this;
        }

        public Criteria andIsArrBetween(Boolean value1, Boolean value2) {
            addCriterion("is_arr between", value1, value2, "isArr");
            return (Criteria) this;
        }

        public Criteria andIsArrNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_arr not between", value1, value2, "isArr");
            return (Criteria) this;
        }

        public Criteria andParrentIdIsNull() {
            addCriterion("parrent_id is null");
            return (Criteria) this;
        }

        public Criteria andParrentIdIsNotNull() {
            addCriterion("parrent_id is not null");
            return (Criteria) this;
        }

        public Criteria andParrentIdEqualTo(Integer value) {
            addCriterion("parrent_id =", value, "parrentId");
            return (Criteria) this;
        }

        public Criteria andParrentIdNotEqualTo(Integer value) {
            addCriterion("parrent_id <>", value, "parrentId");
            return (Criteria) this;
        }

        public Criteria andParrentIdGreaterThan(Integer value) {
            addCriterion("parrent_id >", value, "parrentId");
            return (Criteria) this;
        }

        public Criteria andParrentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("parrent_id >=", value, "parrentId");
            return (Criteria) this;
        }

        public Criteria andParrentIdLessThan(Integer value) {
            addCriterion("parrent_id <", value, "parrentId");
            return (Criteria) this;
        }

        public Criteria andParrentIdLessThanOrEqualTo(Integer value) {
            addCriterion("parrent_id <=", value, "parrentId");
            return (Criteria) this;
        }

        public Criteria andParrentIdIn(List<Integer> values) {
            addCriterion("parrent_id in", values, "parrentId");
            return (Criteria) this;
        }

        public Criteria andParrentIdNotIn(List<Integer> values) {
            addCriterion("parrent_id not in", values, "parrentId");
            return (Criteria) this;
        }

        public Criteria andParrentIdBetween(Integer value1, Integer value2) {
            addCriterion("parrent_id between", value1, value2, "parrentId");
            return (Criteria) this;
        }

        public Criteria andParrentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("parrent_id not between", value1, value2, "parrentId");
            return (Criteria) this;
        }

        public Criteria andUserDefIsNull() {
            addCriterion("user_def is null");
            return (Criteria) this;
        }

        public Criteria andUserDefIsNotNull() {
            addCriterion("user_def is not null");
            return (Criteria) this;
        }

        public Criteria andUserDefEqualTo(Integer value) {
            addCriterion("user_def =", value, "userDef");
            return (Criteria) this;
        }

        public Criteria andUserDefNotEqualTo(Integer value) {
            addCriterion("user_def <>", value, "userDef");
            return (Criteria) this;
        }

        public Criteria andUserDefGreaterThan(Integer value) {
            addCriterion("user_def >", value, "userDef");
            return (Criteria) this;
        }

        public Criteria andUserDefGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_def >=", value, "userDef");
            return (Criteria) this;
        }

        public Criteria andUserDefLessThan(Integer value) {
            addCriterion("user_def <", value, "userDef");
            return (Criteria) this;
        }

        public Criteria andUserDefLessThanOrEqualTo(Integer value) {
            addCriterion("user_def <=", value, "userDef");
            return (Criteria) this;
        }

        public Criteria andUserDefIn(List<Integer> values) {
            addCriterion("user_def in", values, "userDef");
            return (Criteria) this;
        }

        public Criteria andUserDefNotIn(List<Integer> values) {
            addCriterion("user_def not in", values, "userDef");
            return (Criteria) this;
        }

        public Criteria andUserDefBetween(Integer value1, Integer value2) {
            addCriterion("user_def between", value1, value2, "userDef");
            return (Criteria) this;
        }

        public Criteria andUserDefNotBetween(Integer value1, Integer value2) {
            addCriterion("user_def not between", value1, value2, "userDef");
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