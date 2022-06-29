package ch05;

public class FunctionTest {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		
		int sum = add(num1, num2); //add 함수 호출 
		System.out.println(num1 + " + " + num2 + " = " + sum + "입니다.");
	}
	
	//add 함수 
	public static int add(int n1, int n2) {
		int result = n1 + n2;
		return result; //결과값 반환 
	}
	
	//함수 구현할때 매게변수 이름 n1, n2와 
	//함수 호출할대 매게변수 이름 num1, num2 이름이 같을 필요는 없음. 
	

}
