package test;

public class Student {
	//멤버변수 
	int studentID;
	String studentName;
	int grade;
	String address;
	
	//디폴트 생성자
	public Student() {}
	
	//ID를 매개변수로 받는 생성자
	public Student(int s1ID) {
		studentID = s1ID;
	}
	
	//ID와 Name을 매개변수로 받는 생성자
	public Student(int s1ID, String s1Name) {
		studentID = s1ID;
		studentName = s1Name;
	}
}
 