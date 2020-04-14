package tech4ch.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/chart-types", method = RequestMethod.GET)
public class ChartTypesController {
	
	@RequestMapping(value = "/bubbleVisitors", method = RequestMethod.GET)
	public ModelAndView BubbleVisitors() {
		ModelAndView modelAndView = new ModelAndView("ChartTypes/BubbleVisitors");
		return modelAndView;
	}
	
	@RequestMapping(value = "/pieVisitors", method = RequestMethod.GET)
	public ModelAndView PieVisitors() {
		ModelAndView modelAndView = new ModelAndView("ChartTypes/VisitorsPerHour");
		return modelAndView;
	}
	
	@RequestMapping(value = "/statsBar", method = RequestMethod.GET)
	public ModelAndView BarPoiStats() {
		ModelAndView modelAndView = new ModelAndView("ChartTypes/PoiStats");
		return modelAndView;
	}
	
	@RequestMapping(value = "/attractionbar", method = RequestMethod.GET)
	public ModelAndView BarAttractionPower() {
		ModelAndView modelAndView = new ModelAndView("ChartTypes/AttractionPower");
		return modelAndView;
	}
	
	@RequestMapping(value = "/holdingbar", method = RequestMethod.GET)
	public ModelAndView BarHoldingPower() {
		ModelAndView modelAndView = new ModelAndView("ChartTypes/HoldingPower");
		return modelAndView;
	}
}