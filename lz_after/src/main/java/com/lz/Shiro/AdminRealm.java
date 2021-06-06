package com.lz.Shiro;

import com.lz.dao.AdminMapper;
import com.lz.model.pojo.Admin;
import com.lz.model.pojo.AdminExample;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;

import javax.annotation.Resource;
import java.util.List;

public class AdminRealm extends AuthorizingRealm {

    @Resource
    private AdminMapper adminMapper;
    /**
     * 授权要做的事情
     * @param principalCollection
     * @return
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        System.out.println("授权要做的事情");
        return null;
    }

    /**
     * 认证要做的事情
     * @param authenticationToken
     * @return
     * @throws AuthenticationException
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        UsernamePasswordToken token = (UsernamePasswordToken) authenticationToken;

        //验证登录用户
        AdminExample example = new AdminExample();
        example.createCriteria().andAdminaccountEqualTo(token.getUsername());
        List<Admin> sysUsers = adminMapper.selectByExample(example);


        if(sysUsers.size()<1){
            return null;
        }else {
            //在查密码
            Admin users = sysUsers.get(0);
            SimpleAuthenticationInfo info = new SimpleAuthenticationInfo(users,users.getAdminpassword(),getName());
            info.setCredentialsSalt(ByteSource.Util.bytes(users.getAdminaccount()));
            return info;
        }
    }
}
