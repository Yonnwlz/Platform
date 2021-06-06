package com.lz.dao;

import com.lz.model.pojo.Menurela;
import com.lz.model.pojo.Menus;
import com.lz.model.pojo.MenusExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface MenusMapper {
    long countByExample(MenusExample example);

    int deleteByExample(MenusExample example);

    int deleteByPrimaryKey(Integer menuid);

    int insert(Menus record);

    int insertSelective(Menus record);

    List<Menus> selectByExample(MenusExample example);

    Menus selectByPrimaryKey(Integer menuid);

    int updateByExampleSelective(@Param("record") Menus record, @Param("example") MenusExample example);

    int updateByExample(@Param("record") Menus record, @Param("example") MenusExample example);

    int updateByPrimaryKeySelective(Menus record);

    int updateByPrimaryKey(Menus record);

    /**
     * 获取根节点
     * @param parentid
     * @return
     */
    List<Menus> selectByGenAll(List<Menurela> list);


}