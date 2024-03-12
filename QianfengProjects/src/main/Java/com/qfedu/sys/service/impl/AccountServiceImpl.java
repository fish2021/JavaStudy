package com.qfedu.sys.service.impl;

import com.qfedu.sys.mapper.AccountMapper;
import com.qfedu.sys.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class AccountServiceImpl implements IAccountService {


    @Autowired
    AccountMapper accountMapper;

    @Override
    public int updateTransfer(String InNmae, String OutName, double money) {
            //用户存入
            try {
                accountMapper.transferIn(InNmae , money);
                accountMapper.transferOut(OutName , money);
            }catch (Exception e){
                System.out.println(e);
                return 1;
            }
            return 0;
    }
}
