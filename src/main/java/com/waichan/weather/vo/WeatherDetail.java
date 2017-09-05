package com.waichan.weather.vo;

import java.util.Date;

/**
 * WeatherDetail is a value object which contains weather detail.
 * 
 * @author Wai Chan
 *
 */
public class WeatherDetail {
	private String city; // City name
	private Date updatedTime; // Updated time
	private String weather; // weather description
	private int temperature; // weather description
	private int wind; // wind speed in km/h

	/**
	 * Constructor
	 * 
	 * @param city
	 *            City name
	 * @param updatedTime
	 *            Updated time
	 * @param weather
	 *            weather description
	 * @param temperature
	 *            temperature in °C
	 * @param wind
	 *            wind speed in km/h
	 */
	public WeatherDetail(String city, Date updatedTime, String weather, int temperature, int wind) {
		this.city = city;
		this.updatedTime = updatedTime;
		this.weather = weather;
		this.temperature = temperature;
		this.wind = wind;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Date getUpdatedTime() {
		return updatedTime;
	}

	public void setUpdatedTime(Date updatedTime) {
		this.updatedTime = updatedTime;
	}

	public String getWeather() {
		return weather;
	}

	public void setWeather(String weather) {
		this.weather = weather;
	}

	public int getTemperature() {
		return temperature;
	}

	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}

	public int getWind() {
		return wind;
	}

	public void setWind(int wind) {
		this.wind = wind;
	}
}
