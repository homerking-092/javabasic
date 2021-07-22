import java.sql.*;

public class OjdbcSelect {
	public static void main(String[] args) {
		// Oracle SQL과 연동해서 
		// Employees 테이블의 모든 인원에 대한 정보를
		// 콘솔창에 띄우세연
		// SELECT * FROM employees; 에 대한 결과물을 콘솔창에 ㄱㄱ
		
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;

		try {
			// Oracle SQL과 연동할 것임을 나타냄
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// 접속 URL도 Oracle SQL에 맞춰서 적습니다
			String url = "jdbc:oracle:thin:@localhost:1521/XEPDB1";

			con = DriverManager.getConnection(url, "hr", "hr");
			stmt = con.createStatement();
			String sql = "SELECT employee_id, first_name, hire_date, job_id, salary FROM employees WHERE employee_id >= 200 "
					+ "ORDER BY employee_id ASC ";
			
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				Date hDate = rs.getDate(3);
				String jId = rs.getString(4);
				int sal = rs.getInt(5);
				System.out.println("아이디: " + id +
								   ", 성: " + name + 
								   ", 입사일: " + hDate + 
								   ", 직무명: " + jId + 
								   ", 연봉: " + sal);
			}
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

	}//
}//
