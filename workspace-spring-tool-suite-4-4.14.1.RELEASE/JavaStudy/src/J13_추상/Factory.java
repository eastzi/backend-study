package J13_추상;

/*
 * abstract(추상)
 * 1. abstract 는 {}를 가질수 없음({} = body)
 * 2. 클래스 또한 추상클래스를 가져야 함.(메소드도 추상, 클래스도 추상)
 * 3. 강제성을 가짐
 * 4. 꼭 구현을 해주고 싶은 사항들은 추상을 사용. 꼭 따르도록 유도.
 * 
 * <추상 메소드> 
 * 1. 리턴타입 앞에 abstract 키워드가 붙는다.  
 * 2. 추상 메소드는 일반 클래스 안에 선언 할 수 없다. 추상 클래스 속에 선언
 * 3. 상속 또는 구현된 클래스에서 무조건 override(재정의)가 되어야 한다. 
 * 
 * <추상 클래스>
 * 1. 클래스 타입 앞에 abstract 키워드가 붙는다.
 * 2. 추상 클래스는 생성할 수 없다. (new 클래스명 할 수 없다는 뜻, 단순 설계도 역할)
 * 3. 추상 메소드를 포함 할 수 있다. 따라서 추상 메소드가 필수요소가 아님. 
 * 
 */ 

public abstract class Factory {
	
	public abstract void start();
	
	public void stop() {
		
	}
	
	private void test() {
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
