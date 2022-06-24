package J12_다형성;

public class FactoryMain {

	public static void main(String[] args) {

		Factory[] factorys = new Factory[5];
		
		Factory smartPhoneLGFactory = new SmartPhoneLGFactory();
		Factory computerFactory = new ComputerFactory();
		
		smartPhoneLGFactory.start();
		computerFactory.start();

	}

}
