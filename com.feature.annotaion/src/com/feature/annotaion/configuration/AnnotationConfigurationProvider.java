package com.feature.annotaion.configuration;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class AnnotationConfigurationProvider {
	
	public Properties  getProperties(){	
		
		Properties properties = new Properties();
		InputStream fileStream = getClass().getResourceAsStream( "/config.properties" );
		try {
			properties.load(fileStream);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return properties;
	}

}
