package web.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import Config.ServletContextConfig;

@WebFilter("/*")
public class CharacterEncodingFilter extends HttpFilter implements Filter {

//	외부프로그램과 연결될때 사용
	private static final long serialVersionUID = 1L;

	public void destroy() {
		
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		//전처리
		//System.out.println("전처리");
		
		//request를 getMethod를 사용하기 위해서 http로 다운캐스팅
		HttpServletRequest httpRequest = (HttpServletRequest) request;
		//equalsIgnoreCase 문자열을 대소문자 구분없이 비교(문자열 값만 비교하는 것)
		if(!httpRequest.getMethod().equalsIgnoreCase("get")) {
			request.setCharacterEncoding("UTF-8");
			System.out.println("인코딩됨");
		}
		
		chain.doFilter(request, response); //서블릿
		
		//후처리
		//System.out.println("후처리");
	}

	public void init(FilterConfig fConfig) throws ServletException {
		ServletContextConfig.getInstance();
	}

}
