package com.jinu.spring.test.lifecycle;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Test03Controller {
	
	@RequestMapping("/lifecycle/test03")
	public String ThymeleafTest() {
		return "lifecycle/test03";
	}
}
