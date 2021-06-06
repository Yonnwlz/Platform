package com.lz.service;

import com.lz.model.dto.SearchParam;
import com.lz.model.dto.SearchResult;
import com.lz.model.help.AdministratorDetails;
import com.lz.model.pojo.Admin;

public interface AdminManagementService {
    /**
     * 展示所有管理员
     * @param searchParam
     * @return
     */
    public SearchResult findAllAdminDate(SearchParam searchParam);

    /**
     * 管理员详情
     * @param adminId
     * @return
     */
    public AdministratorDetails findByIdAdminDetails(Integer adminId);

    /**
     * 管理员基本信息修改
     * @param admin
     * @return
     */
    public Boolean updateByIdAdminId(Admin admin);
}
