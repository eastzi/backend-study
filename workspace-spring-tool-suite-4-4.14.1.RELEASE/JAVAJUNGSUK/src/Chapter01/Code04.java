package Chapter01;

import java.util.Scanner;

public class Code04 {
	
	public static void main(String[] args) {
		String name = null;
		int age;
		String gender;

		Scanner kb = new Scanner(System.in);

		System.out.println("Please type ur name and ur age and ur gender: ");
		
		name = kb.next();
		age = kb.nextInt();
		gender = kb.next();
		
		if(gender.equals("male")) {
			System.out.println(name + ", ur " + age + " years old man.");
		}else if(gender.equals("female")) {
		System.out.println(name + ", ur " + age + " years old waman.");
		}else {
			System.out.println("hmm.. interesting");
		}
		
		kb.close();
	}

	
	
	
}
