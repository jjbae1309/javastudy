package study01.datastructureHomework.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.codehaus.jackson.map.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JsonTest {
	private static Logger LOGGER = LoggerFactory.getLogger(JsonTest.class);
	
	public static void main(String[] args) {
		try {
			ObjectMapper mapper = new ObjectMapper();
			
			Map<String, Object> map = new HashMap<>();
			
			map.put("squadName", "Super hero squad");
			map.put("homeTown", "Metro City");
			map.put("formed", 2016);

			List memberList = new ArrayList();
			
			Map<String, Object> oneMemberMap = new HashMap<>();
			oneMemberMap.put("name", "Molecule Man");
			oneMemberMap.put("age", 29);
			
			memberList.add(oneMemberMap);
			
			map.put("members", memberList);

	
			String jsonValue = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(map);
			
			//LOGGER.debug(jsonValue);
			
			System.out.println(jsonValue);
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
