package Chapter01;

public class Code01 {
	
	static int num;
	
	public static void main(String[] args) {
	
		int anotherNum = 5;
		
		num = 2;
		
		System.out.println(num + anotherNum);
		System.out.println("Num: " + num);
		System.out.println("AnotherNum: " + anotherNum);
		//파란부분이 먼저 출력됨. => sum: 2 + 5 이런 느낌
		System.out.println("sum: " + num + anotherNum); 
	}

}
