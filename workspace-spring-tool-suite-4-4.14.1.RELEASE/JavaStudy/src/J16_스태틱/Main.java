package J16_스태틱;

public class Main {

	public static void main(String[] args) {
		Test t = new Test();
		Test t2 = new Test();
		Test t3 = new Test();
		
		t.count = 10;
		t2.count = 20;
		t3.count = 30;
		
		t.method();
		t2.method();
		t3.method();
		
		StaticTest.count = 100;
		StaticTest.staticmethod();
		
	}

}
