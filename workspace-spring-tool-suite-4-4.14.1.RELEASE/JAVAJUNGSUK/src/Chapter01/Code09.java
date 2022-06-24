package Chapter01;

import java.util.Scanner;

public class Code09 {

	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		
		int n = kb.nextInt();
		int [] data = new int[n];
		
		for(int i =0; i < n; i++) {
			data[i] = kb.nextInt();
		}
		kb.close();
		
		//tmp를 맨마지막 값이라 생각하고 잠시빼서 킵
		int tmp = data[n-1];
		//맨마지막 숫자 앞까지를 한칸씩 뒤로 밀기
		for(int i = n-2; i >=0; i--) {
			data[i+1] = data[i];
		}
		//맨마지막 숫자를 제일 처음으로 이동
		data[0] = tmp;
		
		for(int i = 0; i < n; i++) {
			System.out.println(data[i]);
		}
	}

}
