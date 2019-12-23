package com.example.springboot.managerinititalizr.common;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebFilter(urlPatterns = {"/admin/*","/user/*"})
public class AuthFilter implements Filter {
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest httpServletRequest = (HttpServletRequest) request;
        HttpServletResponse httpServletResponse = (HttpServletResponse) response;

        Object staff =
                httpServletRequest.getSession().getAttribute(AppConst.USER_LOGIN_SESSION);
        if (staff==null){
            httpServletResponse.sendRedirect("/");
        }
        if (httpServletRequest.getRequestURI().startsWith("/admin/")){
            try {

            }catch (Exception e){
                httpServletResponse.sendRedirect("/");
            }
        }
        chain.doFilter(request,response);
    }
}
