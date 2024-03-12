package com.qfedu.sys.mapper;

import org.apache.ibatis.annotations.Param;

public interface AccountMapper {

    public void transferIn(@Param("name") String name , @Param("money") double money);
    public void transferOut(@Param("name") String name ,  @Param("money") double money);
}
