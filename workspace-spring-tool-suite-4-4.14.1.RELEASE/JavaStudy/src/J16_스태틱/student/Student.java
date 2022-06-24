package J16_스태틱.student;

public class Student {

	private static int auto_increment = 20220000;
	private int student_code;
	private String student_name;
	private int student_year;
	
	public Student(String student_name, int student_year) {
		this.student_code = ++auto_increment;
		this.student_name = student_name;
		this.student_year = student_year;
	}
	
	public void method() {
		System.out.println("학번: " + student_code);
		System.out.println("이름: " + student_name);
		System.out.println("학년: " + student_year);
		System.out.println();
	}
	
}
