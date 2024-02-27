package action;

import dao.ProductManagementDAO;

public class DeleteProductAction {

	Integer id;
	String message;
	
	public String execute()
	{
		System.out.println("DeleteProductAction execute method called.\nid = "+id);
		String status = "error";
		
		try
		{
			int isProductDeleted = ProductManagementDAO.deleteProduct(id);
			System.out.println("isProductDeleted = "+isProductDeleted);
			
			if(isProductDeleted>0)
				status = "success";
			
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

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
