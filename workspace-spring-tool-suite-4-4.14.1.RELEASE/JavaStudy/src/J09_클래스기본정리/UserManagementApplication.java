package J09_클래스기본정리;

import J09_클래스기본정리.controller.UserManagementController;
import J09_클래스기본정리.service.UserService;

public class UserManagementApplication {

	public static void main(String[] args) {

		UserManagementController userManagementController = new UserManagementController(new UserService());
		userManagementController.createUser();
		userManagementController.createUser();
		userManagementController.createUser();

	}

}
