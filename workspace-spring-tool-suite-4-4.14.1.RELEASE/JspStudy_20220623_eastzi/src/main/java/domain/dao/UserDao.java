package domain.dao;

import domain.entity.User;

public interface UserDao {
	//CRUD 구성
	//user 객체를 생성해서 그 안의 변수들을 db에 저장
	public int save(User user) throws Exception;
	public User findUserByUsername(String username) throws Exception;
	public int modify(int user_code) throws Exception;
	public int remove(int user_code) throws Exception;
}
