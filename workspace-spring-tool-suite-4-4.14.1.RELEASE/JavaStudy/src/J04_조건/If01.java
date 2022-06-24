package J04_조건;

import java.util.Scanner;

public class If01 {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("번호를 입력하세요: ");
		
		int num = scanner.nextInt();
		
		System.out.println("프로그램 시작");
		
		if(num > 5) {
			System.out.println("5보다 큽니다.");
		}else if(num < 5) {
			System.out.println("5보다 작습니다.");
		}else {
			System.out.println("num이 5입니다.");
		}
		
		System.out.println("프로그램 종료");
	}

}
