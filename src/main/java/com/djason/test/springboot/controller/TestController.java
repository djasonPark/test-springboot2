package com.djason.test.springboot.controller;

import com.sun.media.sound.ModelDestination;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Park_COM on 2017-03-19.
 */
@RestController
public class TestController {

    @GetMapping
    @ResponseBody
    public String index(){
        System.out.println("index");
        return "index";
    }

    @GetMapping("/index")
    public ModelAndView test(){
        System.out.println("test");
        return new ModelAndView("index");
    }
}
