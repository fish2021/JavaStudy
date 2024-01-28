package com.it.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/save")
public class UserController {

    @RequestMapping("hello")
    @ResponseBody
    public String save(){
        System.out.println("save ....");
        return "{'name':'lisi'}";
    }

    /***
     * 传参数时没有指定
     * @param name
     * @param age
     * @return
     */
    @RequestMapping("param")
    @ResponseBody
    public String save_param(String name , int age){
        return ""+name+"  "+age;
    }

    /***
     * 传递过来的参数为中文时 需要设置编码 去config.ServletContainerInitConfig中设置
     * @param name
     * @param sex
     * @return
     */
    @RequestMapping("param2")
    @ResponseBody
    public String save_param2(@RequestParam("name") String name ,@RequestParam("sex") String sex ){
        return ""+name+"  "+sex;
    }

}
