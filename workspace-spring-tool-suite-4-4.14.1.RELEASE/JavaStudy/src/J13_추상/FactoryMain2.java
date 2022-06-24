package J13_추상;

public class FactoryMain2 {

	public static void main(String[] args) {

		LGFactory lgFactory = new LGFactory();
		lgFactory.start();
		lgFactory.stop();
		
		SamsungFactory samsungFactory = new SamsungFactory();
		samsungFactory.start();
		samsungFactory.stop();
		
	}

}
