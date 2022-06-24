package J03_입력;

import java.util.Scanner;

public class Input03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String name = null;
		int age = 0;
		String phone = null;
		String address = null;
		char gender = 0;
		
		System.out.println("[사용자 정보 입력]");
		System.out.print("이름: ");
		name = scanner.next();
		System.out.print("나이: ");
		age = scanner.nextInt();
		System.out.print("연락처: ");
		phone = scanner.next();
		scanner.nextLine();
		System.out.print("주소: ");
		address = scanner.nextLine();
		System.out.println("성별: ");
		gender = scanner.next().charAt(0);
		
		System.out.println("[사용자 정보 출력]");
		System.out.println("이름: " + name);
		System.out.println("나이: " + age);
		System.out.println("연락처: " + phone);
		System.out.println("주소: " + address);
		System.out.println("성별: " + gender);

	}

}
