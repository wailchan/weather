package com.waichan.weather;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * WeatherInitializer initialises the servlet config.
 * @author Wai Chan
 *
 */
public class WeatherInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	/**
	 * Use the WeatherConfiguration class as the root config class.
	 */
	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class[] { WeatherConfiguration.class };
	}

	/**
	 * There is no servlet config class.
	 */
	@Override
	protected Class<?>[] getServletConfigClasses() {
		return null;
	}

	/**
	 * Use "/" as the servlet mappings.
	 */
	@Override
    protected String[] getServletMappings() {
        return new String[] { "/" };
    }

}
