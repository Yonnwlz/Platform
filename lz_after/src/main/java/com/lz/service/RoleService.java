package com.lz.service;

import com.lz.model.pojo.Role;

import java.util.List;

public interface RoleService {
    /**
     * 所有角色
     * @return
     */
    public List<Role> findAllRoles();
}
