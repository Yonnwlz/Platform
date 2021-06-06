package com.lz.model.pojo;

import com.lz.model.note.RightsManagement;

import java.util.List;

public class Menus {
    private Integer menuid;

    private Integer menuparentid;

    private String menuname;

    private String menuurl;

    private String menuimageurl;

    private String menutip;

    private Integer menustatus;

    private List<Menus> menusList;

    private RightsManagement rightsManagement;

    public RightsManagement getRightsManagement() {
        return rightsManagement;
    }

    public void setRightsManagement(RightsManagement rightsManagement) {
        this.rightsManagement = rightsManagement;
    }

    public List<Menus> getMenusList() {
        return menusList;
    }

    public void setMenusList(List<Menus> menusList) {
        this.menusList = menusList;
    }

    public Integer getMenuid() {
        return menuid;
    }

    public void setMenuid(Integer menuid) {
        this.menuid = menuid;
    }

    public Integer getMenuparentid() {
        return menuparentid;
    }

    public void setMenuparentid(Integer menuparentid) {
        this.menuparentid = menuparentid;
    }

    public String getMenuname() {
        return menuname;
    }

    public void setMenuname(String menuname) {
        this.menuname = menuname == null ? null : menuname.trim();
    }

    public String getMenuurl() {
        return menuurl;
    }

    public void setMenuurl(String menuurl) {
        this.menuurl = menuurl == null ? null : menuurl.trim();
    }

    public String getMenuimageurl() {
        return menuimageurl;
    }

    public void setMenuimageurl(String menuimageurl) {
        this.menuimageurl = menuimageurl == null ? null : menuimageurl.trim();
    }

    public String getMenutip() {
        return menutip;
    }

    public void setMenutip(String menutip) {
        this.menutip = menutip == null ? null : menutip.trim();
    }

    public Integer getMenustatus() {
        return menustatus;
    }

    public void setMenustatus(Integer menustatus) {
        this.menustatus = menustatus;
    }

    @Override
    public String toString() {
        return "Menus{" +
                "menuid=" + menuid +
                ", menuparentid=" + menuparentid +
                ", menuname='" + menuname + '\'' +
                ", menuurl='" + menuurl + '\'' +
                ", menuimageurl='" + menuimageurl + '\'' +
                ", menutip='" + menutip + '\'' +
                ", menustatus=" + menustatus +
                ", menusList=" + menusList +
                '}';
    }
}