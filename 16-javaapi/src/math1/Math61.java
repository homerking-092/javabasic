package math1;

public class Math61 {
	public static void main(String[] args) {
		// 가위바위보 게임을 만들어보자
		// Math.random()을 이용해 1/3 확률로 가위, 바위, 보를 부여받으며
		// 가위 > 보, 바위 > 가위, 가위 > 보의 상성을 가진다
		// 같은 요소가 나오면 무승부
		// 힌트) 컴퓨터가 이기는 경우, 내가 이기는 경우, 비기는 경우
		int user = (int) (Math.random() * 3);
		int com = (int) (Math.random() * 3);

		// 상수를 처리하는 부분
		final int SCISSORS = 0;
		final int ROCK = 1;
		final int PAPER = 2;

		// 내가 낸 것과 컴퓨터가 낸 것을 숫자에서 문자로 치환해주는 배열
		String[] items = { "가위", "바위", "보" };

		if (user > com) {
			System.out.println("유저 승");
		} else if (com > user) {
			System.out.println("컴퓨터 승");
		} else if (com == user) {
			System.out.println("무승부");
		}

//				if (a == 0) {
//					System.out.println("가위");
//				} else if (a == 1) {
//					System.out.println("바위");
//				} else if (a == 2) {
//					System.out.println("보");
//				}
//		switch (user) {
//		case 0:
//			System.out.println("내가 낸 것: " + SCISSORS);
//			break;
//		case 1:
//			System.out.println("내가 낸 것: " + ROCK);
//			break;
//		case 2:
//			System.out.println("내가 낸 것: " + PAPER);
//
//		}
//		switch (com) {
//		case 0:
//			System.out.println("컴퓨터가 낸 것: " + SCISSORS);
//			break;
//		case 1:
//			System.out.println("컴퓨터가 낸 것: " + ROCK);
//			break;
//		case 2:
//			System.out.println("컴퓨터가 낸 것: " + PAPER);
//
//		}

	}
}
