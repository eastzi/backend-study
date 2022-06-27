package web_servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/index123123") //=> 요청주소(가장중요)/ 서블릿마다 요청에 따른 동작이(service) 달라짐
public class IndexServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	public void init(ServletConfig config) throws ServletException {
		System.out.println("서블릿 생성시 최소 1회 호출");
	}

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("요청시마다 매번 호출"); //=>주소창에서 엔터치면 호출됨.
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/index.jsp"); //호출할때마다 해당 주소를 연결
		dispatcher.forward(request, response);
	}
	
	public void destroy() {
		System.out.println("서블릿 객체 소멸시에 1회 호출");
	}

	
		

}
