package b02_반복문;

import java.util.Scanner;

public class For08 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int T = scanner.nextInt();
		
		for(int i = 0; i < T; i++) {
			int A = scanner.nextInt();
			int B = scanner.nextInt();
			int C = A + B;
			System.out.println("Case #" + (i + 1) + ": " + A + " + " + B + " = " + C);
		}

	}

}
