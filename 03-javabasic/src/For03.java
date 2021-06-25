import java.util.Scanner;

public class For03 {
	public static void main(String[] args) {
		// 구구단 출력기를 만들자
		// 1~9중 하나의 숫자를 입력받는다
		// 만약 1~9 범위를 벗어난 숫자가 입력된다면
		// "범위 내의 수를 입력해주세요"라는 안내문구를 적고 종료한다
		// 맞는 숫자가 들어온다면 결과 예시처럼 출력한다

		Scanner scan = new Scanner(System.in);
		System.out.print("숫자를 입력해 주세요 :");
		int number = scan.nextInt();

		if (number < 10 && number > 0) {

			for (int i = 0; i < 9; i++) {
				System.out.println(number + " * " + (i + 1) + " = " + number * (i + 1));
			}
		} else {
			System.out.println("1 ~ 9 범위 내의 수를 입력해주세요");
		}

	}// end main
}// end class
