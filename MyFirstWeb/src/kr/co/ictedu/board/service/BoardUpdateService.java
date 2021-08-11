package kr.co.ictedu.board.service;

import java.sql.Timestamp;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.ictedu.board.model.BoardDAO;
import kr.co.ictedu.board.model.BoardVO;

// IboardService 구현
public class BoardUpdateService implements IBoardService {

	// 오버라이딩된 메서드 내부 작성
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// 1. 파라미터 6개 받아오기
		String strbId = request.getParameter("bId");
		int bId = Integer.parseInt(strbId);
		String strHit = request.getParameter("bHit");
		int bHit = Integer.parseInt(strHit);
		
		String strbDate = request.getParameter("bDate");
		Timestamp bDate = Timestamp.valueOf(strbDate);	// str타입으로 들어온 Date를 Timestamp로 바꾸기
		
		String bName = request.getParameter("bName");
		String bTitle = request.getParameter("title");
		String bContent = request.getParameter("content");
		// 2. VO생성해서 setter 저장하기
		BoardVO board = new BoardVO();
		board.setbId(bId);
		board.setbDate(bDate);
		board.setbName(bName);
		board.setbTitle(bTitle);
		board.setbContent(bContent);
		board.setbHit(bHit);
		
		
		// 3. DAO 생성 및 update로직 호출(update 로직은 직접작성)
		BoardDAO dao = BoardDAO.getInstance();
		int resultCode = dao.updateBoard(board);
		if (resultCode == 1) {
			System.out.println("정보 변경 성공");
		}else if (resultCode == 0) {
			System.out.println("오류로 인한 정보 변경 실패");
		}
		
		
	}

}
