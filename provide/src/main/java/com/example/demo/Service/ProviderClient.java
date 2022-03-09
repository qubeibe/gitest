package com.example.demo.Service;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "consumer2")
public interface ProviderClient {
    @RequestMapping(value="/hi",method = RequestMethod.GET)
    String testFeign(@RequestParam(value = "name") String name);
}
