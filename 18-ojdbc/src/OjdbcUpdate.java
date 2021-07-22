import java.sql.*;
import java.util.Scanner;

public class OjdbcUpdate {
	public static void main(String[] args) {
		
		Connection con = null;
		PreparedStatement pstmt = null;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("수정할 번호를 입력하세요: ");
		int num = scan.nextInt();
		System.out.print("수정할 문자를 입력하세요: ");
		String strr = scan.next();
		
		try {
			// Oracle SQL과 연동할 것임을 나타냄
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// 접속 URL도 Oracle SQL에 맞춰서 적습니다
			String url = "jdbc:oracle:thin:@localhost:1521/XEPDB1";

			con = DriverManager.getConnection(url, "mytest", "mytest");

			// 1. PreparedStatement 구문은 쿼리문을 먼저 만들고 시작합니다
			// 기존의 자바 변수가 들어갈 자리에 ? 로 대신해서 작성합니다
			// 자료형 막론하고 문자열에도 ' 를 붙이지 않고 ? 로만 처리하면 됩니다
			String sql = "UPDATE ojdbcTest SET num = ?, str = ? WHERE num = ? ";
			
			// 2. 만든 쿼리문의 ? 자리에 적용할 자바 변수를 집어넣습니다
			// pstmt 변수를 생성해 놓은 다음, set자료형( ? 순서, 집어넣을 변수)를 이용해
			// ? 를 모두 채워줍니다
			// 아래 코드는 첫 번째 ? 에는 1을, 두 번째 ? 에는 "test"를 대신 넣겠다는 의미
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, num);
			pstmt.setString(2, strr);
			pstmt.setInt(3, num);
			System.out.println("수정할 번호: " + num + ", 입력 문자: " + strr);
			
			// 3. 입력이 모두 끝난 쿼리문을 실행합니다
			pstmt.executeUpdate();

		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패");
		} catch (SQLException e) {
			System.out.println("에러: " + e);
		} finally {
			try {
				if (con != null && !con.isClosed()) {
					con.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();

			}
		}

	}
}
