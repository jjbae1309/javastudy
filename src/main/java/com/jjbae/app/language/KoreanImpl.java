package com.jjbae.app.language;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class KoreanImpl implements LangInterface {
	// 필드
	private static Logger LOGGER = LoggerFactory.getLogger(KoreanImpl.class);

	private static String FILE_PATH = "src/main/java/com/jjbae/app/language/lang.kr";
	private Map<String, String> langMap = new HashMap<>();
	
	// 생성자
	public KoreanImpl() {
		// lang.kr의 내용을 읽어온다.
		loadFile();
	}
	
	// 메소드
	private void loadFile() {
		try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
			String readLine = null;
			while ((readLine = reader.readLine()) != null) {
				//LOGGER.debug(readLine);
				String[] words = readLine.split("=");
				
				langMap.put(words[0], words[1]);
			}
		}
		catch (IOException ioe) {
			LOGGER.error(ioe.getMessage(), ioe);
		}
	}
	
	@Override
	public String message(String key) {
		return langMap.get(key);
	}
}
