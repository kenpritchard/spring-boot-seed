package com.kenpritchard.seeds.domain;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class GreetingTest {

	private String name;

	private Greeting greeting;
	
	@Before
	public void setup() {
		this.name = "test";
		this.greeting = new Greeting();
	}
	
	@Test
	public void createGreetingTest() {
		System.out.println(String.format("Hello %s!", name));
		assertEquals(String.format("Hello %s!", name), this.greeting.createGreeting(name));
	}
}
