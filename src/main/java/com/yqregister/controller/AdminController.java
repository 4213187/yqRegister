package com.yqregister.controller;

import com.yqregister.entity.Admin;
import com.yqregister.entity.GroupAdmin;
import com.yqregister.entity.PageResult;
import com.yqregister.entity.ResultVo;
import com.yqregister.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @Author 小浩
 * @Date 2020/3/18 19:54
 * @Version 1.0
 **/
@RestController
@CrossOrigin(origins = "*", maxAge=3600)
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    AdminService adminService;


    /**
     * CrossOrigin 设置为具体的请求地址 这样可以允许前端携带cookies请求  allowCredentials 允许返回cookies
     * @param admin 传入json格式的admin对象
     * @param httpServletRequest 如果成功需要通过request获取session 防止不登陆非法访问
     * @return
     */
    @CrossOrigin(origins = "http://localhost:63343" ,allowCredentials = "true")
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public ResultVo login(@RequestBody Admin admin, HttpServletRequest httpServletRequest){
        return adminService.login(admin,httpServletRequest);
    }

    @CrossOrigin(origins = "http://localhost:63343" ,allowCredentials = "true")
    @RequestMapping(value = "/check",method = RequestMethod.GET)
    public Admin check(HttpServletRequest httpServletRequest){
        HttpSession session = httpServletRequest.getSession();
        Admin admin = (Admin) session.getAttribute("admin");
        if (admin!=null){
            return admin;
        }else {
            return null;
        }

    }


    @CrossOrigin(origins = "http://localhost:63343" ,allowCredentials = "true")
    @RequestMapping(value = "/logout",method = RequestMethod.GET)
    public ResultVo logout(HttpServletRequest httpServletRequest){
        HttpSession session = httpServletRequest.getSession();
        Admin admin = (Admin) session.getAttribute("admin");
        if (admin!=null){
            session.removeAttribute("admin");
            return new ResultVo(true,"退出成功");
        }else {
            return new ResultVo(false,"未知错误");
        }

    }


    @RequestMapping(value = "/find",method = RequestMethod.POST)
    public PageResult find(@RequestBody GroupAdmin groupAdmin,int pageNum, int pageSize){
        return  adminService.find(groupAdmin, pageNum, pageSize);

    }

    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public ResultVo add(@RequestBody Admin admin){
//        设置管理员级别默认为1也就是普通管理员
        admin.setGrade(1);
        System.out.println(admin);
        try {
            adminService.insertSelective(admin);
            return  new ResultVo(true,"添加成功");
        }catch (Exception e){
            e.printStackTrace();
            return  new ResultVo(true,"添加失败");
        }

    }

    @RequestMapping(value = "/update",method = RequestMethod.POST)
    public ResultVo update(@RequestBody Admin admin){

        try {
            adminService.updateByPrimaryKeySelective(admin);
            return  new ResultVo(true,"修改成功");
        }catch (Exception e){
            e.printStackTrace();
            return  new ResultVo(true,"修改失败");
        }

    }


    @RequestMapping(value = "/findById",method = RequestMethod.GET)
    public Admin findById(int id){
        return  adminService.selectByPrimaryKey(id);
    }

    @RequestMapping(value = "/countBySiteId",method = RequestMethod.GET)
    public int countBySiteId(int siteId){

        return adminService.countBySiteId(siteId);
    }

}
