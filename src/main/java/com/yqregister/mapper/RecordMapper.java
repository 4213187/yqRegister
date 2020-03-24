package com.yqregister.mapper;


import com.yqregister.entity.GroupRecord;
import com.yqregister.entity.Record;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.concurrent.FutureTask;

/**
 * @author 小浩 www.404zyw.com
 */
public interface RecordMapper {
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
    int countBySiteId(@Param("siteId") int siteId);

    /**
     * 分页查询
     * @param groupRecord 组合实体类
     * @return 符合条件的记录
     */
    List<GroupRecord> find(GroupRecord groupRecord);


}