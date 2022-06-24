package package01;

import java.util.Scanner;

public class J03_입력 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String str = null;
		String str2 = null;
		int num1 = 0;
		double num2 = 0;
		
		num1 = scanner.nextInt();
		str = scanner.next();
		num2 = scanner.nextDouble();
		
		System.out.println("num1: " + num1);
		System.out.println("str: " + str);
		System.out.println("num2: " + num2);
		
		
		

	}

}
