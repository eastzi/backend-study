package baekjoon1;

import java.util.Scanner;

public class back2588 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("num1 숫자를 입력하세요: ");
		int num1 = scanner.nextInt();
		System.out.println("num2 숫자를 입력하세요: ");
		int num2 = scanner.nextInt();
		
		System.out.println(num1 * (num2 % 10));
		System.out.println(num1 * (num2 % 100 / 10));
		System.out.println(num1 * (num2 / 100));
		System.out.println(num1 * num2);
	}

}
