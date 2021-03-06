package web.servlet.api.auth;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Config.ServletContextConfig;
import service.UserService;
import service.UserServiceImpl;

@WebServlet("/check/username")
public class CheckUsernameServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private final UserService userService;
	
	public CheckUsernameServlet() {
		userService = ServletContextConfig.getInstance().getUserService();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//HttpSession session = request.getParameter();
		
		//System.out.println("AJAX를 통해 요청을 받음");
		String username = request.getParameter("username");
		
		response.setContentType("text/plain;charset=UTF-8");
		
		try {
			boolean flag = userService.checkUsername(username);
			System.out.println(flag);
			response.getWriter().print(flag);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
