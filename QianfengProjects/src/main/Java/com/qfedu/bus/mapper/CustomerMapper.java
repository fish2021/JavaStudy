package com.qfedu.bus.mapper;

import com.qfedu.bus.domain.Customer;
import com.qfedu.bus.vo.CustomerVo;

import java.util.List;

public interface CustomerMapper {

    List<Customer> queryAllCustomer(CustomerVo customerVo);

    int insertSelective(CustomerVo customerVo);

    int deleteCustomer(String idsntity);

}
