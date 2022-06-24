package J08_접근지정자;

import J08_접근지정자.a.Student;
import J08_접근지정자.b.Teacher;

public class UserMain {

	public static void main(String[] args) {
		Student student = new Student();
		Teacher teacher = new Teacher();
		
		student.setName("홍길동");
		System.out.println(student.getName());
		
		teacher.setName("김준일");
		teacher.setAddress("부산");
		teacher.setPhone("010-0000-0000");
		teacher.showInfo();
	}

}
