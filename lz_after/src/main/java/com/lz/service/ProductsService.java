package com.lz.service;

import com.lz.model.dto.SearchProductsParam;
import com.lz.model.dto.SearchResult;

/**
 * @description:    商品接口
 * @projectName:CloudLz
 * @see:com.lz.service
 * @author:Yonnw丶
 * @createTime:2021/6/1 11:09
 * @version:1.0
 */
public interface ProductsService {

    /**
     * description 分页+all商品
     * param [searchParam]
     * return com.lz.model.dto.SearchResult
     * author Yonnw丶
     * createTime 2021/6/1 11:13
     */
    public SearchResult findAllProducts(SearchProductsParam searchObjectParam);
}
