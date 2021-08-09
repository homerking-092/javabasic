package kr.co.ictedu.board.model;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class BoardDAO {
	// 싱글톤 패턴과 커넥션풀을 적용해서

	private DataSource ds;

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
		return dao;
	}

}//end class
