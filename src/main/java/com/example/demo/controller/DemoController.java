package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * @author qinyu
 * @description controller
 * @date 2022/8/24 15:48
 */
@Controller
@RequestMapping("/demo")
public class DemoController{

    @ResponseBody
    @GetMapping
    public ModelMap helloWorld(){

        System.out.println("demo.helloWorld");
        return getModelMap("200", "hello world", "success");
    }

    public ModelMap getModelMap(String status, Object data, String msg){
        ModelMap modelMap = new ModelMap();
        modelMap.put("status", status);
        modelMap.put("data", data);
        modelMap.put("msg", msg);
        return modelMap;
    }

}
