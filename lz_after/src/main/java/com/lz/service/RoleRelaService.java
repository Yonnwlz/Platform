package com.lz.service;

import com.lz.model.pojo.Role;
import com.lz.model.pojo.Rolerela;
import com.sun.org.apache.xpath.internal.operations.Bool;

/**
 * 角色映射接口
 */

public interface RoleRelaService {
    /**
     * 管理员+角色 关系添加
     * @param rolerela
     * @return
     */
    public Boolean insertAdminRelaRoles(Rolerela rolerela);

    /**
     * 当前管理员角色
     * @param adminId   管理员ID
     * @return
     */
    public Rolerela findByAdminIdRole(Integer adminId);

    /**
     * 角色修改
     * @param rolerela
     * @return
     */
    public Boolean updateByRolerela(Rolerela rolerela);
}
