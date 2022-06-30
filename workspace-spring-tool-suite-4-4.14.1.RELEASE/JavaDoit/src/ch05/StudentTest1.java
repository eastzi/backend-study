package ch05;

public class StudentTest1 {

	public static void main(String[] args) {
		//student1 참조변수는 스택메모리에 생성
		//new student로 생성된 인스턴스는 힙메모리에 생성 
		//참조변수는 힙메모리에 생성된 인스턴스를 가르킴 = 힙메모리 주소를 참조변수에 대입함. 
		//student1, student2 이 가르키는 인스턴스는 각각의 공간을 가짐. 
		
		Student student1 = new Student();
		//student1.studentName = "안연수"; //멤버변수 사용
		student1.setStudentNmae("안연수");
		System.out.println(student1.getStudentName()); //메소드 사용
		
		Student student2 = new Student();
		//student2.studentName = "안승연";
		student2.setStudentNmae("안승연");
		System.out.println(student2.getStudentName());
		

	}

}
