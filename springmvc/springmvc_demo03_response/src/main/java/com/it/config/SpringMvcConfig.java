package com.it.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;



@Configuration
@ComponentScan("com.it.controller")
@EnableWebMvc
/***
 * @EnableWebMvc  功能之一就是将对应的json对象转换为我们所需要的对象
 */
public class SpringMvcConfig {
}
