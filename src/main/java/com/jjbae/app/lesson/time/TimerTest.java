package com.jjbae.app.lesson.time;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TimerTest {
	private static Logger LOGGER = LoggerFactory.getLogger(TimerTest.class);
	public static void main(String[] args) {
		int remains = 400;
				
		while (remains > 0) {
			long startTime = System.currentTimeMillis();

			remains--;
			
			LOGGER.debug("remains:" + remains);
			
			long endTime = System.currentTimeMillis();
			
			try {
				Thread.sleep(1000 - (endTime - startTime));
			}
			catch (Exception ex) {
				LOGGER.error(ex.getMessage(), ex);
			}
		}
	}
}
