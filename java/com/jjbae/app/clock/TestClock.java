package com.jjbae.app.clock;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestClock {
	private static Logger LOGGER = LoggerFactory.getLogger(TestClock.class);
	
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
//		LOGGER.debug(String.format("YEAR:%d", cal.get(Calendar.YEAR)));
//		LOGGER.debug(String.format("MONTH:%d", cal.get(Calendar.MONTH) + 1));
//		LOGGER.debug(String.format("DAY:%02d", cal.get(Calendar.DATE)));
//		LOGGER.debug(String.format("HOUR:%d", cal.get(Calendar.HOUR_OF_DAY)));
//		LOGGER.debug(String.format("MINUTE:%d", cal.get(Calendar.MINUTE)));
//		LOGGER.debug(String.format("SECOND:%d", cal.get(Calendar.SECOND)));
		
		String curTime = String.format("%04d-%02d-%02d %02d:%02d:%02d", 
				cal.get(Calendar.YEAR), 
				cal.get(Calendar.MONTH) + 1, 
				cal.get(Calendar.DATE), 
				cal.get(Calendar.HOUR_OF_DAY), 
				cal.get(Calendar.MINUTE), 
				cal.get(Calendar.SECOND));
		
		// 2023-12-09 12:34:56
		LOGGER.debug(String.format("%04d-%02d-%02d %02d:%02d:%02d", 
				cal.get(Calendar.YEAR), 
				cal.get(Calendar.MONTH) + 1, 
				cal.get(Calendar.DATE), 
				cal.get(Calendar.HOUR_OF_DAY), 
				cal.get(Calendar.MINUTE), 
				cal.get(Calendar.SECOND)));
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String curDate = dateFormat.format(cal.getTime());
		
		LOGGER.debug(curDate);
		
		// 2023/12/09 12:12
		dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm");
		String simDate = dateFormat.format(cal.getTime());
		
		// 20231209123456
		dateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
		String difficultDate = dateFormat.format(cal.getTime());
		LOGGER.debug(difficultDate);
			}
}
