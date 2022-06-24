package package01;

import lombok.ToString;

public class CarMain {
		
	public static void main(String[] args) {
	
//		Car cus1 = new Car();
//		
//		cus1.name = "cus1";
//		cus1.company = "KIA";
//		cus1.model = "K7";
//		cus1.color = "white";
//		
//		cus1.showNameInfo();
//		cus1.showInfoAll();
//	
//		System.out.println("==================");
//		
//		Car cus2 = new Car();
//		
//		cus2.name = "cus2";
//		cus2.company = "KIA";
//		cus2.model = "K5";
//		cus2.color = "black";
//		
//		cus2.showNameInfo();
//		cus2.showInfoAll();
		
		Car cus1 = new Car("cus1", "KIA", "K7", "white");
		cus1.showNameInfo();
		cus1.showInfoAll();
	
		
	}

}
