package b02_반복문;

import java.util.Scanner;

public class For10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();
		
		for(int i = 0; i < N; i++) {
			for(int k = 0; k < (N-1) - i; k++) {
				System.out.print(" ");
			}
			for(int j = 0; j < i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
