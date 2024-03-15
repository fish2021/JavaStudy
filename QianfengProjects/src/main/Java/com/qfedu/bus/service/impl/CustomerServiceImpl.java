package com.qfedu.bus.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.qfedu.bus.domain.Customer;
import com.qfedu.bus.mapper.CustomerMapper;
import com.qfedu.bus.service.ICustomerService;
import com.qfedu.bus.vo.CustomerVo;
import com.qfedu.sys.utils.DataGridView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CustomerServiceImpl implements ICustomerService {


    @Autowired
    private CustomerMapper customerMapper;
    /***
     * 分页查询方法
     * @param customerVo
     * @return
     */
    @Override
    public DataGridView queryAllCustomer(CustomerVo customerVo) {
      Page<Object> page =  PageHelper.startPage(customerVo.getPage() , customerVo.getLimit());
        List<Customer>  data = customerMapper.queryAllCustomer(customerVo);
        return new DataGridView(page.getTotal() , data);
    }

    /**
     * 添加用户业务
     * @param customerVo
     */
    @Override
    public void addCustomer(CustomerVo customerVo) {
        customerMapper.insertSelective(customerVo);
    }

    /**
     * 删除用户
     */
    @Override
    public void deleteCustomer(String identity){
        customerMapper.deleteCustomer(identity);
    }
}
