package cn.edu.sziit.controller;

import cn.edu.sziit.service.TestService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SayHelloController {

    @Reference
    private TestService service;

    @RequestMapping("test")
    public String sayHello(){
        service.sayHello();
        return "success!!!";
    }
}
