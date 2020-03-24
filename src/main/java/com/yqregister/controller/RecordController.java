package com.yqregister.controller;

import com.yqregister.entity.GroupRecord;
import com.yqregister.entity.PageResult;
import com.yqregister.entity.Record;
import com.yqregister.entity.ResultVo;
import com.yqregister.service.RecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

/**
 * @Author 小浩
 * @Date 2020/3/21 19:03
 * @Version 1.0
 **/

@RestController
@RequestMapping("/record")
@CrossOrigin(origins = "*", maxAge=3600)
public class RecordController {
    @Autowired
    RecordService recordService;


    @RequestMapping(value = "/recordCountBySiteId",method = RequestMethod.GET)
    public int recordCountBySiteId(int siteId){
        return recordService.countBySiteId(siteId);
    }


    @RequestMapping(value = "/find",method = RequestMethod.POST)
    public PageResult find(@RequestBody GroupRecord groupRecord, int pageNum, int pageSize){
        System.out.println(groupRecord);
        return  recordService.find(groupRecord, pageNum, pageSize);
    }
    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public ResultVo add(@RequestBody Record record){
        System.out.println(record);
        record.setDate(new Date());
        try {
            recordService.insertSelective(record);
            return  new ResultVo(true,"登记成功");
        }catch (Exception e){
            e.printStackTrace();
            return  new ResultVo(false,"登记失败");
        }

    }


}
