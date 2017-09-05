package com.waichan.weather.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.waichan.weather.model.WeatherModel;
import com.waichan.weather.vo.WeatherDetail;

@RestController
public class WeatherController {

	@RequestMapping("/")
	public ModelAndView showDefaultPage() {
		ModelAndView mv = new ModelAndView("views/currentweatherbycity");
		WeatherModel weatherModel = new WeatherModel();
		mv.addObject("weatherDetail", weatherModel.getCurrentWeatherByCity("Melbourne"));
		return mv;
	}
	
	@RequestMapping("/weather")
	public WeatherDetail getCurrentWeatherByCity(
			@RequestParam(value = "city", required = false, defaultValue = "Melbourne") String city) {
		WeatherModel weatherModel = new WeatherModel();
		return weatherModel.getCurrentWeatherByCity(city);
	}
}
