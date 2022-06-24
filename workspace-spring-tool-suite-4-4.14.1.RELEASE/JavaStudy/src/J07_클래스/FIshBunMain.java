package J07_클래스;

public class FIshBunMain {

	public static void main(String[] args) {

		FishBun fishBun = new FishBun();
		
		fishBun.showInfo();
		fishBun.material = "팥";
		fishBun.dough = "부드러운 반죽";
		fishBun.showInfo();
		
		System.out.println("=====================");
		
		FishBun fishBun2 = new FishBun();
		
		fishBun2.showInfo();
		fishBun2.material = "슈크림";
		fishBun2.dough = "퍽퍽한 반죽";
		fishBun2.showInfo();
		fishBun.showInfo();
		
		System.out.println(fishBun);
		System.out.println(fishBun2);

	}

}
