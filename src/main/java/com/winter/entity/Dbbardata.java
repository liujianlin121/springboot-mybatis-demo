package com.winter.entity;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

/**
 * dbbardata
 *
 * @author
 */
@Data
public class Dbbardata implements Serializable {
    private Integer id;

    private String symbol;

    private String exchange;

    private Date datetime;

    private String interval;

    private Double volume;

    private Double openInterest;

    private Double openPrice;

    private Double highPrice;

    private Double lowPrice;

    private Double closePrice;

    private static final long serialVersionUID = 1L;
}