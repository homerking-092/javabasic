package kr.co.ictedu.board.model;

import javax.naming.Context;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.*;
import javax.sql.DataSource;

public class BoardDAO {
	// 싱글톤 패턴과 커넥션풀을 적용해서

	private DataSource ds;

	private static final int WRITE_SUCCESS = 1;
	private static final int WRITE_FAIL = 0;
//	private static final int DELETE_FAIL = 1;
//	private static final int DELETE_SUCCESS = 0;

	private BoardDAO() {

		try {
			Context ct = new InitialContext();
			ds = (DataSource) ct.lookup("java:comp/env/jdbc/mysql");
		} catch (Exception e) {
			e.printStackTrace();

		}
	}

	// DAO의 연결부(생성자, getInstance() 까지 작성해주세요
	private static BoardDAO dao = new BoardDAO();

	public static BoardDAO getInstance() {
		if (dao == null) {
			dao = new BoardDAO();
		}
		return dao;
	}

	public int write(BoardVO board) {
		// connection, preparedStatement 객체 선언
		Connection con = null;
		PreparedStatement pstmt = null;

		// 구문작성
		// bId는 auto_increment가 붙어있으므로 입력 안해도 됨
		// bName, bTitle, bContent는 폼에서 날려준걸 넣음
		// bDate는 나동으로 현재 서버시간을 입력함
		// bhit는 자동으로 0을 입력함
		String sql = "INSERT INTO jspboard (bname, btitle, bcontent, bdate, bhit)" 
					+ "VALUES(?, ?, ?, now(), 0)";

		try {
			// 커넥션 생성 및 pstmt에 쿼리문 넣고 완성시켜서 실행까지 하고
			// close()로 메모리회수까지 해주세욘

			con = ds.getConnection();
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, board.getbName());
			pstmt.setString(2, board.getbTitle());
			pstmt.setString(3, board.getbContent());

			pstmt.executeUpdate();
			return WRITE_SUCCESS;

		} catch (Exception e) {
			System.out.println("에러: " + e);
			e.printStackTrace();

		} finally {
			try {
				if (con != null && !con.isClosed()) {
					con.close();
				}
				if (pstmt != null && !pstmt.isClosed()) {
					pstmt.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
		return WRITE_FAIL;
	}// end write()

	// 모든 게시글의 정보를 DB로부터 얻어올 메서드
	public List<BoardVO> getBoardList() {
		// 내부에서 사용할 변수 선언
		List<BoardVO> boardList = new ArrayList<BoardVO>();
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		// Sql문 작성 조회할떄는 최신글이 위에 오도록 order by
		String sql = "SELECT * FROM jspboard ORDER BY bId DESC";

		try {
			// 커넥션 연결 후 DB에 쿼리 쏴주고
			con = ds.getConnection();
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();

			// boardList에 DB내 모든 글을 저장
			while (rs.next()) { // rs.next() 처음 while문 열릴때 인덱스 값이 -1에서 0으로 이동
				BoardVO board = new BoardVO();

				board.setbId(rs.getInt("bid"));
				board.setbName(rs.getString("bname"));
				board.setbTitle(rs.getString("btitle"));
				board.setbContent(rs.getString("bcontent"));
				board.setbDate(rs.getTimestamp("bdate"));
				board.setbHit(rs.getInt("bhit"));

				boardList.add(board);

			}
//			System.out.println("db board: " + boardList);

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (con != null && !con.isClosed()) {
					con.close();
				}
				if (pstmt != null && !pstmt.isClosed()) {
					pstmt.close();
				}
				if (rs != null && !rs.isClosed()) {
					rs.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return boardList;
	}// end getBoardList()

	// 게시물 조회
	public BoardVO getBoardDetail(String bId) {

		// bId에 해당하는 글 정보를 가져와서 리턴하도록 로직을 작성
		BoardVO board = new BoardVO();
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		String sql = "SELECT * FROM jspboard WHERE bid = ?";

		try {
			con = ds.getConnection();
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, bId);
			rs = pstmt.executeQuery();

			if (rs.next()) {
				board.setbId(rs.getInt("bid"));
				board.setbName(rs.getString("bname"));
				board.setbTitle(rs.getString("btitle"));
				board.setbContent(rs.getString("bcontent"));
				board.setbDate(rs.getTimestamp("bdate"));
				board.setbHit(rs.getInt("bhit"));

				System.out.println("상세조회 정보: " + board);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (con != null && !con.isClosed()) {
					con.close();
					if (pstmt != null && !pstmt.isClosed()) {
						pstmt.close();
					}
					if (rs != null && !rs.isClosed()) {
						rs.close();
					}
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return board;

	}// end getBoardDetail()

	// 삭제
	public int deleteBoard(String bId) {
		// 사용할 변수들 선언
		Connection con = null;
		PreparedStatement pstmt = null;
		int resultCode;

		// 커넥션 연결 및 쿼리문 실행
		String sql = "DELETE FROM jspboard WHERE bid = ?";

		try {
			// 커넥션 생성 및 pstmt에 쿼리문 넣고 완성시켜서 실행까지 하고
			// close()로 메모리회수까지 해주세욘

			con = ds.getConnection();
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, bId);

			pstmt.executeUpdate();
			
			System.out.println("db delete 번호: " + bId);
			resultCode = 1;

		} catch (Exception e) {
			System.out.println("에러: " + e);
			e.printStackTrace();
			resultCode = 0;

		} finally {
			try {
				if (con != null && !con.isClosed()) {
					con.close();
				}
				if (pstmt != null && !pstmt.isClosed()) {
					pstmt.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
		return resultCode;
	}// end deleteBoard()
	
	/// 업데이트
	public int updateBoard(BoardVO board) {
		// connection, preparedStatement 객체 선언
		Connection con = null;
		PreparedStatement pstmt = null;
		int result;
		// 구문작성

		String sql = "UPDATE jspboard SET bName =?, bTitle = ?, bContent = ?,"+
					"bDate = ?, bHit = ? " +
					"WHERE bId = ?";

		try {
			// 커넥션 생성 및 pstmt에 쿼리문 넣고 완성시켜서 실행까지 하고
			// close()로 메모리회수까지 해주세욘

			con = ds.getConnection();
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, board.getbName());
			pstmt.setString(2, board.getbTitle());
			pstmt.setString(3, board.getbContent());
			pstmt.setTimestamp(4, board.getbDate());
			pstmt.setInt(5, board.getbHit());
			pstmt.setInt(6, board.getbId());

			pstmt.executeUpdate();
			result = 1;
			System.out.println("정보 변경결과: " + result);

		} catch (Exception e) {
			System.out.println("에러: " + e);
			e.printStackTrace();
			result = 0;
			System.out.println("정보 변경결과: " + result);
		} finally {
			try {
				if (con != null && !con.isClosed()) {
					con.close();
				}
				if (pstmt != null && !pstmt.isClosed()) {
					pstmt.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
		return result;
	}// end updateBoard()


}// end class
