package domain.dao;

import java.awt.geom.RectangularShape;
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
		con = pool.getConnection(); //데이터베이스 연결 + 예외처리 필요
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
		User user = null;
		
		sql = "SELECT \r\n"
				+ "	um.user_code,\r\n"
				+ "	um.name,\r\n"
				+ "	um.email,\r\n"
				+ "	um.username,\r\n"
				+ "	um.password,\r\n"
				+ "	um.roles,\r\n"
				+ "	um.provider,\r\n"
				+ "	ud.user_profile_img,\r\n"
				+ "	ud.user_address,\r\n"
				+ "	ud.user_phone,\r\n"
				+ "	ud.user_gender\r\n"
				+ "FROM\r\n"
				+ "	user_mst um\r\n"
				+ "	LEFT OUTER JOIN user_dtl ud ON(ud.user_code = um.user_code)\r\n"
				+ "WHERE \r\n"
				+ "	um.username = ?";
		
		con = pool.getConnection();
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, username);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				user = User.builder()
						.user_code(rs.getInt(1))
						.name(rs.getString(2))
						.email(rs.getString(3))
						.username(rs.getString(4))
						.password(rs.getString(5))
						.roles(rs.getString(6))
						.provider(rs.getString(7))
						.user_profile_img(rs.getString(8))
						.user_address(rs.getString(9))
						.user_phone(rs.getString(10))
						.user_gender(rs.getInt(11))
						.build();
			}	
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			pool.freeConnection(con, pstmt, rs);
		}
		return user;
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
