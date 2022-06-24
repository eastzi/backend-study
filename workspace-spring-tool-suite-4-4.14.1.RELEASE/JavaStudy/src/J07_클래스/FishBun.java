package J07_클래스;

public class FishBun {
	String material;
	String dough;
	
	FishBun() {
		System.out.println("생성자 호출");
	}
	
	void showInfo() {
		System.out.println("재료: " + material);
		System.out.println("반죽: " + dough);
	}
}
