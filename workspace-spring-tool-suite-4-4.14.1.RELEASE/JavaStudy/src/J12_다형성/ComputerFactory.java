package J12_다형성;

public class ComputerFactory extends Factory {
	
	@Override
	public void start() {
		System.out.println("컴퓨터 공장을 가동합니다.");
	}
	
	public void showComputer() {
		System.out.println("컴퓨터를 확인합니다.");
	}
	
	
	
}
