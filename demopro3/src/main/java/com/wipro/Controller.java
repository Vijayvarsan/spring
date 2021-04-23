package com.wipro;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller
public class Controller {
	@RequestMapping("/submit")
	public String submit(HttpServletRequest request ,HttpServletResponse response) {
		
		String a=request.getParameter("user");
		String b=request.getParameter("pass");
		
		if(a.equals("vj") && b.equals("12345")) {
			return ("Display.jsp");
		}
		else{
			return("index.jsp");
		}
		
	}

}
