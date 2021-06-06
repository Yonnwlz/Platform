package com.lz.model.dto;

import java.io.Serializable;

public class SearchParam implements Serializable {
    private static final long serialVersionUID = -3898728817738602655L;
    private Integer pageNum;        //当前页数

    private Integer pageSize;       //每页展示数量

    private Integer adminId;        //管理员编号

    private String adminName;       //管理员昵称

    private String adminAddress;    //管理员地址

    private String adminstate;      //管理员状态

    public String getAdminstate() {
        return adminstate;
    }

    public void setAdminstate(String adminstate) {
        this.adminstate = adminstate;
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

    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public String getAdminAddress() {
        return adminAddress;
    }

    public void setAdminAddress(String adminAddress) {
        this.adminAddress = adminAddress;
    }

    @Override
    public String toString() {
        return "SearchParam{" +
                "pageNum=" + pageNum +
                ", pageSize=" + pageSize +
                ", adminId=" + adminId +
                ", adminName='" + adminName + '\'' +
                ", adminAddress='" + adminAddress + '\'' +
                '}';
    }
}

