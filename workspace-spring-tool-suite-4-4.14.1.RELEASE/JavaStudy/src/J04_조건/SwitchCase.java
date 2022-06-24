package J04_조건;

public class SwitchCase {

	public static void main(String[] args) {
		int num = 10;
		char c = 'b';
		String str = "가나다";
		
		switch(num / 10) {
		case 1: 
			System.out.println("case 1");
			break;
		case 2: 
			System.out.println("case 2");
			break;
		case 3:
			System.out.println("case 3");
			break;
		default:
			System.out.println("찾을 수 없음");
		}
		
		switch(c) {
		case 'a':
			System.out.println("case a");
			break;
		case 'b':
			System.out.println("case b");
			break;
		case 'c':
			System.out.println("case c");
			break;
		default:
			System.out.println("찾을 수 없음");
		}
		
		switch(str) {
		case "홍길동": 
			System.out.println("case 홍길동");
			break;
		case "철수":
			System.out.println("case 철수");
			break;
		case "영희":
			System.out.println("case 영희");
			break;
		default:
			System.out.println("찾을 수 없음");
		}

	}

}
