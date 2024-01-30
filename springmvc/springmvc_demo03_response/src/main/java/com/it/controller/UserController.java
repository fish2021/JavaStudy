package com.it.controller;


import com.it.pojo.User;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/demo2")
public class UserController {

    @RequestMapping("save2")
    @ResponseBody
    public String save(){
        System.out.println("springmvc demo2 ...");
        return "{'name':'mvc demo2'}";
    }

    @ResponseBody
    @RequestMapping("user")
    public String getUser(@RequestBody User user){
        System.out.println(user);
        return user.toString();
    }
    @ResponseBody
    @RequestMapping("users")
    public String getUser(@RequestBody List<User> users){
        System.out.println(users);
        return users.toString();
    }

    @ResponseBody
    @RequestMapping("list")
    //对应的测试 ["lisi" , "wangwu" , "zhaoyi"]
    public String getList(@RequestBody List<String> str){
        System.out.println(str);
        return str.toString();
    }

    @ResponseBody
    @RequestMapping("date")
    /***
     * pattern 必须要匹配 yyyy-MM-dd   加时间的话就为yyyy-MM-dd HH:mm:ss
     */
    public String getDate( Date date , @DateTimeFormat(pattern = "yyyy-mm-dd") Date date1 , @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss") Date date3){
        System.out.println(date);
        System.out.println(date1);
        System.out.println(date3);
        return date.toString()+"  "+date1.toString();
    }

}
