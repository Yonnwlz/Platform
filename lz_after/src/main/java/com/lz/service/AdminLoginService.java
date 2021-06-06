package com.lz.service;

import com.lz.model.pojo.Admin;

import java.util.Map;

public interface AdminLoginService {

    /**
     * 登录验证
     * @param admin
     * @return
     */
    public Map findLoginValidation(Admin admin);

    /**
     * 新增管理员
     * @param admin
     * @return
     */
    public Boolean insertAdmin(Admin admin);
}
