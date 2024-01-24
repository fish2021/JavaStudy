# 使用SpringMVC开发的一个简单demo

## 



## 环境配置: 

#### 软件IDEA2023

### pom.xml:

依赖

```
<dependency>
      <groupId>javax.servlet</groupId>
      <artifactId>javax.servlet-api</artifactId>
      <version>3.1.0</version>
      <scope>provided</scope>
    </dependency>
    <dependency>
      <groupId>org.springframework</groupId>
      <artifactId>spring-webmvc</artifactId>
      <version>5.2.10.RELEASE</version>
    </dependency>
```

插件

```
 <plugin>
        <groupId>org.apache.tomcat.maven</groupId>
        <artifactId>tomcat7-maven-plugin</artifactId>
        <version>2.1</version>
        <configuration>
          <port>8080</port>
          <path>/</path>
        </configuration>
      </plugin>
```





###  其中使用到的注解

#### controller包(表现层):

@Controller是支持多个请求的动作

