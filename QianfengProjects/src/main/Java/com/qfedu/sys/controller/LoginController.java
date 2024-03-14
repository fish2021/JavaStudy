package com.qfedu.sys.controller;


import cn.hutool.captcha.CaptchaUtil;
import cn.hutool.captcha.LineCaptcha;
import com.qfedu.sys.constant.SysConstant;
import com.qfedu.sys.domain.User;
import com.qfedu.sys.domain.UserVo;
import com.qfedu.sys.service.IUserService;
import com.qfedu.sys.utils.WebUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.imageio.ImageIO;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@RequestMapping("/login")
@Controller
public class LoginController {

    @RequestMapping("toLogin")
    public String toLogin(){
            return "system/main/login";
    }

    /**
     * 生成验证码
     * @param request
     * @param response
     * @param session
     * @throws IOException
     */
    @RequestMapping("getCode")
    public void getCode(HttpServletRequest request , HttpServletResponse response , HttpSession session) throws IOException {
        LineCaptcha lineCaptcha  = CaptchaUtil.createLineCaptcha(116,36,4,5);
        session.setAttribute("code" , lineCaptcha.getCode());
        ServletOutputStream outputStream = response.getOutputStream();
        ImageIO.write(lineCaptcha.getImage() , "JPEG",outputStream);
    }


        @Autowired
        IUserService userService;

    @RequestMapping("login")
    public String login(UserVo userVo , Model model){

        //获取验证码
        String code = WebUtils.getHttpSession().getAttribute("code").toString();

        //判断验证码是否正确
        if(userVo.getCode().equals(code)){
            User user = userService.login(userVo);
            if(user != null){ //存在
                WebUtils.getHttpSession().setAttribute("user" ,user);
                return "system/main/index";
            }else{
                model.addAttribute("error" , SysConstant.USER_LOGIN_ERROR_MSG);
                return "system/main/login";
            }
        }else{
            System.out.println(3);
             model.addAttribute("error" , SysConstant.USER_LOGIN_CODE_ERROR_MSG);
             return "system/main/login";
        }
    }

}
