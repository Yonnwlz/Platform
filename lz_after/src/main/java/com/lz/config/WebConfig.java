package com.lz.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("login").setViewName("login");
        registry.addViewController("index").setViewName("index");
        registry.addViewController("index1").setViewName("index1");
        registry.addViewController("register").setViewName("register");
        registry.addViewController("404").setViewName("404");
        registry.addViewController("500").setViewName("500");
        registry.addViewController("management").setViewName("management");
        registry.addViewController("goodsEdit").setViewName("goodsEdit");
        registry.addViewController("goods").setViewName("goods");
    }
}
