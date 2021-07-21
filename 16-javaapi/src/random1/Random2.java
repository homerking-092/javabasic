package random1;

import java.util.Random;
import java.util.Scanner;

public class Random2 {
	public static void main(String[] args) {
		// Random 객체를 생성한 다음 nextBoolean() 기능을 이용해서
		// 동전던지기 카운팅 프로그램을 만들어보자
		// n회 던졌을때 true = 앞면, false = 뒷면으로 간주해서
		// 프로그램이 다 끝났을 때 앞면 몇회, 뒷면 몇회인지
		// 콘솔에 출력
		// 실행 횟수 n회는 스캐너로 입력받는다
		Scanner scan = new Scanner(System.in);
		System.out.print("실행 횟수를 입력하세요: ");
		int cnt = scan.nextInt();
		Random random = new Random();
		int cntf = 0;
		int cntb = 0;
		for (int i = 1; i <= cnt; i++) {
			if (random.nextBoolean()) {
				cntf++;
			} else {
				cntb++;
			}
		}
		System.out.println(cnt + "바퀴 돌린 결과값");
		System.out.println("앞면: " + cntf);
		System.out.println("뒷면: " + cntb);

	}
}
