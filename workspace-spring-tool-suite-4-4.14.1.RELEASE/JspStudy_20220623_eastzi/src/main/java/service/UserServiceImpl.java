package service;

import domain.dao.UserDao;
import domain.dao.UserDaoImpl;
import domain.entity.User;
import web.dto.SignupReqDto;

public class UserServiceImpl implements UserService {
	
	private final UserDao userDao;
	
	public UserServiceImpl () {
		userDao = new UserDaoImpl();
	}
	
	@Override
	public boolean checkUsername(String username) throws Exception {
		return userDao.findUserByUsername(username) != null;
	}
	
	@Override
	public boolean createUser(SignupReqDto signupReqDto) throws Exception {
//		System.out.println("회원가입서비스 실행");
//		System.out.println(signupReqDto);
//		User user;
		return userDao.save(signupReqDto.toEntity()) > 0; //user 객체로 바꾸어 save에 전달
	}

	@Override
	public void getUser() throws Exception {
		
		
	}

	@Override
	public boolean updateUser() throws Exception {
		
		return false;
	}

	@Override
	public boolean deleteUser() throws Exception {
		
		return false;
	}

	@Override
	public User loadUser(String username, String password) throws Exception {
		User user = userDao.findUserByUsername(username);
		if(user == null) {
			return null;
		}else {
			return user.getPassword().equals(password) ? user : null;
		}
	}
}
