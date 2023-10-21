package dad03.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DBTest {
	private static Logger LOGGER = LoggerFactory.getLogger(DBTest.class);
	
	public static void main(String[] args) {
		try {
			// 어떤 JDBC 드라이버를 사용할지 지정한다.
			Class.forName("org.mariadb.jdbc.Driver");
			
			// DB 연결정보(url, userId, passwd)를 정보를 만든다.
			String url="jdbc:mariadb://localhost:3306/JJBAE?useUnicode=true&characterEncoding=utf8";
            String userId="root";
            String userPass="qowowns1!";
            
            // DB 연결 정보를 가지고 connection(연결)을 만든다.
			Connection conn = DriverManager.getConnection(url, userId, userPass);
			// 연결을 통해 Statement를 만든다.
			Statement stmt = conn.createStatement();
			// statement를 통해 조회(executeQuery)한다.
			ResultSet resultSet = stmt.executeQuery("SELECT * FROM ADDRESS_BOOK");
			while (resultSet.next()) {
				String seqNum = resultSet.getString(1);
				String name = resultSet.getString(2);
				
				LOGGER.debug(String.format("seqNum=%s, name=%s", seqNum, name));
			}
		}
		catch (Exception ex) {
			LOGGER.error(ex.getMessage(), ex);
		}
	}
}
