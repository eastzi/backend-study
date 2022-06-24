package J03_입력;

import java.util.Scanner;

public class Input02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String a = null;
		String b = null;
		char c = 0;
		int d = 0;
		double e = 0;
		
		System.out.print("문자열1 입력: ");
		a = scanner.nextLine();
		System.out.print("문자열2 입력: ");
		b = scanner.next();
		System.out.print("문자입력: ");
		c = scanner.next().charAt(0);
		System.out.print("정수 입력: ");
		d = scanner.nextInt();
		System.out.print("실수 입력: ");
		e = scanner.nextDouble();
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		
		
	}

}
