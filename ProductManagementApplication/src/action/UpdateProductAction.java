package action;

import dao.ProductManagementDAO;

public class UpdateProductAction {
	
	Integer id;
	String name;
	String category;
	Integer price;
	String message;
	
	public String populateProductDetails()
	{
		System.out.println("UpdateProductAction populateProductDetails method called.\n id = "+id+" name = "+name+
				" category = "+category+" price = "+price);

		return "input";
	}
	
	public String execute()
	{
		System.out.println("UpdateProductAction execute method called.\n id = "+id+" name = "+name+" category = "+
				category+" price = "+price);
		String status = "error";

		try
		{
			if(null==name || name.equalsIgnoreCase(""))
				message = "Name should not be null.";
			else if(null==price )
				message = "Price should not be null.";
			else
			{
				int isProductUpdated = ProductManagementDAO.updateProduct(id, name, category, price);
				System.out.println("isProductUpdated = "+isProductUpdated);

				if(isProductUpdated>0)
					status = "success";
			}
			
		}catch(Exception e)
		{
			message = "There is some error.";

			return status;
		}	
		return status;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
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
