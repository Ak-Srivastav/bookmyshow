package com.dockerforjavadevelopers.controller;

import com.dockerforjavadevelopers.model.City;
import com.dockerforjavadevelopers.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/cities")
public class CityController {

    @Autowired
    private CityService cityService;

    @GetMapping
    public List<City> listCities() {
        return cityService.listCities();
    }
}
