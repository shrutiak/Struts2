package action;

import dao.LoginDAO;

public class LoginAction {
	
	private String username;
	private String password;
	private String message;
	
	public String execute()
	{
		System.out.println("Login execute method called.");
		String status = "error";
		System.out.println("status = "+status+" username = "+username+" password = "+password);
		
		boolean isValid = LoginDAO.isValidUser(username, password);
		
		if(isValid)
			status = "success";
		else
			message = "Invalid username or password.";
		
		return status;
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
}
