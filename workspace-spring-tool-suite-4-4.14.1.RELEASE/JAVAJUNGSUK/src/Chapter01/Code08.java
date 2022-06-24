package Chapter01;

import java.util.Scanner;

public class Code08 { 

	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		
		int n = kb.nextInt();
		int [] data = new int[n];
		
		for(int i = 0; i < n; i++) {
			data[i] = kb.nextInt();
		}
		kb.close();
		
		int sum = 0;
		int max = data[0]; //초기화를 입력하는 숫자로 하면 음수가 나와도 max 추출가능
		for(int i = 0; i < n; i++) {
			sum += data[i];
			if(data[i] > max) {
				max = data[i];
			}
		}
		System.out.println("The sum is" + sum + "and the maximum is" + max);
	}

}
