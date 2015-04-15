package com.kenpritchard.seeds.domain;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

@Component
public class Greeting {
	
	static final Logger logger = Logger.getLogger(Greeting.class.getName());
	public String createGreeting(String name) {
		Greeting.logger.trace(String.format("Creating greeting for %s", name));
		return String.format("Hello %s!", name);
	}
	
}

