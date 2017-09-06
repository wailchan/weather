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
	private float temperature; // weather description
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
	public WeatherDetail(String city, Date updatedTime, String weather, float temperature, int wind) {
		this.city = city;
		this.updatedTime = updatedTime;
		this.weather = weather;
		this.temperature = temperature;
		this.wind = wind;
	}

	/**
	 * Get the city name
	 * @return the city name
	 */
	public String getCity() {
		return city;
	}

	/**
	 * Get the updated time
	 * @return the updated time
	 */
	public Date getUpdatedTime() {
		return updatedTime;
	}

	/**
	 * Get the weather description
	 * @return the weather description
	 */
	public String getWeather() {
		return weather;
	}

	/**
	 * Get the temperature in °C
	 * @return the temperature in °C
	 */
	public float getTemperature() {
		return temperature;
	}

	/**
	 * Get the wind speed in km/h
	 * @return the wind speed in km/h
	 */
	public int getWind() {
		return wind;
	}
}