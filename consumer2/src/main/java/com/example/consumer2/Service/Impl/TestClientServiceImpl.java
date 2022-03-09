package com.example.consumer2.Service.Impl;

import com.example.consumer2.Service.TestClientSerice;
import org.springframework.stereotype.Service;

@Service
public class TestClientServiceImpl  implements TestClientSerice {


    public String testFeign(String name) {
        return "调用consumer成功";
    }
}
