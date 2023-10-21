package homework.jjbae.lottery;

import java.util.HashSet;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LotteryImpl implements LotteryInterface {
	private static Logger LOGGER = LoggerFactory.getLogger(LotteryImpl.class);
	
	private final int MAX_NUM = 10;
	
	@Override
	public Set<Integer> generateNum() {
		// TODO Auto-generated method stub
		Set<Integer> set = new HashSet<>();
		while (set.size() <  6) {
			int num = (int)(Math.random() * MAX_NUM) + 1;
			LOGGER.debug("num:" + num);
			
			set.add(num);
		}
		
		return set;
	}

}
