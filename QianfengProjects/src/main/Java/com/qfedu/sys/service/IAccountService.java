package com.qfedu.sys.service;

public interface IAccountService {

    //转账
    public int updateTransfer(String InNmae , String OutName , double money);
}
