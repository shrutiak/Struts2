import java.sql.*;

public class JDBCTest {

	public static void main(String[] args) {
		System.out.println("Connecting to the database...");
		Connection conn = null;
		try 
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			// Login as Admin goto cmd -> enter ->  sqlplus / as sysdba
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "shrutiak", "Iferg");
			System.out.println("Connection successful.");

			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery("select * from customers");

			while(rs.next())
			{
				System.out.println(rs.getObject(1)+" "+rs.getObject(2));
			}
			
		} catch (Exception e) 
		{
			e.printStackTrace();
		} finally
		{
			try 
			{
				conn.close();
			} catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
	}
}
