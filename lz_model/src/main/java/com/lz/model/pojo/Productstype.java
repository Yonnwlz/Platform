package com.lz.model.pojo;

import java.util.Date;

public class Productstype {
    private Integer productstypeid;

    private String productstypename;

    private Date productstypecreatetime;

    private String productstypedesc;

    public Integer getProductstypeid() {
        return productstypeid;
    }

    public void setProductstypeid(Integer productstypeid) {
        this.productstypeid = productstypeid;
    }

    public String getProductstypename() {
        return productstypename;
    }

    public void setProductstypename(String productstypename) {
        this.productstypename = productstypename == null ? null : productstypename.trim();
    }

    public Date getProductstypecreatetime() {
        return productstypecreatetime;
    }

    public void setProductstypecreatetime(Date productstypecreatetime) {
        this.productstypecreatetime = productstypecreatetime;
    }

    public String getProductstypedesc() {
        return productstypedesc;
    }

    public void setProductstypedesc(String productstypedesc) {
        this.productstypedesc = productstypedesc == null ? null : productstypedesc.trim();
    }
}