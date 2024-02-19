import java.sql.*;

public class CallableStatementTest {

	public static void main(String[] args) {
		System.out.println("Connecting to the database...");
		Connection conn = null;
		try 
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			// Login as Admin goto cmd -> enter ->  sqlplus / as sysdba
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "shrutiak", "Iferg");
			System.out.println("Connection successful.");

//			CallableStatement cst = conn.prepareCall("{call insertEmployee(?,?,?)}");
//			cst.setInt(1, 3);
//			cst.setString(2, "Shrikant");
//			cst.setInt(3, 100000);
//			int n = cst.executeUpdate();
			
			CallableStatement cst = conn.prepareCall("{call getemployeebyid(?,?,?)}");
			cst.setInt(1, 3);
			cst.registerOutParameter(2, java.sql.Types.VARCHAR);
			cst.registerOutParameter(3, java.sql.Types.INTEGER);
			int n = cst.executeUpdate();
			
			System.out.println("Number of rows updated = "+ n);
			
			System.out.println(cst.getObject(2)+" "+cst.getObject(3));
			
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
