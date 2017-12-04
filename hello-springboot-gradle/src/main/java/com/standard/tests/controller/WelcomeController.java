package com.standard.tests.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Welcome page controller.
 * 
 * @author John Doe <jonhdoedev@gmail.com>
 *
 */
@Controller
public class WelcomeController {
	
	@RequestMapping("/welcome.html")
	public ModelAndView firstPage() {
		return new ModelAndView("welcome");
	}
}
