import java.sql.*;

public class CRUDTest {

	public static void main(String[] args) {

		System.out.println("Connecting to the database...");
		Connection conn = null;
		
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "shrutiak", "Iferg");
			System.out.println("Connection successful.");
			
			int n = 0;
			
			//Using Statement
//			String createQuery = "create table employee(emp_id number, emp_name varchar2(30), emp_salary number)";
//			String insertQuery = "Insert into employee (emp_id, emp_name, emp_salary) values (3, 'Shrikant', 30000)";
//			String updateQuery = "Update employee set emp_salary = 90000 where emp_name = 'Abhijit'";
//			String deleteQuery = "delete employee where emp_name = 'Shrikant'";
//			
//			Statement st = conn.createStatement();
//			n = st.executeUpdate(deleteQuery); 
//			
//			System.out.println("Number of rows updated = "+ n);
			
			//Using PreparedStatement
			
			String createQueryPS = "create table employee(emp_id number, emp_name varchar2(30), emp_salary number)";
			String insertQueryPS = "Insert into employee (emp_id, emp_name, emp_salary) values (?, ?, ?)";
			String updateQueryPS = "Update employee set emp_salary = ? where emp_name = ?";
			String deleteQueryPS = "delete employee where emp_name = ?";
			
			PreparedStatement pst = conn.prepareStatement(deleteQueryPS);
//			pst.setInt(1, 3777777);
			pst.setString(1, "Shrikant");
//			pst.setInt(3, 30000);
			n = pst.executeUpdate();
			
			System.out.println("Number of rows updated = "+ n);
			
		}catch (Exception e) {
			e.printStackTrace();
		}finally
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
