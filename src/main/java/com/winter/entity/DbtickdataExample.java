package com.winter.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.validator.constraints.NotEmpty;

public class DbtickdataExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    private Boolean forUpdate;

    public DbtickdataExample() {
        oredCriteria = new ArrayList<>();
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

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Long offset) {
        this.offset = offset;
    }

    public Long getOffset() {
        return offset;
    }

    public void setForUpdate(Boolean forUpdate) {
        this.forUpdate = forUpdate;
    }

    public Boolean getForUpdate() {
        return forUpdate;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<>();
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
            addCriterion("dbtickdata.id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("dbtickdata.id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("dbtickdata.id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("dbtickdata.id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("dbtickdata.id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("dbtickdata.id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("dbtickdata.id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("dbtickdata.id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("dbtickdata.id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("dbtickdata.id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("dbtickdata.id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("dbtickdata.id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andSymbolIsNull() {
            addCriterion("dbtickdata.symbol is null");
            return (Criteria) this;
        }

        public Criteria andSymbolIsNotNull() {
            addCriterion("dbtickdata.symbol is not null");
            return (Criteria) this;
        }

        public Criteria andSymbolEqualTo(String value) {
            addCriterion("dbtickdata.symbol =", value, "symbol");
            return (Criteria) this;
        }

        public Criteria andSymbolNotEqualTo(String value) {
            addCriterion("dbtickdata.symbol <>", value, "symbol");
            return (Criteria) this;
        }

        public Criteria andSymbolGreaterThan(String value) {
            addCriterion("dbtickdata.symbol >", value, "symbol");
            return (Criteria) this;
        }

        public Criteria andSymbolGreaterThanOrEqualTo(String value) {
            addCriterion("dbtickdata.symbol >=", value, "symbol");
            return (Criteria) this;
        }

        public Criteria andSymbolLessThan(String value) {
            addCriterion("dbtickdata.symbol <", value, "symbol");
            return (Criteria) this;
        }

        public Criteria andSymbolLessThanOrEqualTo(String value) {
            addCriterion("dbtickdata.symbol <=", value, "symbol");
            return (Criteria) this;
        }

        public Criteria andSymbolLike(String value) {
            addCriterion("dbtickdata.symbol like", value, "symbol");
            return (Criteria) this;
        }

        public Criteria andSymbolNotLike(String value) {
            addCriterion("dbtickdata.symbol not like", value, "symbol");
            return (Criteria) this;
        }

        public Criteria andSymbolIn(List<String> values) {
            addCriterion("dbtickdata.symbol in", values, "symbol");
            return (Criteria) this;
        }

        public Criteria andSymbolNotIn(List<String> values) {
            addCriterion("dbtickdata.symbol not in", values, "symbol");
            return (Criteria) this;
        }

        public Criteria andSymbolBetween(String value1, String value2) {
            addCriterion("dbtickdata.symbol between", value1, value2, "symbol");
            return (Criteria) this;
        }

        public Criteria andSymbolNotBetween(String value1, String value2) {
            addCriterion("dbtickdata.symbol not between", value1, value2, "symbol");
            return (Criteria) this;
        }

        public Criteria andExchangeIsNull() {
            addCriterion("dbtickdata.exchange is null");
            return (Criteria) this;
        }

        public Criteria andExchangeIsNotNull() {
            addCriterion("dbtickdata.exchange is not null");
            return (Criteria) this;
        }

        public Criteria andExchangeEqualTo(String value) {
            addCriterion("dbtickdata.exchange =", value, "exchange");
            return (Criteria) this;
        }

        public Criteria andExchangeNotEqualTo(String value) {
            addCriterion("dbtickdata.exchange <>", value, "exchange");
            return (Criteria) this;
        }

        public Criteria andExchangeGreaterThan(String value) {
            addCriterion("dbtickdata.exchange >", value, "exchange");
            return (Criteria) this;
        }

        public Criteria andExchangeGreaterThanOrEqualTo(String value) {
            addCriterion("dbtickdata.exchange >=", value, "exchange");
            return (Criteria) this;
        }

        public Criteria andExchangeLessThan(String value) {
            addCriterion("dbtickdata.exchange <", value, "exchange");
            return (Criteria) this;
        }

        public Criteria andExchangeLessThanOrEqualTo(String value) {
            addCriterion("dbtickdata.exchange <=", value, "exchange");
            return (Criteria) this;
        }

        public Criteria andExchangeLike(String value) {
            addCriterion("dbtickdata.exchange like", value, "exchange");
            return (Criteria) this;
        }

        public Criteria andExchangeNotLike(String value) {
            addCriterion("dbtickdata.exchange not like", value, "exchange");
            return (Criteria) this;
        }

        public Criteria andExchangeIn(List<String> values) {
            addCriterion("dbtickdata.exchange in", values, "exchange");
            return (Criteria) this;
        }

        public Criteria andExchangeNotIn(List<String> values) {
            addCriterion("dbtickdata.exchange not in", values, "exchange");
            return (Criteria) this;
        }

        public Criteria andExchangeBetween(String value1, String value2) {
            addCriterion("dbtickdata.exchange between", value1, value2, "exchange");
            return (Criteria) this;
        }

        public Criteria andExchangeNotBetween(String value1, String value2) {
            addCriterion("dbtickdata.exchange not between", value1, value2, "exchange");
            return (Criteria) this;
        }

        public Criteria andDatetimeIsNull() {
            addCriterion("dbtickdata.`datetime` is null");
            return (Criteria) this;
        }

        public Criteria andDatetimeIsNotNull() {
            addCriterion("dbtickdata.`datetime` is not null");
            return (Criteria) this;
        }

        public Criteria andDatetimeEqualTo(LocalDateTime value) {
            addCriterion("dbtickdata.`datetime` =", value, "datetime");
            return (Criteria) this;
        }

        public Criteria andDatetimeNotEqualTo(LocalDateTime value) {
            addCriterion("dbtickdata.`datetime` <>", value, "datetime");
            return (Criteria) this;
        }

        public Criteria andDatetimeGreaterThan(LocalDateTime value) {
            addCriterion("dbtickdata.`datetime` >", value, "datetime");
            return (Criteria) this;
        }

        public Criteria andDatetimeGreaterThanOrEqualTo(LocalDateTime value) {
            addCriterion("dbtickdata.`datetime` >=", value, "datetime");
            return (Criteria) this;
        }

        public Criteria andDatetimeLessThan(LocalDateTime value) {
            addCriterion("dbtickdata.`datetime` <", value, "datetime");
            return (Criteria) this;
        }

        public Criteria andDatetimeLessThanOrEqualTo(LocalDateTime value) {
            addCriterion("dbtickdata.`datetime` <=", value, "datetime");
            return (Criteria) this;
        }

        public Criteria andDatetimeIn(List<LocalDateTime> values) {
            addCriterion("dbtickdata.`datetime` in", values, "datetime");
            return (Criteria) this;
        }

        public Criteria andDatetimeNotIn(List<LocalDateTime> values) {
            addCriterion("dbtickdata.`datetime` not in", values, "datetime");
            return (Criteria) this;
        }

        public Criteria andDatetimeBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("dbtickdata.`datetime` between", value1, value2, "datetime");
            return (Criteria) this;
        }

        public Criteria andDatetimeNotBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("dbtickdata.`datetime` not between", value1, value2, "datetime");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("dbtickdata.`name` is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("dbtickdata.`name` is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("dbtickdata.`name` =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("dbtickdata.`name` <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("dbtickdata.`name` >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("dbtickdata.`name` >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("dbtickdata.`name` <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("dbtickdata.`name` <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("dbtickdata.`name` like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("dbtickdata.`name` not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("dbtickdata.`name` in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("dbtickdata.`name` not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("dbtickdata.`name` between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("dbtickdata.`name` not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andVolumeIsNull() {
            addCriterion("dbtickdata.volume is null");
            return (Criteria) this;
        }

        public Criteria andVolumeIsNotNull() {
            addCriterion("dbtickdata.volume is not null");
            return (Criteria) this;
        }

        public Criteria andVolumeEqualTo(Double value) {
            addCriterion("dbtickdata.volume =", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeNotEqualTo(Double value) {
            addCriterion("dbtickdata.volume <>", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeGreaterThan(Double value) {
            addCriterion("dbtickdata.volume >", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeGreaterThanOrEqualTo(Double value) {
            addCriterion("dbtickdata.volume >=", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeLessThan(Double value) {
            addCriterion("dbtickdata.volume <", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeLessThanOrEqualTo(Double value) {
            addCriterion("dbtickdata.volume <=", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeIn(List<Double> values) {
            addCriterion("dbtickdata.volume in", values, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeNotIn(List<Double> values) {
            addCriterion("dbtickdata.volume not in", values, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeBetween(Double value1, Double value2) {
            addCriterion("dbtickdata.volume between", value1, value2, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeNotBetween(Double value1, Double value2) {
            addCriterion("dbtickdata.volume not between", value1, value2, "volume");
            return (Criteria) this;
        }

        public Criteria andOpen_interestIsNull() {
            addCriterion("dbtickdata.open_interest is null");
            return (Criteria) this;
        }

        public Criteria andOpen_interestIsNotNull() {
            addCriterion("dbtickdata.open_interest is not null");
            return (Criteria) this;
        }

        public Criteria andOpen_interestEqualTo(Double value) {
            addCriterion("dbtickdata.open_interest =", value, "open_interest");
            return (Criteria) this;
        }

        public Criteria andOpen_interestNotEqualTo(Double value) {
            addCriterion("dbtickdata.open_interest <>", value, "open_interest");
            return (Criteria) this;
        }

        public Criteria andOpen_interestGreaterThan(Double value) {
            addCriterion("dbtickdata.open_interest >", value, "open_interest");
            return (Criteria) this;
        }

        public Criteria andOpen_interestGreaterThanOrEqualTo(Double value) {
            addCriterion("dbtickdata.open_interest >=", value, "open_interest");
            return (Criteria) this;
        }

        public Criteria andOpen_interestLessThan(Double value) {
            addCriterion("dbtickdata.open_interest <", value, "open_interest");
            return (Criteria) this;
        }

        public Criteria andOpen_interestLessThanOrEqualTo(Double value) {
            addCriterion("dbtickdata.open_interest <=", value, "open_interest");
            return (Criteria) this;
        }

        public Criteria andOpen_interestIn(List<Double> values) {
            addCriterion("dbtickdata.open_interest in", values, "open_interest");
            return (Criteria) this;
        }

        public Criteria andOpen_interestNotIn(List<Double> values) {
            addCriterion("dbtickdata.open_interest not in", values, "open_interest");
            return (Criteria) this;
        }

        public Criteria andOpen_interestBetween(Double value1, Double value2) {
            addCriterion("dbtickdata.open_interest between", value1, value2, "open_interest");
            return (Criteria) this;
        }

        public Criteria andOpen_interestNotBetween(Double value1, Double value2) {
            addCriterion("dbtickdata.open_interest not between", value1, value2, "open_interest");
            return (Criteria) this;
        }

        public Criteria andLast_priceIsNull() {
            addCriterion("dbtickdata.last_price is null");
            return (Criteria) this;
        }

        public Criteria andLast_priceIsNotNull() {
            addCriterion("dbtickdata.last_price is not null");
            return (Criteria) this;
        }

        public Criteria andLast_priceEqualTo(Double value) {
            addCriterion("dbtickdata.last_price =", value, "last_price");
            return (Criteria) this;
        }

        public Criteria andLast_priceNotEqualTo(Double value) {
            addCriterion("dbtickdata.last_price <>", value, "last_price");
            return (Criteria) this;
        }

        public Criteria andLast_priceGreaterThan(Double value) {
            addCriterion("dbtickdata.last_price >", value, "last_price");
            return (Criteria) this;
        }

        public Criteria andLast_priceGreaterThanOrEqualTo(Double value) {
            addCriterion("dbtickdata.last_price >=", value, "last_price");
            return (Criteria) this;
        }

        public Criteria andLast_priceLessThan(Double value) {
            addCriterion("dbtickdata.last_price <", value, "last_price");
            return (Criteria) this;
        }

        public Criteria andLast_priceLessThanOrEqualTo(Double value) {
            addCriterion("dbtickdata.last_price <=", value, "last_price");
            return (Criteria) this;
        }

        public Criteria andLast_priceIn(List<Double> values) {
            addCriterion("dbtickdata.last_price in", values, "last_price");
            return (Criteria) this;
        }

        public Criteria andLast_priceNotIn(List<Double> values) {
            addCriterion("dbtickdata.last_price not in", values, "last_price");
            return (Criteria) this;
        }

        public Criteria andLast_priceBetween(Double value1, Double value2) {
            addCriterion("dbtickdata.last_price between", value1, value2, "last_price");
            return (Criteria) this;
        }

        public Criteria andLast_priceNotBetween(Double value1, Double value2) {
            addCriterion("dbtickdata.last_price not between", value1, value2, "last_price");
            return (Criteria) this;
        }

        public Criteria andLast_volumeIsNull() {
            addCriterion("dbtickdata.last_volume is null");
            return (Criteria) this;
        }

        public Criteria andLast_volumeIsNotNull() {
            addCriterion("dbtickdata.last_volume is not null");
            return (Criteria) this;
        }

        public Criteria andLast_volumeEqualTo(Double value) {
            addCriterion("dbtickdata.last_volume =", value, "last_volume");
            return (Criteria) this;
        }

        public Criteria andLast_volumeNotEqualTo(Double value) {
            addCriterion("dbtickdata.last_volume <>", value, "last_volume");
            return (Criteria) this;
        }

        public Criteria andLast_volumeGreaterThan(Double value) {
            addCriterion("dbtickdata.last_volume >", value, "last_volume");
            return (Criteria) this;
        }

        public Criteria andLast_volumeGreaterThanOrEqualTo(Double value) {
            addCriterion("dbtickdata.last_volume >=", value, "last_volume");
            return (Criteria) this;
        }

        public Criteria andLast_volumeLessThan(Double value) {
            addCriterion("dbtickdata.last_volume <", value, "last_volume");
            return (Criteria) this;
        }

        public Criteria andLast_volumeLessThanOrEqualTo(Double value) {
            addCriterion("dbtickdata.last_volume <=", value, "last_volume");
            return (Criteria) this;
        }

        public Criteria andLast_volumeIn(List<Double> values) {
            addCriterion("dbtickdata.last_volume in", values, "last_volume");
            return (Criteria) this;
        }

        public Criteria andLast_volumeNotIn(List<Double> values) {
            addCriterion("dbtickdata.last_volume not in", values, "last_volume");
            return (Criteria) this;
        }

        public Criteria andLast_volumeBetween(Double value1, Double value2) {
            addCriterion("dbtickdata.last_volume between", value1, value2, "last_volume");
            return (Criteria) this;
        }

        public Criteria andLast_volumeNotBetween(Double value1, Double value2) {
            addCriterion("dbtickdata.last_volume not between", value1, value2, "last_volume");
            return (Criteria) this;
        }

        public Criteria andLimit_upIsNull() {
            addCriterion("dbtickdata.limit_up is null");
            return (Criteria) this;
        }

        public Criteria andLimit_upIsNotNull() {
            addCriterion("dbtickdata.limit_up is not null");
            return (Criteria) this;
        }

        public Criteria andLimit_upEqualTo(Double value) {
            addCriterion("dbtickdata.limit_up =", value, "limit_up");
            return (Criteria) this;
        }

        public Criteria andLimit_upNotEqualTo(Double value) {
            addCriterion("dbtickdata.limit_up <>", value, "limit_up");
            return (Criteria) this;
        }

        public Criteria andLimit_upGreaterThan(Double value) {
            addCriterion("dbtickdata.limit_up >", value, "limit_up");
            return (Criteria) this;
        }

        public Criteria andLimit_upGreaterThanOrEqualTo(Double value) {
            addCriterion("dbtickdata.limit_up >=", value, "limit_up");
            return (Criteria) this;
        }

        public Criteria andLimit_upLessThan(Double value) {
            addCriterion("dbtickdata.limit_up <", value, "limit_up");
            return (Criteria) this;
        }

        public Criteria andLimit_upLessThanOrEqualTo(Double value) {
            addCriterion("dbtickdata.limit_up <=", value, "limit_up");
            return (Criteria) this;
        }

        public Criteria andLimit_upIn(List<Double> values) {
            addCriterion("dbtickdata.limit_up in", values, "limit_up");
            return (Criteria) this;
        }

        public Criteria andLimit_upNotIn(List<Double> values) {
            addCriterion("dbtickdata.limit_up not in", values, "limit_up");
            return (Criteria) this;
        }

        public Criteria andLimit_upBetween(Double value1, Double value2) {
            addCriterion("dbtickdata.limit_up between", value1, value2, "limit_up");
            return (Criteria) this;
        }

        public Criteria andLimit_upNotBetween(Double value1, Double value2) {
            addCriterion("dbtickdata.limit_up not between", value1, value2, "limit_up");
            return (Criteria) this;
        }

        public Criteria andLimit_downIsNull() {
            addCriterion("dbtickdata.limit_down is null");
            return (Criteria) this;
        }

        public Criteria andLimit_downIsNotNull() {
            addCriterion("dbtickdata.limit_down is not null");
            return (Criteria) this;
        }

        public Criteria andLimit_downEqualTo(Double value) {
            addCriterion("dbtickdata.limit_down =", value, "limit_down");
            return (Criteria) this;
        }

        public Criteria andLimit_downNotEqualTo(Double value) {
            addCriterion("dbtickdata.limit_down <>", value, "limit_down");
            return (Criteria) this;
        }

        public Criteria andLimit_downGreaterThan(Double value) {
            addCriterion("dbtickdata.limit_down >", value, "limit_down");
            return (Criteria) this;
        }

        public Criteria andLimit_downGreaterThanOrEqualTo(Double value) {
            addCriterion("dbtickdata.limit_down >=", value, "limit_down");
            return (Criteria) this;
        }

        public Criteria andLimit_downLessThan(Double value) {
            addCriterion("dbtickdata.limit_down <", value, "limit_down");
            return (Criteria) this;
        }

        public Criteria andLimit_downLessThanOrEqualTo(Double value) {
            addCriterion("dbtickdata.limit_down <=", value, "limit_down");
            return (Criteria) this;
        }

        public Criteria andLimit_downIn(List<Double> values) {
            addCriterion("dbtickdata.limit_down in", values, "limit_down");
            return (Criteria) this;
        }

        public Criteria andLimit_downNotIn(List<Double> values) {
            addCriterion("dbtickdata.limit_down not in", values, "limit_down");
            return (Criteria) this;
        }

        public Criteria andLimit_downBetween(Double value1, Double value2) {
            addCriterion("dbtickdata.limit_down between", value1, value2, "limit_down");
            return (Criteria) this;
        }

        public Criteria andLimit_downNotBetween(Double value1, Double value2) {
            addCriterion("dbtickdata.limit_down not between", value1, value2, "limit_down");
            return (Criteria) this;
        }

        public Criteria andOpen_priceIsNull() {
            addCriterion("dbtickdata.open_price is null");
            return (Criteria) this;
        }

        public Criteria andOpen_priceIsNotNull() {
            addCriterion("dbtickdata.open_price is not null");
            return (Criteria) this;
        }

        public Criteria andOpen_priceEqualTo(Double value) {
            addCriterion("dbtickdata.open_price =", value, "open_price");
            return (Criteria) this;
        }

        public Criteria andOpen_priceNotEqualTo(Double value) {
            addCriterion("dbtickdata.open_price <>", value, "open_price");
            return (Criteria) this;
        }

        public Criteria andOpen_priceGreaterThan(Double value) {
            addCriterion("dbtickdata.open_price >", value, "open_price");
            return (Criteria) this;
        }

        public Criteria andOpen_priceGreaterThanOrEqualTo(Double value) {
            addCriterion("dbtickdata.open_price >=", value, "open_price");
            return (Criteria) this;
        }

        public Criteria andOpen_priceLessThan(Double value) {
            addCriterion("dbtickdata.open_price <", value, "open_price");
            return (Criteria) this;
        }

        public Criteria andOpen_priceLessThanOrEqualTo(Double value) {
            addCriterion("dbtickdata.open_price <=", value, "open_price");
            return (Criteria) this;
        }

        public Criteria andOpen_priceIn(List<Double> values) {
            addCriterion("dbtickdata.open_price in", values, "open_price");
            return (Criteria) this;
        }

        public Criteria andOpen_priceNotIn(List<Double> values) {
            addCriterion("dbtickdata.open_price not in", values, "open_price");
            return (Criteria) this;
        }

        public Criteria andOpen_priceBetween(Double value1, Double value2) {
            addCriterion("dbtickdata.open_price between", value1, value2, "open_price");
            return (Criteria) this;
        }

        public Criteria andOpen_priceNotBetween(Double value1, Double value2) {
            addCriterion("dbtickdata.open_price not between", value1, value2, "open_price");
            return (Criteria) this;
        }

        public Criteria andHigh_priceIsNull() {
            addCriterion("dbtickdata.high_price is null");
            return (Criteria) this;
        }

        public Criteria andHigh_priceIsNotNull() {
            addCriterion("dbtickdata.high_price is not null");
            return (Criteria) this;
        }

        public Criteria andHigh_priceEqualTo(Double value) {
            addCriterion("dbtickdata.high_price =", value, "high_price");
            return (Criteria) this;
        }

        public Criteria andHigh_priceNotEqualTo(Double value) {
            addCriterion("dbtickdata.high_price <>", value, "high_price");
            return (Criteria) this;
        }

        public Criteria andHigh_priceGreaterThan(Double value) {
            addCriterion("dbtickdata.high_price >", value, "high_price");
            return (Criteria) this;
        }

        public Criteria andHigh_priceGreaterThanOrEqualTo(Double value) {
            addCriterion("dbtickdata.high_price >=", value, "high_price");
            return (Criteria) this;
        }

        public Criteria andHigh_priceLessThan(Double value) {
            addCriterion("dbtickdata.high_price <", value, "high_price");
            return (Criteria) this;
        }

        public Criteria andHigh_priceLessThanOrEqualTo(Double value) {
            addCriterion("dbtickdata.high_price <=", value, "high_price");
            return (Criteria) this;
        }

        public Criteria andHigh_priceIn(List<Double> values) {
            addCriterion("dbtickdata.high_price in", values, "high_price");
            return (Criteria) this;
        }

        public Criteria andHigh_priceNotIn(List<Double> values) {
            addCriterion("dbtickdata.high_price not in", values, "high_price");
            return (Criteria) this;
        }

        public Criteria andHigh_priceBetween(Double value1, Double value2) {
            addCriterion("dbtickdata.high_price between", value1, value2, "high_price");
            return (Criteria) this;
        }

        public Criteria andHigh_priceNotBetween(Double value1, Double value2) {
            addCriterion("dbtickdata.high_price not between", value1, value2, "high_price");
            return (Criteria) this;
        }

        public Criteria andLow_priceIsNull() {
            addCriterion("dbtickdata.low_price is null");
            return (Criteria) this;
        }

        public Criteria andLow_priceIsNotNull() {
            addCriterion("dbtickdata.low_price is not null");
            return (Criteria) this;
        }

        public Criteria andLow_priceEqualTo(Double value) {
            addCriterion("dbtickdata.low_price =", value, "low_price");
            return (Criteria) this;
        }

        public Criteria andLow_priceNotEqualTo(Double value) {
            addCriterion("dbtickdata.low_price <>", value, "low_price");
            return (Criteria) this;
        }

        public Criteria andLow_priceGreaterThan(Double value) {
            addCriterion("dbtickdata.low_price >", value, "low_price");
            return (Criteria) this;
        }

        public Criteria andLow_priceGreaterThanOrEqualTo(Double value) {
            addCriterion("dbtickdata.low_price >=", value, "low_price");
            return (Criteria) this;
        }

        public Criteria andLow_priceLessThan(Double value) {
            addCriterion("dbtickdata.low_price <", value, "low_price");
            return (Criteria) this;
        }

        public Criteria andLow_priceLessThanOrEqualTo(Double value) {
            addCriterion("dbtickdata.low_price <=", value, "low_price");
            return (Criteria) this;
        }

        public Criteria andLow_priceIn(List<Double> values) {
            addCriterion("dbtickdata.low_price in", values, "low_price");
            return (Criteria) this;
        }

        public Criteria andLow_priceNotIn(List<Double> values) {
            addCriterion("dbtickdata.low_price not in", values, "low_price");
            return (Criteria) this;
        }

        public Criteria andLow_priceBetween(Double value1, Double value2) {
            addCriterion("dbtickdata.low_price between", value1, value2, "low_price");
            return (Criteria) this;
        }

        public Criteria andLow_priceNotBetween(Double value1, Double value2) {
            addCriterion("dbtickdata.low_price not between", value1, value2, "low_price");
            return (Criteria) this;
        }

        public Criteria andPre_closeIsNull() {
            addCriterion("dbtickdata.pre_close is null");
            return (Criteria) this;
        }

        public Criteria andPre_closeIsNotNull() {
            addCriterion("dbtickdata.pre_close is not null");
            return (Criteria) this;
        }

        public Criteria andPre_closeEqualTo(Double value) {
            addCriterion("dbtickdata.pre_close =", value, "pre_close");
            return (Criteria) this;
        }

        public Criteria andPre_closeNotEqualTo(Double value) {
            addCriterion("dbtickdata.pre_close <>", value, "pre_close");
            return (Criteria) this;
        }

        public Criteria andPre_closeGreaterThan(Double value) {
            addCriterion("dbtickdata.pre_close >", value, "pre_close");
            return (Criteria) this;
        }

        public Criteria andPre_closeGreaterThanOrEqualTo(Double value) {
            addCriterion("dbtickdata.pre_close >=", value, "pre_close");
            return (Criteria) this;
        }

        public Criteria andPre_closeLessThan(Double value) {
            addCriterion("dbtickdata.pre_close <", value, "pre_close");
            return (Criteria) this;
        }

        public Criteria andPre_closeLessThanOrEqualTo(Double value) {
            addCriterion("dbtickdata.pre_close <=", value, "pre_close");
            return (Criteria) this;
        }

        public Criteria andPre_closeIn(List<Double> values) {
            addCriterion("dbtickdata.pre_close in", values, "pre_close");
            return (Criteria) this;
        }

        public Criteria andPre_closeNotIn(List<Double> values) {
            addCriterion("dbtickdata.pre_close not in", values, "pre_close");
            return (Criteria) this;
        }

        public Criteria andPre_closeBetween(Double value1, Double value2) {
            addCriterion("dbtickdata.pre_close between", value1, value2, "pre_close");
            return (Criteria) this;
        }

        public Criteria andPre_closeNotBetween(Double value1, Double value2) {
            addCriterion("dbtickdata.pre_close not between", value1, value2, "pre_close");
            return (Criteria) this;
        }

        public Criteria andBid_price_1IsNull() {
            addCriterion("dbtickdata.bid_price_1 is null");
            return (Criteria) this;
        }

        public Criteria andBid_price_1IsNotNull() {
            addCriterion("dbtickdata.bid_price_1 is not null");
            return (Criteria) this;
        }

        public Criteria andBid_price_1EqualTo(Double value) {
            addCriterion("dbtickdata.bid_price_1 =", value, "bid_price_1");
            return (Criteria) this;
        }

        public Criteria andBid_price_1NotEqualTo(Double value) {
            addCriterion("dbtickdata.bid_price_1 <>", value, "bid_price_1");
            return (Criteria) this;
        }

        public Criteria andBid_price_1GreaterThan(Double value) {
            addCriterion("dbtickdata.bid_price_1 >", value, "bid_price_1");
            return (Criteria) this;
        }

        public Criteria andBid_price_1GreaterThanOrEqualTo(Double value) {
            addCriterion("dbtickdata.bid_price_1 >=", value, "bid_price_1");
            return (Criteria) this;
        }

        public Criteria andBid_price_1LessThan(Double value) {
            addCriterion("dbtickdata.bid_price_1 <", value, "bid_price_1");
            return (Criteria) this;
        }

        public Criteria andBid_price_1LessThanOrEqualTo(Double value) {
            addCriterion("dbtickdata.bid_price_1 <=", value, "bid_price_1");
            return (Criteria) this;
        }

        public Criteria andBid_price_1In(List<Double> values) {
            addCriterion("dbtickdata.bid_price_1 in", values, "bid_price_1");
            return (Criteria) this;
        }

        public Criteria andBid_price_1NotIn(List<Double> values) {
            addCriterion("dbtickdata.bid_price_1 not in", values, "bid_price_1");
            return (Criteria) this;
        }

        public Criteria andBid_price_1Between(Double value1, Double value2) {
            addCriterion("dbtickdata.bid_price_1 between", value1, value2, "bid_price_1");
            return (Criteria) this;
        }

        public Criteria andBid_price_1NotBetween(Double value1, Double value2) {
            addCriterion("dbtickdata.bid_price_1 not between", value1, value2, "bid_price_1");
            return (Criteria) this;
        }

        public Criteria andBid_price_2IsNull() {
            addCriterion("dbtickdata.bid_price_2 is null");
            return (Criteria) this;
        }

        public Criteria andBid_price_2IsNotNull() {
            addCriterion("dbtickdata.bid_price_2 is not null");
            return (Criteria) this;
        }

        public Criteria andBid_price_2EqualTo(Double value) {
            addCriterion("dbtickdata.bid_price_2 =", value, "bid_price_2");
            return (Criteria) this;
        }

        public Criteria andBid_price_2NotEqualTo(Double value) {
            addCriterion("dbtickdata.bid_price_2 <>", value, "bid_price_2");
            return (Criteria) this;
        }

        public Criteria andBid_price_2GreaterThan(Double value) {
            addCriterion("dbtickdata.bid_price_2 >", value, "bid_price_2");
            return (Criteria) this;
        }

        public Criteria andBid_price_2GreaterThanOrEqualTo(Double value) {
            addCriterion("dbtickdata.bid_price_2 >=", value, "bid_price_2");
            return (Criteria) this;
        }

        public Criteria andBid_price_2LessThan(Double value) {
            addCriterion("dbtickdata.bid_price_2 <", value, "bid_price_2");
            return (Criteria) this;
        }

        public Criteria andBid_price_2LessThanOrEqualTo(Double value) {
            addCriterion("dbtickdata.bid_price_2 <=", value, "bid_price_2");
            return (Criteria) this;
        }

        public Criteria andBid_price_2In(List<Double> values) {
            addCriterion("dbtickdata.bid_price_2 in", values, "bid_price_2");
            return (Criteria) this;
        }

        public Criteria andBid_price_2NotIn(List<Double> values) {
            addCriterion("dbtickdata.bid_price_2 not in", values, "bid_price_2");
            return (Criteria) this;
        }

        public Criteria andBid_price_2Between(Double value1, Double value2) {
            addCriterion("dbtickdata.bid_price_2 between", value1, value2, "bid_price_2");
            return (Criteria) this;
        }

        public Criteria andBid_price_2NotBetween(Double value1, Double value2) {
            addCriterion("dbtickdata.bid_price_2 not between", value1, value2, "bid_price_2");
            return (Criteria) this;
        }

        public Criteria andBid_price_3IsNull() {
            addCriterion("dbtickdata.bid_price_3 is null");
            return (Criteria) this;
        }

        public Criteria andBid_price_3IsNotNull() {
            addCriterion("dbtickdata.bid_price_3 is not null");
            return (Criteria) this;
        }

        public Criteria andBid_price_3EqualTo(Double value) {
            addCriterion("dbtickdata.bid_price_3 =", value, "bid_price_3");
            return (Criteria) this;
        }

        public Criteria andBid_price_3NotEqualTo(Double value) {
            addCriterion("dbtickdata.bid_price_3 <>", value, "bid_price_3");
            return (Criteria) this;
        }

        public Criteria andBid_price_3GreaterThan(Double value) {
            addCriterion("dbtickdata.bid_price_3 >", value, "bid_price_3");
            return (Criteria) this;
        }

        public Criteria andBid_price_3GreaterThanOrEqualTo(Double value) {
            addCriterion("dbtickdata.bid_price_3 >=", value, "bid_price_3");
            return (Criteria) this;
        }

        public Criteria andBid_price_3LessThan(Double value) {
            addCriterion("dbtickdata.bid_price_3 <", value, "bid_price_3");
            return (Criteria) this;
        }

        public Criteria andBid_price_3LessThanOrEqualTo(Double value) {
            addCriterion("dbtickdata.bid_price_3 <=", value, "bid_price_3");
            return (Criteria) this;
        }

        public Criteria andBid_price_3In(List<Double> values) {
            addCriterion("dbtickdata.bid_price_3 in", values, "bid_price_3");
            return (Criteria) this;
        }

        public Criteria andBid_price_3NotIn(List<Double> values) {
            addCriterion("dbtickdata.bid_price_3 not in", values, "bid_price_3");
            return (Criteria) this;
        }

        public Criteria andBid_price_3Between(Double value1, Double value2) {
            addCriterion("dbtickdata.bid_price_3 between", value1, value2, "bid_price_3");
            return (Criteria) this;
        }

        public Criteria andBid_price_3NotBetween(Double value1, Double value2) {
            addCriterion("dbtickdata.bid_price_3 not between", value1, value2, "bid_price_3");
            return (Criteria) this;
        }

        public Criteria andBid_price_4IsNull() {
            addCriterion("dbtickdata.bid_price_4 is null");
            return (Criteria) this;
        }

        public Criteria andBid_price_4IsNotNull() {
            addCriterion("dbtickdata.bid_price_4 is not null");
            return (Criteria) this;
        }

        public Criteria andBid_price_4EqualTo(Double value) {
            addCriterion("dbtickdata.bid_price_4 =", value, "bid_price_4");
            return (Criteria) this;
        }

        public Criteria andBid_price_4NotEqualTo(Double value) {
            addCriterion("dbtickdata.bid_price_4 <>", value, "bid_price_4");
            return (Criteria) this;
        }

        public Criteria andBid_price_4GreaterThan(Double value) {
            addCriterion("dbtickdata.bid_price_4 >", value, "bid_price_4");
            return (Criteria) this;
        }

        public Criteria andBid_price_4GreaterThanOrEqualTo(Double value) {
            addCriterion("dbtickdata.bid_price_4 >=", value, "bid_price_4");
            return (Criteria) this;
        }

        public Criteria andBid_price_4LessThan(Double value) {
            addCriterion("dbtickdata.bid_price_4 <", value, "bid_price_4");
            return (Criteria) this;
        }

        public Criteria andBid_price_4LessThanOrEqualTo(Double value) {
            addCriterion("dbtickdata.bid_price_4 <=", value, "bid_price_4");
            return (Criteria) this;
        }

        public Criteria andBid_price_4In(List<Double> values) {
            addCriterion("dbtickdata.bid_price_4 in", values, "bid_price_4");
            return (Criteria) this;
        }

        public Criteria andBid_price_4NotIn(List<Double> values) {
            addCriterion("dbtickdata.bid_price_4 not in", values, "bid_price_4");
            return (Criteria) this;
        }

        public Criteria andBid_price_4Between(Double value1, Double value2) {
            addCriterion("dbtickdata.bid_price_4 between", value1, value2, "bid_price_4");
            return (Criteria) this;
        }

        public Criteria andBid_price_4NotBetween(Double value1, Double value2) {
            addCriterion("dbtickdata.bid_price_4 not between", value1, value2, "bid_price_4");
            return (Criteria) this;
        }

        public Criteria andBid_price_5IsNull() {
            addCriterion("dbtickdata.bid_price_5 is null");
            return (Criteria) this;
        }

        public Criteria andBid_price_5IsNotNull() {
            addCriterion("dbtickdata.bid_price_5 is not null");
            return (Criteria) this;
        }

        public Criteria andBid_price_5EqualTo(Double value) {
            addCriterion("dbtickdata.bid_price_5 =", value, "bid_price_5");
            return (Criteria) this;
        }

        public Criteria andBid_price_5NotEqualTo(Double value) {
            addCriterion("dbtickdata.bid_price_5 <>", value, "bid_price_5");
            return (Criteria) this;
        }

        public Criteria andBid_price_5GreaterThan(Double value) {
            addCriterion("dbtickdata.bid_price_5 >", value, "bid_price_5");
            return (Criteria) this;
        }

        public Criteria andBid_price_5GreaterThanOrEqualTo(Double value) {
            addCriterion("dbtickdata.bid_price_5 >=", value, "bid_price_5");
            return (Criteria) this;
        }

        public Criteria andBid_price_5LessThan(Double value) {
            addCriterion("dbtickdata.bid_price_5 <", value, "bid_price_5");
            return (Criteria) this;
        }

        public Criteria andBid_price_5LessThanOrEqualTo(Double value) {
            addCriterion("dbtickdata.bid_price_5 <=", value, "bid_price_5");
            return (Criteria) this;
        }

        public Criteria andBid_price_5In(List<Double> values) {
            addCriterion("dbtickdata.bid_price_5 in", values, "bid_price_5");
            return (Criteria) this;
        }

        public Criteria andBid_price_5NotIn(List<Double> values) {
            addCriterion("dbtickdata.bid_price_5 not in", values, "bid_price_5");
            return (Criteria) this;
        }

        public Criteria andBid_price_5Between(Double value1, Double value2) {
            addCriterion("dbtickdata.bid_price_5 between", value1, value2, "bid_price_5");
            return (Criteria) this;
        }

        public Criteria andBid_price_5NotBetween(Double value1, Double value2) {
            addCriterion("dbtickdata.bid_price_5 not between", value1, value2, "bid_price_5");
            return (Criteria) this;
        }

        public Criteria andAsk_price_1IsNull() {
            addCriterion("dbtickdata.ask_price_1 is null");
            return (Criteria) this;
        }

        public Criteria andAsk_price_1IsNotNull() {
            addCriterion("dbtickdata.ask_price_1 is not null");
            return (Criteria) this;
        }

        public Criteria andAsk_price_1EqualTo(Double value) {
            addCriterion("dbtickdata.ask_price_1 =", value, "ask_price_1");
            return (Criteria) this;
        }

        public Criteria andAsk_price_1NotEqualTo(Double value) {
            addCriterion("dbtickdata.ask_price_1 <>", value, "ask_price_1");
            return (Criteria) this;
        }

        public Criteria andAsk_price_1GreaterThan(Double value) {
            addCriterion("dbtickdata.ask_price_1 >", value, "ask_price_1");
            return (Criteria) this;
        }

        public Criteria andAsk_price_1GreaterThanOrEqualTo(Double value) {
            addCriterion("dbtickdata.ask_price_1 >=", value, "ask_price_1");
            return (Criteria) this;
        }

        public Criteria andAsk_price_1LessThan(Double value) {
            addCriterion("dbtickdata.ask_price_1 <", value, "ask_price_1");
            return (Criteria) this;
        }

        public Criteria andAsk_price_1LessThanOrEqualTo(Double value) {
            addCriterion("dbtickdata.ask_price_1 <=", value, "ask_price_1");
            return (Criteria) this;
        }

        public Criteria andAsk_price_1In(List<Double> values) {
            addCriterion("dbtickdata.ask_price_1 in", values, "ask_price_1");
            return (Criteria) this;
        }

        public Criteria andAsk_price_1NotIn(List<Double> values) {
            addCriterion("dbtickdata.ask_price_1 not in", values, "ask_price_1");
            return (Criteria) this;
        }

        public Criteria andAsk_price_1Between(Double value1, Double value2) {
            addCriterion("dbtickdata.ask_price_1 between", value1, value2, "ask_price_1");
            return (Criteria) this;
        }

        public Criteria andAsk_price_1NotBetween(Double value1, Double value2) {
            addCriterion("dbtickdata.ask_price_1 not between", value1, value2, "ask_price_1");
            return (Criteria) this;
        }

        public Criteria andAsk_price_2IsNull() {
            addCriterion("dbtickdata.ask_price_2 is null");
            return (Criteria) this;
        }

        public Criteria andAsk_price_2IsNotNull() {
            addCriterion("dbtickdata.ask_price_2 is not null");
            return (Criteria) this;
        }

        public Criteria andAsk_price_2EqualTo(Double value) {
            addCriterion("dbtickdata.ask_price_2 =", value, "ask_price_2");
            return (Criteria) this;
        }

        public Criteria andAsk_price_2NotEqualTo(Double value) {
            addCriterion("dbtickdata.ask_price_2 <>", value, "ask_price_2");
            return (Criteria) this;
        }

        public Criteria andAsk_price_2GreaterThan(Double value) {
            addCriterion("dbtickdata.ask_price_2 >", value, "ask_price_2");
            return (Criteria) this;
        }

        public Criteria andAsk_price_2GreaterThanOrEqualTo(Double value) {
            addCriterion("dbtickdata.ask_price_2 >=", value, "ask_price_2");
            return (Criteria) this;
        }

        public Criteria andAsk_price_2LessThan(Double value) {
            addCriterion("dbtickdata.ask_price_2 <", value, "ask_price_2");
            return (Criteria) this;
        }

        public Criteria andAsk_price_2LessThanOrEqualTo(Double value) {
            addCriterion("dbtickdata.ask_price_2 <=", value, "ask_price_2");
            return (Criteria) this;
        }

        public Criteria andAsk_price_2In(List<Double> values) {
            addCriterion("dbtickdata.ask_price_2 in", values, "ask_price_2");
            return (Criteria) this;
        }

        public Criteria andAsk_price_2NotIn(List<Double> values) {
            addCriterion("dbtickdata.ask_price_2 not in", values, "ask_price_2");
            return (Criteria) this;
        }

        public Criteria andAsk_price_2Between(Double value1, Double value2) {
            addCriterion("dbtickdata.ask_price_2 between", value1, value2, "ask_price_2");
            return (Criteria) this;
        }

        public Criteria andAsk_price_2NotBetween(Double value1, Double value2) {
            addCriterion("dbtickdata.ask_price_2 not between", value1, value2, "ask_price_2");
            return (Criteria) this;
        }

        public Criteria andAsk_price_3IsNull() {
            addCriterion("dbtickdata.ask_price_3 is null");
            return (Criteria) this;
        }

        public Criteria andAsk_price_3IsNotNull() {
            addCriterion("dbtickdata.ask_price_3 is not null");
            return (Criteria) this;
        }

        public Criteria andAsk_price_3EqualTo(Double value) {
            addCriterion("dbtickdata.ask_price_3 =", value, "ask_price_3");
            return (Criteria) this;
        }

        public Criteria andAsk_price_3NotEqualTo(Double value) {
            addCriterion("dbtickdata.ask_price_3 <>", value, "ask_price_3");
            return (Criteria) this;
        }

        public Criteria andAsk_price_3GreaterThan(Double value) {
            addCriterion("dbtickdata.ask_price_3 >", value, "ask_price_3");
            return (Criteria) this;
        }

        public Criteria andAsk_price_3GreaterThanOrEqualTo(Double value) {
            addCriterion("dbtickdata.ask_price_3 >=", value, "ask_price_3");
            return (Criteria) this;
        }

        public Criteria andAsk_price_3LessThan(Double value) {
            addCriterion("dbtickdata.ask_price_3 <", value, "ask_price_3");
            return (Criteria) this;
        }

        public Criteria andAsk_price_3LessThanOrEqualTo(Double value) {
            addCriterion("dbtickdata.ask_price_3 <=", value, "ask_price_3");
            return (Criteria) this;
        }

        public Criteria andAsk_price_3In(List<Double> values) {
            addCriterion("dbtickdata.ask_price_3 in", values, "ask_price_3");
            return (Criteria) this;
        }

        public Criteria andAsk_price_3NotIn(List<Double> values) {
            addCriterion("dbtickdata.ask_price_3 not in", values, "ask_price_3");
            return (Criteria) this;
        }

        public Criteria andAsk_price_3Between(Double value1, Double value2) {
            addCriterion("dbtickdata.ask_price_3 between", value1, value2, "ask_price_3");
            return (Criteria) this;
        }

        public Criteria andAsk_price_3NotBetween(Double value1, Double value2) {
            addCriterion("dbtickdata.ask_price_3 not between", value1, value2, "ask_price_3");
            return (Criteria) this;
        }

        public Criteria andAsk_price_4IsNull() {
            addCriterion("dbtickdata.ask_price_4 is null");
            return (Criteria) this;
        }

        public Criteria andAsk_price_4IsNotNull() {
            addCriterion("dbtickdata.ask_price_4 is not null");
            return (Criteria) this;
        }

        public Criteria andAsk_price_4EqualTo(Double value) {
            addCriterion("dbtickdata.ask_price_4 =", value, "ask_price_4");
            return (Criteria) this;
        }

        public Criteria andAsk_price_4NotEqualTo(Double value) {
            addCriterion("dbtickdata.ask_price_4 <>", value, "ask_price_4");
            return (Criteria) this;
        }

        public Criteria andAsk_price_4GreaterThan(Double value) {
            addCriterion("dbtickdata.ask_price_4 >", value, "ask_price_4");
            return (Criteria) this;
        }

        public Criteria andAsk_price_4GreaterThanOrEqualTo(Double value) {
            addCriterion("dbtickdata.ask_price_4 >=", value, "ask_price_4");
            return (Criteria) this;
        }

        public Criteria andAsk_price_4LessThan(Double value) {
            addCriterion("dbtickdata.ask_price_4 <", value, "ask_price_4");
            return (Criteria) this;
        }

        public Criteria andAsk_price_4LessThanOrEqualTo(Double value) {
            addCriterion("dbtickdata.ask_price_4 <=", value, "ask_price_4");
            return (Criteria) this;
        }

        public Criteria andAsk_price_4In(List<Double> values) {
            addCriterion("dbtickdata.ask_price_4 in", values, "ask_price_4");
            return (Criteria) this;
        }

        public Criteria andAsk_price_4NotIn(List<Double> values) {
            addCriterion("dbtickdata.ask_price_4 not in", values, "ask_price_4");
            return (Criteria) this;
        }

        public Criteria andAsk_price_4Between(Double value1, Double value2) {
            addCriterion("dbtickdata.ask_price_4 between", value1, value2, "ask_price_4");
            return (Criteria) this;
        }

        public Criteria andAsk_price_4NotBetween(Double value1, Double value2) {
            addCriterion("dbtickdata.ask_price_4 not between", value1, value2, "ask_price_4");
            return (Criteria) this;
        }

        public Criteria andAsk_price_5IsNull() {
            addCriterion("dbtickdata.ask_price_5 is null");
            return (Criteria) this;
        }

        public Criteria andAsk_price_5IsNotNull() {
            addCriterion("dbtickdata.ask_price_5 is not null");
            return (Criteria) this;
        }

        public Criteria andAsk_price_5EqualTo(Double value) {
            addCriterion("dbtickdata.ask_price_5 =", value, "ask_price_5");
            return (Criteria) this;
        }

        public Criteria andAsk_price_5NotEqualTo(Double value) {
            addCriterion("dbtickdata.ask_price_5 <>", value, "ask_price_5");
            return (Criteria) this;
        }

        public Criteria andAsk_price_5GreaterThan(Double value) {
            addCriterion("dbtickdata.ask_price_5 >", value, "ask_price_5");
            return (Criteria) this;
        }

        public Criteria andAsk_price_5GreaterThanOrEqualTo(Double value) {
            addCriterion("dbtickdata.ask_price_5 >=", value, "ask_price_5");
            return (Criteria) this;
        }

        public Criteria andAsk_price_5LessThan(Double value) {
            addCriterion("dbtickdata.ask_price_5 <", value, "ask_price_5");
            return (Criteria) this;
        }

        public Criteria andAsk_price_5LessThanOrEqualTo(Double value) {
            addCriterion("dbtickdata.ask_price_5 <=", value, "ask_price_5");
            return (Criteria) this;
        }

        public Criteria andAsk_price_5In(List<Double> values) {
            addCriterion("dbtickdata.ask_price_5 in", values, "ask_price_5");
            return (Criteria) this;
        }

        public Criteria andAsk_price_5NotIn(List<Double> values) {
            addCriterion("dbtickdata.ask_price_5 not in", values, "ask_price_5");
            return (Criteria) this;
        }

        public Criteria andAsk_price_5Between(Double value1, Double value2) {
            addCriterion("dbtickdata.ask_price_5 between", value1, value2, "ask_price_5");
            return (Criteria) this;
        }

        public Criteria andAsk_price_5NotBetween(Double value1, Double value2) {
            addCriterion("dbtickdata.ask_price_5 not between", value1, value2, "ask_price_5");
            return (Criteria) this;
        }

        public Criteria andBid_volume_1IsNull() {
            addCriterion("dbtickdata.bid_volume_1 is null");
            return (Criteria) this;
        }

        public Criteria andBid_volume_1IsNotNull() {
            addCriterion("dbtickdata.bid_volume_1 is not null");
            return (Criteria) this;
        }

        public Criteria andBid_volume_1EqualTo(Double value) {
            addCriterion("dbtickdata.bid_volume_1 =", value, "bid_volume_1");
            return (Criteria) this;
        }

        public Criteria andBid_volume_1NotEqualTo(Double value) {
            addCriterion("dbtickdata.bid_volume_1 <>", value, "bid_volume_1");
            return (Criteria) this;
        }

        public Criteria andBid_volume_1GreaterThan(Double value) {
            addCriterion("dbtickdata.bid_volume_1 >", value, "bid_volume_1");
            return (Criteria) this;
        }

        public Criteria andBid_volume_1GreaterThanOrEqualTo(Double value) {
            addCriterion("dbtickdata.bid_volume_1 >=", value, "bid_volume_1");
            return (Criteria) this;
        }

        public Criteria andBid_volume_1LessThan(Double value) {
            addCriterion("dbtickdata.bid_volume_1 <", value, "bid_volume_1");
            return (Criteria) this;
        }

        public Criteria andBid_volume_1LessThanOrEqualTo(Double value) {
            addCriterion("dbtickdata.bid_volume_1 <=", value, "bid_volume_1");
            return (Criteria) this;
        }

        public Criteria andBid_volume_1In(List<Double> values) {
            addCriterion("dbtickdata.bid_volume_1 in", values, "bid_volume_1");
            return (Criteria) this;
        }

        public Criteria andBid_volume_1NotIn(List<Double> values) {
            addCriterion("dbtickdata.bid_volume_1 not in", values, "bid_volume_1");
            return (Criteria) this;
        }

        public Criteria andBid_volume_1Between(Double value1, Double value2) {
            addCriterion("dbtickdata.bid_volume_1 between", value1, value2, "bid_volume_1");
            return (Criteria) this;
        }

        public Criteria andBid_volume_1NotBetween(Double value1, Double value2) {
            addCriterion("dbtickdata.bid_volume_1 not between", value1, value2, "bid_volume_1");
            return (Criteria) this;
        }

        public Criteria andBid_volume_2IsNull() {
            addCriterion("dbtickdata.bid_volume_2 is null");
            return (Criteria) this;
        }

        public Criteria andBid_volume_2IsNotNull() {
            addCriterion("dbtickdata.bid_volume_2 is not null");
            return (Criteria) this;
        }

        public Criteria andBid_volume_2EqualTo(Double value) {
            addCriterion("dbtickdata.bid_volume_2 =", value, "bid_volume_2");
            return (Criteria) this;
        }

        public Criteria andBid_volume_2NotEqualTo(Double value) {
            addCriterion("dbtickdata.bid_volume_2 <>", value, "bid_volume_2");
            return (Criteria) this;
        }

        public Criteria andBid_volume_2GreaterThan(Double value) {
            addCriterion("dbtickdata.bid_volume_2 >", value, "bid_volume_2");
            return (Criteria) this;
        }

        public Criteria andBid_volume_2GreaterThanOrEqualTo(Double value) {
            addCriterion("dbtickdata.bid_volume_2 >=", value, "bid_volume_2");
            return (Criteria) this;
        }

        public Criteria andBid_volume_2LessThan(Double value) {
            addCriterion("dbtickdata.bid_volume_2 <", value, "bid_volume_2");
            return (Criteria) this;
        }

        public Criteria andBid_volume_2LessThanOrEqualTo(Double value) {
            addCriterion("dbtickdata.bid_volume_2 <=", value, "bid_volume_2");
            return (Criteria) this;
        }

        public Criteria andBid_volume_2In(List<Double> values) {
            addCriterion("dbtickdata.bid_volume_2 in", values, "bid_volume_2");
            return (Criteria) this;
        }

        public Criteria andBid_volume_2NotIn(List<Double> values) {
            addCriterion("dbtickdata.bid_volume_2 not in", values, "bid_volume_2");
            return (Criteria) this;
        }

        public Criteria andBid_volume_2Between(Double value1, Double value2) {
            addCriterion("dbtickdata.bid_volume_2 between", value1, value2, "bid_volume_2");
            return (Criteria) this;
        }

        public Criteria andBid_volume_2NotBetween(Double value1, Double value2) {
            addCriterion("dbtickdata.bid_volume_2 not between", value1, value2, "bid_volume_2");
            return (Criteria) this;
        }

        public Criteria andBid_volume_3IsNull() {
            addCriterion("dbtickdata.bid_volume_3 is null");
            return (Criteria) this;
        }

        public Criteria andBid_volume_3IsNotNull() {
            addCriterion("dbtickdata.bid_volume_3 is not null");
            return (Criteria) this;
        }

        public Criteria andBid_volume_3EqualTo(Double value) {
            addCriterion("dbtickdata.bid_volume_3 =", value, "bid_volume_3");
            return (Criteria) this;
        }

        public Criteria andBid_volume_3NotEqualTo(Double value) {
            addCriterion("dbtickdata.bid_volume_3 <>", value, "bid_volume_3");
            return (Criteria) this;
        }

        public Criteria andBid_volume_3GreaterThan(Double value) {
            addCriterion("dbtickdata.bid_volume_3 >", value, "bid_volume_3");
            return (Criteria) this;
        }

        public Criteria andBid_volume_3GreaterThanOrEqualTo(Double value) {
            addCriterion("dbtickdata.bid_volume_3 >=", value, "bid_volume_3");
            return (Criteria) this;
        }

        public Criteria andBid_volume_3LessThan(Double value) {
            addCriterion("dbtickdata.bid_volume_3 <", value, "bid_volume_3");
            return (Criteria) this;
        }

        public Criteria andBid_volume_3LessThanOrEqualTo(Double value) {
            addCriterion("dbtickdata.bid_volume_3 <=", value, "bid_volume_3");
            return (Criteria) this;
        }

        public Criteria andBid_volume_3In(List<Double> values) {
            addCriterion("dbtickdata.bid_volume_3 in", values, "bid_volume_3");
            return (Criteria) this;
        }

        public Criteria andBid_volume_3NotIn(List<Double> values) {
            addCriterion("dbtickdata.bid_volume_3 not in", values, "bid_volume_3");
            return (Criteria) this;
        }

        public Criteria andBid_volume_3Between(Double value1, Double value2) {
            addCriterion("dbtickdata.bid_volume_3 between", value1, value2, "bid_volume_3");
            return (Criteria) this;
        }

        public Criteria andBid_volume_3NotBetween(Double value1, Double value2) {
            addCriterion("dbtickdata.bid_volume_3 not between", value1, value2, "bid_volume_3");
            return (Criteria) this;
        }

        public Criteria andBid_volume_4IsNull() {
            addCriterion("dbtickdata.bid_volume_4 is null");
            return (Criteria) this;
        }

        public Criteria andBid_volume_4IsNotNull() {
            addCriterion("dbtickdata.bid_volume_4 is not null");
            return (Criteria) this;
        }

        public Criteria andBid_volume_4EqualTo(Double value) {
            addCriterion("dbtickdata.bid_volume_4 =", value, "bid_volume_4");
            return (Criteria) this;
        }

        public Criteria andBid_volume_4NotEqualTo(Double value) {
            addCriterion("dbtickdata.bid_volume_4 <>", value, "bid_volume_4");
            return (Criteria) this;
        }

        public Criteria andBid_volume_4GreaterThan(Double value) {
            addCriterion("dbtickdata.bid_volume_4 >", value, "bid_volume_4");
            return (Criteria) this;
        }

        public Criteria andBid_volume_4GreaterThanOrEqualTo(Double value) {
            addCriterion("dbtickdata.bid_volume_4 >=", value, "bid_volume_4");
            return (Criteria) this;
        }

        public Criteria andBid_volume_4LessThan(Double value) {
            addCriterion("dbtickdata.bid_volume_4 <", value, "bid_volume_4");
            return (Criteria) this;
        }

        public Criteria andBid_volume_4LessThanOrEqualTo(Double value) {
            addCriterion("dbtickdata.bid_volume_4 <=", value, "bid_volume_4");
            return (Criteria) this;
        }

        public Criteria andBid_volume_4In(List<Double> values) {
            addCriterion("dbtickdata.bid_volume_4 in", values, "bid_volume_4");
            return (Criteria) this;
        }

        public Criteria andBid_volume_4NotIn(List<Double> values) {
            addCriterion("dbtickdata.bid_volume_4 not in", values, "bid_volume_4");
            return (Criteria) this;
        }

        public Criteria andBid_volume_4Between(Double value1, Double value2) {
            addCriterion("dbtickdata.bid_volume_4 between", value1, value2, "bid_volume_4");
            return (Criteria) this;
        }

        public Criteria andBid_volume_4NotBetween(Double value1, Double value2) {
            addCriterion("dbtickdata.bid_volume_4 not between", value1, value2, "bid_volume_4");
            return (Criteria) this;
        }

        public Criteria andBid_volume_5IsNull() {
            addCriterion("dbtickdata.bid_volume_5 is null");
            return (Criteria) this;
        }

        public Criteria andBid_volume_5IsNotNull() {
            addCriterion("dbtickdata.bid_volume_5 is not null");
            return (Criteria) this;
        }

        public Criteria andBid_volume_5EqualTo(Double value) {
            addCriterion("dbtickdata.bid_volume_5 =", value, "bid_volume_5");
            return (Criteria) this;
        }

        public Criteria andBid_volume_5NotEqualTo(Double value) {
            addCriterion("dbtickdata.bid_volume_5 <>", value, "bid_volume_5");
            return (Criteria) this;
        }

        public Criteria andBid_volume_5GreaterThan(Double value) {
            addCriterion("dbtickdata.bid_volume_5 >", value, "bid_volume_5");
            return (Criteria) this;
        }

        public Criteria andBid_volume_5GreaterThanOrEqualTo(Double value) {
            addCriterion("dbtickdata.bid_volume_5 >=", value, "bid_volume_5");
            return (Criteria) this;
        }

        public Criteria andBid_volume_5LessThan(Double value) {
            addCriterion("dbtickdata.bid_volume_5 <", value, "bid_volume_5");
            return (Criteria) this;
        }

        public Criteria andBid_volume_5LessThanOrEqualTo(Double value) {
            addCriterion("dbtickdata.bid_volume_5 <=", value, "bid_volume_5");
            return (Criteria) this;
        }

        public Criteria andBid_volume_5In(List<Double> values) {
            addCriterion("dbtickdata.bid_volume_5 in", values, "bid_volume_5");
            return (Criteria) this;
        }

        public Criteria andBid_volume_5NotIn(List<Double> values) {
            addCriterion("dbtickdata.bid_volume_5 not in", values, "bid_volume_5");
            return (Criteria) this;
        }

        public Criteria andBid_volume_5Between(Double value1, Double value2) {
            addCriterion("dbtickdata.bid_volume_5 between", value1, value2, "bid_volume_5");
            return (Criteria) this;
        }

        public Criteria andBid_volume_5NotBetween(Double value1, Double value2) {
            addCriterion("dbtickdata.bid_volume_5 not between", value1, value2, "bid_volume_5");
            return (Criteria) this;
        }

        public Criteria andAsk_volume_1IsNull() {
            addCriterion("dbtickdata.ask_volume_1 is null");
            return (Criteria) this;
        }

        public Criteria andAsk_volume_1IsNotNull() {
            addCriterion("dbtickdata.ask_volume_1 is not null");
            return (Criteria) this;
        }

        public Criteria andAsk_volume_1EqualTo(Double value) {
            addCriterion("dbtickdata.ask_volume_1 =", value, "ask_volume_1");
            return (Criteria) this;
        }

        public Criteria andAsk_volume_1NotEqualTo(Double value) {
            addCriterion("dbtickdata.ask_volume_1 <>", value, "ask_volume_1");
            return (Criteria) this;
        }

        public Criteria andAsk_volume_1GreaterThan(Double value) {
            addCriterion("dbtickdata.ask_volume_1 >", value, "ask_volume_1");
            return (Criteria) this;
        }

        public Criteria andAsk_volume_1GreaterThanOrEqualTo(Double value) {
            addCriterion("dbtickdata.ask_volume_1 >=", value, "ask_volume_1");
            return (Criteria) this;
        }

        public Criteria andAsk_volume_1LessThan(Double value) {
            addCriterion("dbtickdata.ask_volume_1 <", value, "ask_volume_1");
            return (Criteria) this;
        }

        public Criteria andAsk_volume_1LessThanOrEqualTo(Double value) {
            addCriterion("dbtickdata.ask_volume_1 <=", value, "ask_volume_1");
            return (Criteria) this;
        }

        public Criteria andAsk_volume_1In(List<Double> values) {
            addCriterion("dbtickdata.ask_volume_1 in", values, "ask_volume_1");
            return (Criteria) this;
        }

        public Criteria andAsk_volume_1NotIn(List<Double> values) {
            addCriterion("dbtickdata.ask_volume_1 not in", values, "ask_volume_1");
            return (Criteria) this;
        }

        public Criteria andAsk_volume_1Between(Double value1, Double value2) {
            addCriterion("dbtickdata.ask_volume_1 between", value1, value2, "ask_volume_1");
            return (Criteria) this;
        }

        public Criteria andAsk_volume_1NotBetween(Double value1, Double value2) {
            addCriterion("dbtickdata.ask_volume_1 not between", value1, value2, "ask_volume_1");
            return (Criteria) this;
        }

        public Criteria andAsk_volume_2IsNull() {
            addCriterion("dbtickdata.ask_volume_2 is null");
            return (Criteria) this;
        }

        public Criteria andAsk_volume_2IsNotNull() {
            addCriterion("dbtickdata.ask_volume_2 is not null");
            return (Criteria) this;
        }

        public Criteria andAsk_volume_2EqualTo(Double value) {
            addCriterion("dbtickdata.ask_volume_2 =", value, "ask_volume_2");
            return (Criteria) this;
        }

        public Criteria andAsk_volume_2NotEqualTo(Double value) {
            addCriterion("dbtickdata.ask_volume_2 <>", value, "ask_volume_2");
            return (Criteria) this;
        }

        public Criteria andAsk_volume_2GreaterThan(Double value) {
            addCriterion("dbtickdata.ask_volume_2 >", value, "ask_volume_2");
            return (Criteria) this;
        }

        public Criteria andAsk_volume_2GreaterThanOrEqualTo(Double value) {
            addCriterion("dbtickdata.ask_volume_2 >=", value, "ask_volume_2");
            return (Criteria) this;
        }

        public Criteria andAsk_volume_2LessThan(Double value) {
            addCriterion("dbtickdata.ask_volume_2 <", value, "ask_volume_2");
            return (Criteria) this;
        }

        public Criteria andAsk_volume_2LessThanOrEqualTo(Double value) {
            addCriterion("dbtickdata.ask_volume_2 <=", value, "ask_volume_2");
            return (Criteria) this;
        }

        public Criteria andAsk_volume_2In(List<Double> values) {
            addCriterion("dbtickdata.ask_volume_2 in", values, "ask_volume_2");
            return (Criteria) this;
        }

        public Criteria andAsk_volume_2NotIn(List<Double> values) {
            addCriterion("dbtickdata.ask_volume_2 not in", values, "ask_volume_2");
            return (Criteria) this;
        }

        public Criteria andAsk_volume_2Between(Double value1, Double value2) {
            addCriterion("dbtickdata.ask_volume_2 between", value1, value2, "ask_volume_2");
            return (Criteria) this;
        }

        public Criteria andAsk_volume_2NotBetween(Double value1, Double value2) {
            addCriterion("dbtickdata.ask_volume_2 not between", value1, value2, "ask_volume_2");
            return (Criteria) this;
        }

        public Criteria andAsk_volume_3IsNull() {
            addCriterion("dbtickdata.ask_volume_3 is null");
            return (Criteria) this;
        }

        public Criteria andAsk_volume_3IsNotNull() {
            addCriterion("dbtickdata.ask_volume_3 is not null");
            return (Criteria) this;
        }

        public Criteria andAsk_volume_3EqualTo(Double value) {
            addCriterion("dbtickdata.ask_volume_3 =", value, "ask_volume_3");
            return (Criteria) this;
        }

        public Criteria andAsk_volume_3NotEqualTo(Double value) {
            addCriterion("dbtickdata.ask_volume_3 <>", value, "ask_volume_3");
            return (Criteria) this;
        }

        public Criteria andAsk_volume_3GreaterThan(Double value) {
            addCriterion("dbtickdata.ask_volume_3 >", value, "ask_volume_3");
            return (Criteria) this;
        }

        public Criteria andAsk_volume_3GreaterThanOrEqualTo(Double value) {
            addCriterion("dbtickdata.ask_volume_3 >=", value, "ask_volume_3");
            return (Criteria) this;
        }

        public Criteria andAsk_volume_3LessThan(Double value) {
            addCriterion("dbtickdata.ask_volume_3 <", value, "ask_volume_3");
            return (Criteria) this;
        }

        public Criteria andAsk_volume_3LessThanOrEqualTo(Double value) {
            addCriterion("dbtickdata.ask_volume_3 <=", value, "ask_volume_3");
            return (Criteria) this;
        }

        public Criteria andAsk_volume_3In(List<Double> values) {
            addCriterion("dbtickdata.ask_volume_3 in", values, "ask_volume_3");
            return (Criteria) this;
        }

        public Criteria andAsk_volume_3NotIn(List<Double> values) {
            addCriterion("dbtickdata.ask_volume_3 not in", values, "ask_volume_3");
            return (Criteria) this;
        }

        public Criteria andAsk_volume_3Between(Double value1, Double value2) {
            addCriterion("dbtickdata.ask_volume_3 between", value1, value2, "ask_volume_3");
            return (Criteria) this;
        }

        public Criteria andAsk_volume_3NotBetween(Double value1, Double value2) {
            addCriterion("dbtickdata.ask_volume_3 not between", value1, value2, "ask_volume_3");
            return (Criteria) this;
        }

        public Criteria andAsk_volume_4IsNull() {
            addCriterion("dbtickdata.ask_volume_4 is null");
            return (Criteria) this;
        }

        public Criteria andAsk_volume_4IsNotNull() {
            addCriterion("dbtickdata.ask_volume_4 is not null");
            return (Criteria) this;
        }

        public Criteria andAsk_volume_4EqualTo(Double value) {
            addCriterion("dbtickdata.ask_volume_4 =", value, "ask_volume_4");
            return (Criteria) this;
        }

        public Criteria andAsk_volume_4NotEqualTo(Double value) {
            addCriterion("dbtickdata.ask_volume_4 <>", value, "ask_volume_4");
            return (Criteria) this;
        }

        public Criteria andAsk_volume_4GreaterThan(Double value) {
            addCriterion("dbtickdata.ask_volume_4 >", value, "ask_volume_4");
            return (Criteria) this;
        }

        public Criteria andAsk_volume_4GreaterThanOrEqualTo(Double value) {
            addCriterion("dbtickdata.ask_volume_4 >=", value, "ask_volume_4");
            return (Criteria) this;
        }

        public Criteria andAsk_volume_4LessThan(Double value) {
            addCriterion("dbtickdata.ask_volume_4 <", value, "ask_volume_4");
            return (Criteria) this;
        }

        public Criteria andAsk_volume_4LessThanOrEqualTo(Double value) {
            addCriterion("dbtickdata.ask_volume_4 <=", value, "ask_volume_4");
            return (Criteria) this;
        }

        public Criteria andAsk_volume_4In(List<Double> values) {
            addCriterion("dbtickdata.ask_volume_4 in", values, "ask_volume_4");
            return (Criteria) this;
        }

        public Criteria andAsk_volume_4NotIn(List<Double> values) {
            addCriterion("dbtickdata.ask_volume_4 not in", values, "ask_volume_4");
            return (Criteria) this;
        }

        public Criteria andAsk_volume_4Between(Double value1, Double value2) {
            addCriterion("dbtickdata.ask_volume_4 between", value1, value2, "ask_volume_4");
            return (Criteria) this;
        }

        public Criteria andAsk_volume_4NotBetween(Double value1, Double value2) {
            addCriterion("dbtickdata.ask_volume_4 not between", value1, value2, "ask_volume_4");
            return (Criteria) this;
        }

        public Criteria andAsk_volume_5IsNull() {
            addCriterion("dbtickdata.ask_volume_5 is null");
            return (Criteria) this;
        }

        public Criteria andAsk_volume_5IsNotNull() {
            addCriterion("dbtickdata.ask_volume_5 is not null");
            return (Criteria) this;
        }

        public Criteria andAsk_volume_5EqualTo(Double value) {
            addCriterion("dbtickdata.ask_volume_5 =", value, "ask_volume_5");
            return (Criteria) this;
        }

        public Criteria andAsk_volume_5NotEqualTo(Double value) {
            addCriterion("dbtickdata.ask_volume_5 <>", value, "ask_volume_5");
            return (Criteria) this;
        }

        public Criteria andAsk_volume_5GreaterThan(Double value) {
            addCriterion("dbtickdata.ask_volume_5 >", value, "ask_volume_5");
            return (Criteria) this;
        }

        public Criteria andAsk_volume_5GreaterThanOrEqualTo(Double value) {
            addCriterion("dbtickdata.ask_volume_5 >=", value, "ask_volume_5");
            return (Criteria) this;
        }

        public Criteria andAsk_volume_5LessThan(Double value) {
            addCriterion("dbtickdata.ask_volume_5 <", value, "ask_volume_5");
            return (Criteria) this;
        }

        public Criteria andAsk_volume_5LessThanOrEqualTo(Double value) {
            addCriterion("dbtickdata.ask_volume_5 <=", value, "ask_volume_5");
            return (Criteria) this;
        }

        public Criteria andAsk_volume_5In(List<Double> values) {
            addCriterion("dbtickdata.ask_volume_5 in", values, "ask_volume_5");
            return (Criteria) this;
        }

        public Criteria andAsk_volume_5NotIn(List<Double> values) {
            addCriterion("dbtickdata.ask_volume_5 not in", values, "ask_volume_5");
            return (Criteria) this;
        }

        public Criteria andAsk_volume_5Between(Double value1, Double value2) {
            addCriterion("dbtickdata.ask_volume_5 between", value1, value2, "ask_volume_5");
            return (Criteria) this;
        }

        public Criteria andAsk_volume_5NotBetween(Double value1, Double value2) {
            addCriterion("dbtickdata.ask_volume_5 not between", value1, value2, "ask_volume_5");
            return (Criteria) this;
        }
    }

    /**
     */
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