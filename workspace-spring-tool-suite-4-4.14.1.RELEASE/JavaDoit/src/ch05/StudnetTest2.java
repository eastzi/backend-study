package ch05;

public class StudnetTest2 {

	public static void main(String[] args) {

		Student student1 = new Student();
		//student1.studentName = "안연수"; 
		student1.setStudentNmae("안연수");
		
		Student student2 = new Student();
		//student2.studentName = "안승연";
		student2.setStudentNmae("안승연");
		
		System.out.println(student1);
		System.out.println(student2);

	}

}
