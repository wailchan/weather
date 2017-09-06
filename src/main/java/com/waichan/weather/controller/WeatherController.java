package com.waichan.weather.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.waichan.weather.model.WeatherModel;
import com.waichan.weather.vo.WeatherDetail;

/**
 * WeatherController is the controller class of the Weather web application.
 * @author Wai Chan
 *
 */
@RestController
public class WeatherController {

	/**
	 * Get current weather details by city
	 * 
	 * @param city the city name
	 * @return WeatherDetail of the city.
	 */
	@RequestMapping("/weather")
	public WeatherDetail getCurrentWeatherByCity(
			@RequestParam(value = "city", required = false, defaultValue = "Melbourne") String city) {
		WeatherModel weatherModel = new WeatherModel();
		return weatherModel.getCurrentWeatherByCity(city);
	}
}