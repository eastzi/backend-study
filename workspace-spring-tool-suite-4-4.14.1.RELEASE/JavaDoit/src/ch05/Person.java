package ch05;

public class Person {
	String name; 
	float height;
	float weight;
	
	//생성자 => 인스턴스 변수의 초기화 
	//default 생성자
	public Person() {
		
	}
	
	//이름을 매개변수로 입력받는 생성자
	public Person(String pname) {
		name = pname;
	}
	
	//이름, 키, 몸무게를 매개변수로 입력받는 생성자
	public Person(String pname, float pheight, float pweight) {
		name = pname;
		height = pheight;
		weight = pweight;
	}
}
