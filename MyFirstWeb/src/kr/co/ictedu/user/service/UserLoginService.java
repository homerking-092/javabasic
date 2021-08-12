package kr.co.ictedu.user.service;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kr.co.ictedu.user.model.UsersDAO;
import kr.co.ictedu.user.model.UsersVO;

// 인터페이스 구현
public class UserLoginService implements IUserService {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {

		try {
			request.setCharacterEncoding("utf-8");
			response.setCharacterEncoding("utf-8");

			// 폼에서 날린 데이터 받기
			String uId = request.getParameter("uId");
			String uPw = request.getParameter("uPw");
			
			System.out.println("서비스 아이디:" + uId);
			System.out.println("서비스 비번:" + uPw);
			// 세션 쓰는법
			HttpSession session = null;
			session = request.getSession();

			// VO 생성 및 데이터 입력
			UsersVO user = new UsersVO();
			user.setUid(uId);
			user.setUpw(uPw);

			// 그거 넣어서 dao 호출
			UsersDAO dao = UsersDAO.getInstance();

			int resultCode = dao.userLogin(user);

			if (resultCode == 1) {
				// 통과시 세션발급 해주세요
				session.setAttribute("i_s", uId);
				session.setAttribute("p_s", uPw);
			} else if (resultCode == 0 || resultCode == -1) {
				/// 실패시 login이라는 세션 부여
				session.setAttribute("login", "fail");
			}
			System.out.println("service 세션: " + resultCode);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}// end execute()
	
}// end class
