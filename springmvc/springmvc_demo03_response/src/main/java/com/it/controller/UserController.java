package com.it.controller;


import com.it.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
//@RequestMapping("/demo3")
/*** bug
 * 此处需要注释掉 因为在转发界面时 test.jsp会找不到
 */
public class UserController {


    /***
     * @ResponseBody 是指将将字符串当做返回结果 ，不加则会去跳转界面
     * @return
     */
    @RequestMapping("/judge_page")
    public String juadePage(){
        System.out.println("跳转页面");
        return "test.jsp";
    }


    /***
     * 返回对象集合类似
     * @return
     */
    @ResponseBody
    @RequestMapping("/response_json")
    public User ResponseJson(){
        User user = new User("张三" , 12 , new String[]{"sahnghai","choqing"});
        return user;
    }


    /***
     * 使用Test风格
     * @param id
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/save/{id}" , method = RequestMethod.GET)
    public String save(@PathVariable int id){
        System.out.println("查询..."+id);
        return "查询成功";
    }

    @ResponseBody
    @RequestMapping(value = "/save/users" , method = RequestMethod.PUT)
    public String save2(){
        System.out.println("保存成功...");
        return "success";
    }


}
