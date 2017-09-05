package com.waichan.weather;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
import org.springframework.data.rest.webmvc.config.RepositoryRestMvcConfiguration;

public class WeatherInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class[] { WeatherConfiguration.class };
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class<?>[] { RepositoryRestMvcConfiguration.class, WeatherMvcConfiguration.class };
		//return null;
	}

	@Override
    protected String[] getServletMappings() {
        return new String[] { "/" };
    }

}
