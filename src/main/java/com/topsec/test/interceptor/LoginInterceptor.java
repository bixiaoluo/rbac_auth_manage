//package com.topsec.test.interceptor;
//
//import com.topsec.test.model.User;
//import com.topsec.test.util.Constants;
//import org.springframework.web.servlet.HandlerInterceptor;
//import org.springframework.web.servlet.ModelAndView;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;
//
///**
// * Created by jiyujing on 2017/9/21.
// * 登录拦截器
// */
//
//public class LoginInterceptor implements HandlerInterceptor {
//    @Override
//    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
//        //获取Session
//        HttpSession session = request.getSession();
//        User user = (User) session.getAttribute(Constants.USER_INFO);
//        if(user != null){
//            return true;
//        }
//        //不符合条件的，跳转到登录界面
////        request.getRequestDispatcher("/static/index.html").forward(request, response);
//        response.sendRedirect("/nice_admin/login.html");
//
//        return false;
//    }
//
//    @Override
//    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
//
//    }
//
//    @Override
//    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
//
//    }
//}
