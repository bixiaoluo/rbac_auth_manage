package com.topsec.test.controller;

import com.topsec.test.model.User;
import com.topsec.test.service.UserService;
import com.topsec.test.util.Constants;
import com.topsec.test.util.ResponseMsg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by jiyujing on 2017/11/9.
 */

@RestController
@RequestMapping("/auth")
public class LoginController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public Map login(User user, HttpSession session){
        if(null == user){
            return ResponseMsg.createMsg(-1,"用户信息不能为空",null);
        }

        //根据用户名密码查找该用户   //及用户所属角色
        Map paramMap = new HashMap();
        paramMap.put("accout",user.getAccout());
        paramMap.put("password",user.getPassword());
        User userInfo = userService.findUserByUserName(paramMap);
        if(null == userInfo){
            return ResponseMsg.createMsg(-1,"用户名密码不对",null);
        }
        session.setAttribute(Constants.USER_INFO,userInfo);
        return ResponseMsg.createMsg(1,"",userInfo);
    }

//    @RequestMapping()
//    public String logout(){

//    }
}
