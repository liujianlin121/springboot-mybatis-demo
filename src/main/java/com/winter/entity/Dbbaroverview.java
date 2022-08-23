package com.winter.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * dbbaroverview
 * @author 
 */
@Data
public class Dbbaroverview implements Serializable {
    private Integer id;

    private String symbol;

    private String exchange;

    private String interval;

    private Integer count;

    private Date start;

    private Date end;

    private static final long serialVersionUID = 1L;
}