package kr.co.ictedu.board.service;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kr.co.ictedu.board.model.BoardDAO;
import kr.co.ictedu.board.model.BoardVO;

// 구현클래스이기 떄문에 implements를 합니다
public class BoardWriteService implements IBoardService {

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

		// getParameter로 폼에서 쏜 데이터를 들고오게 해주세요
		try {

			/// post방식 한글깨짐 방지 인코딩
			request.setCharacterEncoding("utf-8");
			response.setCharacterEncoding("utf-8");

			String bTitle = request.getParameter("title");
			String bContent = request.getParameter("content");
			String bWriter = request.getParameter("writer");

			request.setAttribute("bWriter", bWriter);
			// dao 생성
			BoardDAO dao = BoardDAO.getInstance();

			// VO 생성
			BoardVO board = new BoardVO();
			board.setbTitle(bTitle);
			board.setbContent(bContent);
			board.setbName(bWriter);
			int resultCode = dao.write(board);
			if (resultCode == 1) {
				System.out.println("DB에 글이 입력되었습니다");
			} else if (resultCode == 0) {
				System.out.println("에러 발생으로 글이 입력되지 않았습니다");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}// end execute()

}// end class
