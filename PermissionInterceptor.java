package com.book.bookshop.interceptor;

import com.book.bookshop.entity.User;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @Auther: jzhang
 * @Date: 2019/10/8 15:06
 * @Description: 用户登录拦截器
 */
public class PermissionInterceptor implements HandlerInterceptor {
    @Override
    @Mapper
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("user");
        if(user != null && user.getUsername() != null){
            return true;
        }else {
            response.sendRedirect(request.getContextPath() + "/book/index");
            return false;
        }
    }

    @Override
    @Mapper
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    @Mapper
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
