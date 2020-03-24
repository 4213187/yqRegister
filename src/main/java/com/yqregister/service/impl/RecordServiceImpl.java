package com.yqregister.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.yqregister.entity.GroupRecord;
import com.yqregister.entity.PageResult;
import com.yqregister.entity.Record;
import com.yqregister.mapper.RecordMapper;
import com.yqregister.service.RecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author 小浩
 * @Date 2020/3/21 19:02
 * @Version 1.0
 **/
@Service
public class RecordServiceImpl implements RecordService {

    @Autowired
    RecordMapper recordMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    @Override
    public int insert(Record record) {
        return 0;
    }

    @Override
    public int insertSelective(Record record) {
        return recordMapper.insertSelective(record);
    }

    @Override
    public Record selectByPrimaryKey(Integer id) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(Record record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Record record) {
        return 0;
    }

    @Override
    public int countBySiteId(int siteId) {
        return recordMapper.countBySiteId(siteId);
    }

    @Override
    public PageResult find(GroupRecord groupRecord, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        Page<GroupRecord> page =  (Page<GroupRecord>) recordMapper.find(groupRecord);
        return  new PageResult(page.getTotal(),page.getResult());
    }
}
