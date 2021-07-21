import java.sql.*;
import java.util.Scanner;

public class JdbcDelete {
	public static void main(String[] args) {
		Connection con = null;
		Statement stmt = null;
//		ResultSet rs = null; 	ResultSet은 SELECT구문에 대한 결과만 처리함

		// DB 연결에 관련된 로직은 무조건 try ~ catch 구문을 활용하도록 강요받습니다

		Scanner scan = new Scanner(System.in);
		System.out.print("삭제할 num 값: ");
		int number = scan.nextInt();

//		System.out.print("삭제할 str 값: ");
//		String strr = scan.next();

		try {
			// MySQL DB와 연동할 것임을 나타냅니다
			Class.forName("com.mysql.jdbc.Driver");
			// 접속 url은 jdbc:mysql://localhost/db명 입니다
			String url = "jdbc:mysql://localhost/sqldb";
			con = DriverManager.getConnection(url, "root", "mysql");

			stmt = con.createStatement();

			// 쿼리문이 길다면 아래와 같이 + 로 여러줄로 나눠서 연결
			String sql = "DELETE FROM JDBCInsert WHERE num = " + number ;
			System.out.println(sql);

			// SELECT문은 executeQuery(sql구문); 형식으로 호출하지만
			// 이외구문은 executeUpdate(sql구문); 으로 호출합니다
			stmt.executeUpdate(sql);

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
