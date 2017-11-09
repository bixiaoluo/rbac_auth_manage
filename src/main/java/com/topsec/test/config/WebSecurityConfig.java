//package com.topsec.test.config;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//
///**
// * Created by jiyujing on 2017/11/7.
// * 权限控制
// */
//
//@Configuration
//@EnableWebSecurity
//public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http
//                .authorizeRequests()  //定义哪些URL需要被保护、哪些不需要被保护
//                // 配置那些路径可以不用权限访问，其他路径都需要认证
//                .antMatchers("/public/**","/static/assets/**","/static/css/**","/static/images/**","/static/js/**").permitAll()
//                .anyRequest().authenticated()
//                .and()
//                .formLogin()  //定义当需要用户登录时候，转到的登录页面。
//                .loginPage("/nice_admin/login.html")
//                .permitAll()  //登录页面任意访问
//                .and()
//                .logout()
//                .permitAll();   //注销行为任意访问
//    }
//
//    @Autowired
//    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
//        auth
//                .inMemoryAuthentication()
//                .withUser("user").password("1").roles("USER");
//    }
//
//}
