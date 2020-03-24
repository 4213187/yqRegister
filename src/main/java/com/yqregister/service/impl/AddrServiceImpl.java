package com.yqregister.service.impl;


import com.yqregister.entity.Area;
import com.yqregister.entity.City;
import com.yqregister.entity.Province;
import com.yqregister.mapper.AreaMapper;
import com.yqregister.mapper.CityMapper;
import com.yqregister.mapper.ProvinceMapper;
import com.yqregister.service.AddrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author 小浩
 * @Date 2019/12/14 21:59
 * @Version 1.0
 **/
@Service
public class AddrServiceImpl implements AddrService {
    @Autowired
    ProvinceMapper provinceMapper;
    @Autowired
    CityMapper cityMapper;
    @Autowired
    AreaMapper areaMapper;
    @Override
    public List<Province> findAllProvince() {
        return provinceMapper.findAllProvince();
    }

    @Override
    public List<City> findAllCities() {
        return cityMapper.findAllCities();
    }

    @Override
    public List<Area> findAllAreas() {
        return areaMapper.findAllAreas();
    }

    @Override
    public Province findProvinceById(Integer id) {
        return provinceMapper.selectByPrimaryKey(id);
    }

    @Override
    public City findCityById(Integer id) {
        return cityMapper.selectByPrimaryKey(id);
    }

    @Override
    public Area findAreaById(Integer id) {
        return areaMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<City> findCitiesByProvinceId(String provinceId) {
        return cityMapper.findCitiesByProvinceId(provinceId);
    }

    @Override
    public List<Area> findAreasByCityId(String cityId) {
        return areaMapper.findAreasByCityId(cityId);
    }
}
