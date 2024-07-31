import java.sql.*;
public class DBConnection 
{
	public static Connection dbconnect() throws Exception 
	{
		String url="jdbc:mysql://localhost:3306/employeedb";
		String username = "root";
		String password = "jeffy";
		Connection con = DriverManager.getConnection(url,username,password);
		return con;
	}
}
