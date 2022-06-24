package J04_조건;

import java.util.Scanner;

public class If03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("점수를 입력하세요: ");
		int score1 = scanner.nextInt();
		
		if(score1 < 0 || score1 > 100) {
			System.out.println("계산할 수 없는 점수입니다.");
		}else if(score1 > 89) {
			System.out.println("A");
		}else if(score1 > 79) {
			System.out.println("B");
		}else if(score1 > 69) {
			System.out.println("C");
		}else if(score1 > 59) {
			System.out.println("D");
		}else {
			System.out.println("F");
		}

	}

}
