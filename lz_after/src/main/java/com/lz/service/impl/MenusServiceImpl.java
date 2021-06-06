package com.lz.service.impl;

import com.lz.dao.MenurelaMapper;
import com.lz.dao.MenusMapper;
import com.lz.dao.RoleMapper;
import com.lz.dao.RolerelaMapper;
import com.lz.model.note.RightsManagement;
import com.lz.model.pojo.*;
import com.lz.service.MenusService;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class MenusServiceImpl implements MenusService {

    @Resource
    private MenusMapper menusMapper;

    @Resource
    private RolerelaMapper rolerelaMapper;

    @Resource
    private MenurelaMapper menurelaMapper;

    @Override
    public List<Menus> findMenusAll(Integer adminId) {
        List<Menus> menusList = new ArrayList<>();
        //角色映射
        Rolerela rolerela = rolerelaMapper.selectByAdminIdQueryRole(adminId);
        //获取权限
        MenurelaExample menurelaExample = new MenurelaExample();
        menurelaExample.createCriteria().andRoleidEqualTo(rolerela.getRoleid());
        List<Menurela> menurelas = menurelaMapper.selectByExample(menurelaExample);

        //所有根节点
        List<Menus> menusList1 = menusMapper.selectByGenAll(menurelas);
        for(Menus menus:menusList1){
            menusList.add(menus);
        }

        return findMenusTheChild(menusList);
    }
    /**
     * 查询所有子权限
     * @param menusList
     * @return
     */
    public List<Menus> findMenusTheChild(List<Menus> menusList){
        //遍历跟权限
        for(Menus menu : menusList){
            //获取子权限
            MenusExample menusExample = new MenusExample();
            menusExample.createCriteria().andMenuparentidEqualTo(menu.getMenuid());
            List<Menus> menusList1 = menusMapper.selectByExample(menusExample);
            //获取子权限存入父权限中
            menu.setMenusList(menusList1);
            RightsManagement rightsManagement = new RightsManagement();
            rightsManagement.setMenuName(menu.getMenuname());
            rightsManagement.setMenuUrl(menu.getMenuurl());
            rightsManagement.setMenuImageUrl(menu.getMenuimageurl());
            rightsManagement.setMenuTIP(menu.getMenutip());
            rightsManagement.setMenuStatus(menu.getMenustatus());
            menu.setRightsManagement(rightsManagement);
            //递归查询
            findMenusTheChild(menusList1);
        }
        return menusList;
    }
}
