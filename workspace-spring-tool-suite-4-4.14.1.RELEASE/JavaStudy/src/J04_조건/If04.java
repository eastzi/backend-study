package J04_조건;

import java.util.Scanner;

public class If04 {

	public static void main(String[] args) {
		/*
		 * 백준 14681문제 
		 * + 조건추가
		 * x == 0 || y == 0 --> 계산할 수 없습니다.
		 * x == 0 && y == 0 --> 원점입니다. 
		 * 
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		int x = 0; 
		int y = 0; 
		
		System.out.println("x: ");
		x = scanner.nextInt();
		System.out.println("y: ");
		y = scanner.nextInt();
		
		if((x > 1000 || y > 1000 || x < -1000 || y < -1000 || x == 0 || y == 0) 
				&& (x != 0 || y != 0)) {
			System.out.println("계산할 수 없습니다.");
		}else if(x > 0 && y > 0) {
			System.out.println("제 1사분면");
		}else if(x < 0 && y > 0) {
			System.out.println("제 2사분면");
		}else if(x < 0 && y < 0) {
			System.out.println("제 3사분면");
		}else if(x > 0 && y < 0) {
			System.out.println("제 4사분면");
		}else {
			System.out.println("원점");
		}

	}

}
