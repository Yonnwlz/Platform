package com.lz.dao;

import com.lz.model.pojo.Menurela;
import com.lz.model.pojo.MenurelaExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MenurelaMapper {
    long countByExample(MenurelaExample example);

    int deleteByExample(MenurelaExample example);

    int deleteByPrimaryKey(Integer menuid);

    int insert(Menurela record);

    int insertSelective(Menurela record);

    List<Menurela> selectByExample(MenurelaExample example);

    Menurela selectByPrimaryKey(Integer menuid);

    int updateByExampleSelective(@Param("record") Menurela record, @Param("example") MenurelaExample example);

    int updateByExample(@Param("record") Menurela record, @Param("example") MenurelaExample example);

    int updateByPrimaryKeySelective(Menurela record);

    int updateByPrimaryKey(Menurela record);
}