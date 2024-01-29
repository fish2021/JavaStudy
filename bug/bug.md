# bug合集



## 1.springmvc_demo1中 请求[localhost:8080/save/param?name=李四&age=12](http://localhost:8080/save/param?name=李四&age=12)

#### 返回结果出现中文乱码

#### 未解决



## 2.springmvc_demo2中请求http://localhost:8080/demo2/user 结果报错

#### 原因是 com.it.pojo.user中没有默认的构造 user{}

#### 已解决



## 3.基于2的bug得到的结果 例如User(name =null , age= null ,address= null)

#### 原因是使用的空参构造，并使用set方法进行传值 ，所以在User类中需要get set方法

#### 已解决