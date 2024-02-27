package action;

import dao.LoginDAO;

public class SignInAction {
	
	private String username;
	private String password;
	private String confirmPassword;
	private String message;
	
	public String execute()
	{
		System.out.println("SignIn execute method called.");
		String status = "error";
		int isUserAdded = 0;
		System.out.println("status = "+status+" username = "+username+" password = "+password+" confirmPassword = "+confirmPassword);
		
		if(null==username || username.equalsIgnoreCase(""))
			message = "Username cannot be null.";
		else if(null==password || password.equalsIgnoreCase(""))
			message = "Password cannot be null.";
		else if(null==confirmPassword || confirmPassword.equalsIgnoreCase("") || !confirmPassword.equalsIgnoreCase(password))
			message = "Please confirm password once again.";
		else
		{
			isUserAdded = LoginDAO.addNewUser(username, password);
			
			if(isUserAdded>0)
				status = "success";
			else
				message = "There is some error while signing in.";
		}
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

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
}
