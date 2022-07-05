package test;

public class StuentMain {

	public static void main(String[] args) {

		Student studentHong = new Student();
		studentHong.studentID = 1000;
		studentHong.studentName = "홍길동";
		
		Student studentKim = new Student(1001, "김철수");
		
		System.out.println(studentHong.studentID);
		System.out.println(studentHong.studentName);
		System.out.println(studentKim.studentID);
		System.out.println(studentKim.studentName);
		
	}

}
