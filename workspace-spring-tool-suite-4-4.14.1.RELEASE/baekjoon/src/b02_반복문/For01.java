package b02_반복문;

import java.util.Scanner;

public class For01 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int num1 = scanner.nextInt();
		
		for(int num2 = 0; num2 < 9; num2++) {
			System.out.println(num1 + " * " + (num2 + 1) 
					+ " = " + num1 * (num2 + 1));
		}
	}

}
