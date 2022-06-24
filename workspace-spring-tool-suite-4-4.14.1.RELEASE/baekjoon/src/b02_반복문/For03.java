package b02_반복문;

import java.util.Scanner;

public class For03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		int sum = 0;
		
		for(int i = 0; i < n + 1; i++) {
			sum += i;
		}
		
		System.out.println(sum);

	}

}
