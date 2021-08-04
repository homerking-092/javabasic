package kr.co.ictedu;
import java.sql.*;
public class UsersDAO {
	
	// DB주소 아이디 패스워드 미리 저장
	private static final String URL = "jdbc:mysql://localhost/ict03";
	private static final String DBID = "root";
	private static final String DBPW = "mysql";
	
	/*
	 * DAO 클래스는 하나의 객체만으로도 DB연동을 수행할 수 있기 때문에
	 * 메모리 관리 차원에서 클래스의 객체를 단 1개만 생성하도록
	 * 싱글톤 패턴을 적용하여 클래스를 디자인합니다
	 */
	
	// 싱글톤 패턴 클래스 디자인 방법
	// 1. 외부에서 객체를 new 키워드로 만들어 쓸 수 없도록 생성자에
	// private를 붙여줍니다
	
	private UsersDAO() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
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

		try{
			

			con = DriverManager.getConnection(URL, DBID, DBPW);
			
			// 1. 쿼리문을 작성합니다
			String sql = "INSERT INTO users VALUES(?, ?, ?, ?)";
			
			// 2. 만들 쿼리문의 ? 자리에 적용할 자바 변수를 접어넣습니다
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, user.getUid());
			pstmt.setString(2, user.getUpw());
			pstmt.setString(3, user.getUname());
			pstmt.setString(4, user.getEmail());
			System.out.println("회원가입정보");
			System.out.println("id: " + user.getUid() + ", pw: " + user.getUpw() + 
								", 이름: " + user.getUname() + ", 이메일: " + user.getEmail());
			
			// 3. 만든 쿼리문 실행하기
			pstmt.executeUpdate();
			
		
		}catch(SQLException e){
			System.out.println("에러: " + e);
		}finally{
			try{
				// con 닫기
				if(con != null && !con.isClosed()){
					con.close();
				}
				// pstmt 닫기
				if(pstmt != null && !pstmt.isClosed()) {
					pstmt.close();
				}
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
		return 1;
		
	}//end joinUsers()
	
	
	
}//end class
