package com.yqregister.service;


import com.yqregister.entity.PageResult;
import com.yqregister.entity.Site;

import java.util.List;

/**
 * @Author 小浩
 * @Date 2020/3/20 10:41
 * @Version 1.0
 **/
public interface SiteService {
    /**
     * 通过id删除
     * @param id
     * @return
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * 增加新的防疫站
     * @param record
     * @return
     */
    int insert(Site record);

    /**
     * 增加新的防疫站 部分参数可为空
     * @param record
     * @return
     */
    int insertSelective(Site record);

    /**
     * 通过id查询防疫站
     * @param id
     * @return
     */
    Site selectByPrimaryKey(Integer id);

    /**
     * 更新防疫站 部分参数可以为空
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(Site record);

    /**
     * 更新防疫站
     * @param record
     * @return
     */
    int updateByPrimaryKey(Site record);

    /**
     * 分页查询所有的防疫站
     * @param site 组合实体类
     * @param pageNum 页数
     * @param pageSize 大小
     * @return 符合条件的防疫站
     */
    PageResult find(Site site, int pageNum, int pageSize);

    /**
     * 查询所有的防疫站
     * @return 所有的防疫站
     */
    List<Site> findAllSite();


    /**
     * 获取所有防疫站的数量
     * @return 所有防疫站的数量
     */
    int getSiteCount();
}
