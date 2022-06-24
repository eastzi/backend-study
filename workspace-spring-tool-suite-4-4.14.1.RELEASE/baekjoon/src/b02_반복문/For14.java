package b02_반복문;

import java.util.Scanner;

public class For14 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();
		
		int a = 0;
		int copy = N;
		
		while(true) {
			N = ((N%10)*10) + (((N / 10) + (N % 10)) % 10);
			a++;
			
			if(copy == N) {
				break;
			}
		}
		System.out.println(a);
		
	}

}
