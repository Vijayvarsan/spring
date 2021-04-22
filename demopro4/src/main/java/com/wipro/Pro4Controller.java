package com.wipro;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Pro4Controller {
	@RequestMapping("/submit")
	public String getdetails(HttpServletRequest request , HttpServletResponse response) {
		
		
		String a=request.getParameter("name");
		int b=Integer.parseInt(request.getParameter("id"));
		
		
		if(a.equals("vj") && b==101) {
			return "ThanksPage.jsp";
		}
		else {
			return "index.jsp";
		}
		}
}
