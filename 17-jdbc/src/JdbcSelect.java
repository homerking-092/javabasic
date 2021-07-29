import java.sql.*;

public class JdbcSelect {
	// mysql의 employees와 연결해주세요

	public static void main(String[] args) {
		Connection con = null;
		// 쿼리문을 날리기 위해 먼저 구문 객체를 생성합니다
		Statement stmt = null;
		// SELECT 문은 결과물이 존재하기 떄문에
		// 결과데이터를 받아줄 ResultSET도 필요합니다
		ResultSet rs = null;

		// DB 연결에 관련된 로직은 무조건 try ~ catch 구문을 활용하도록 강요받습니다
		try {
			// MySQL DB와 연동할 것임을 나타냅니다
			Class.forName("com.mysql.jdbc.Driver");

			// 접속 url은 jdbc:mysql://localhost/db명 입니다
			String url = "jdbc:mysql://localhost/employees";

			// 접속주소, 계정, 비밀번호를 이용해 접속요청을 넣습니다
			con = DriverManager.getConnection(url, "root", "mysql");

			// 쿼리를 실행하는 stmt 객체 처리
			// con 변수가 url, 아이디, 비밀번호 정보가 있기 때문에
			// con 변수의 정보를 stmt에 넘기는 것
			stmt = con.createStatement();
			
			// SQL쿼리를 작성한 뒤 stmt의 파라미터로 제공합니다
			// 쿼리작성법
			// 1) JDBC에서는 가장 마지막 ;를 생략합니다
			// 2) *로 컬럼을 지정하면 전체데이터를 가져오고, 컬럼명을 적으면 일부만 가져옵니다
			String sql = "SELECT emp_no FROM employees LIMIT 2";
			
			// 작성된 쿼리를 수행시킵니다
			// 결과물은 위의 rs 변수에 저장합니다
			rs = stmt.executeQuery(sql);
			
			// rs는 커서라는 개념을 사용합니다
			// rs는 인덱스 -1번부터 시작합니다
			// rs의 길이는 로우갯수만큼 생성됩니다
			// (SELECT문의 결과가 로우1개면 길이 1
			// SELECT문의 결과가 로우 10개면 길이 10)
			// 커서를 옮기는 방법은 rs.next()를 호출하면 됩니다
			// rs.next()는 커서 옮기는 기능과 더불어,
			// 다음 자료가 조회되면 true, 조회되지 않으면 false를 출력합니다
			
			// 첫 호출에 따라 -1번에서 0번 인덱스로 커서 이동
			rs.next();		// -1번에서 0번으로
			
			// rs.get자료형(컬럼번호); 를 통해 자료를 받아올 수 있습니다
			// 컬럼번호는 1번부터 시작합니다
			// rs.get자료형("컬럼이름"); 을 대신 사용할 수 있습니다
			System.out.println(rs.getInt("emp_no"));
//			System.out.println(rs.getInt(1));
			
			// 하단에 10002번도 조회해서 콘솔에 찍어주세연
			System.out.println(rs.next()); // 0번에서 1번으로
			System.out.println(rs.getInt("emp_no"));
			System.out.println(rs.getInt(1));
			System.out.println(rs.next());

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

	}//end main
}//end class
