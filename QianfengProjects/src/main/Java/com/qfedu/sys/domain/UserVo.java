package com.qfedu.sys.domain;

public class UserVo extends User{

    //分页信息
    //第多少页
    private Integer page;
    //每页显示多少数据
    private Integer limit;
    //验证码
    private String code;

    //获取多个用户编码
    private int[] ids;

    public int[] getIds() {
        return ids;
    }

    public void setIds(int[] ids) {
        this.ids = ids;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
