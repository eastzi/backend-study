package b01_조건문;

import java.util.Scanner;

public class If05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int H = scanner.nextInt();
		int M = scanner.nextInt();
		
		if(M > 46) { 
			System.out.println(H + " " + (M - 45));
		}else if(H == 0) {
			System.out.println(23);
		}else {
			System.out.println(H - 1);
		}
		System.out.println(" " + (M + 15));
	}

}
