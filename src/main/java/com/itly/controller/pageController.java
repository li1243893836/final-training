package com.itly.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class pageController {

    @RequestMapping("index")
    @ResponseBody
    public ModelAndView userIndex(ModelAndView modelAndView){
        modelAndView.setViewName("index");
        return modelAndView;
    }

    @RequestMapping("welcome")
    @ResponseBody
    public ModelAndView welcome(ModelAndView modelAndView){
        modelAndView.setViewName("page/welcome-1");
        return modelAndView;
    }
}
