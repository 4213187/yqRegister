package com.yqregister.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.yqregister.entity.Admin;
import com.yqregister.entity.GroupAdmin;
import com.yqregister.entity.PageResult;
import com.yqregister.entity.ResultVo;
import com.yqregister.mapper.AdminMapper;
import com.yqregister.service.AdminService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @Author 小浩
 * @Date 2020/3/18 20:16
 * @Version 1.0
 **/
@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    AdminMapper adminMapper;
    @Override
    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    @Override
    public int insert(Admin record) {
        return 0;
    }

    @Override
    public int insertSelective(Admin record) {
        return adminMapper.insertSelective(record);
    }

    @Override
    public Admin selectByPrimaryKey(Integer id) {
        return adminMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Admin record) {
        return adminMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Admin record) {
        return 0;
    }

    @Override
    public ResultVo login(Admin admin, HttpServletRequest httpServletRequest) {

        Admin admin1 = adminMapper.findByUserName(admin.getUsername());
        if (admin1==null){
            return  new ResultVo(false,"账号不存在");
        }else {
            if (admin.getPassword().equals(admin1.getPassword())){
                HttpSession session = httpServletRequest.getSession();
                session.setAttribute("admin",admin1);
                System.out.println("登陆成功");
                return  new ResultVo(true,"登陆成功");
            }else {
                return  new ResultVo(false,"密码错误");
            }
        }

    }

    @Override
    public PageResult find(GroupAdmin groupAdmin, int pageNum, int pageSize) {

        PageHelper.startPage(pageNum, pageSize);
        Page<GroupAdmin> page =  (Page<GroupAdmin>) adminMapper.find(groupAdmin);
        return  new PageResult(page.getTotal(),page.getResult());
    }

    @Override
    public int countBySiteId( int siteId) {
        return adminMapper.countBySiteId(siteId);
    }
}
