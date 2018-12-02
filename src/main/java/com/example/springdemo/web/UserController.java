package com.example.springdemo.web;


import com.example.springdemo.bean.User;
import com.example.springdemo.service.UserService;
import com.example.springdemo.util.UserModel;
import com.example.springdemo.util.UserRedisServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private UserRedisServiceImpl userRedisService;

    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public String find(Model model){
        List<User> list=userService.findAll();
        model.addAttribute("list",list);
        return "users/list";
    }

    @RequestMapping(value = "/redis",method = RequestMethod.GET)
    public String redis_find(Model model){
        List<UserModel> userList=new ArrayList<>();
        long start=System.currentTimeMillis();
        if (userRedisService.count()==0){
            List<User> list=userService.findAll();
            //po--->vo
            if(list!=null &&list.size()>0){
                for(User user:list){
                    UserModel um=new UserModel(user);
                    userList.add(um);
                    //将po存入数据库
                    userRedisService.put(um.getId(),um,-1);
                }

            }
        }
        //如果缓存有
        else {
           userList=userRedisService.getAll();
        }
        long end=System.currentTimeMillis();
        System.out.println("用时"+(end-start)+"毫秒");
        model.addAttribute("list",userList);
        return "users/list";
    }
}
