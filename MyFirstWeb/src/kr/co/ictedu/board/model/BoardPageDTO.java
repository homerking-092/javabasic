package kr.co.ictedu.board.model;

import java.util.List;

// VO와 DTO는 크게 구분을 하지 않는 사람들도 있고 구분을 한다고 해도
// 엄격하게 하지는 않는 편입니다.
// 만약 굳이 구분을 해야 한다면, VO는 DB에서 받아온 데이터를 그대로 전달하는쪽에
// 초점이 맞춰져 있다면, DTO는 받아온 데이터를 특수하게 가공해서 전달하는 쪽에
// 초점이 맞춰져 있다고 보셔도 무방합니다.
public class BoardPageDTO {
	private int total; // 전체 글 개수
	private int currentPage; // 현재 보고 있는 페이지
	private List<BoardVO> boardList; // 페이징된 글 목록
	private int totalPages; // 전체 페이지 개수
	private int startPage; // 시작 페이지 번호
	private int endPage; // 끝 페이지 번호
	
	
	// 생성자는 전체 글 개수, 현재 페이지, 페이징된 글 목록을 받아서 가공해 
	// 나머지 정보를 얻어냅니다.
	public BoardPageDTO(int total, 
						int currentPage,
						List<BoardVO> boardList) {
		this.total = total;
		this.currentPage = currentPage;
		this.boardList = boardList;
		
		// 아래부터 위 3개를 토대로 가공해서 나머지 변수를 채웁니다.
		// 글이 없는경우 페이지 및 버튼 자체가 필요없음
		if(total == 0) {
			this.totalPages = 0;
			this.startPage = 0;
			this.endPage = 0;
		} else {
			// 게시글 총 개수를 이용해 전체 페이지 개수부터 구하기
			this.totalPages = this.total / 10;
			if(this.total % 10 > 0) {
				// 만약 나눴을때 10개로 딱떨어지지 않으면
				// 마지막에 페이지를 하나 더 추가해야함
				this.totalPages += 1;
			}
			
			// 현재 보고 있는 페이지 그룹의 시작 번호 구하기.
			int modVal = this.currentPage % 10;
			this.startPage =
					this.currentPage / 10 * 10 + 1;
			if(modVal == 0) {
				this.startPage -= 10;
			}
			
			// 해당 페이지 그룹의 끝 번호 구하기.
			endPage = startPage + (10 - 1);
			// 단 위에서 구한 명목상의 마지막 번호가
			// totalPages를 초과하는 경우는
			// totalPages로 대신 대입한다.
			if(endPage > totalPages) {
				endPage = totalPages;
			}
			
		}
	}// end constructor
	
	
	public int getTotal() {
		return total; // 총 글 개수 리턴
	}
	
	public boolean hasNoBoard() {
		return total == 0; // 게시물 표기가 불가능할때 true 리턴
	}
	
	public boolean hasBoard() {
		return total > 0; // 게시물이 있을때 true 리턴
	}
	
	public int getTotalPages() {
		return totalPages; // 페이지의 총 개수 리턴
	}
	
	public List<BoardVO> getBoardList(){
		return boardList; // 해당 페이지에 표기할 글 목록 리턴
	}
	
	public int getStartPage() {
		return startPage; // 해당 페이지 그룹의 시작번호 리턴
	}
	
	public int getEndPage() {
		return endPage; // 해당 페이지 그룹의 끝번호 리턴
	}


	// 현재 페이지
	public int getCurrentPage() {
		return currentPage;
	}
	
	
	@Override
	public String toString() {
		return "BoardPageDTO [total=" + total + ", currentPage=" + currentPage + ", boardList=" + boardList
				+ ", totalPages=" + totalPages + ", startPage=" + startPage + ", endPage=" + endPage + "]";
	}
	
	
	

}
