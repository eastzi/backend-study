package J05_반복;

public class While02 {

	public static void main(String[] args) {
		/*
		 * 구구단 2단 출력
		 */
		
		int dan = 2;
		int num = 0;
		
		while(num < 9) {
			System.out.println(dan + "x" + (num + 1) + "=" + dan * (num +1));
			num++;
		}

	}

}
