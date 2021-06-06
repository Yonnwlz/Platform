package com.lz.model.note;

import com.lz.model.pojo.Admin;
import com.lz.model.pojo.Menus;
import com.lz.model.pojo.Role;

import java.util.List;

/**
 * 权限管理类
 */
public class RightsManagement {
    private String menuName;         //提示信息

    private String menuUrl;     //链接地址

    private String menuImageUrl;    //图片地址

    private String menuTIP;     //菜单说明

    private Integer menuStatus;     //是否可用

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public String getMenuUrl() {
        return menuUrl;
    }

    public void setMenuUrl(String menuUrl) {
        this.menuUrl = menuUrl;
    }

    public String getMenuImageUrl() {
        return menuImageUrl;
    }

    public void setMenuImageUrl(String menuImageUrl) {
        this.menuImageUrl = menuImageUrl;
    }

    public String getMenuTIP() {
        return menuTIP;
    }

    public void setMenuTIP(String menuTIP) {
        this.menuTIP = menuTIP;
    }

    public Integer getMenuStatus() {
        return menuStatus;
    }

    public void setMenuStatus(Integer menuStatus) {
        this.menuStatus = menuStatus;
    }
}
