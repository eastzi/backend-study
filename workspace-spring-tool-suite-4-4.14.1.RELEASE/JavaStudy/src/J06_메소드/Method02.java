package J06_메소드;

public class Method02 {

	public static void test1(int age, int year) {
		System.out.println("나이: " + age);
		System.out.println("출생년도: " + year);
	}
	
	public static String test2(String name, int num) {
		return name + num;
	}
	
	public static void main(String[] args) {
		test1(10, 2000);
		System.out.println(test2("홍길동", 1));
	}

	
}
