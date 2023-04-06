package com.gender.find.controller;

import com.gender.find.response.GenderResponse;
import com.gender.find.service.GenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GenderController {
    @Autowired
    GenderService genderService;

    @GetMapping("/getGender")
    public GenderResponse genderResponse (@RequestParam("name") String name){
        GenderResponse response = genderService.getResponse(name);

        return response;
    }
}
