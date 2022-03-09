package com.example.gateway.Controler;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestControler {

    @RequestMapping(value="/hello",method = RequestMethod.GET)
    public String testFeign(@RequestParam String name){
        System.out.println(12);
        return "12122";
    }

}
