package J09_클래스기본정리.controller;

import J09_클래스기본정리.repository.User;
import J09_클래스기본정리.service.UserService;

public class UserManagementController {
	private UserService userService;
	
	private User[] users;
	
	public UserManagementController(UserService userService) {
		this.userService = new UserService();
		users = new User[2];
	}
	
	public void createUser() {
		int indexResult = findEmptyInUsers();
		if(indexResult != -1) {
			users[indexResult] = userService.insertUser();
		
			//User user = userService.insertUser();
			
			System.out.println("[새로 추가된 사용자]");
			//System.out.println(user.toString());
			System.out.println(users[indexResult].toString());
		}else {
			System.out.println("더 이상 사용자를 추가할 수 없습니다.");
		}
	}
	
	public int findEmptyInUsers() {
		for(int i = 0; i < users.length; i++) {
			if(users[i] == null) {
				return i;
			}
		}
		return -1;
		
	}
	
	public void updateUser() {
		userService.insertUser();
	}
}
