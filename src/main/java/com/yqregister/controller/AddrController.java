package com.yqregister.controller;


import com.yqregister.entity.Area;
import com.yqregister.entity.City;
import com.yqregister.entity.Province;
import com.yqregister.service.AddrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author 小浩
 * @Date 2019/12/14 22:13
 * @Version 1.0
 **/
@RestController
@RequestMapping("/addr")
@CrossOrigin(origins = "*", maxAge=3600)
public class AddrController {
    @Autowired
    private AddrService addrService;


    @RequestMapping(value = "/findAllProvince" ,method = RequestMethod.GET)
    public List<Province> findAll(){
        return addrService.findAllProvince();
    }

    @RequestMapping(value = "/findCitiesByProvinceId",method = RequestMethod.GET)
    public List<City> findCitiesByProvinceId(String provinceId) {
        return addrService.findCitiesByProvinceId(provinceId);
    }

    @RequestMapping(value = "/findAreasByCityId" ,method = RequestMethod.GET)
    public List<Area> findAreasByCityId(String cityId) {
        return addrService.findAreasByCityId(cityId);
    }



    @RequestMapping(value = "/findAllCities",method = RequestMethod.GET)
    public List<City> findAllCities(){
        System.out.println("City");
        return  addrService.findAllCities();
    }

    @RequestMapping(value = "/findAllAreas",method = RequestMethod.GET)
    public List<Area> findAllAreas(){
        System.out.println("Area");
        return  addrService.findAllAreas();
    }



}
