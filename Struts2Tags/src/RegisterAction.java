import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

public class RegisterAction extends ActionSupport{

	String firstName;
	String lastName;
	String gender;
	Integer age;
	String emailId;
	String address;
	String favoriteColor;
	String hobbies;
	List<String> colors;
	List<String> hobbiesList;
	boolean subscription;
	List<Product> products;

	public String populateFormFields()
	{
		populateColors();
		populateHobbiesList();
		populateProdctList();
		return "input";
	}
	public void populateColors() 
	{
		colors = new ArrayList<String>();
		colors.add("Blue");
		colors.add("Red");
		colors.add("Green");
		colors.add("White");	
	}

	public void populateHobbiesList() 
	{
		hobbiesList = new ArrayList<String>();
		hobbiesList.add("Reading");
		hobbiesList.add("Painting");
		hobbiesList.add("Swimmimg");
		hobbiesList.add("Music");	
	}

	public void populateProdctList()
	{
		products = new ArrayList<Product>();
		products.add(new Product(1,"Mobile",100));
		products.add(new Product(2,"Camera",200));
		products.add(new Product(3,"TV",300));
		products.add(new Product(4,"Bike",400));	
	}

	public String execute()
	{
		System.out.println("Execute method called.");
		if(subscription)
		{
			System.out.println("You are a subscriber.");
		}
		else
		{
			System.out.println("You are not a subscriber.");
		}
		return "success";
	}

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

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getFavoriteColor() {
		return favoriteColor;
	}

	public void setFavoriteColor(String favoriteColor) {
		this.favoriteColor = favoriteColor;
	}

	public String getHobbies() {
		return hobbies;
	}

	public void setHobbies(String hobbies) {
		this.hobbies = hobbies;
	}
	public List<String> getColors() {
		return colors;
	}
	public void setColors(List<String> colors) {
		this.colors = colors;
	}
	public List<String> getHobbiesList() {
		return hobbiesList;
	}
	public void setHobbiesList(List<String> hobbiesList) {
		this.hobbiesList = hobbiesList;
	}
	public boolean isSubscription() {
		return subscription;
	}
	public void setSubscription(boolean subscription) {
		this.subscription = subscription;
	}
	public List<Product> getProducts() {
		return products;
	}
	public void setProducts(List<Product> products) {
		this.products = products;
	}

}
