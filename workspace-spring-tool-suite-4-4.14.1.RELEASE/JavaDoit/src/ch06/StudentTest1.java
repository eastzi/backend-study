package ch06;



public class StudentTest1 {
	public static void main(String[] args) {
		StudentLee studentLee = new StudentLee();
		studentLee.setStudentName("이지원");
		System.out.println(studentLee.serialNum);
		studentLee.serialNum++;
		
		StudentLee studentSon = new StudentLee();
		studentSon.setStudentName("손수경");
		System.out.println(studentSon.serialNum);
		System.out.println(studentLee.serialNum);
	}
}
