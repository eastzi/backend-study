package J13_추상;

public class FactoryMain {

	public static void main(String[] args) {
		Factory lg = new LGFactory();
		Factory samsung = new SamsungFactory();
		
		Factory[] factorys = new Factory[2];
		
		factorys[0] = new SamsungFactory();
		factorys[1] = new LGFactory();
		
		for(Factory factory : factorys) {
			factory.start();
		}
		
		for(Factory factory : factorys) {
			factory.stop();
		}

	}

}
