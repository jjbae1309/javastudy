package homework.jjbae.calc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CalcMain {
	private static Logger LOGGER = LoggerFactory.getLogger(CalcMain.class);
	
	public static void main(String[] args) {
		CalcImpl calcmain = new CalcImpl();
		
		int result = calcmain.add(5, 5);
		LOGGER.debug("result:" + result);
		
		result = calcmain.substract(5, 5);
		LOGGER.debug("result:" + result);
		
		result = calcmain.multiply(5, 5);
		LOGGER.debug("result:" + result);

		result = calcmain.devide(5, 5);
		LOGGER.debug("result:" + result);
	}
}
