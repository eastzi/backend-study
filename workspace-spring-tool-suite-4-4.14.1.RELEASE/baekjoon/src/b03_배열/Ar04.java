package b03_배열;

import java.util.Scanner;

public class Ar04 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int [] arr = new int[10];
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		
		int sum = a * b * c;
		
		while(sum > 0) {
			arr[sum % 10]++;
			sum /= 10;
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
	}

}
