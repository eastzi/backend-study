package Config;

import domain.dao.UserDao;
import domain.dao.UserDaoImpl;
import lombok.Getter;
import service.UserService;
import service.UserServiceImpl;

@Getter
public class ServletContextConfig {
	private static ServletContextConfig instance = null;
	
	/*
	 * Custom Ioc (객체관리)
	 */
	
	//Repository 
	private UserDao userDao;

	//service
	private UserService userService;

	public ServletContextConfig() {}
	
	public static ServletContextConfig getInstance() {
		if(instance == null) {
			instance = new ServletContextConfig();
			instance.setIoc();
		}

		return instance;
	}
	
	private void setIoc() {
		if(userDao == null) {
			userDao = new UserDaoImpl();
		}
		
		if(userService == null) {
			userService = new UserServiceImpl();
		}
	}
}
