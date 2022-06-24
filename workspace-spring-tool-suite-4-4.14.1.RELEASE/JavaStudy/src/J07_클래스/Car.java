package J07_클래스;

public class Car {
	String company;
	String model;
	String color; 
	
	void showCompanyInfo() {
		System.out.println(company + "회사에서 제조된 차량입니다.");
	}
	
	void showInfoAll() {
		System.out.println("제조사: " + company);
		System.out.println("모델: " + model);
		System.out.println("색상: " + color);
	}
	
	String getCar() {
		return company + "_" + model + "_" + color;
	}
	
	void setColor(String color) {
		this.color = color; 
	}
}
