package ch06.alone;

public class Car {
	
	private static int serialNum =10000;
	private int carNum;
	
	public Car() {
		serialNum++;
		carNum = serialNum;
	}
	
	public int getCarNum() {
		return carNum;
	}
	
	public void setCarNUm(int carNum) {
		this.carNum = carNum;
	}
	

}
