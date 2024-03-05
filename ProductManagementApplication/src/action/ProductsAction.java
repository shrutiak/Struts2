package action;

import java.util.List;

import dao.ProductManagementDAO;
import pojo.Product;

public class ProductsAction {
	
	List<Product> products;
	private String name;
	private String category;
	private int price;
	
	public String execute() 
	{
		System.out.println("ProductsAction execute method called. name = "+name+" category = "+category+
				" price = "+price);
		products =  ProductManagementDAO.getAllProducts(name, category, price);
		System.out.println("Total products = "+products.size());
		return "input";
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
}
