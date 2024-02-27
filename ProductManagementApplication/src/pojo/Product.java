package pojo;

public class Product {
	private int id;
	private String name;
	private String category;
	private int price;
	private String isDelete;
	
	public Product(int id, String name, String category, int price, String isDelete) {
		super();
		this.id = id;
		this.name = name;
		this.category = category;
		this.price = price;
		this.isDelete = isDelete;
	}

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", category=" + category + ", price=" + price + ", isDelete="
				+ isDelete + "]";
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
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
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

	public String getIsDelete() {
		return isDelete;
	}

	public void setIsDelete(String isDelete) {
		this.isDelete = isDelete;
	}
	
}
