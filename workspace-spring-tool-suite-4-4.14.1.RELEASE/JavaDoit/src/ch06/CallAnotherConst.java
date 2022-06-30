package ch06;

class Person {
	String name;
	int age; 
	
	Person() {
		this("이름없음", 1); //밑에 동일한 형태의 생성자가 있기때문에
		//밑에 생성자를 this로 해서 부를 수 있음. 
		//매개변수 데이터타입이 맞으면 여러개의 생성자가 있어도 호출됨
		//단, this 전에 다른 코드 사용 불가. this가 제일 먼저 나와야함.
	}
	
	Person(String name, int age) {//Person을 만들때 name, age를 매개변수로 받겟다
		this.name = name;
		this.age = age;
	}
	
	public Person returnSelf() {
		return this;
	}
}

public class CallAnotherConst {

	public static void main(String[] args) {
		Person noName = new Person();
		System.out.println(noName.name);
		
		System.out.println(noName.returnSelf());

	}

}
