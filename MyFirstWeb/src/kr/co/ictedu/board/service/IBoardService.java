package kr.co.ictedu.board.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// 컨트롤러에다가 직접적으로 기능 하나하나에 대한 코드를 작성할수도 있지만 그렇게 되면 기능이 많아졌을떄
// 코드관리가 굉장히 어려워지는 문제가 있습니다
// 따라서 기능을 하나하나 다시 Service라는 단위로 나눠서 관리해줍니다
public interface IBoardService {
	
	// 서비스 인터페이스 내에는 실행 메서드 하나만 만듭니다
	void execute(HttpServletRequest request, HttpServletResponse response);
	

}
