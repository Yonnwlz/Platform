package com.lz.model.pojo;

public class Productscontent {
    private Integer productscontentid;

    private String productscontentkey;

    private String productscontentvalue;

    public Integer getProductscontentid() {
        return productscontentid;
    }

    public void setProductscontentid(Integer productscontentid) {
        this.productscontentid = productscontentid;
    }

    public String getProductscontentkey() {
        return productscontentkey;
    }

    public void setProductscontentkey(String productscontentkey) {
        this.productscontentkey = productscontentkey == null ? null : productscontentkey.trim();
    }

    public String getProductscontentvalue() {
        return productscontentvalue;
    }

    public void setProductscontentvalue(String productscontentvalue) {
        this.productscontentvalue = productscontentvalue == null ? null : productscontentvalue.trim();
    }
}