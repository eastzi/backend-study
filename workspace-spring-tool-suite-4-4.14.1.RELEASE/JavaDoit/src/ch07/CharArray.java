package ch07;

public class CharArray {

	public static void main(String[] args) {

		char[] alp = new char[26];
		char ch = 'A';
		
		//alp을 배열에 저장하기.
		for(int i = 0; i < alp.length; i++, ch++) {
			alp[i] = ch;
		}
		
		for(int i = 0; i < alp.length; i++) {
			System.out.println(alp[i]);
		}

	}

}
