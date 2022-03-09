package com.example.demo.Controler;

import com.example.demo.Service.ProviderClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestControler {

    @Autowired
    ProviderClient providerClient;

    @RequestMapping(value="/hi",method = RequestMethod.GET)
    public String testFeign(@RequestParam String name){
        System.out.println(1122);
        return providerClient.testFeign(name);
    }

}
