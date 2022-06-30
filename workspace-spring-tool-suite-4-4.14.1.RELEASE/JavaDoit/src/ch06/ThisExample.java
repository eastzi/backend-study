package ch06;

class BirthDay {
	int day;
	int month;
	int year;

	//year = BirthDay year 
	public void setYear(int year) {
		this.year = year; //birthDay 인스턴스 year에 year를 대입
	}
	
	public void printThis() {
		System.out.println(this);
	}
	
}

public class ThisExample {
	public static void main(String[] args) {
		BirthDay bDay = new BirthDay();
		bDay.setYear(2000);
		System.out.println(bDay);
		bDay.printThis();
		
//		BirthDay b1 = new BirthDay();
//		BirthDay b2 = new BirthDay();
//		
//		System.out.println(b1);
//		System.out.println(b2);
		
	}
}
