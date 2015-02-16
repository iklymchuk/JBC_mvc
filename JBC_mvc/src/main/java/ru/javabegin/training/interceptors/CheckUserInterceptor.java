package ru.javabegin.training.interceptors;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import ru.javabegin.training.objects.User;

public class CheckUserInterceptor extends HandlerInterceptorAdapter {
	
	@Override
	public void postHandle (HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws IOException {
		
		if (request.getRequestURI().contains("check-user")) {
					
					User user = (User) modelAndView.getModel().get("user");
					if (user == null || !user.isAdmin()) {
						response.sendRedirect(request.getContextPath() + "/failed");
					}
					
				}
		}

}
