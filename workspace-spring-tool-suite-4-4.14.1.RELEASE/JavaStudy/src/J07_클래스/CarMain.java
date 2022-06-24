package J07_클래스;

public class CarMain {

	public static void main(String[] args) {
		Car c1 = new Car();
		Car c2 = new Car();
		Car c3 = new Car();
		
		c1.company = "KIA";
		c2.company = "현대자동차";
		c3.company = "Tesla";
		
		c1.model = "K7";
		c2.model = "소나타";
		c3.model = "Model3";
		
		c1.color = "black";
		c2.color = "white";
		c3.color = "red";
		
		c1.showCompanyInfo();
		c2.showCompanyInfo();
		c3.showCompanyInfo();
		
		System.out.println();
		
		c1.showInfoAll();
		c2.showInfoAll();
		c3.showInfoAll();
		
		System.out.println(c1.getCar());
		System.out.println(c2.getCar());
		System.out.println(c3.getCar());
		
		System.out.println();
		
		c1.setColor("blue");
		c2.setColor("grey");
		c3.setColor("green");
	}

}
