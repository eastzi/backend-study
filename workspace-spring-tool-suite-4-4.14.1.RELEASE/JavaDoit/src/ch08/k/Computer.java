package ch08.k;

public class Computer {
	protected String manufacturer;
	protected String processor;
	protected int ramSize;
	protected int diskSize;
	protected double processorSpeed;
	
	public Computer(String man, String proc, int ram, int disk, double procSpeed) {
		manufacturer = man;
		processor = proc;
		ramSize = ram;
		diskSize = disk;
		processorSpeed = procSpeed;
	}

	public double computerPower() {
		return ramSize * processorSpeed;
	}
	
	public int getRamSize() {
		return ramSize;
	}

	public int getDiskSize() {
		return diskSize;
	}

	public double getProcessorSpeed() {
		return processorSpeed;
	}

	@Override
	public String toString() {
		String result = "Computer [manufacturer=" + manufacturer + ", processor=" + processor + ", ramSize=" + ramSize
				+ ", diskSize=" + diskSize + ", processorSpeed=" + processorSpeed + "]";
		
		return result;
	}
	
	
	
}
