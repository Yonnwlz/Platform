package com.lz.service;

import com.lz.model.pojo.Menus;

import java.util.List;

public interface MenusService {
    /**
     * 查询根节点权限
     * @param adminId
     * @return
     */
    public List<Menus> findMenusAll(Integer adminId);
}
