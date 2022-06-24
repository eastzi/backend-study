package J07_클래스;

public class User {
	String name;
	String age;
	String phone;
	String address;
	
	User() {
		System.out.println("생성");
	}
	
	User(String name) {
		this.name = name;
	}
	
	User(String name, String age, String phone, String address) {
		this.name = name;
		this.age = age;
		this.phone = phone;
		this.address = address;
	}
	
	void setName(String name) {
		System.out.println("setName 매소드 안에서 호출: " + this);
		this.name =  name;
	}
}
