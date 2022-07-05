package ch06.exercise;

public class BeanCoffee {

	int money;
	
	public String brewing(int money) {
		
		this.money += money; 
		if(money == Menu.BEANAMERICANO) {
			return "아메리카노를 마셨습니다";
		}else if(money == Menu.BEANLATTE) {
			return "라떼를 사 마셨습니다";
		}else {
			return null;
		}
	}
}
