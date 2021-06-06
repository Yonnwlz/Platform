package com.lz.dao;

import com.lz.model.pojo.Productsinventory;
import com.lz.model.pojo.ProductsinventoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductsinventoryMapper {
    long countByExample(ProductsinventoryExample example);

    int deleteByExample(ProductsinventoryExample example);

    int deleteByPrimaryKey(String inventoryserialnumber);

    int insert(Productsinventory record);

    int insertSelective(Productsinventory record);

    List<Productsinventory> selectByExample(ProductsinventoryExample example);

    Productsinventory selectByPrimaryKey(String inventoryserialnumber);

    int updateByExampleSelective(@Param("record") Productsinventory record, @Param("example") ProductsinventoryExample example);

    int updateByExample(@Param("record") Productsinventory record, @Param("example") ProductsinventoryExample example);

    int updateByPrimaryKeySelective(Productsinventory record);

    int updateByPrimaryKey(Productsinventory record);
}