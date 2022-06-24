package J12_다형성;

public class FactoryMain2 {

	public static void main(String[] args) {
		
		Factory[] factorys = new Factory[100];
		
		for(int i = 0; i < factorys.length; i++) {
			factorys[i] = i % 2 == 0 ? new SmartPhoneLGFactory() : new ComputerFactory();
		}
		
		for(Factory factory : factorys) {
			factory.start();
		}
		
		for(Factory factory : factorys) {
			if(factory instanceof SmartPhoneLGFactory) {
				SmartPhoneLGFactory spf = (SmartPhoneLGFactory) factory;
				spf.showSmartPhone();
				
			}else if(factory instanceof ComputerFactory) {
				ComputerFactory cf = (ComputerFactory) factory;
				cf.showComputer();
				
			}else {
				System.out.println("다운캐스팅 할 수 없습니다.");
			}
		}

	}

}
