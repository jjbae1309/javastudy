package homework.jjbae.language;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LanguageMain {
	private static Logger LOGGER = LoggerFactory.getLogger(LanguageMain.class);
	
	public static void main(String[] args) {
		LanguageInterface lang = new Chinese();
		LOGGER.debug(lang.greeting());
	}
}
