package com.spring_sec;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

	@GetMapping("/")
	public String show() {
		return "WEB-INF/views/index.jsp";
		
	}
	
}
