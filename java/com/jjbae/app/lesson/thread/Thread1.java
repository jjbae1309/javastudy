package com.jjbae.app.lesson.thread;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Thread1 extends Thread {
	private static Logger LOGGER = LoggerFactory.getLogger(Thread1.class);
	
	@Override
	public void run() {
		for (int i = 0; i < 1000; i = i + 3) {
			LOGGER.debug("Thread1 = " + i);
		}
	}
}
