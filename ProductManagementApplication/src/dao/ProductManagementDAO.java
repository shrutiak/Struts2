package dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import dbutil.DBUtil;
import pojo.Product;

public class ProductManagementDAO {

	public static List<Product> getAllProducts()
	{
		System.out.println("getAllProducts method called.");
		List<Product> productList = new ArrayList<Product>();
		PreparedStatement pst = null;
		ResultSet rs = null;
		Connection conn = null;
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "shrutiak", "Iferg");
			pst = conn.prepareStatement("select * from products where isDelete = 'N' order by id");
			rs = pst.executeQuery();
			
			while(rs.next())
			{
				Product product = new Product(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getString(5));
				System.out.println("Product = "+product.toString());
				productList.add(product);
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
		
		return productList;
	}
	
	public static Product getProduct(int id)
	{
		System.out.println("getProduct method called.");
		Product product = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		Connection conn = null;
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "shrutiak", "Iferg");
			pst = conn.prepareStatement("select * from products where isDelete = 'N' and id = ?");
			pst.setInt(1, id);
			rs = pst.executeQuery();
			
			while(rs.next())
			{
				product = new Product(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getString(5));
				System.out.println("Product = "+product.toString());		
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
		
		return product;
	}
	
	public static int insertProduct(String name, String category, int price)
	{
		PreparedStatement pst = null;
		int rs = 0;
		Connection conn = null;
		
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "shrutiak", "Iferg");
			pst = conn.prepareStatement("insert into products values(product_seq.NEXTVAL , ? , ? , ?, 'N')");
			pst.setString(1, name);
			pst.setString(2, category);
			pst.setInt(3, price);
			rs = pst.executeUpdate();
				
			System.out.println("Product inserted successfully. "+rs);
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
	
	public static int updateProduct(int id, String name, String category, int price)
	{
		PreparedStatement pst = null;
		int rs = 0;
		Connection conn = null;
		
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "shrutiak", "Iferg");
			pst = conn.prepareStatement("update products set name = ?, category = ?, price = ? where id = ?");
			pst.setString(1, name);
			pst.setString(2, category);
			pst.setInt(3, price);
			pst.setInt(4, id);
			rs = pst.executeUpdate();
				
			System.out.println("Product updated successfully. "+rs);
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
	
	public static int deleteProduct(int id)
	{
		PreparedStatement pst = null;
		int rs = 0;
		Connection conn = null;
		
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "shrutiak", "Iferg");
			pst = conn.prepareStatement("update products set isDelete = 'Y' where id = ?");
			pst.setInt(1, id);
			rs = pst.executeUpdate();
				
		}catch(Exception e)
		{  
			e.printStackTrace();
		}finally
		{
			DBUtil.closePreparedStatement(pst);
		}
		
		return rs;
	}
}
