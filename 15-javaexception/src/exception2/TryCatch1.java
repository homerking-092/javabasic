package exception2;

import java.util.Scanner;

public class TryCatch1 {
	public static void main(String[] args) {
		// try ~ catch 구문은 크게 예외가 발생할 수 있는 구문을 적는
		// try블럭과 예외 발생시 처리할 catch블럭으로 나뉜다
		Scanner scan = new Scanner(System.in);

		System.out.print("1번 정수를 입력하세요: ");
		int a = scan.nextInt();
		System.out.print("2번 정수를 입력하세요: ");
		int b = scan.nextInt();

		try {
			// 예외가 발생할 구문을 적는 블럭. try 블럭은
			// 반드시 하단에 catch 블럭이 추가로 작성되어야 한다
			System.out.println(a / b);
			System.out.println("계산 끝");
		} catch (Exception e) {
			// catch블럭에는 (Exception e)가 기본으로 들어간다
			// 추후 특정한 종류의 예외만 처리하고 싶을 때 다른 자료형을 적어주면 된다
			System.out.println("나누는 수는 0이 될 수 없습니다");
		} finally {
			// 모든 실행구문이 끝나고 실행할 코드는
			// finally 블럭 내부에 작성한다
			System.out.println("코드 끝");
		}
	}
}
