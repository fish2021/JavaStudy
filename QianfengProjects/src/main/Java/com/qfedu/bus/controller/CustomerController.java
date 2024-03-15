package com.qfedu.bus.controller;

import com.qfedu.bus.service.ICustomerService;
import com.qfedu.bus.vo.CustomerVo;
import com.qfedu.sys.utils.DataGridView;
import com.qfedu.sys.utils.ResultObj;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController //返回json数据格式
@RequestMapping("customer")
public class CustomerController {

    @Autowired
    private ICustomerService customerService;

    /**
     * 展示用户信息
     * @param customerVo
     * @return
     */
    @RequestMapping("loadAllCustomer")
    public DataGridView loadAllCustomer(CustomerVo customerVo){
        return customerService.queryAllCustomer(customerVo);
    }

    /**
     * 添加用户信息
     * @param customerVo
     * @return
     */
    @RequestMapping("addCustomer")
    @ResponseBody
    public ResultObj addCustomer(CustomerVo customerVo){
        try{
            customerService.addCustomer(customerVo);
            return ResultObj.ADD_SUCCESS;
        }catch (Exception e){
            e.printStackTrace();
            return ResultObj.ADD_ERROR;
        }
    }

    /**
     * 删除用户
     * @param customerVo
     * @return
     */
    @ResponseBody
    @RequestMapping("deleteCustomer")
    public ResultObj deleteCustomer(CustomerVo customerVo){
        try{
            customerService.deleteCustomer(customerVo.getIdentity());
            return ResultObj.DELETE_SUCCESS;
        }catch (Exception e){
            e.printStackTrace();
            return ResultObj.DELETE_ERROR;
        }

    }

}
