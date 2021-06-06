package com.lz.model.pojo;

public class Productsinventory {
    private String inventoryserialnumber;

    private Integer inventorynumber;

    public String getInventoryserialnumber() {
        return inventoryserialnumber;
    }

    public void setInventoryserialnumber(String inventoryserialnumber) {
        this.inventoryserialnumber = inventoryserialnumber == null ? null : inventoryserialnumber.trim();
    }

    public Integer getInventorynumber() {
        return inventorynumber;
    }

    public void setInventorynumber(Integer inventorynumber) {
        this.inventorynumber = inventorynumber;
    }
}