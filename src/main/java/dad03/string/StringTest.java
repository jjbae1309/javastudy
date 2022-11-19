package dad03.string;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StringTest {
	private static Logger LOGGER = LoggerFactory.getLogger(StringTest.class);
	
	public static void main(String[] args) {
		String s = "Hello World";
		
		// 1. charAt : 문자열에서 문자 추출
		LOGGER.debug("s.charAt:" + s.charAt(4));
		
		// 2. codePointAt : 문자열에서 해당 문자의 코드값을 추출
		LOGGER.debug("s.codePointAt:" + s.codePointAt(2));
	}
}
