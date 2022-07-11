package web.dto;

import domain.entity.User;
import lombok.Builder;
import lombok.Data;
import service.UserService;

@Data
@Builder
public class SignupReqDto {
	private String name;
	private String email;
	private String username;
	private String password;
	
	
	//dto에 있는 값을 user 객체로 바뀌어 리턴해줌
	public User toEntity() {
		return User.builder()
				.name(name)
				.email(email)
				.username(username)
				.password(password)
				.roles("ROLE_USER")
				.build();
		
	}
}
