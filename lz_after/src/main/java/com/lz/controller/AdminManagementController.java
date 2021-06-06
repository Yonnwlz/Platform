package com.lz.controller;

import com.lz.model.dto.SearchParam;
import com.lz.model.dto.SearchResult;
import com.lz.model.help.AdministratorDetails;
import com.lz.model.pojo.Admin;
import com.lz.model.pojo.Rolerela;
import com.lz.service.AdminManagementService;
import com.lz.service.MenusService;
import com.lz.service.RoleRelaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class AdminManagementController {
    @Autowired
    private AdminManagementService adminManagementService;

    @Autowired
    private MenusService menusService;


    @Autowired
    private RoleRelaService roleRelaService;

    /**
     * 管理员分页接口
     * @param searchParam
     * @return
     */
    @GetMapping("/getAdminAll")
    public SearchResult getAdminAll(SearchParam searchParam){
      return adminManagementService.findAllAdminDate(searchParam);
    }

    /***
     * 管理员详情接口
     */
    @GetMapping("/getAdmiDetails/{adminId}")
    public AdministratorDetails getAdmiDetails(@PathVariable Integer adminId){
        return adminManagementService.findByIdAdminDetails(adminId);
    }
    /**
     * 管理员角色修改
     */
    @PutMapping("/theRoleChange")
    public Boolean theRoleChange(@RequestBody Rolerela rolerela){
        return roleRelaService.updateByRolerela(rolerela);
    }
    /**
     * 管理员基本信息修改
     */
    @PutMapping("/AdministratorModification")
    public Boolean administratorModification(@RequestBody Admin admin){
        Boolean isBoolean = adminManagementService.updateByIdAdminId(admin);
        return isBoolean;
    }

}
