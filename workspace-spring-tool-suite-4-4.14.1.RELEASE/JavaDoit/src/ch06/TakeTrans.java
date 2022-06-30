package ch06;

public class TakeTrans {

	public static void main(String[] args) {
		
		Student james = new Student("james", 5000);
		Student tomas = new Student("Tomas", 10000);
		
		Bus bus100 = new Bus(100);
		
		james.takeBus(bus100); //위에 생성된 bus100이 인자로 들어가야함.
		//학생 클래스에서 takeBus 메소드를 호출하고
		//거기에 등록된 bus 클래스 take 메소드를 호출해서 
		//돈을 벌고 승객을 증가시킴. 
		james.showInfo();
		bus100.showInfo();
		
		Subway subwayGreen = new Subway(2);
		
		tomas.takeSubway(subwayGreen);
		tomas.showInfo();
		subwayGreen.showInfo();
		
	}

}
