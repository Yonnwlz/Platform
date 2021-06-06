package com.lz.service.impl;

import com.lz.dao.*;
import com.lz.model.note.RightsManagement;
import com.lz.model.pojo.*;
import com.lz.service.AdminLoginService;
import com.lz.service.MenusService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@Service
public class AdminLoginServiceImpl implements AdminLoginService {
    @Resource
    private AdminMapper adminMapper;

    @Override
    public Map findLoginValidation(Admin admin) {
            HashMap hashMap = new HashMap();
            Admin sysUsers = new Admin();
            //通过shiro 提供的验证方式登录
            //1.获取subject
            Subject subject = SecurityUtils.getSubject();
            //把用户提交的用户名和密码封装到shiro提供的一个对象中
            UsernamePasswordToken token = new UsernamePasswordToken(admin.getAdminaccount(),admin.getAdminpassword());
            //提交认证
            try {
                subject.login(token);
                AdminExample example = new AdminExample();
                example.createCriteria().andAdminaccountEqualTo(admin.getAdminaccount()).andAdminpasswordEqualTo(admin.getAdminpassword());
                sysUsers = adminMapper.selectByExample(example).get(0);
                hashMap.put("msg","1");
                hashMap.put("adminId",sysUsers.getAdminid());
                hashMap.put("loginValidation",sysUsers);
                //登录成功
                return hashMap;
            } catch (UnknownAccountException e) {
                hashMap.put("msg","2");
                //System.out.println("用户名不存在!");
                return hashMap;
            } catch (IncorrectCredentialsException e){
                hashMap.put("msg","3");
               //System.out.println("密码错误!");
                return hashMap;
            }
    }

    @Override
    public Boolean insertAdmin(Admin admin) {
        //管理员密码加密
        //密码加密
        String md5Pwd = new Md5Hash(admin.getAdminpassword(),admin.getAdminaccount(),3).toString();
        admin.setAdminpassword(md5Pwd);
        //新增管理员
        int i = adminMapper.insertSelective(admin);
        return i>0?true:false;
    }
}
