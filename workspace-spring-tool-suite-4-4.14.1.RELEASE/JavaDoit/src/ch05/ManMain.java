package ch05;

public class ManMain {

	public static void main(String[] args) {
		Man man1 = new Man();
		
		man1.age = 40;
		man1.name = "james";
		man1.Married = true;
		man1.children = 3;
		
		System.out.println(man1.age);
		System.out.println(man1.name);
		System.out.println(man1.Married);
		System.out.println(man1.children);

	}

}
