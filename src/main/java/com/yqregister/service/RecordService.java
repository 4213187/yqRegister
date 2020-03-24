package com.yqregister.service;

import com.yqregister.entity.GroupRecord;
import com.yqregister.entity.PageResult;
import com.yqregister.entity.Record;

/**
 * @Author 小浩
 * @Date 2020/3/21 19:02
 * @Version 1.0
 **/
public interface RecordService {
    int deleteByPrimaryKey(Integer id);

    int insert(Record record);

    int insertSelective(Record record);

    Record selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Record record);

    int updateByPrimaryKey(Record record);

    /**
     * 通过siteId查询对应的记录数量
     * @param siteId 防疫站id
     * @return 记录数s
     */
    int countBySiteId(int siteId);

    /**
     * 分页查询
     * @param groupRecord 组合实体类
     * @param pageNum  大小
     * @param pageSize 页数
     * @return 符合条件的记录
     */
    PageResult find(GroupRecord groupRecord, int pageNum, int pageSize);
}
