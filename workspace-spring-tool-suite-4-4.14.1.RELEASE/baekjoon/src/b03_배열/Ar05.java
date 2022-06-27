package b03_배열;

import java.util.Scanner;

public class Ar05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		
		int a[] = new int[N];
		
		for(int i = 0; i < N; i++) {
			a[i] = scanner.nextInt();
		}

		long sum = 0;
		long max = 0;
		
		for(int i = 0; i < N; i++) {
			if(a[i] > max) {
				max = a[i];
				sum = sum + a[i];
			}
		}
		System.out.println(sum * 100.0 / max / N);
	}

}
