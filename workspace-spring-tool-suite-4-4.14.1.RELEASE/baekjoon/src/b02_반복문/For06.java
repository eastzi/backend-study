package b02_반복문;

import java.util.Scanner;

public class For06 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();
		
		for(int i = N; i > 0; i--) {
				System.out.println(i);
		}

	}

}
