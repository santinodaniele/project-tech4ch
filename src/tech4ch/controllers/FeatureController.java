package tech4ch.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FeatureController {
	
	@RequestMapping(value = "/revisit", method = RequestMethod.GET)
	public ModelAndView BubbleVisitors() {
		ModelAndView modelAndView = new ModelAndView("Features/Revisit");
		return modelAndView;
	}
}
