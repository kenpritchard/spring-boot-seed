package com.kenpritchard.seeds;

import java.util.Arrays;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.kenpritchard.seeds.domain.Greeting;

@Component
public class Runner implements CommandLineRunner {
	
	static final Logger logger = Logger.getLogger(Runner.class.getName());

	@Value("${name}")
	private String theName;

	@Autowired
	private Greeting theGreeting;

	public void run(String... args) {
		Runner.logger.trace(String.format("Args: %s", Arrays.asList(args)));
		System.out.println(this.theGreeting.createGreeting(this.theName));
	}
}
