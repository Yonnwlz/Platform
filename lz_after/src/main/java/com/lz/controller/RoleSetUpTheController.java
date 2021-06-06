package com.lz.controller;

import com.lz.model.pojo.Role;
import com.lz.model.pojo.Rolerela;
import com.lz.service.RoleRelaService;
import com.lz.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RoleSetUpTheController {
    @Autowired
    private RoleService roleService;

    @Autowired
    private RoleRelaService roleRelaService;

    /**
     * 所有角色
     * @return
     */
    @GetMapping("/getAllRoles")
    public List<Role> getAllRoles(){
        return roleService.findAllRoles();
    }

    /**
     * 当前登录管理员 角色信息
     * @param adminId
     * @return
     */
    @GetMapping("/getRoleInfo/{adminId}")
    public Rolerela getRoleInfo(@PathVariable Integer adminId){
      return   roleRelaService.findByAdminIdRole(adminId);
    }
}
