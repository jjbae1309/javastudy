package com.jjbae.app.lesson.thread;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ThreadTest {
	private static Logger LOGGER = LoggerFactory.getLogger(ThreadTest.class);
	
	public static void main(String[] args) {
//		LOGGER.debug("hello world");
		LOGGER.debug("++++ activeCount:" + Thread.activeCount());
		
		Thread1 t1 = new Thread1();
		t1.start();
		
		Thread2 t2 = new Thread2();
		t2.start();
		
		Thread3 t3 = new Thread3();
		t3.start();
		
		LOGGER.debug("---- activeCount:" + Thread.activeCount());
	}
}
