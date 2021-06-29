package exception1;

import java.util.Scanner;

public class Exception3 {
	public static void main(String[] args) {

		// 예외 발생 케이스 3.
		// 클래스 자료형을 생성할 때 new로 정보를 대입하지 않는 경우
		Scanner scan = null;
		scan.nextInt();
	}
}
