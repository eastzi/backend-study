package b03_배열;

import java.util.Scanner;

public class Ar01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();
		
		int[] arr = new int[N];
		
		for(int i = 0; i < N; i++) {
			arr[i] = scanner.nextInt();
		}
		
		int min = arr[0];
		int max = arr[0];
		
		for(int i = 0; i < N; i++) {
			if(min > arr[i]) {
				min = arr[i];
			}
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		
		System.out.println(min + " " + max);
		

	}

}
