package com.lz.model.pojo;

public class Productsimage {
    private Integer productsimagesid;

    private String productsimagesurl;

    private String productsimagesdesc;

    public Integer getProductsimagesid() {
        return productsimagesid;
    }

    public void setProductsimagesid(Integer productsimagesid) {
        this.productsimagesid = productsimagesid;
    }

    public String getProductsimagesurl() {
        return productsimagesurl;
    }

    public void setProductsimagesurl(String productsimagesurl) {
        this.productsimagesurl = productsimagesurl == null ? null : productsimagesurl.trim();
    }

    public String getProductsimagesdesc() {
        return productsimagesdesc;
    }

    public void setProductsimagesdesc(String productsimagesdesc) {
        this.productsimagesdesc = productsimagesdesc == null ? null : productsimagesdesc.trim();
    }
}