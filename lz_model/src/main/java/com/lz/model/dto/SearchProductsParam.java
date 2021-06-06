package com.lz.model.dto;

import com.lz.model.pojo.Products;

import java.io.Serializable;

/**
 * @description:
 * @projectName:CloudLz
 * @see:com.lz.model.dto
 * @author:Yonnw丶
 * @createTime:2021/6/1 11:15
 * @version:1.0
 */
public class SearchProductsParam implements Serializable {
    private static final long serialVersionUID = -1856171222375089734L;
    private Integer pageNum;        //当前页数

    private Integer pageSize;       //每页展示数量

    private String productsname;    //商品名称

    private Integer productthestoreid;

    public String getProductsname() {
        return productsname;
    }

    public void setProductsname(String productsname) {
        this.productsname = productsname;
    }

    public Integer getProductthestoreid() {
        return productthestoreid;
    }

    public void setProductthestoreid(Integer productthestoreid) {
        this.productthestoreid = productthestoreid;
    }

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }
}
