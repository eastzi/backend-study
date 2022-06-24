package J07_클래스;

public class UserMain {

	public static void main(String[] args) {
		User user1 = new User();
		System.out.println("첫번째: " + user1.name);
		user1.setName("aaa");
		System.out.println("두번째: " + user1.name);
		
		User user2 = new User();
		System.out.println(user2.name);
		System.out.println(user2.age);
		System.out.println(user2.phone);
		System.out.println(user2.address);

	}

}
