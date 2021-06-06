package com.lz.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.lz.dao.ProductsMapper;
import com.lz.model.dto.SearchProductsParam;
import com.lz.model.dto.SearchResult;
import com.lz.model.pojo.Products;
import com.lz.model.pojo.ProductsExample;
import com.lz.service.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @description:
 * @projectName:CloudLz
 * @see:com.lz.service.impl
 * @author:Yonnw丶
 * @createTime:2021/6/1 11:12
 * @version:1.0
 */
@Service
public class ProductsServiceImpl implements ProductsService {

    @Autowired
    private ProductsMapper productsMapper;

    @Override
    public SearchResult findAllProducts(SearchProductsParam searchObjectParam) {
        //分页
        Page<Object> page = PageHelper.startPage(searchObjectParam.getPageNum(), searchObjectParam.getPageSize());
        //All产品
        ProductsExample example = new ProductsExample();
        example.createCriteria().andProductsnameLike("%"+searchObjectParam.getProductsname()+"%");
        System.out.println(searchObjectParam.getProductthestoreid());
        List<Products> productsList = productsMapper.selectByExample(example);
        return new SearchResult(page.getTotal(),productsList);
    }
}
