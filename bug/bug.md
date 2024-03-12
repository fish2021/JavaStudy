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



## 4.在springmvc_demo03_response中controller包下的类中方法juadePage()运行报错，

#### 原因是不加@ResponseBody ，则方法返回值会自动跳转界面，而在该类上加上了@RequestMapping("/demo3") ，使得该方法在去请求test.jsp界面会自动加上/demo3从而访问/demo3/test.jsp，而实际上我们要访问的是/test.jsp

#### 已解决 





## 5.IDEA日常填坑：Cannot resolve plugin org.apache.maven.plugins:maven-war-plugin

#### 在setting中重新配置一下

![image-20240311102901813](D:\Ideaprojects\Java_graduate\bug\image\image-20240311102901813.png)

#### 已解决 





## 6.IDEA2023在pom.xml文件中出现版本不安全的提示

![image-20240312123642888](D:\Ideaprojects\Java_graduate\bug\image\image-20240312123642888.png)

#### 已解决 