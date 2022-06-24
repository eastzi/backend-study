package b03_배열;

import java.util.Scanner;

public class Ar02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		int[] arr = new int[9];
		
		for(int i = 0; i < 9; i++) {
			arr[i] = scanner.nextInt();
		}
		
		int count = 0;
		int max = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
				count = i;
			}
		}
		System.out.println(max);
		System.out.println(count + 1);
		

	}
}
