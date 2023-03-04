package com.jjbae.app.language;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LangTest {
	private static Logger LOGGER = LoggerFactory.getLogger(LangTest.class);
	
	public static void main(String[] args) {
		LangInterface lang = new EnglishImpl();
		LOGGER.debug(lang.message("title1"));
		LOGGER.debug(lang.message("create_new_account"));		
	}
}
