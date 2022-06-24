package J14_인터페이스;

/*
 * 인터페이스 
 * 1. 약속
 * 2. 클래스와 클래스를 연결해주는 매개체
 * 3. 각 기능을 모듈화.
 * 4. 기본적으로 모든 인터페이스 메소드는 추상 메소드.
 * 5. 인터페이스 메소드를 일반 메소드로 사용하고 싶다면 리턴타입 앞에 default 키워드를 사용해야 함.
 * 
 * 
 */

public interface Hdmi {

	public void connect();
	
	public void disconnect();
	
}
