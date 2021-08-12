package kr.co.ictedu.board.service;

import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kr.co.ictedu.board.model.BoardDAO;
import kr.co.ictedu.board.model.BoardVO;

public class BoardListService implements IBoardService {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// 세션 쓰는법
		HttpSession session = null;
		session = request.getSession();
		String idSession = (String)session.getAttribute("i_s");
		
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

		// 접속하자마자 바로 전체 데이터만 들고오면 됨
		// 바로 DAO부터 생성함
		BoardDAO dao = BoardDAO.getInstance();
		// 전체 리스트 가져오기
		List<BoardVO> boardList = dao.getBoardList();

		// 받아온 리스트를 .jsp에 전달하기
		// request에 데이터를 실어놔야 합니다
		// request.setAttribute("명칭", 데이터);
		request.setAttribute("boardList", boardList);
		System.out.println("service 게시물 데이터: " + boardList);

	}

}// end class
