package com.example.consumer2.Action;


import com.example.consumer2.Service.TestClientSerice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestClient {

    @Autowired
    public TestClientSerice t;

    @RequestMapping(value="/hi",method = RequestMethod.GET)
    public String testFeign(@RequestParam String name){
        return t.testFeign(name);
    }



}
