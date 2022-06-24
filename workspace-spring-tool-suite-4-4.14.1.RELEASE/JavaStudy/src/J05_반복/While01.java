package J05_반복;

public class While01 {

	public static void main(String[] args) {
		
		int i = 0;
		int result = 0;
		
		while(i < 100) {
			result = result + (i + 1);
			i++;
		}
		System.out.println(result);

	}

}
