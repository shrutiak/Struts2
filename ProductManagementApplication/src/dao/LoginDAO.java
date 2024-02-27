package dao;

import java.sql.*;

import dbutil.DBUtil;

public class LoginDAO {
	
	public static boolean isValidUser(String username, String password)
	{
		System.out.println("isValidUser method called.");
		boolean isValid = false;
		PreparedStatement pst = null;
		ResultSet rs = null;
		Connection conn = null;
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "shrutiak", "Iferg");
			pst = conn.prepareStatement("select * from login_info where username = ? and password = ? and isActive = 'Y'");
			pst.setString(1, username);
			pst.setString(2, password);
			rs = pst.executeQuery();
			
			if(rs.next())
			{
				isValid = true;
				System.out.println(username+ " and "+password+ " is valid login info.");
			}
				
		}catch(Exception e)
		{
			e.printStackTrace();
		}finally
		{
			DBUtil.closeConnection(conn);
			DBUtil.closePreparedStatement(pst);
			DBUtil.closeResultSet(rs);
		}
		return isValid;
	}
	
	public static int addNewUser(String username, String password)
	{
		System.out.println("addNewUser method called.");
		PreparedStatement pst = null;
		int rs = 0;
		Connection conn = null;
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "shrutiak", "Iferg");
			pst = conn.prepareStatement("insert into login_info values( login_seq.NEXTVAL , ? , ? , 'Y' )");
			pst.setString(1, username);
			pst.setString(2, password);
			rs = pst.executeUpdate();
				
		}catch(Exception e)
		{
			e.printStackTrace();
		}finally
		{
			DBUtil.closeConnection(conn);
			DBUtil.closePreparedStatement(pst);
		}
		return rs;
	}
}
