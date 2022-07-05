package ch07;

public class ArrayTest {

	public static void main(String[] args) {
		//방법1
		int[] num = new int[] {1,2,3,4,5,6,7,8,9,10}; //배열초기화
		
		for(int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
		
		//방법2
		int[] numbers = new int[3];
		
		numbers[0] = 1;
		numbers[1] = 2;
		numbers[2] = 3;
		
		for(int i = 0;  i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		
		//방법3
		int[] studentID = new int[5]; //값들은 초기값으로 지정됨. int의 초기값은 0
		
		for(int i = 0;  i < studentID.length; i++) {
			System.out.println(studentID[i]);
		}

	}

}
