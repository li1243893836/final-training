package com.itly.controller;


import com.itly.entity.UserVO;
import com.itly.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService service;

    @RequestMapping("/insert")
    @ResponseBody
    public Map userAdd(UserVO uservo) {
        int flag = service.insert(uservo);
        Map res = new HashMap();
        if (flag != 0) {
            res.put("msg", flag);
        } else {
            res.put("msg", flag);
        }
        return res;
    }

    @RequestMapping("/delete")
    @ResponseBody
    public Map userDel(int Id) {
        int flag = service.delete(Id);
        Map res = new HashMap();
        res.put("msg", flag);
        return res;
    }

    @RequestMapping("/update")
    @ResponseBody
    public Map userUpdate(UserVO uservo) {
        int flag = service.update(uservo);
        Map res = new HashMap();
        if (flag != 0) {
            res.put("msg", flag);
        } else {
            res.put("msg", flag);
        }
        return res;
    }

    @RequestMapping("/queryById")
    @ResponseBody
    public Map queryById(int Id) {
        UserVO uservo = service.queryById(Id);
        Map res = new HashMap();
        res.put("uservo", uservo);
        return res;
    }

    @RequestMapping("/queryAll")
    @ResponseBody
    public Map queryAll(UserVO uservo) {
        List<UserVO> list = service.queryAll();
        Map res = new HashMap();
        res.put("code", 0);
        res.put("msg", "");
        res.put("count", 1000);
        res.put("data", list);
        res.put("list", list);
        return res;
    }

    @RequestMapping("/queryByName")
    @ResponseBody
    public Map queryByName(UserVO uservo) {
        UserVO flag = service.queryByName(uservo);
        System.out.println(flag);
        Map res = new HashMap();
        if (flag != null) {
            res.put("msg", 1);
        } else {
            res.put("msg", 0);
        }
        return res;
    }
}
