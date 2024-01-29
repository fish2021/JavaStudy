







## 使用post方式传参user对象

#### 1.在com.it.config.springMvcConfig中添加@EnableEebMvc注解

#### 2.在com.it.controller中对应的getUser方法的参数上加@RequestBody注解

#### 3.postman中Body使用raw和json数据方式

对应raw

{

  "name":"zhaoyi",

  "age":123,

  "address":["henan","shanghai"]

}

#### 4.http://localhost:8080/demo2/user 点击send