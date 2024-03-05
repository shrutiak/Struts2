package pojo;

public class LoginInfo {
	
	private int id;
	private String username;
	private String password;
	private String isActive;
	private String createdDate;
	private String updatedDate;
	
	public LoginInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public LoginInfo(int id, String username, String password, String isActive, String createdDate,
			String updatedDate) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.isActive = isActive;
		this.createdDate = createdDate;
		this.updatedDate = updatedDate;
	}

	@Override
	public String toString() {
		return "LoginInfo [id=" + id + ", username=" + username + ", password=" + password + ", isActive=" + isActive
				+ ", createdDate=" + createdDate + ", updatedDate=" + updatedDate + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getIsActive() {
		return isActive;
	}

	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}

	public String getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}

	public String getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(String updatedDate) {
		this.updatedDate = updatedDate;
	}
	
}
