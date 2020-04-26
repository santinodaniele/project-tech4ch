package tech4ch.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FeatureController {
	
	@RequestMapping(value = "/revisit", method = RequestMethod.GET)
	public ModelAndView RevisitFeature() {
		ModelAndView modelAndView = new ModelAndView("Features/Revisit");
		return modelAndView;
	}
	
	@RequestMapping(value = "/summary", method = RequestMethod.GET)
	public ModelAndView SummaryFeature() {
		ModelAndView modelAndView = new ModelAndView("Features/Summary");
		return modelAndView;
	}
}
