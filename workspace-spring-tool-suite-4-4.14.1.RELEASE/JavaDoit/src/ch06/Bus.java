package ch06;

public class Bus {
	int busNumber;
	int passengerCount;
	int money;
	
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}
	
	//승객을 태울때 호출될 메소드
	public void take(int money) {
		this.money = money;
		passengerCount++;
	}
	
	public void showInfo() {
		System.out.println(("버스 " + busNumber + "번의 승객은 " + passengerCount 
				+ "명이고, 수입은 " + money + "입니다."));
	}
}
