package ch05;

public class Student {
	//멤버변수 -> 클래스 내용 구현(속성을 변수로 선언) 
	int studentID;
	String studentName;
	int grade;
	String address;
	
 	public void showStudentInfo() {
		System.out.println(studentName + "," + address); 
	}
 	
 	public String getStudentName() {
 		return studentName;
 	}
 	
 	public void setStudentNmae(String name) { //set메소드는 이름을 전달받아 지정하는 것 => 매개변수 name이 필요함. 
  		studentName = name; //name 을 studentName에 대입하면 이름이 지정됨. 
 	}
 	
 	public static void main(String[] args) {
		Student studentAhn = new Student(); //student class 생성
		studentAhn.studentName = "안연수";
		
		System.out.println(studentAhn.studentName);
		System.out.println(studentAhn.getStudentName());
	}
}
