package com.lz.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.lz.dao.AdminMapper;
import com.lz.dao.RolerelaMapper;
import com.lz.model.dto.SearchParam;
import com.lz.model.dto.SearchResult;
import com.lz.model.help.AdministratorDetails;
import com.lz.model.pojo.Admin;
import com.lz.model.pojo.AdminExample;
import com.lz.model.pojo.Menus;
import com.lz.model.pojo.Rolerela;
import com.lz.service.AdminManagementService;
import com.lz.service.MenusService;
import com.lz.service.RoleRelaService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AdminManagementServiceImpl implements AdminManagementService {

    @Resource
    private AdminMapper adminMapper;

    @Resource
    private RolerelaMapper rolerelaMapper;

    @Resource
    private MenusService menusService;

    /**
     * 展示所有管理员
     * @param searchParam
     * @return
     */
    @Override
    public SearchResult findAllAdminDate(SearchParam searchParam) {
        SearchResult searchResult = new SearchResult();
        //分页
        Page<Object> page = PageHelper.startPage(searchParam.getPageNum(), searchParam.getPageSize());
        if (searchParam.getAdminName()!=null){
            searchParam.setAdminName("%"+searchParam.getAdminName()+"%");
        }
        if(searchParam.getAdminAddress()!=null){
            searchParam.setAdminAddress("%"+searchParam.getAdminAddress()+"%");
        }
        if(searchParam.getAdminstate()!=null){
            searchParam.setAdminstate(searchParam.getAdminstate());
        }
        List<Admin> admins = adminMapper.selectByAdminQueryFuzzy(searchParam);
        //角色查询
        admins.forEach(item ->{
            Rolerela rolerela = rolerelaMapper.selectByAdminIdQueryRole(item.getAdminid());
            //角色赋值
            item.setRoleName(rolerela.getRole().getRolename());
        });
        //角色判断
        //赋值给返回对象
        searchResult.setTotal(page.getTotal());
        searchResult.setList(admins);
        return searchResult;
    }

    /**
     * 管理员详情
     * @param adminId   管理员ID
     * @return
     */
    @Override
    public AdministratorDetails findByIdAdminDetails(Integer adminId) {
        //管理员基本信息
        Admin admin = adminMapper.selectByPrimaryKey(adminId);
        //管理员角色
        Rolerela rolerela = rolerelaMapper.selectByAdminIdQueryRole(adminId);
        //管理员模块
        List<Menus> menusAll = menusService.findMenusAll(adminId);
        return new AdministratorDetails(admin,rolerela,menusAll);
    }
    @Override
    public Boolean updateByIdAdminId(Admin admin) {
//        AdminExample adminExample = new AdminExample();
//        adminExample.createCriteria().andAdminidEqualTo(admin.getAdminid());
//        //管理员基本信息修改
//        int result = adminMapper.updateByExampleSelective(admin, adminExample);
        int result = adminMapper.updateByPrimaryKeySelective(admin);
        return result>0?true:false;
    }

}
