package com.lz.dao;

import com.lz.model.pojo.Productsimage;
import com.lz.model.pojo.ProductsimageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductsimageMapper {
    long countByExample(ProductsimageExample example);

    int deleteByExample(ProductsimageExample example);

    int insert(Productsimage record);

    int insertSelective(Productsimage record);

    List<Productsimage> selectByExample(ProductsimageExample example);

    int updateByExampleSelective(@Param("record") Productsimage record, @Param("example") ProductsimageExample example);

    int updateByExample(@Param("record") Productsimage record, @Param("example") ProductsimageExample example);
}