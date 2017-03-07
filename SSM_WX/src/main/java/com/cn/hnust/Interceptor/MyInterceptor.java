package com.cn.hnust.Interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.cn.hnust.pojo.Manager;

public class MyInterceptor implements HandlerInterceptor {

	@Override
	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean preHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2) throws Exception {
		if (arg0.getRequestURI().indexOf("login") > 0 || arg0.getRequestURI().indexOf("agent") > 0
				|| arg0.getRequestURI().indexOf("user") > 0)
			return true;
		String path = arg0.getContextPath();
		System.out.println(path);
		Manager manager = (Manager) arg0.getSession().getAttribute("manager");
		if (null != manager) {
			return true;
		}
		arg1.sendRedirect(path + "/user/login.html");
		return false;
	}

}
