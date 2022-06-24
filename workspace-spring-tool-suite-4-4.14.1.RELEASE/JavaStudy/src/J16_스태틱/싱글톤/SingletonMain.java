package J16_스태틱.싱글톤;

public class SingletonMain {

	public static void main(String[] args) {
		Singleton singleton = Singleton.getInstance();
		singleton.setCount(10);
		singleton.printInfo();
		
		Singleton singleton2 = Singleton.getInstance();
		singleton.setCount(20);
		singleton.printInfo();

	}

}
