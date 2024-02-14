import com.opensymphony.xwork2.ActionSupport;

public class RegisterAction extends ActionSupport{
	
	String firstName;
	String lastName;
	String gender;
	String emailId;
	Integer age;
	

	public String execute()
	{
		System.out.println("Execute method called.");
		return "success";
	}
	
//	public void validate ()
//	{
//		if(null==firstName || firstName.equalsIgnoreCase(""))
//		{
//			addFieldError("firstName", "First name is required.");
//		}
//		
//		if(null==lastName || lastName.equalsIgnoreCase(""))
//		{
//			addFieldError("lastName", "Last name is required.");
//		}
//		if(null==gender || gender.equalsIgnoreCase(""))
//		{
//			addFieldError("gender", "Gender is required.");
//		}
//		if(null==age)
//		{
//			addFieldError("age", "Age is required.");
//		}
//		else if(age<18)
//		{
//			addFieldError("age", "Age should be above 18.");
//		}
//		if(null==emailId || emailId.equalsIgnoreCase(""))
//		{
//			addFieldError("emailId", "Email ID is required.");
//		}
//	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	
}
