package com.yqregister.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.yqregister.entity.PageResult;
import com.yqregister.entity.Site;
import com.yqregister.mapper.SiteMapper;
import com.yqregister.service.SiteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author 小浩
 * @Date 2020/3/20 10:42
 * @Version 1.0
 **/
@Service
public class SiteServiceImpl implements SiteService {
    @Autowired
    SiteMapper siteMapper;
    @Override
    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    @Override
    public int insert(Site record) {
        return 0;
    }

    @Override
    public int insertSelective(Site record) {
        return siteMapper.insertSelective(record);
    }

    @Override
    public Site selectByPrimaryKey(Integer id) {
        return siteMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Site record) {
        return siteMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Site record) {
        return 0;
    }

    @Override
    public PageResult find(Site site, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        Page<Site> page =  (Page<Site>) siteMapper.find(site);
        return new PageResult(page.getTotal(),page.getResult());

    }

    @Override
    public List<Site> findAllSite() {
        return siteMapper.findAllSite();
    }

    @Override
    public int getSiteCount() {
        return siteMapper.getSiteCount();
    }
}
