package com.lz.model.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class Products {
    private String productsnumber;

    private String productsname;

    private Integer productsimagesid;

    private Integer productstypeid;

    private BigDecimal productprice;

    private Integer productcontentid;

    private Integer productnumbersales;

    private Integer productthestoreid;

    private Date productcreatetime;

    public String getProductsnumber() {
        return productsnumber;
    }

    public void setProductsnumber(String productsnumber) {
        this.productsnumber = productsnumber == null ? null : productsnumber.trim();
    }

    public String getProductsname() {
        return productsname;
    }

    public void setProductsname(String productsname) {
        this.productsname = productsname == null ? null : productsname.trim();
    }

    public Integer getProductsimagesid() {
        return productsimagesid;
    }

    public void setProductsimagesid(Integer productsimagesid) {
        this.productsimagesid = productsimagesid;
    }

    public Integer getProductstypeid() {
        return productstypeid;
    }

    public void setProductstypeid(Integer productstypeid) {
        this.productstypeid = productstypeid;
    }

    public BigDecimal getProductprice() {
        return productprice;
    }

    public void setProductprice(BigDecimal productprice) {
        this.productprice = productprice;
    }

    public Integer getProductcontentid() {
        return productcontentid;
    }

    public void setProductcontentid(Integer productcontentid) {
        this.productcontentid = productcontentid;
    }

    public Integer getProductnumbersales() {
        return productnumbersales;
    }

    public void setProductnumbersales(Integer productnumbersales) {
        this.productnumbersales = productnumbersales;
    }

    public Integer getProductthestoreid() {
        return productthestoreid;
    }

    public void setProductthestoreid(Integer productthestoreid) {
        this.productthestoreid = productthestoreid;
    }

    public Date getProductcreatetime() {
        return productcreatetime;
    }

    public void setProductcreatetime(Date productcreatetime) {
        this.productcreatetime = productcreatetime;
    }

    @Override
    public String toString() {
        return "Products{" +
                "productsnumber='" + productsnumber + '\'' +
                ", productsname='" + productsname + '\'' +
                ", productsimagesid=" + productsimagesid +
                ", productstypeid=" + productstypeid +
                ", productprice=" + productprice +
                ", productcontentid=" + productcontentid +
                ", productnumbersales=" + productnumbersales +
                ", productthestoreid=" + productthestoreid +
                ", productcreatetime=" + productcreatetime +
                '}';
    }
}