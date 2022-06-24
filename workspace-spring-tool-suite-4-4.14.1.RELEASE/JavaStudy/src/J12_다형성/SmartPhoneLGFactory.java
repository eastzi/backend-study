package J12_다형성;

public class SmartPhoneLGFactory extends Factory {
	
	@Override
	public void start() {
		System.out.println("스마트폰 공장을 가동합니다.");
	}
	
	public void showSmartPhone() {
		System.out.println("스마트 폰들을 확인합니다.");
	}
}
