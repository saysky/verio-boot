package com.example.ssm.rental.common.interceptor;

import com.example.ssm.rental.common.constant.Constant;
import com.example.ssm.rental.common.enums.UserRoleEnum;
import com.example.ssm.rental.entity.User;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


/**
 * 租客接口拦截器
 *
 * @author example
 */
@Component
public class AdminInterceptor extends HandlerInterceptorAdapter {


    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object o) throws IOException {
        User user = (User) request.getSession().getAttribute(Constant.SESSION_USER_KEY);
        // 如果用户未登录，拦截
        if (user == null) {
            response.sendRedirect("/login");
            return false;
        }
        // 如果不是管理员，则拦截
        if (!UserRoleEnum.ADMIN.getValue().equalsIgnoreCase(user.getRole())) {
            return false;
        }
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) {

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {

    }
}

