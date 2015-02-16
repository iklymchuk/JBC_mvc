package ru.javabegin.training.interceptors;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import ru.javabegin.training.objects.User;

public class CheckUserInterceptor extends HandlerInterceptorAdapter {
	
	@Override
	public void afterCompletion (HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
		if (request.getRequestURI().contains("check-user")) {
			
			User user = (User) request.getAttribute("user");
			if (user == null || !user.isAdmin()) {
				response.sendRedirect(request.getContextPath() + "/failed");
			}
			
		}
	}

}
