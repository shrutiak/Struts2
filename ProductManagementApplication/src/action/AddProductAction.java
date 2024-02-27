package action;

import dao.ProductManagementDAO;

public class AddProductAction {
	
	String name;
	String category;
	Integer price;
	String message;
	
	public String execute()
	{
		System.out.println("AddProductAction execute method called.");
		String status = "error";
		
		try
		{
			int isProductAdded = ProductManagementDAO.insertProduct(name, category, price);
			System.out.println("isProductAdded = "+isProductAdded);
			
			if(isProductAdded>0)
				status = "success";
		}catch(Exception e)
		{
			if(null==name || name.equalsIgnoreCase(""))
				message = "Name should not be null.";
			else if(null==price )
				message = "Price should not be null.";
			else
				message = "There is some error.";
			
			return status;
		}	
		
		return status;	
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

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
}
