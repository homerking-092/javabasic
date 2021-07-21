import java.sql.*;

public class JdbcConnection {
	public static void main(String[] args) {
		// JAVA와 DB를 연동하기 위해서 JDBC라는 API가 필요합니다
		// MySQL은 그중에서도 Connector J 라는 라이브러리를 이용합니다
		// Connector J는 MySQL 공식 홈페이지에서 다운받아 설치할 수도 있고
		// 아니면 jar파일만 구해서 바로 적용할 수도 있습니다
		// 공식 홈페이지 루트는
		// 1. mysql 홈페이지 접속
		// 2. download 탭에서 하단의 mysql community(GPL) 선택
		// 3. OS에 맞는 버전 선택(mysql installer 선택)
		// 4. 상단의 2메가바이트짜리 업데이트 파일 다운 후 실행
		// 5. connector j 설치
		// 6. program files(x86) -> masql -> connector j 폴더
		// 내부의 .jar 파일을 확인하면 됩니다

		// jar파일을 어떤 경로로든 구했다면, 사용할 프로젝트에
		// jar파일을 추가해줘야 합니다
		// 프로젝트별로 계소고 추가해야 하니 방법을 잘 기억해자
		// 1. 프로젝트 우클릭 -> properties -> 좌측탭의 java build path
		// 2. 상단 탭의 library 선택 후 Add library 선택
		// 3. user library 선택
		// 4. 우측 new 버튼 누르고 이름 임의로 입력(현재 jdbc connection)
		// 5. Add External Jar 선택후 connectoe j 폴더로 이동
		// 6. jar파일 선택 후 apply and close 선택

		// DB 연동 코드 작성
		// 위쪽의 모든 작업이 끝났다면 본격적으로 코드를 작성해보자
		// 기본적으로 import java.sql.*;을 1번라인에 입력하고 시작합니다

		// 연결은 Connection 자료형으로 진행합니다
		Connection con = null;

		// DB 연결에 관련된 로직은 무조건 try ~ catch 구문을 활용하도록 강요받습니다
		try {
			// MySQL DB와 연동할 것임을 나타냅니다
			Class.forName("com.mysql.jdbc.Driver");

			// 접속 url은 jdbc:mysql://localhost/db명 입니다
			String url = "jdbc:mysql://localhost/sqldb";

			// 접속주소, 계정, 비밀번호를 이용해 접속요청을 넣습니다
			con = DriverManager.getConnection(url, "root", "mysql");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패");
		} catch (SQLException e) {
			System.out.println("에러 : " + e);
		} finally {
			try {
				if (con != null && !con.isClosed()) {
					con.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}// end main
}// end class
