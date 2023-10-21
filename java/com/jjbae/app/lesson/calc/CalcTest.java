package com.jjbae.app.lesson.calc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CalcTest {
	private static Logger LOGGER = LoggerFactory.getLogger(CalcTest.class);
	
	public static void main(String[] args) {
		CalcInterface calc = new CalcImpl();
		
		int value = calc.subtract(1, 1);
		LOGGER.debug("value:" + value);
	}
}
