package com.lz.controller;

import com.lz.model.pojo.Admin;
import com.lz.model.pojo.Menus;
import com.lz.model.pojo.Rolerela;
import com.lz.service.AdminLoginService;
import com.lz.service.MenusService;
import com.lz.service.RoleRelaService;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Map;

@RestController
public class AdminLoginController {
    @Autowired
    private AdminLoginService adminLoginService;

    @Autowired
    private MenusService menusService;

    @Autowired
    private RoleRelaService roleRelaService;

    /**
     * 登录验证
     * @param admin
     * @return
     */
    @GetMapping("/loginShiro")
    public Map getloginShiro(Admin admin){
        //密码加密
        String md5Pwd = new Md5Hash(admin.getAdminpassword(),admin.getAdminaccount(),3).toString();
        admin.setAdminpassword(md5Pwd);
        return adminLoginService.findLoginValidation(admin);
    }
    /**
     * 权限返回
     * @return
     */
    @GetMapping("/VimRole/{menuparentid}")
    public List<Menus> getVimRole(@PathVariable Integer menuparentid){
        return  menusService.findMenusAll(menuparentid);
    }

    /**
     * 新增管理员 + 角色
     * @param
     * @return
     */
    @PostMapping("/AddAdmin")
    public Boolean putAddAdminPerm(@RequestBody Admin admin){
        Integer roleId = admin.getAdminid();
        admin.setAdminid(null);
        Boolean aBoolean = adminLoginService.insertAdmin(admin);
        if(aBoolean){
            Rolerela rolerela = new Rolerela();
            rolerela.setAdminid(admin.getAdminid());
            rolerela.setRoleid(roleId);
            Boolean aBoolean1 = roleRelaService.insertAdminRelaRoles(rolerela);
            return aBoolean1?true:false;
        }
        return true;
    }
}
