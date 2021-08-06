package kr.co.ictedu;

import java.sql.*;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;




public class UsersDAO {

	// DB주소 아이디 패스워드 미리 저장
	
	// 일반  DAO 활용시 사용하던 것들
//	private static final String URL = "jdbc:mysql://localhost/ict03";
//	private static final String DBID = "root";
//	private static final String DBPW = "mysql";
	
	// 커넥션 풀 설정 후 사용하는 것
	// javax.sql의 DataSource
	private DataSource ds; 

	// 메서드 결과에 따른 리턴값 상수로 표기
	private static final int ID_DELETE_SUCCESS = 1;
	private static final int ID_DELETE_FAIL = 0;

	private static final int ID_LOGIN_SUCCESS = 1;
	private static final int ID_LOGIN_FAIL = -1;
	private static final int PW_LOGIN_FAIL = 0;

	private static final int UPDATE_SUCCESS = 1;
	private static final int UPDATE_FAIL = 0;

	/*
	 * DAO 클래스는 하나의 객체만으로도 DB연동을 수행할 수 있기 때문에 메모리 관리 차원에서 클래스의 객체를 단 1개만 생성하도록 싱글톤
	 * 패턴을 적용하여 클래스를 디자인합니다
	 */

	// 싱글톤 패턴 클래스 디자인 방법
	// 1. 외부에서 객체를 new 키워드로 만들어 쓸 수 없도록 생성자에
	// private를 붙여줍니다

	private UsersDAO() {
		
		// 일반 JDBS에서 활용하던 드라이버 설정 코드
//		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		
		// 커넥션 풀에서 활용하는 드라이버 설정코드
		// javax.naming의 요소를 임포트
		try {
			Context ct = new InitialContext();
			ds = (DataSource)ct.lookup("java:comp/env/jdbc/mysql");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	// 2. 외부에서 객체생성을 못하기 때문에 자기 클래스 내부에서
	// 그냥 스스로 자기 자신을 1개 생성합니다
	private static UsersDAO dao = new UsersDAO();

	// 3. 외부에서 객체 생성이 필료할 때 public 선언으로 처리한
	// getter를 이용해 2에서 만든 객체를 리턴만 해줍니다
	// 이러면 UsersDAO는 참조형 변수이기 때문에 주소값만 전달합니다
	public static UsersDAO getInstance() {
		return dao;
	}

	// 회원가입을 처리하는 메서드 선언
	// DB에 들어가는 데이터, 혹은 DB에서 출력되어 나오는 데이터
	// 모두가 UsersVO 내부 자료 형식을 벗어날 수 없으므로
	// 대다수 입출력은 전부 VO를 매개로 진행합니다
	public int joinUsers(UsersVO user) {
		// users_join.jsp에서 가져온 코드를 이곳에 붙여넣기를 합니다
		// 연결로직을 만들어주세요
		Connection con = null;

		// 쿼리문 실행을 위한 PreparedStatement 객체 생성
		PreparedStatement pstmt = null;

		try {
			
			// JDBC 기준 DB 접속 코드
//			con = DriverManager.getConnection(URL, DBID, DBPW);
			
			// 커넥션 풀 기준 접속코드
			con = ds.getConnection();


			// 1. 쿼리문을 작성합니다
			String sql = "INSERT INTO users VALUES(?, ?, ?, ?)";

			// 2. 만들 쿼리문의 ? 자리에 적용할 자바 변수를 접어넣습니다
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, user.getUid());
			pstmt.setString(2, user.getUpw());
			pstmt.setString(3, user.getUname());
			pstmt.setString(4, user.getEmail());
			System.out.println("회원가입정보");
			System.out.println("id: " + user.getUid() + ", pw: " + user.getUpw() + ", 이름: " + user.getUname()
					+ ", 이메일: " + user.getEmail());

			// 3. 만든 쿼리문 실행하기
			pstmt.executeUpdate();

		} catch (SQLException e) {
			System.out.println("에러: " + e);
		} finally {
			try {
				// con 닫기
				if (con != null && !con.isClosed()) {
					con.close();
				}
				// pstmt 닫기
				if (pstmt != null && !pstmt.isClosed()) {
					pstmt.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return 1;

	}// end joinUsers()

	// userDelete
	// 원래 대다수 DAO는 UsersVO 하나로 모든 처리를 해결할 수 있습니다
	// 다만 삭제로 작은 폼에서 날린 비밀번호와 원래 DB에 저장되어있던 비밀번호를
	// 비교해야 하기 때문에 폼에서 날린 비밀번호를 추가로 입력받습니다

	public int usersDelete(UsersVO user, String dpw) { // 왜 int형이냐? delete할 컬럼이 int형이기 때문

		// Thread.sleep(1500);
		// 연결로직을 만들어주세요

		Connection con = null;

		// 쿼리문 실행을 위한 PreparedStatement 객체 생성
		PreparedStatement pstmt = null;

		try {
			System.out.println("유저 입력 패스워드 : " + user.getUpw());
			System.out.println("DB 패스워드 : " + dpw);
			// UsersVO에 입력된 비밀번호와 폼에서 날린 dpw를 비교
			if (user.getUpw().equals(dpw)) {

//				con = DriverManager.getConnection(URL, DBID, DBPW);
				con = ds.getConnection();

				// 1. delete 쿼리문을 작성합니다
				String sql = "DELETE FROM users WHERE uid = ?";

				// 2. 만들 쿼리문의 ? 자리에 적용할 자바 변수를 접어넣습니다
				pstmt = con.prepareStatement(sql);
				pstmt.setString(1, user.getUid());
				System.out.println("삭제 정보");
				System.out.println("삭제한 id: " + user.getUid());

				// 3. 만든 쿼리문 실행하기
				pstmt.executeUpdate();

				// 내부적으로 session, response 등 내장 객체에 대한
				// 처리를 할수 없으므로, 결과 정보만 리턴
				return ID_DELETE_SUCCESS;

			} else {
				// 비밀번호를 틀리게 입력한 경우
				System.out.println("비밀번호가 다릅니다");
				return ID_DELETE_FAIL;

			}

		} catch (SQLException e) {
			System.out.println("에러: " + e);
		} finally {
			try {
				// con 닫기
				if (con != null && !con.isClosed()) {
					con.close();
				}
				// pstmt 닫기
				if (pstmt != null && !pstmt.isClosed()) {
					pstmt.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		// 상단 try블럭 내에서 로직이 처리가 안되어서 여기까지 코드가
		// 도달했다는 자체로 이미 뭔가 실행이 누락되었다는 이야기이므로
		// 0을 리턴
		return ID_DELETE_FAIL;

	}// end usersDelete()

	// userLogin
	public int userLogin(UsersVO user) {
		// DB연결로직을 집어넣어주세요
		Connection con = null;

		PreparedStatement pstmt = null;
		ResultSet rs = null; // select로 조회하기 위해

		// if ~ else문으로 try ~ catch ~ finally로 감싸서
		// 세션이 존재할 때는 DB에서 데이터를 가져오는 로직을 생략해주세요

		try {

//			con = DriverManager.getConnection(URL, DBID, DBPW);
			con = ds.getConnection();

			// 1. SELECT 쿼리문을 작성합니다
			// 입력받은 id가 실제로 DB에 존재하는지 조회하는 쿼리문 작성
			String sql = "SELECT * FROM users WHERE uid = ?";

			// 2. 쿼리문의 ?자리에 적용할 변수를 집어넣습니다
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, user.getUid());

			// 3. 쿼리문 실행 및 데이터 받아오기
			rs = pstmt.executeQuery();

			// rs.next()를 통해 데이터가 들어왔는지 안 들어왔는지 확인

			if (rs.next()) {

				// 들어왔다면 DB쪽 데이터 받기
				String dbId = rs.getString("uid");
				String dbPw = rs.getString("upw");

				// 폼에서 보낸 데이터와 DB쪽 데이터간 아이디 비밀번호 일치여부 비교해서
				// 아이디와 비밀번호 모두 일치시 세션 발급 및 body태그에 id 출력
				// 비밀번호가 틀린 경우 역시 user_login_fail.jsp로 보내줌

				// 사용자가 보내준 user
				if (user.getUid().equals(dbId) && user.getUpw().equals(dbPw)) { // 굳이 id 비교하지 않아도됨

					System.out.println("입력한 아이디: " + user.getUid());
					return ID_LOGIN_SUCCESS;
				} else {
					System.out.println("비밀번호를 잘못 입력하셨습니다");
					System.out.println("입력한 비밀번호: " + user.getUpw());
					return PW_LOGIN_FAIL;
				}

				// 들어오지 않았다면 user_login_fail.jsp로 리다이렉트
			} else {
				System.out.println("없는 아이디입니다: " + user.getUid());
				return ID_LOGIN_FAIL;
			}

		} catch (SQLException e) {
			System.out.println("에러: " + e);
		} finally {
			// 연결끊기
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

		return ID_LOGIN_FAIL;
	}// end userLogin()

	// getUserInfo() 메서드
	// 수정 로직을 사용하기 전에 수정할 타겟 아이디의 정보를 얻어오기 위해
	// 사용하는 메서드로 아이디, 비밀번호, 이름, 이메일을 UsersVO에 넣어서 리턴합니다
	public UsersVO getUserInfo(UsersVO user) {

		// DB연결 후 입력받은 user의 .getId()를 이용해 조회구문 완성

		// DB연결로직을 집어넣어주세요
		Connection con = null;

		PreparedStatement pstmt = null;
		ResultSet rs = null; // select로 조회하기 위해

		UsersVO resultData = new UsersVO();

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

//			con = DriverManager.getConnection(URL, DBID, DBPW);
			con = ds.getConnection();

			// 1. SELECT 쿼리문을 작성합니다
			// 입력받은 id가 실제로 DB에 존재하는지 조회하는 쿼리문 작성
			String sql = "SELECT * FROM users WHERE uid = ?";

			// 2. 쿼리문의 ?자리에 적용할 변수를 집어넣습니다
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, user.getUid());

			// 3. 쿼리문 실행 및 데이터 받아오기
			rs = pstmt.executeQuery();

			// rs.next()를 통해 데이터가 들어왔는지 안 들어왔는지 확인

			if (rs.next()) {
				// 이후 ResultSet에 담겨있는 자료를 다시 다 꺼내서
				// 새로 선언한 UsersVO 변수에 입력해준 후
				resultData.setUid(rs.getString("uid"));
				resultData.setUpw(rs.getString("upw"));
				resultData.setUname(rs.getString("uname"));
				resultData.setEmail(rs.getString("email"));
			}

		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패");
		} catch (SQLException e) {
			System.out.println("에러: " + e);
		} finally {
			// 연결끊기
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
		// ResultSet에 있던 자료를 입력받는 UsersVO를 리턴
		return resultData;

	}// end getUserInfo()

	// userUpdate
	public int userUpdate(UsersVO user) {

		// DB연결로직을 집어넣어주세요
		Connection con = null;

		PreparedStatement pstmt = null;

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");

//			con = DriverManager.getConnection(URL, DBID, DBPW);
			con = ds.getConnection();

			// 1. SELECT 쿼리문을 작성합니다
			// 입력받은 id가 실제로 DB에 존재하는지 조회하는 쿼리문 작성
			String sql = "UPDATE users SET uname = ?, email = ? WHERE uid = ?";

			// 2. 쿼리문의 ?자리에 적용할 변수를 집어넣습니다
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, user.getUname());
			pstmt.setString(2, user.getEmail());
			pstmt.setString(3, user.getUid());

			// 3. 쿼리문 실행 및 데이터 받아오기
			pstmt.executeUpdate();

			System.out.println("수정된 이름: " + user.getUname());
			System.out.println("수정된 이메일: " + user.getEmail());

			return UPDATE_SUCCESS;

		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패");
		} catch (SQLException e) {
			System.out.println("에러: " + e);
		} finally {
			// 연결끊기
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
		return UPDATE_FAIL;
	}// end userUpdate()

	/////////////////////////////////////////////////
	// getAllUser()
	public ArrayList<UsersVO> getAllUser() {
		// users_join.jsp에서 가져온 코드를 이곳에 붙여넣기를 합니다
		// 연결로직을 만들어주세요
		Connection con = null;

		// 쿼리문 실행을 위한 PreparedStatement 객체 생성
		PreparedStatement pstmt = null;

		ResultSet rs = null; // select 사용하기 위해

		// 비어있는 ArrayList<UsersVO>도 같이 선언
		ArrayList<UsersVO> userList = new ArrayList<UsersVO>();

		try {

//			con = DriverManager.getConnection(URL, DBID, DBPW);
			con = ds.getConnection();

			// 1. 쿼리문을 작성합니다
			String sql = "SELECT * FROM users;";

			// 2. 만들 쿼리문의 ? 자리에 적용할 자바 변수를 접어넣습니다
			pstmt = con.prepareStatement(sql);

			// 3. 만든 쿼리문 실행하기
			rs = pstmt.executeQuery();

			// row 갯수만큼 돌리기 때문에 while
			while (rs.next()) {
				// ArrayList에 넣어줄 빈 UsersVO생성
				UsersVO user = new UsersVO();

				// ResultSet에 든 컬럼별 값을 꺼냅니다
				String uid = rs.getString("uid");
				String upw = rs.getString("upw");
				String uname = rs.getString("uname");
				String email = rs.getString("email");

				// UsersVo에 setter로 저장합니다
				user.setUid(uid);
				user.setUpw(upw);
				user.setUname(uname);
				user.setEmail(email);
				// ArrayList에 그 UsersVO를 저정합니다
				userList.add(user);

			}

		} catch (SQLException e) {
			System.out.println("에러: " + e);
		} finally {
			try {
				// con 닫기
				if (con != null && !con.isClosed()) {
					con.close();
				}
				// pstmt 닫기
				if (pstmt != null && !pstmt.isClosed()) {
					pstmt.close();
				}if (rs != null && !rs.isClosed()) {
					rs.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		// 테이블에 있던 모든 자료를 가지고 있는 userList를 리턴
		return userList;

	}// end getAllUser()

}// end class
