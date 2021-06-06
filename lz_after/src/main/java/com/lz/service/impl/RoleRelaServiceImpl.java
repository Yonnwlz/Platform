package com.lz.service.impl;

import com.lz.dao.RolerelaMapper;
import com.lz.model.pojo.Rolerela;
import com.lz.model.pojo.RolerelaExample;
import com.lz.service.RoleRelaService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class RoleRelaServiceImpl implements RoleRelaService {
    @Resource
    private RolerelaMapper rolerelaMapper;

    @Override
    public Boolean insertAdminRelaRoles(Rolerela rolerela) {
        //管理员+角色 关系添加
        int i = rolerelaMapper.insertSelective(rolerela);
        return i>0?true:false;
    }

    @Override
    public Rolerela findByAdminIdRole(Integer adminId) {
        return rolerelaMapper.selectByAdminIdQueryRole(adminId);
    }

    @Override
    public Boolean updateByRolerela(Rolerela rolerela) {
        RolerelaExample rolerelaExample = new RolerelaExample();
        rolerelaExample.createCriteria().andAdminidEqualTo(rolerela.getAdminid());
        //管理员角色修改
        int result = rolerelaMapper.updateByExampleSelective(rolerela, rolerelaExample);
        return result>0?true:false;
    }
}
