package com.lz.model.pojo;

public class Rolerela {
    private Integer adminid;

    private Integer roleid;

    private Role role;      //角色类

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Integer getAdminid() {
        return adminid;
    }

    public void setAdminid(Integer adminid) {
        this.adminid = adminid;
    }

    public Integer getRoleid() {
        return roleid;
    }

    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }

    @Override
    public String toString() {
        return "Rolerela{" +
                "adminid=" + adminid +
                ", roleid=" + roleid +
                ", role=" + role +
                '}';
    }
}