package connection.util;

import java.sql.Connection;

import javax.naming.InitialContext;
import javax.sql.DataSource;

public class ConnectionUtil {
	public static Connection getConnection() {
		Connection con = null;

		try {
			/*
			 * Class.forName("com.mysql.cj.jdbc.Driver"); con =
			 * DriverManager.getConnection("jdbc:mysql://localhost:3306/shadi", "root",
			 * "open6162");
			 */
			InitialContext i=new InitialContext();
			DataSource ds=(DataSource) i.lookup("java:comp/env/java");
		 con = ds.getConnection();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}
}
