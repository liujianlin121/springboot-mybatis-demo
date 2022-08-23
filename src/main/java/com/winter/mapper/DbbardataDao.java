package com.winter.mapper;

import com.winter.entity.Dbbardata;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface DbbardataDao {
    int deleteByPrimaryKey(Integer id);

    int insert(Dbbardata record);

    int insertSelective(Dbbardata record);

    Dbbardata selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Dbbardata record);

    int updateByPrimaryKey(Dbbardata record);
}