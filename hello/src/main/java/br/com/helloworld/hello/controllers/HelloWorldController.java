package br.com.helloworld.hello.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.helloworld.hello.services.HelloWorldService;

@Controller
public class HelloWorldController {
    
    HelloWorldService helloWorldService;

    public HelloWorldController() {
        helloWorldService = new HelloWorldService();
    }

    @RequestMapping("/hello")
    @ResponseBody
    public String hello() {
        System.out.println(helloWorldService);
        return helloWorldService.getHelloMessage();
    }
}
