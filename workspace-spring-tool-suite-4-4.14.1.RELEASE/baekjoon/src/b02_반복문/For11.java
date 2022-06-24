package b02_반복문;

import java.util.Scanner;

public class For11 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();
		int X = scanner.nextInt();
		
		for(int i =0; i < N; i++) {
			int A = scanner.nextInt();
			if(A < X) {
				System.out.println(A + " ");
			}
		}
		
	}

}
