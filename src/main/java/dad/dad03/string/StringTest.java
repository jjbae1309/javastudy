package dad.dad03.string;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StringTest {
	private static Logger LOGGER = LoggerFactory.getLogger(StringTest.class);
	
	public static void main(String[] args) {
		String s = "Hello World";
		
		char c = 'C';
		
		// 1. charAt : 문자열에서 문자 추출
		LOGGER.debug("s.charAt:" + s.charAt(4));
		
		// 2. codePointAt : 문자열에서 해당 문자의 코드값을 추출
		LOGGER.debug("s.codePointAt:" + s.codePointAt(2));
		
		// 3. codePointBefore : index 안의 char를 반환시킴
		LOGGER.debug("s.codePointBefore:" + s.codePointBefore(2));
		
		// 4. codePointCount : string의 단어 자리에 해당하는 유니코드 출력
		LOGGER.debug("s.codePointCount:" + s.codePointCount(1, 2));
		
		// 5. compareTo : 두 string을 lexicographically하게 비교한다.
		LOGGER.debug("s.compareTo:" + s.compareTo(s));
		
		// 6. compareToIgnoreCase : 다른 case를 전부 제쳐두고, 두 string을 lexicographically하게 비교한다.
		LOGGER.debug("s.compareToIgnoreCase:" + s.compareToIgnoreCase(s));
		
		// 7. concat : string의 가장 끝부분을 concatenate한다.
		LOGGER.debug("s.concat:" + s.concat(s));
		
		// 8. contains : string이 char값의 지정된 순서를 가지고 있으면 true 리턴
		LOGGER.debug("s.contains:" + s.contains(s));
		
		// 9. contentEquals : 특정한 CharSequence를 이 string하고 비교한다
		LOGGER.debug("s.contentEquals:" + s.contentEquals(s));
		
		// 10. contentEquals : 특정한 StringBuffer를 이 string하고 비교한다.
		LOGGER.debug("s.contentEquals:" + s.contentEquals(s));
		
		char[] buf = new char[3];
		buf[0] = 'B';
		buf[1] = 'y';
		buf[2] = 'e';
		
		// 11. copyValueOf : 지정된 배열의 sequence를 이 string으로 리턴함
		LOGGER.debug("s.copyValueOf:" + String.copyValueOf(buf));
		s = String.copyValueOf(buf);
		LOGGER.debug("s:" + s);
		
		// 12. copyValueOf : 지정된 배열의 sequence를 이 string으로 리턴함
		//LOGGER.debug("s.copyValueOf:" + s.copyValueOf(null, 1, 2)); (에러로 실행불가)
		
		// 13. endsWith : 이 string이 suffix로 끝나는지 시험한다.
		LOGGER.debug("s.endsWith:" + s.endsWith(s));
		
		// 14. equals : 이 string을 다른 object하고 비교한다.
		LOGGER.debug("s.equals:" + s.equals(s));
		
		// 15. equalsIgnoreCase : 이 string을 다른 object하고 비교하는 동시에, 다른 case들을 모두 배제한다.
		LOGGER.debug("s.equalsIgnoreCase:" + s.equalsIgnoreCase(s));
		
		// 16. format : String, arguments, locale를 쓰는 format된 string을 반환시킴.
		LOGGER.debug("s.format:" + s.format(s, args));
		
		//String a = "나이=" + age + ", 이름=" + name;
		String a = String.format("나이=%.1000f,  이름=%s", (4.0f/9), "배재준");
		
		LOGGER.debug("a=" + a);
		
		// 17. format : String와 locale를 쓰는 format된 string을 리턴시킴.
		LOGGER.debug("s.format:" + s.format(null, s, args));
		
		// 18. getBytes : 이 String을 인코딩시켜 새로운 byte array로 변환시킴.
		LOGGER.debug("s.getBytes:" + s.getBytes());
		
		// 19. getBytes : 이 String을 charset와 같이 인코딩시켜 새로운 byte array로 변환시킴.
		//LOGGER.debug("s.getBytes:" + s.getBytes(null)); 실행 불가
		
		// 20. getBytes : 이제 이 메소드는 문자를 바이트로 재대로 바꾸지 않음. getBytes쓰심 되겠습니다 ㅋ
		//LOGGER.debug("s.getBytes:" + s.getBytes(null));
		
		// 21. getBytes : 이 string을 charset와 같이 인코딩시켜 새로운 byte array로 변환시킨다.
		//LOGGER.debug("s.getBytes:" + s.getBytes(null)); (실행 불가)
		
		// 22. getChars : string를 복사하여 destinition char array로 변환시킴
		//LOGGER.debug("s.getChars:" + s.getChars(c, c, null, c)); 실행 불가
		
		// 23. hashCode : hash code를 string으로 변환시킨다.
		LOGGER.debug("s.hashCode:" + s.hashCode());
		
		// 24. indexOf : 이 문자열 안의 index를 리턴함
		LOGGER.debug("s.indexOf" + s.indexOf(c));
		
		// 25. indexOf : 이 문자열 안의 index를 리턴함
		LOGGER.debug("s.indexOf" + s.indexOf(c));
		
		// 26. indexOf : substring 문자열 안의 index를 리턴한다.
		LOGGER.debug("s.indexOf" + s.indexOf(s));
		
		// 27. indexOf : substring 문자열 안의 특정한 index를 리턴한다.
		LOGGER.debug("s.indexOf" + s.indexOf(s, c));
		
		
		String p = "1,2,3,4";
		String[] words = p.split(",");
		for (int i = 0; i < words.length; i++) {
			LOGGER.debug(words[i]);
		}
	}
}
