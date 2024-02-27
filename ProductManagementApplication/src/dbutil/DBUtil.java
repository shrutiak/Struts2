package dbutil;

import java.sql.*;

public abstract class DBUtil {
	
	public static Connection getConnection() 
	{
		Connection conn = null;
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "shrutiak", "Iferg");
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return conn;	
	}
	
	public static void closeConnection(Connection conn)
	{
		try
		{
			if(null!=conn)
				conn.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static void closePreparedStatement(PreparedStatement pst)
	{
		try
		{
			if(null!=pst)
				pst.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static void closeResultSet(ResultSet rs)
	{
		try
		{
			if(null!=rs)
				rs.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
