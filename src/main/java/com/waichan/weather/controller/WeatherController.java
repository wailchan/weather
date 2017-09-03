package com.waichan.weather.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.waichan.weather.model.WeatherModel;

@Controller
public class WeatherController {

	@RequestMapping("/weather")
	public ModelAndView showMessage(
			@RequestParam(value = "city", required = false, defaultValue = "Melbourne") String city) {
		System.out.println("in controller");

		ModelAndView mv = new ModelAndView("currentweatherbycity");
		WeatherModel weatherModel = new WeatherModel();
		mv.addObject("weatherDetail", weatherModel.getCurrentWeatherByCity(city));
		return mv;
	}
}