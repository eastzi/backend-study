package ch08.k;

public class Notebook extends Computer {

	public double screenSize;
	public double weight;
	
	public Notebook(String man, String proc, int ram, int disk, double speed, double screen, double weight) {
		super(man, proc, ram, disk, speed);
		screenSize = screen;
		this.weight = weight;
	}

	@Override
	public String toString() {
		String result = super.toString() + 
				"Notebook [screenSize=" + screenSize + ", weight=" + weight + "]";
		
		return result;
	}

	public static void main(String[] args) {
		Notebook test = new Notebook("dell", "15", 4, 1000, 3.2, 15.6, 1.2);
		
		System.out.println(test.computerPower());
		System.out.println(test.toString());
	}
} 
 