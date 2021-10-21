package com.mj.multi_module.web_app.web;

import com.mj.multi_module.entity.MyData;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MultiModuleRestController {

    @GetMapping("/")
    public MyData getMyData(){
        return new MyData("Hello world");
    }
}
