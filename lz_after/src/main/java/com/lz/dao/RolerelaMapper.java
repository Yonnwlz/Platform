package com.lz.dao;

import com.lz.model.pojo.Rolerela;
import com.lz.model.pojo.RolerelaExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RolerelaMapper {
    long countByExample(RolerelaExample example);

    int deleteByExample(RolerelaExample example);

    int insert(Rolerela record);

    int insertSelective(Rolerela record);

    List<Rolerela> selectByExample(RolerelaExample example);

    int updateByExampleSelective(@Param("record") Rolerela record, @Param("example") RolerelaExample example);

    int updateByExample(@Param("record") Rolerela record, @Param("example") RolerelaExample example);

    /**
     * RoleRale+Role 1-1  角色查询
     * @param adminId   管理员ID
     * @return
     */
    Rolerela selectByAdminIdQueryRole(Integer adminId);

}