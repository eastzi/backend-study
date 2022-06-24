package Chapter01;

import java.util.Scanner;

public class Code03 {

	public static void main(String[] args) {
		
		String str = "Hello, world";
		String input = null;
		
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please type a string: ");
		
		//input = kb.next(); // => Hello만 출력됨
		input = kb.nextLine();
		
		//== => 프리미티타입만 해당함.(같다)
		if(str.equals(input)) {
			System.out.println("String match! :-)");
		}else {
			System.out.println("Strings do not match! :-(");
		}
		
		kb.close();

	}

}
