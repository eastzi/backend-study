package package01;

public class Car {
	
	String name;
	String company;
	String model;
	String color;
	
	void showNameInfo() {
		System.out.println("고객명 : " + name);
	}
	
	void showInfoAll() {
		System.out.println("company: " + company);
		System.out.println("model: " + model);
		System.out.println("color: " + color);
	}

	public Car(String name, String company, String model, String color) {
		super();
		this.name = name;
		this.company = company;
		this.model = model;
		this.color = color;
	}

	

	
	
}
