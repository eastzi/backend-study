package J16_스태틱.student;

public class StudentMain {

	public static void main(String[] args) {
		Student s1 = new Student("홍길동", 3);
		Student s2 = new Student("홍길동", 1);
		Student s3 = new Student("홍길동", 3);
		Student s4 = new Student("홍길동", 2);
		Student s5 = new Student("홍길동", 5);
		
		s1.method();
		s2.method();
		s3.method();
		s4.method();
		s5.method();

	}

}
