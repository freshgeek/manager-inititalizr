package com.example.springboot.managerinititalizr.common;

import org.springframework.stereotype.Controller;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @author chen.chao
 * @version 1.0
 * @date 2019/9/26 18:10
 * @description
 */
@Controller
public class BaseController {

    /**
     * 获取request对象
     */
    protected HttpServletRequest getRequest() {
        return ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
    }

    /**
     * 获取Response对象
     */
    protected HttpServletResponse getResponse() {
        return ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getResponse();
    }

    /**
     * 获取Session对象
     */
    protected HttpSession getSession() {
        return ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest().getSession();
    }

    protected Object getSessionUser(){
       return  getSession().getAttribute(AppConst.USER_LOGIN_SESSION);
    }
    protected void setSessionUser(Object user){
        getSession().setAttribute(AppConst.USER_LOGIN_SESSION,user);
    }
}


