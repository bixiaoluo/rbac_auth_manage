package com.topsec.test.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.web.servlet.config.annotation.*;

/**
 * Created by jiyujing on 2017/11/9.
 * 配置项目默认访问页面
 * 如果不在这里设置，那么可以单独写一个controller 以/开头的路径。来实现默认跳转
 */
@Configuration
public class MvcConfigurer extends WebMvcConfigurerAdapter {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        //配置项目默认访问页面
        registry.addViewController("").setViewName("redirect:/nice_admin/login.html");
        registry.setOrder(Ordered.HIGHEST_PRECEDENCE);
    }
//
//    @Override
//    public void configurePathMatch(PathMatchConfigurer configurer) {
//        super.configurePathMatch(configurer);
//        configurer.setUseSuffixPatternMatch(false);//当此参数设置为true的时候，那么/user.html，/user.aa，/user.*都能是正常访问的。
//    }
//
//
//    /**
//     * 配置静态资源 自定义目录
//     * @param registry
//     */
//    @Override
//    public void addResourceHandlers(ResourceHandlerRegistry registry) {
//        registry.addResourceHandler("/static/**","/public/**")
//                .addResourceLocations("classpath:/static/")
//                .addResourceLocations("classpath:/META-INF/resources/**")
//                .addResourceLocations("classpath:/public/");
//    }
}