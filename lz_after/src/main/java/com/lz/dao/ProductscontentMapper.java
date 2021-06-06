package com.lz.dao;

import com.lz.model.pojo.Productscontent;
import com.lz.model.pojo.ProductscontentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductscontentMapper {
    long countByExample(ProductscontentExample example);

    int deleteByExample(ProductscontentExample example);

    int insert(Productscontent record);

    int insertSelective(Productscontent record);

    List<Productscontent> selectByExample(ProductscontentExample example);

    int updateByExampleSelective(@Param("record") Productscontent record, @Param("example") ProductscontentExample example);

    int updateByExample(@Param("record") Productscontent record, @Param("example") ProductscontentExample example);
}