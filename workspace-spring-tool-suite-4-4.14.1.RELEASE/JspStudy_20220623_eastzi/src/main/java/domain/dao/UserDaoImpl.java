package domain.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import domain.entity.User;
import domain.jdbc.DBConnectionMgr;

public class UserDaoImpl implements UserDao {
	private DBConnectionMgr pool;
	
	private String sql;
	
	private Connection con;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	public UserDaoImpl() {
		pool = DBConnectionMgr.getInstance();
	}
	
	@Override
	public int save(User user) throws Exception {
		int result = 0; 
		
		//쿼리문
		sql = "INSERT INTO \r\n"
				+ "	user_mst\r\n"
				+ "VALUES(\r\n" //0과 create , update 빼고 값을 ? 로 변경, ''빼고 => 밑에 set에서 ''자동 붙음
				+ "	0,\r\n"
				+ "	?,\r\n"
				+ "	?,\r\n"
				+ "	?,\r\n"
				+ "	?,\r\n"
				+ "	?,\r\n"
				+ "	?,\r\n"
				+ "	NOW(),\r\n"
				+ "	NOW()\r\n"
				+ ");";
		con = pool.getConnection(); //데이터베이스 연결
		//예외 마지노선 
		try {
			pstmt = con.prepareStatement(sql); //데이터베이스에서 해당 쿼리문을 전달
			pstmt.setString(1, user.getName());
			pstmt.setString(2, user.getEmail());
			pstmt.setString(3, user.getUsername());
			pstmt.setString(4, user.getPassword());
			pstmt.setString(5, user.getRoles());
			pstmt.setString(6, user.getProvider());
			result = pstmt.executeUpdate(); //쿼리실행 컨+f9, 성공횟수 리턴함.			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			pool.freeConnection(con, pstmt); //연결 끊기 			
		}
		return result;
	}

	@Override
	public User findUserByUsername(String username) throws Exception {
		
		return null;
	}

	@Override
	public int modify(int user_code) throws Exception {
		
		return 0;
	}

	@Override
	public int remove(int user_code) throws Exception {
		
		return 0;
	}
	
}
