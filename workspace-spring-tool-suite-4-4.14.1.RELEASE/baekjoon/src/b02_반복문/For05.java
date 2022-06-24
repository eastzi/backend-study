package b02_반복문;

import java.util.Scanner;

public class For05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();
		for(int i = 0; i < N+1; i++) {
			if(i != 0) {
				System.out.println(i);				
			}
		}

	}

}
