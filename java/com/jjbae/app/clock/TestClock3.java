package com.jjbae.app.clock;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestClock3 {
	private static Logger LOGGER = LoggerFactory.getLogger(TestClock3.class);
	
	private static final long UNIT_DATE = (1000 * 60 * 60 * 24);
	
	public static void main(String[] args) throws Exception {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;
		int date = cal.get(Calendar.DATE);
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		int min = cal.get(Calendar.MINUTE);
		int scd = cal.get(Calendar.SECOND);
		
		String simpleDate = simpleDateFormat.format(cal.getTime());
		LOGGER.debug(String.format("%04d-%02d-%02d %02d:%02d:%02d", year, month, date, hour, min, scd));
		LOGGER.debug(simpleDate);
/*		
		cal.add(Calendar.HOUR, 10000);
		simpleDate = simpleDateFormat.format(cal.getTime());
		LOGGER.debug(simpleDate);
*/		
		Date curDate = cal.getTime();
		
		String dueDateStr = "2027-11-16 09:00:00";
		Date dueDate = simpleDateFormat.parse(dueDateStr);
		
		long diff = dueDate.getTime() - curDate.getTime();
		
		long diffHour = diff / (1000 * 60 * 60);
		LOGGER.debug("diffHour:" + diffHour);
		
		// 만 19세 되는 날까지 남은 일수를 구하시오
		// String birthday = "2009-04-13";
		String birthday = "1975-09-04";
		// 1. birthday를 Date로 변환
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date birthDate = sdf.parse(birthday);
		
		// 2. 19년 후 Date 구함
		Calendar _19YearLaterCal = Calendar.getInstance();
		_19YearLaterCal.setTime(birthDate);
		_19YearLaterCal.add(Calendar.YEAR, 19);
		Date _19YearDate = _19YearLaterCal.getTime();
		
		// 3. 19년 후와 현재 날짜의 차이를 밀리세컨드 단위로 구함
		long diff2 = _19YearDate.getTime() - curDate.getTime();
		
		// 4. 밀리세컨드 단위의 날짜 차이를 일수로 변환.
		long dateDiff = diff2 / (1000 * 60 * 60 * 24);
		
		LOGGER.debug("19세까지의 날짜는 :" + dateDiff);
		
		/**
		 * Calendar는 Calendar.getInstance()를 통해 생성
		 * 
		 * Date는 
		 *   - Calendar 객체의 getTime()를 통해 생성 
		 *   - SimpleDateFormat 객체의 parse()를 통해 성성
		 * 
		 * 날짜 String은
		 *   - SimpleDateFormat 객체의 format()을 통해 생성
		 */
		// 1) 만 30세까지의 남은 일수를 구하시오.
		Calendar _30YearLaterCal = Calendar.getInstance();
		_30YearLaterCal.setTime(birthDate);
		_30YearLaterCal.add(Calendar.YEAR, 30);
		Date _30YearDate = _30YearLaterCal.getTime();
		
		long diff3 = _30YearDate.getTime() - curDate.getTime();
		long yearDiff = diff3 / (1000 * 60 * 60 * 24);
		LOGGER.debug("30세까지의 남은 일수는:" + yearDiff);
				
		// 2) 현재까지 몇일을 살았는지 구한다. 
		long now = cal.getTime().getTime();
		long birth = birthDate.getTime();
		long diff4 = now - birth;
		dateDiff = diff4 / UNIT_DATE;
		LOGGER.debug(String.format("살아온 날짜: %d", dateDiff));
		
		
	}
}
