package com.winter.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author: ljl
 * @date: 2022/09/23
 **/
@Data
public class Room implements Serializable {

    private String roomId;

    private String roomName;

    private List<Personnel> personnelList;

    private long size;
}
