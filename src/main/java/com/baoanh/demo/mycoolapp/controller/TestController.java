package com.baoanh.demo.mycoolapp.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    
    @Value("${team.name}")
    private String teamName;
    
    @Value("${team.size}")
    private String teamSize;
    
    @GetMapping("/teaminfo")
    public String getTeamInfo() {
        return "Team name: " + teamName + ", Team size: " + teamSize;
    }

    @GetMapping("/")
    public String sayHello() {
        return "Hello Bao Anh!";
    }
}
