package J05_반복;

import java.util.Scanner;

public class While03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int num = 0;
		System.out.print("반복 횟수를 입력하세요.");
		
		num = scanner.nextInt();
	
		int i = 0; //초기식
		while(i < num) { //조건식
			System.out.println(i + 1);
			i++; //증감식
		}
		
		i = 0; //초기식
		
		while(i < num) { //조건식
			System.out.println(num - i);
			i++; //증감식
		}

	}

}
