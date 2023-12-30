package com.jjbae.app.clock;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestClock4 {
	private static Logger LOGGER = LoggerFactory.getLogger(TestClock4.class);
	
	public static void main(String[] args) throws Exception {
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;
		int date = cal.get(Calendar.DATE);
		
		String dateStr = String.format("%04d-%02d-%02d", year, month, date);
		LOGGER.debug(dateStr);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String date1 = sdf.format(cal.getTime());
		LOGGER.debug(date1);
		
		String testDate = "2024-12-30 12:34:56";
		// 하루를 더한 날짜를 String으로 구하세요.
		Date d = sdf.parse(testDate);
		Calendar tempCal = Calendar.getInstance();
		tempCal.setTime(d);
		tempCal.add(Calendar.YEAR, 1);
		LOGGER.debug(sdf.format(tempCal.getTime()));
		
	}
}
