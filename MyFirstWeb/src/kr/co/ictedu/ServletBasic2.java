package kr.co.ictedu;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ServletBasic2
 */
@WebServlet("/mango")
public class ServletBasic2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletBasic2() {
        super();
        // 객체 생성시 "망고 생성"
        System.out.println("망고 생성");
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// 객체 실행시 "망고 시작"
		System.out.println("망고 시작");
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// 객체 삭제시 "망고 소멸"
		System.out.println("망고 소멸");
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// get 방식으로 접속하면 post방식으로만 접속할 수 있습니다를 콘솔창에 찍어준다
		System.out.println("post 방식으로만 접속할 수 있습니다");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// mango_form.jsp에서 날려준 정보를 콘솔창에 request.parameter로 받아서 찍어줍니다
		
		// doGet, doPost 시리즈는 해당 메서드 내부에서 파라미터로 선언한 request, response 내장 객체를
		// 기본으로 쓸수 있고, 추가로 내부에 세션이나 쿠키들을 선언해서 쓸 수 있습니다
//		HttpSession session;
		
		// 폼에서 넘겨준 데이터 utf-8로 인코딩
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		// request.getParameter를 이용해 폼에서 날린 데이터 받기
		String id = request.getParameter("id");
		String pw =  request.getParameter("pw");
		// 폼에서 날려준 데이터 콘솔에 찍기
		System.out.println("id: " + id);
		System.out.println("pw: " + pw);
		
	}

}//end class
