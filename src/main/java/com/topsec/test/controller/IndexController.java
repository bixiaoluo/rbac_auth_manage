package com.topsec.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by jiyujing on 2017/11/7.
 */

@Controller
public class IndexController {


    @RequestMapping(value ="/login",produces = "text/html")
    public String login() {
        return "nice_admin/login.html";
    }

    @RequestMapping(value = "/",produces = "text/html")
    @ResponseBody
    public ModelAndView index(){
        ModelAndView mv = new ModelAndView("forword:/nice_admin/login.html");
        return mv;
    }

}