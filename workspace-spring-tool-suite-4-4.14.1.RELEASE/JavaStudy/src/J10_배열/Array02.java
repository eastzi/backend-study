package J10_배열;

public class Array02 {

	public static void main(String[] args) {
		
		/*
		 * for문으로 0부터 99까지 반복을 한다. 
		 * i의 값이 8의 배수이면 8의 배수 갯수만큼 배열을 생성하고
		 * 8의 배수를 모두 배열에 대입한다. 
		 * 8의 배열에 들어있는 8의 배수들을 모두 출력하시오. 
		 * 
		 */
		
		int size = 0;
		
		for(int i = 0; i < 100; i++) {
			if(i != 0 && i % 8 == 0) {
				size++;
			}
		}
		
		int[] numbers = new int[size];
		
		for(int i = 0, j = 0; i < 100; i++) {
			if(i != 0 && i % 8 == 0) {
				numbers[j] = i;
				j++;
			}
		}
		
		for(int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}

	}

}
