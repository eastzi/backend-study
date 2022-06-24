package b01_조건문;

import java.util.Scanner;

public class If07 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		int num3 = scanner.nextInt();
		
		if(num1 == num2 && num2 == num3) {
			System.out.println(10000 + num1*1000); 
		}else if(num1 == num2 || num1 == num3) {
			System.out.println(1000 + num1*100);
		}else if(num2 == num3) {
			System.out.println(1000 + num2*100);
		}else {
			System.out.println(Math.max
					(num1, Math.max(num2, num3))*100);
//			int max = num1;
//			if(max < num2) {
//				max = num2;
//			}
//			if(max < num3) {
//				max = num3;
//			}
//			System.out.println(max * 100);
		}
	}

}
