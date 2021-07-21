import java.util.Scanner;

public class ScoreChecker {
	public static void main(String[] args) {
		// 성적 판독기
		// if ~ else if ~else구문을 사용
		// 성적 기준은
		// 95점 이상 A+, 90점 이상 A0, 85점 이상 B+
		// 80점 이상 B0, 75점 이상 C+, 70점 이상 C0, 65점 이상 D+,
		// 60점 이상 D0, 60미만 F로 프린트구문으로 콘솔에 출력
		// 스캐너로 int score변수에 성적을 입력 받는다

		Scanner sc = new Scanner(System.in);
		System.out.println("성적을 입력해주세요");
		int score = sc.nextInt();
		if (score >= 95) {
			System.out.print("A+");
		} else if (score >= 90) {
			System.out.print("A0");
		} else if (score >= 85) {
			System.out.print("B+");
		} else if (score >= 80) {
			System.out.print("B0");
		} else if (score >= 75) {
			System.out.print("C+");
		} else if (score >= 70) {
			System.out.print("C0");
		} else if (score >= 65) {
			System.out.print("D+");
		} else if (score >= 60) {
			System.out.print("D0");
		} else {
			System.out.print("F");
		}
		System.out.print("입니다");

	}
}
