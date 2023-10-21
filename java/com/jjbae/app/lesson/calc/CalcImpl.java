package com.jjbae.app.lesson.calc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CalcImpl implements CalcInterface {
	private static Logger LOGGER = LoggerFactory.getLogger(CalcImpl.class);
	
	public int add(int a, int b) { 
		int value = a + b;
		return value;
	}
	
	public int subtract(int a, int b) {
		int value = a - b;
		return value;
	}
	
	public int multiply(int a, int b) {
		int value = a * b;
		return value;
	}
	
	public int divide(int a, int b) {
		int value = a / b;
		return value;
	}
}
