package com.example.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

/**
 * @author: yoihanabi
 * @date: 2022年08月05日 9:47
 * @Description: 配置cros跨域
 */
@Configuration
public class WebMvcConfigurer implements org.springframework.web.servlet.config.annotation.WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")  //拦截所有路径
                .allowedOrigins("*")    //允许跨域的地址
                .allowedHeaders("*")    //允许的头信息，*表示所有
                .allowedMethods("*");   //允许的方法，GET PUT HEAD 等等，* 表示所有
    }
}
