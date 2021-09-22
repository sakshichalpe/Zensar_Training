package implementation;

	/*import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.SQLException;

	public class ConnectionFactory {

		static final String URL="jdbc:mysql://localhost:3306/bookstore";
		static final String USER="root";
		static final String PASS="root";
		
		public  static Connection getConnection() throws SQLException
		{
			Connection connection=null;
			connection=DriverManager.getConnection(URL,USER,PASS);
			return connection;
		}


	}

*/
import java.sql.*;
import java.sql.SQLException;

public class ConnectionFactory 
{
	public static final String JDBC_DRIVER="com.mysql.cj.jdbc.Driver";
	public static final String JDBC_URL="jdbc:mysql://localhost:3306/hr_management";
	
	public static final String USER="root";
	public static final String PASS="Root";
	static Connection conn=null;
	
	public static Connection getConnection()
	{
		try
		{
			Class.forName(JDBC_DRIVER);
			System.out.println("Driver Loaded.....");
			System.out.println("Connecting to Database.....");
			conn=DriverManager.getConnection(JDBC_URL, USER,PASS);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return conn;
	}
			
	
	public static void main(String[] args)
	{
		Connection connection=ConnectionFactory .getConnection();
		if(conn!=null)
		{
			System.out.println("Successfully Connected");
		}
		else
			System.out.println("Unsuccessful");
		// TODO Auto-generated method stub

	}

}