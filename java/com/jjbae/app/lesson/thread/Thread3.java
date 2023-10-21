package com.jjbae.app.lesson.thread;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Thread3 extends Thread {
	private static Logger LOGGER = LoggerFactory.getLogger(Thread3.class);
	
	@Override
	public void run() {
		for (int i = 2; i < 1000; i = i + 3) {
			LOGGER.debug("Thread3 = " + i);
		}
	}
}
