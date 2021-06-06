package com.lz.model.pojo;

public class Menurela {
    private Integer menuid;

    private Integer roleid;

    public Integer getMenuid() {
        return menuid;
    }

    public void setMenuid(Integer menuid) {
        this.menuid = menuid;
    }

    public Integer getRoleid() {
        return roleid;
    }

    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }

    @Override
    public String toString() {
        return "Menurela{" +
                "menuid=" + menuid +
                ", roleid=" + roleid +
                '}';
    }
}