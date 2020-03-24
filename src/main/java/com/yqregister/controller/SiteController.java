package com.yqregister.controller;


import com.alibaba.fastjson.JSON;
import com.yqregister.entity.PageResult;
import com.yqregister.entity.ResultVo;
import com.yqregister.entity.Site;
import com.yqregister.service.SiteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author 小浩
 * @Date 2020/3/20 10:43
 * @Version 1.0
 **/
@RestController
@CrossOrigin(origins = "*", maxAge=3600)
@RequestMapping("/site")
public class SiteController {

    @Autowired
   private SiteService siteService;

    @RequestMapping(value = "/find",method = RequestMethod.POST)
    public PageResult find(@RequestBody Site site, int pageNum, int pageSize){
       return  siteService.find(site, pageNum, pageSize);
    }

    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public ResultVo add(@RequestBody Site site){
        try {
            siteService.insertSelective(site);
            return  new ResultVo(true,"添加成功");
        }catch (Exception e){
            e.printStackTrace();
            return new ResultVo(false,"添加失败");
        }
    }

    @RequestMapping(value = "/findById",method = RequestMethod.GET)
    public Site findById( int  id){

       return      siteService.selectByPrimaryKey(id);

    }

    @RequestMapping(value = "/update",method = RequestMethod.POST)
    public  ResultVo update( @RequestBody Site site){
       try {
           siteService.updateByPrimaryKeySelective(site);
           return  new ResultVo(true,"更新成功");
       }catch (Exception e){
           e.printStackTrace();
           return  new ResultVo(false,"更新失败");
       }


    }

    @RequestMapping(value = "/findAllSite",method = RequestMethod.GET)
    public  List<Site> findAllSite(){
        return  siteService.findAllSite();
    }


    @RequestMapping(value = "/getSiteCount",method = RequestMethod.GET)
    public  int getSiteCount(){
        return  siteService.getSiteCount();
    }


}
