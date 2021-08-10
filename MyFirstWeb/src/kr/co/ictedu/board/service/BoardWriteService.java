package kr.co.ictedu.board.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.ictedu.board.model.BoardDAO;
import kr.co.ictedu.board.model.BoardVO;

// 구현클래스이기 떄문에 implements를 합니다
public class BoardWriteService implements IBoardService {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// getParameter로 폼에서 쏜 데이터를 들고오게 해주세요
		try {

			/// post방식 한글깨짐 방지 인코딩
			request.setCharacterEncoding("utf-8");
			response.setCharacterEncoding("utf-8");

			String bTitle = request.getParameter("title");
			String bContent = request.getParameter("content");
			String bWriter = request.getParameter("writer");

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
				System.out.println("에러 발생으로 글리 입력되지 않았습니다");
			}
		

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}//end execute()

}//end class
