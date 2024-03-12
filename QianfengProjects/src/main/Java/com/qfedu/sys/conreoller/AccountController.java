package com.qfedu.sys.conreoller;

import com.qfedu.sys.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/account")
public class AccountController {

    @Autowired
    IAccountService service;

    @ResponseBody
    @RequestMapping("transfer")
    public int accountTransfer(String inName, String
            outName, double money){
            int status = service.updateTransfer(inName, outName, money);
            if(status == 1){
                System.out.println(1);
            }else{
                System.out.println(0);
            }
        return 1;
    }
}
