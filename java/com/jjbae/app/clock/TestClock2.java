package com.jjbae.app.clock;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestClock2 {
	private static Logger LOGGER = LoggerFactory.getLogger(TestClock2.class);
	
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		LOGGER.debug(String.format("YEAR:%04d", cal.get(Calendar.YEAR)));
		LOGGER.debug(String.format("MONTH:%02d", cal.get(Calendar.MONTH) + 1));
		LOGGER.debug(String.format("DATE:%02d", cal.get(Calendar.DATE)));
		
		// 2023-12-09 12:34:56
		SimpleDateFormat simpleFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String curTime = simpleFormat.format(cal.getTime());
		LOGGER.debug(curTime);
		
		// 09/12/2023 12:34:56
//		simpleFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
//		curTime = simpleFormat.format(cal.getTime());
//		LOGGER.debug(curTime);
		try {
			String time1 = "3000-01-02 12:34:56";
			Date d = simpleFormat.parse(time1);
			LOGGER.debug("d.getYear():" + d.getYear());
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
