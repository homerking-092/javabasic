package kr.co.ictedu.board.service;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kr.co.ictedu.board.model.BoardDAO;

public class BoardDeleteService implements IBoardService {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// 세션 쓰는법
		HttpSession session = null;
		session = request.getSession();
		String idSession = (String) session.getAttribute("i_s");

		if (idSession == null) {
			try {
				// 서비스 내부에서 포워딩을 시키면
				// 리다이렉트가 아니기 떄문에 실행됨
				String ui = "users/user_login.jsp";
				RequestDispatcher dp = request.getRequestDispatcher(ui);
				dp.forward(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		// bId 파라미터(디테일 페이지에서 post 방식으로 날려준) 받기
		String bId = request.getParameter("bId");

		// DAO 생성
		BoardDAO dao = BoardDAO.getInstance();

		System.out.println("delete id: " + bId);

		// delete 로직에 bId 넣어서 실행
		int resultCode = dao.deleteBoard(bId);
		if (resultCode == 1) {
			System.out.println("db의 글이 삭제 되었습니다");
		} else if (resultCode == 0) {
			System.out.println("에러 발생으로 글이 삭제되지 않았습니다");
		}

	}

}
