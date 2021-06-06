package com.lz.Shiro;


import org.apache.shiro.authc.credential.HashedCredentialsMatcher;
import org.apache.shiro.realm.Realm;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

/**
 * 配置shiro核心类
 */

@Configuration
public class ShiroConfig {

    //1.配置ShiroFilterFactoryBean
    @Bean
    public ShiroFilterFactoryBean shiroFilterFactoryBean(DefaultWebSecurityManager securityManager){
        ShiroFilterFactoryBean shiroFilterFactoryBean=new ShiroFilterFactoryBean();
        //关联安全管理器
        shiroFilterFactoryBean.setSecurityManager((org.apache.shiro.mgt.SecurityManager) securityManager);
        /*** shiro通过底层去拦截
         * anon:不需要认证（登录）就可以访问
         * authc:一定要认证才能访问
         */
        //配置过滤器链
        //需要拦截的资源
        Map<String,String> filterMap=new HashMap<>();
//        filterMap.put("/add","authc");
//        filterMap.put("/update","authc");
        //拦截后需要跳转的页面
        shiroFilterFactoryBean.setLoginUrl("/login");
        shiroFilterFactoryBean.setFilterChainDefinitionMap(filterMap);
        return shiroFilterFactoryBean;
    }

    //2.配置安全管理器SecurityManager
    @Bean
    public DefaultWebSecurityManager securityManager(Realm realm) {
        DefaultWebSecurityManager defaultWebSecurityManager=new DefaultWebSecurityManager();
        //管理realm
        defaultWebSecurityManager.setRealm(realm);
        return defaultWebSecurityManager;
    }

    //3.需要配置Realm
    @Bean
    public Realm realm(){
        return new AdminRealm();
    }


    @Bean
    public HashedCredentialsMatcher hashedCredentialsMatcher(){
        //创建加密器
        HashedCredentialsMatcher matcher = new HashedCredentialsMatcher();
        //设置加密算法
        matcher.setHashAlgorithmName("md5");
        //设置加密次数（散列次数，例如散列2次，相当于md5(md5(""))）
        matcher.setHashIterations(3);
        return matcher;
    }

}
