package package01;

public class J01_변수와상수 {

	public static void main(String[] args) {
		char name1 = '이';
		char name2 = '스';
		char name3 = '트';
		char name4 = '지';
		int age = 10;
		String phone = "010-1234-5678";
		String address = "부산광역시";
		
		System.out.print("이름: ");
		System.out.print(name1);
		System.out.print(name2);
		System.out.print(name3);
		System.out.println(name4);
		System.out.println("" + name1 + name2 + name3 + name4);
		
		System.out.println("당신의 나이는 몇살 입니까?");
		System.out.println("제 나이는 " + age + "살" + " 입니다.");
		
		System.out.println("연락처는 무엇인가요?");
		System.out.print("연락처는 ");
		System.out.println(phone);

		System.out.println("주소는 무엇입니까?");
		System.out.print("주소는 ");
		System.out.println(address);

		
		final int num = 10;
		final double num2 = 3.14;
		final char b = 'A';

	}

}
