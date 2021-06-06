package com.lz.model.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

public class Admin implements Serializable {
    private static final long serialVersionUID = -6806858146992517491L;
    private Integer adminid;

    private String adminname;

    private String adminimage;

    private String adminaccount;

    private String adminpassword;

    private String admindetails;

    private String adminphone;

    private String adminaddress;

    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date admincreatedate;

    private Integer adminstate;

    private Integer adminthestoreid;

    private String roleName;            //角色

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public Integer getAdminid() {
        return adminid;
    }

    public void setAdminid(Integer adminid) {
        this.adminid = adminid;
    }

    public String getAdminname() {
        return adminname;
    }

    public void setAdminname(String adminname) {
        this.adminname = adminname == null ? null : adminname.trim();
    }

    public String getAdminimage() {
        return adminimage;
    }

    public void setAdminimage(String adminimage) {
        this.adminimage = adminimage == null ? null : adminimage.trim();
    }

    public String getAdminaccount() {
        return adminaccount;
    }

    public void setAdminaccount(String adminaccount) {
        this.adminaccount = adminaccount == null ? null : adminaccount.trim();
    }

    public String getAdminpassword() {
        return adminpassword;
    }

    public void setAdminpassword(String adminpassword) {
        this.adminpassword = adminpassword == null ? null : adminpassword.trim();
    }

    public String getAdmindetails() {
        return admindetails;
    }

    public void setAdmindetails(String admindetails) {
        this.admindetails = admindetails == null ? null : admindetails.trim();
    }

    public String getAdminphone() {
        return adminphone;
    }

    public void setAdminphone(String adminphone) {
        this.adminphone = adminphone == null ? null : adminphone.trim();
    }

    public String getAdminaddress() {
        return adminaddress;
    }

    public void setAdminaddress(String adminaddress) {
        this.adminaddress = adminaddress == null ? null : adminaddress.trim();
    }

    public Date getAdmincreatedate() {
        return admincreatedate;
    }

    public void setAdmincreatedate(Date admincreatedate) {
        this.admincreatedate = admincreatedate;
    }

    public Integer getAdminstate() {
        return adminstate;
    }

    public void setAdminstate(Integer adminstate) {
        this.adminstate = adminstate;
    }

    public Integer getAdminthestoreid() {
        return adminthestoreid;
    }

    public void setAdminthestoreid(Integer adminthestoreid) {
        this.adminthestoreid = adminthestoreid;
    }
}