package com.winter.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * dbtickdata
 * @author 
 */
@Table(name="dbtickdata")
@ApiModel(value="com.winter.entity.Dbtickdata")
@Data
public class Dbtickdata implements Serializable {
    @Id
    @GeneratedValue
    @GeneratedValue(generator = "JDBC")
    private Integer id;

    @NotEmpty
    private String symbol;

    @NotEmpty
    private String exchange;

    @NotEmpty
    private LocalDateTime datetime;

    @NotEmpty
    private String name;

    @NotEmpty
    private Double volume;

    @NotEmpty
    private Double open_interest;

    @NotEmpty
    private Double last_price;

    @NotEmpty
    private Double last_volume;

    @NotEmpty
    private Double limit_up;

    @NotEmpty
    private Double limit_down;

    @NotEmpty
    private Double open_price;

    @NotEmpty
    private Double high_price;

    @NotEmpty
    private Double low_price;

    @NotEmpty
    private Double pre_close;

    @NotEmpty
    private Double bid_price_1;

    private Double bid_price_2;

    private Double bid_price_3;

    private Double bid_price_4;

    private Double bid_price_5;

    @NotEmpty
    private Double ask_price_1;

    private Double ask_price_2;

    private Double ask_price_3;

    private Double ask_price_4;

    private Double ask_price_5;

    @NotEmpty
    private Double bid_volume_1;

    private Double bid_volume_2;

    private Double bid_volume_3;

    private Double bid_volume_4;

    private Double bid_volume_5;

    @NotEmpty
    private Double ask_volume_1;

    private Double ask_volume_2;

    private Double ask_volume_3;

    private Double ask_volume_4;

    private Double ask_volume_5;

    private static final long serialVersionUID = 1L;

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Dbtickdata other = (Dbtickdata) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getSymbol() == null ? other.getSymbol() == null : this.getSymbol().equals(other.getSymbol()))
            && (this.getExchange() == null ? other.getExchange() == null : this.getExchange().equals(other.getExchange()))
            && (this.getDatetime() == null ? other.getDatetime() == null : this.getDatetime().equals(other.getDatetime()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getVolume() == null ? other.getVolume() == null : this.getVolume().equals(other.getVolume()))
            && (this.getOpen_interest() == null ? other.getOpen_interest() == null : this.getOpen_interest().equals(other.getOpen_interest()))
            && (this.getLast_price() == null ? other.getLast_price() == null : this.getLast_price().equals(other.getLast_price()))
            && (this.getLast_volume() == null ? other.getLast_volume() == null : this.getLast_volume().equals(other.getLast_volume()))
            && (this.getLimit_up() == null ? other.getLimit_up() == null : this.getLimit_up().equals(other.getLimit_up()))
            && (this.getLimit_down() == null ? other.getLimit_down() == null : this.getLimit_down().equals(other.getLimit_down()))
            && (this.getOpen_price() == null ? other.getOpen_price() == null : this.getOpen_price().equals(other.getOpen_price()))
            && (this.getHigh_price() == null ? other.getHigh_price() == null : this.getHigh_price().equals(other.getHigh_price()))
            && (this.getLow_price() == null ? other.getLow_price() == null : this.getLow_price().equals(other.getLow_price()))
            && (this.getPre_close() == null ? other.getPre_close() == null : this.getPre_close().equals(other.getPre_close()))
            && (this.getBid_price_1() == null ? other.getBid_price_1() == null : this.getBid_price_1().equals(other.getBid_price_1()))
            && (this.getBid_price_2() == null ? other.getBid_price_2() == null : this.getBid_price_2().equals(other.getBid_price_2()))
            && (this.getBid_price_3() == null ? other.getBid_price_3() == null : this.getBid_price_3().equals(other.getBid_price_3()))
            && (this.getBid_price_4() == null ? other.getBid_price_4() == null : this.getBid_price_4().equals(other.getBid_price_4()))
            && (this.getBid_price_5() == null ? other.getBid_price_5() == null : this.getBid_price_5().equals(other.getBid_price_5()))
            && (this.getAsk_price_1() == null ? other.getAsk_price_1() == null : this.getAsk_price_1().equals(other.getAsk_price_1()))
            && (this.getAsk_price_2() == null ? other.getAsk_price_2() == null : this.getAsk_price_2().equals(other.getAsk_price_2()))
            && (this.getAsk_price_3() == null ? other.getAsk_price_3() == null : this.getAsk_price_3().equals(other.getAsk_price_3()))
            && (this.getAsk_price_4() == null ? other.getAsk_price_4() == null : this.getAsk_price_4().equals(other.getAsk_price_4()))
            && (this.getAsk_price_5() == null ? other.getAsk_price_5() == null : this.getAsk_price_5().equals(other.getAsk_price_5()))
            && (this.getBid_volume_1() == null ? other.getBid_volume_1() == null : this.getBid_volume_1().equals(other.getBid_volume_1()))
            && (this.getBid_volume_2() == null ? other.getBid_volume_2() == null : this.getBid_volume_2().equals(other.getBid_volume_2()))
            && (this.getBid_volume_3() == null ? other.getBid_volume_3() == null : this.getBid_volume_3().equals(other.getBid_volume_3()))
            && (this.getBid_volume_4() == null ? other.getBid_volume_4() == null : this.getBid_volume_4().equals(other.getBid_volume_4()))
            && (this.getBid_volume_5() == null ? other.getBid_volume_5() == null : this.getBid_volume_5().equals(other.getBid_volume_5()))
            && (this.getAsk_volume_1() == null ? other.getAsk_volume_1() == null : this.getAsk_volume_1().equals(other.getAsk_volume_1()))
            && (this.getAsk_volume_2() == null ? other.getAsk_volume_2() == null : this.getAsk_volume_2().equals(other.getAsk_volume_2()))
            && (this.getAsk_volume_3() == null ? other.getAsk_volume_3() == null : this.getAsk_volume_3().equals(other.getAsk_volume_3()))
            && (this.getAsk_volume_4() == null ? other.getAsk_volume_4() == null : this.getAsk_volume_4().equals(other.getAsk_volume_4()))
            && (this.getAsk_volume_5() == null ? other.getAsk_volume_5() == null : this.getAsk_volume_5().equals(other.getAsk_volume_5()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getSymbol() == null) ? 0 : getSymbol().hashCode());
        result = prime * result + ((getExchange() == null) ? 0 : getExchange().hashCode());
        result = prime * result + ((getDatetime() == null) ? 0 : getDatetime().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getVolume() == null) ? 0 : getVolume().hashCode());
        result = prime * result + ((getOpen_interest() == null) ? 0 : getOpen_interest().hashCode());
        result = prime * result + ((getLast_price() == null) ? 0 : getLast_price().hashCode());
        result = prime * result + ((getLast_volume() == null) ? 0 : getLast_volume().hashCode());
        result = prime * result + ((getLimit_up() == null) ? 0 : getLimit_up().hashCode());
        result = prime * result + ((getLimit_down() == null) ? 0 : getLimit_down().hashCode());
        result = prime * result + ((getOpen_price() == null) ? 0 : getOpen_price().hashCode());
        result = prime * result + ((getHigh_price() == null) ? 0 : getHigh_price().hashCode());
        result = prime * result + ((getLow_price() == null) ? 0 : getLow_price().hashCode());
        result = prime * result + ((getPre_close() == null) ? 0 : getPre_close().hashCode());
        result = prime * result + ((getBid_price_1() == null) ? 0 : getBid_price_1().hashCode());
        result = prime * result + ((getBid_price_2() == null) ? 0 : getBid_price_2().hashCode());
        result = prime * result + ((getBid_price_3() == null) ? 0 : getBid_price_3().hashCode());
        result = prime * result + ((getBid_price_4() == null) ? 0 : getBid_price_4().hashCode());
        result = prime * result + ((getBid_price_5() == null) ? 0 : getBid_price_5().hashCode());
        result = prime * result + ((getAsk_price_1() == null) ? 0 : getAsk_price_1().hashCode());
        result = prime * result + ((getAsk_price_2() == null) ? 0 : getAsk_price_2().hashCode());
        result = prime * result + ((getAsk_price_3() == null) ? 0 : getAsk_price_3().hashCode());
        result = prime * result + ((getAsk_price_4() == null) ? 0 : getAsk_price_4().hashCode());
        result = prime * result + ((getAsk_price_5() == null) ? 0 : getAsk_price_5().hashCode());
        result = prime * result + ((getBid_volume_1() == null) ? 0 : getBid_volume_1().hashCode());
        result = prime * result + ((getBid_volume_2() == null) ? 0 : getBid_volume_2().hashCode());
        result = prime * result + ((getBid_volume_3() == null) ? 0 : getBid_volume_3().hashCode());
        result = prime * result + ((getBid_volume_4() == null) ? 0 : getBid_volume_4().hashCode());
        result = prime * result + ((getBid_volume_5() == null) ? 0 : getBid_volume_5().hashCode());
        result = prime * result + ((getAsk_volume_1() == null) ? 0 : getAsk_volume_1().hashCode());
        result = prime * result + ((getAsk_volume_2() == null) ? 0 : getAsk_volume_2().hashCode());
        result = prime * result + ((getAsk_volume_3() == null) ? 0 : getAsk_volume_3().hashCode());
        result = prime * result + ((getAsk_volume_4() == null) ? 0 : getAsk_volume_4().hashCode());
        result = prime * result + ((getAsk_volume_5() == null) ? 0 : getAsk_volume_5().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", symbol=").append(symbol);
        sb.append(", exchange=").append(exchange);
        sb.append(", datetime=").append(datetime);
        sb.append(", name=").append(name);
        sb.append(", volume=").append(volume);
        sb.append(", open_interest=").append(open_interest);
        sb.append(", last_price=").append(last_price);
        sb.append(", last_volume=").append(last_volume);
        sb.append(", limit_up=").append(limit_up);
        sb.append(", limit_down=").append(limit_down);
        sb.append(", open_price=").append(open_price);
        sb.append(", high_price=").append(high_price);
        sb.append(", low_price=").append(low_price);
        sb.append(", pre_close=").append(pre_close);
        sb.append(", bid_price_1=").append(bid_price_1);
        sb.append(", bid_price_2=").append(bid_price_2);
        sb.append(", bid_price_3=").append(bid_price_3);
        sb.append(", bid_price_4=").append(bid_price_4);
        sb.append(", bid_price_5=").append(bid_price_5);
        sb.append(", ask_price_1=").append(ask_price_1);
        sb.append(", ask_price_2=").append(ask_price_2);
        sb.append(", ask_price_3=").append(ask_price_3);
        sb.append(", ask_price_4=").append(ask_price_4);
        sb.append(", ask_price_5=").append(ask_price_5);
        sb.append(", bid_volume_1=").append(bid_volume_1);
        sb.append(", bid_volume_2=").append(bid_volume_2);
        sb.append(", bid_volume_3=").append(bid_volume_3);
        sb.append(", bid_volume_4=").append(bid_volume_4);
        sb.append(", bid_volume_5=").append(bid_volume_5);
        sb.append(", ask_volume_1=").append(ask_volume_1);
        sb.append(", ask_volume_2=").append(ask_volume_2);
        sb.append(", ask_volume_3=").append(ask_volume_3);
        sb.append(", ask_volume_4=").append(ask_volume_4);
        sb.append(", ask_volume_5=").append(ask_volume_5);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}