package action;

import java.util.List;

import dao.ProductManagementDAO;
import pojo.Product;

public class ProductsAction {
	
	List<Product> products;
	
	public String execute() 
	{
		System.out.println("ProductsAction execute method called.");
		products =  ProductManagementDAO.getAllProducts();
		System.out.println("Total products = "+products.size());
		return "input";
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}
	
}
