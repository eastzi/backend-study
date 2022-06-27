package web_servlet_api;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * 요청의 종류
 * 1. view(HTML) 요청 -> 무조건 get요청(주소창에 입력 후 엔터치는 것) 
 * 2. api(Application Programming Interface) 요청 -> CRUD(post, get, put, delete)
 *  => 자바스크립트(AJAX 동기, 비동기 요청) 
 * 3. index = main page 요청 
 * 4. views 안에는 get 요청 관련 jsp 모아둘 것임.
 * 
 */

@WebServlet("/index")
public class IndexServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	//indexservlet 이 생성되고 doget으로 찾아오는 것 
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//RequestDispatcher requestDispatcher = request.getRequestDispatcher("/WEB-INF/views/index.jsp");
		request.getRequestDispatcher("/WEB-INF/views/index.jsp").forward(request, response);
	}

}
