package J09_클래스기본정리.repository;

public class User {
	private String usercode;
	private String email;
	private String name;
	private String username;
	private String password;
	
	//기본생성자
	public User() {}

	//전체생성자 - 인스턴스 생성과 초기화를 동시에 
	public User(String usercode, String email, String name, String username, String password) {
		this.usercode = usercode;
		this.email = email;
		this.name = name;
		this.username = username;
		this.password = password;
	}

	public String getUsercode() {
		return usercode;
	}

	public void setUsercode(String usercode) {
		this.usercode = usercode;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	@Override
	public String toString() {
		return "User [usercode=" + usercode + ", email=" + email + ", name=" + name + ", username=" + username
				+ ", password=" + password + "]";
	}
	
	
	
	

}
