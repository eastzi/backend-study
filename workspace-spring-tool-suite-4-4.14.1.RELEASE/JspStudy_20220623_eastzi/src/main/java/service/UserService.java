package service;

import web.dto.SignupReqDto;

public interface UserService {
	//throws Exception 예외를 미룬다 -> 오류나면 서버가 꺼지므로 한 오류때문에 서버자체가 꺼지게 할 수 없으니
	public boolean createUser(SignupReqDto signupReqDto) throws Exception;
	public void getUser() throws Exception;
	public boolean updateUser() throws Exception;
	public boolean deleteUser() throws Exception;
}
