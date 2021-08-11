package kr.co.ictedu.board.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.ictedu.board.model.BoardDAO;

public class BoardDeleteService implements IBoardService {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
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
