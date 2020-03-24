package com.yqregister.service;

import com.yqregister.entity.Admin;
import com.yqregister.entity.GroupAdmin;
import com.yqregister.entity.PageResult;
import com.yqregister.entity.ResultVo;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @Author 小浩
 * @Date 2020/3/18 20:13
 * @Version 1.0
 **/

public interface AdminService {
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
     * 登陆服务
     * @param admin 管理员账号密码
     * @param httpServletRequest 设置session需要
     * @return 登陆结果
     */
    ResultVo login(Admin admin, HttpServletRequest httpServletRequest);



    /**
     * 查询所有的管理员
     * @param groupAdmin 管理员组合类
     * @param pageNum 大小
     * @param pageSize 页数
     * @return 符合条件的所有管理员
     */
    PageResult find(GroupAdmin groupAdmin, int pageNum, int pageSize);


    /**
     * 通过siteId查询管理员数量
     * @param siteId
     * @return
     */
    int countBySiteId(int siteId);
}
