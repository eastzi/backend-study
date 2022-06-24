package b03_배열;

import java.util.Scanner;

public class Ar03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int max = 0;
		int cnt = 0;
		
		int [] arr = new int[9];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
				cnt = i + 1;
			}
		}
		
		System.out.println(max);
		System.out.println(cnt);
		
		

	}

}
