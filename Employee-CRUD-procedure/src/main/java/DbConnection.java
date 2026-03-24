import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection {
	public static Connection getConnection() {
		
		Connection connection=null;
		
		String name="root";
		String password="vetri@1234";
		String url="jdbc:mysql://localhost:3306/testdb";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			connection =DriverManager.getConnection(url,name,password);
	
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return connection;
	}
}
