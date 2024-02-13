
public class TestAction {
	
	String message;
	String firstName;
	
	public String execute()
	{
		System.out.println("Execute method called.");
		message = "SUCCESS";
		System.out.println("Name: "+firstName);
		return "success";
	}
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
} 
