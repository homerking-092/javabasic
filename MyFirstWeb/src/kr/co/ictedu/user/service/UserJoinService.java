package kr.co.ictedu.user.service;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.ictedu.user.model.UsersDAO;
import kr.co.ictedu.user.model.UsersVO;

public class UserJoinService implements IUserService {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		/// post 한글 깨짐 인코딩
		try {
			request.setCharacterEncoding("utf-8");
			response.setCharacterEncoding("utf-8");
			
			String uId = request.getParameter("uId");
			String uPw = request.getParameter("uPw");
			String uName = request.getParameter("uName");
			String email = request.getParameter("email");
			
			
			/// VO 객체 생성, 데이터 입력
			UsersVO user = new UsersVO(uId, uPw, uName, email);
			/// Dao 생성
			UsersDAO dao = UsersDAO.getInstance();
			
			int result = dao.joinUsers(user);
			if (result == 1) {
				System.out.println("회원가입 데이터 잘 받아옴");
			}else {
				System.out.println("join service 오류");
			}
			
			
		} catch (UnsupportedEncodingException e) {

			e.printStackTrace();
		}
		
	}

}
