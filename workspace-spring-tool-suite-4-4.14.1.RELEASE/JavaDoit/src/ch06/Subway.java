package ch06;

public class Subway {
	int lineNumber;
	int passengerCount;
	int money;
	
	public Subway(int lineNumber) {
		this.lineNumber = lineNumber;
	}
	
	//승객을 태울때 호출될 메소드
	public void take(int money) {
		this.money = money;
		passengerCount++;
	}
	
	public void showInfo() {
		System.out.println((lineNumber + "의 승객은 " + passengerCount 
				+ "명이고, 수입은 " + money + "입니다."));
	}
}
