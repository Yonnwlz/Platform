package com.lz.dao;

import com.lz.model.pojo.Productstype;
import com.lz.model.pojo.ProductstypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductstypeMapper {
    long countByExample(ProductstypeExample example);

    int deleteByExample(ProductstypeExample example);

    int deleteByPrimaryKey(Integer productstypeid);

    int insert(Productstype record);

    int insertSelective(Productstype record);

    List<Productstype> selectByExample(ProductstypeExample example);

    Productstype selectByPrimaryKey(Integer productstypeid);

    int updateByExampleSelective(@Param("record") Productstype record, @Param("example") ProductstypeExample example);

    int updateByExample(@Param("record") Productstype record, @Param("example") ProductstypeExample example);

    int updateByPrimaryKeySelective(Productstype record);

    int updateByPrimaryKey(Productstype record);
}