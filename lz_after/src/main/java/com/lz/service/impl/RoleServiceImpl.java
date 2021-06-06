package com.lz.service.impl;

import com.lz.dao.RoleMapper;
import com.lz.model.pojo.Role;
import com.lz.service.RoleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {
    @Resource
    private RoleMapper roleMapper;


    @Override
    public List<Role> findAllRoles() {
        return roleMapper.selectByExample(null);
    }
}
