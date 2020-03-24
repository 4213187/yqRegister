package com.yqregister.mapper;


import com.yqregister.entity.Admin;
import com.yqregister.entity.GroupAdmin;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author lenovo
 */
public interface AdminMapper {
    /**
     * 删除管理员
     * @param id
     * @return
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * 新增管理员
     * @param record
     * @return
     */
    int insert(Admin record);

    /**
     * 新增管理员 部分参数可为空
     * @param record
     * @return
     */
    int insertSelective(Admin record);

    /**
     * 通过id查询
     * @param id
     * @return
     */
    Admin selectByPrimaryKey(Integer id);

    /**
     * 更新管理员信息部分参数可为空
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(Admin record);

    /**
     * 更新管理员信息
     * @param record
     * @return
     */
    int updateByPrimaryKey(Admin record);

    /**
     * 通过账号查找管理员
     * @param username
     * @return
     */
    Admin findByUserName(String username);

    /**
     * 查询所有的管理员
     * @param groupAdmin 管理员组合类
     * @return 符合条件的所有管理员
     */
   List<GroupAdmin> find(GroupAdmin groupAdmin);

    /**
     * 通过siteId查询管理员数量
     * @param siteId
     * @return
     */
   int countBySiteId(@Param("siteId") int siteId);
}