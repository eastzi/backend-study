package J03_입력;

import java.util.Scanner;

public class Input01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("첫번째 값 입력: ");
		int num1 = scanner.nextInt();
		
		System.out.println("두번째 값 입력: ");
		int num2 = scanner.nextInt();
		
		System.out.println("입력한 값: " + (num1 + num2));
		
		scanner.next();
		scanner.nextLine();
		scanner.next().charAt(0);
		scanner.nextInt();
		scanner.nextDouble();

	}

}
