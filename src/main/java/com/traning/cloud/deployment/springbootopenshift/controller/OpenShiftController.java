package com.traning.cloud.deployment.springbootopenshift.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OpenShiftController {

    @GetMapping("/hello")
    public String hell(){

        return "Hello";
    }
    @GetMapping()
    public String test(){
       String envDat= System.getenv().getOrDefault("test-config","LAST");
        System.out.println("envDat==================:"+envDat);
        return "Test";
    }

    @GetMapping("/hello/{name}")
    public String hell(@PathVariable String name){
        return "Hello:"+name;
    }
}
