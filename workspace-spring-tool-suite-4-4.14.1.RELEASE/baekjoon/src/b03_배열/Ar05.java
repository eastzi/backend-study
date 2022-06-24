package b03_배열;

import java.util.Scanner;

public class Ar05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int sum = a % b;
		int[] arr = new int[9];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}

	}

}
