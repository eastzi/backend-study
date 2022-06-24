package b02_반복문;

import java.util.Scanner;

public class For13 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while(scanner.hasNextInt()) {
			int A = scanner.nextInt();
			int B = scanner.nextInt();
			
			System.out.println(A + B);
		}
	}

}
