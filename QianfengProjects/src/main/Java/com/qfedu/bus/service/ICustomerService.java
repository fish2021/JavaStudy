package com.qfedu.bus.service;


import com.qfedu.bus.vo.CustomerVo;
import com.qfedu.sys.utils.DataGridView;

public interface ICustomerService {

    public DataGridView queryAllCustomer(CustomerVo customerVo);

    public void addCustomer(CustomerVo customerVo);

    public void deleteCustomer(String identity);
}
