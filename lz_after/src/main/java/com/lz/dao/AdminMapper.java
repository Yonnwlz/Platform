package com.lz.dao;

import com.lz.model.dto.SearchParam;
import com.lz.model.pojo.Admin;
import com.lz.model.pojo.AdminExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AdminMapper {
    long countByExample(AdminExample example);

    int deleteByExample(AdminExample example);

    int deleteByPrimaryKey(Integer adminid);

    int insert(Admin record);

    int insertSelective(Admin record);

    List<Admin> selectByExample(AdminExample example);

    Admin selectByPrimaryKey(Integer adminid);

    int updateByExampleSelective(@Param("record") Admin record, @Param("example") AdminExample example);

    int updateByExample(@Param("record") Admin record, @Param("example") AdminExample example);

    int updateByPrimaryKeySelective(Admin record);

    int updateByPrimaryKey(Admin record);

    /**
     * 分页管理员  +  模板查询
     * @param searchParam
     * @return
     */
    List<Admin> selectByAdminQueryFuzzy(@Param("searchParam") SearchParam searchParam);
}