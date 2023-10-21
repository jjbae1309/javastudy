package com.jjbae.app.lesson.hello;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GreetingTest {
	private static Logger LOGGER = LoggerFactory.getLogger(GreetingTest.class);
	
	public static void main(String[] args) {
	
		GreetingInterface greeting = new KoreanGreetingImpl();
		LOGGER.debug(greeting.hello());
	}
}
