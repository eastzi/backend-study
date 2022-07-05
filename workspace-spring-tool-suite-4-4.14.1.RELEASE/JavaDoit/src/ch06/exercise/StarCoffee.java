package ch06.exercise;

public class StarCoffee {

	int money;
	
	public String brewing(int money) {
		
		this.money = money;
		if(money == Menu.STARAMERICANO) {
			return "별다방 아메리카노";
		}else if(money == Menu.STARLATTE) {
			return "별다방 라뗴";
		}else {
			return null;
		}
	}
}
