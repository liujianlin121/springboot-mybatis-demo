package com.winter.mapper;

import com.winter.entity.Dbbaroverview;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface DbbaroverviewDao {
    int deleteByPrimaryKey(Integer id);

    int insert(Dbbaroverview record);

    int insertSelective(Dbbaroverview record);

    Dbbaroverview selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Dbbaroverview record);

    int updateByPrimaryKey(Dbbaroverview record);

    int insertList(@Param("list") List<Dbbaroverview> list);
}