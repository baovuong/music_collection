package mc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BlogController {
	
	@RequestMapping("/welcome")
	public ModelAndView welcome() {
		String message = "testing";
		return new ModelAndView("welcome","message",message);
	}
}
