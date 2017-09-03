package com.waichan.weather.model;

import java.util.Date;

import com.waichan.weather.vo.WeatherDetail;

public class WeatherModel {

	/**
	 * Get current weather by city
	 * @param city city name
	 * @return weatherDetail the weather detail
	 */
	public WeatherDetail getCurrentWeatherByCity(String city) {
		WeatherDetail weatherDetail = new WeatherDetail(city, new Date(), "Mostly Cloudy", 9, 32);
		//TODO implement the logic here
		return weatherDetail;
	}
}
