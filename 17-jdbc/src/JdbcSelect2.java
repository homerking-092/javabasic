import java.sql.*;
import java.util.Scanner;

public class JdbcSelect2 {
	public static void main(String[] args) {
		// 1. 커넥터 연결을 해 주세요. employees DB를 연결합니다
		// 2. 조회구문은 SELECT emp_no, first_name FROM employees LIMIT 10;
		// 3. 위 조회구문으로 조회한 결과물을 while문믈 활용해서
		// 콘솔창에 사번 : emp_no, 성 : first_name 과 같은 형태로
		// 10줄을 출력하도록 처리
		// hint) while(rs.next())를 조건식으로 잡으면
		// 정확하게 ResultSet에 저장된 만큼만 반복하고 끝
		
		
		Connection con = null;
		// 쿼리문을 날리기 위해 먼저 구문 객체를 생성합니다
		Statement stmt = null;
		// SELECT 문은 결과물이 존재하기 떄문에
		// 결과데이터를 받아줄 ResultSET도 필요합니다
		ResultSet rs = null;

		
		Scanner scan = new Scanner(System.in);
		System.out.print("조회할 인원 수: ");
		int number = scan.nextInt();
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
			String sql = "SELECT emp_no, first_name, hire_date FROM employees limit " + number;

			// 작성된 쿼리를 수행시킵니다
			// 결과물은 위의 rs 변수에 저장합니다
			rs = stmt.executeQuery(sql);

//			while (rs.next()) {
//				System.out.println("사번: " + rs.getInt(1) + ", 성: " + rs.getString(2));
//				
//				
//			}
//			System.out.println("------------------------");
			while (rs.next()) {
				int num = rs.getInt("emp_no");
				String name = rs.getString("first_name");
				Date hDate = rs.getDate("hire_date");
				System.out.println("사번: " + num + ", 성: " + name + "   , 고용 날짜: " + hDate);
//				System.out.printf("사번: %d, 성: %s, 고용날짜: %o", num, name, hDate);
			}

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

	}//
}//
