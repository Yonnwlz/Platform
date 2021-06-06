package com.lz.service;

import com.lz.model.pojo.Menurela;

public interface MenuRelaService {
    /**
     * 角色+权限 关系添加
     * @param menurela
     * @return
     */
    public Boolean insertRoleRelaAuthorization(Menurela menurela);
}
