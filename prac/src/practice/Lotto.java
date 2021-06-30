package practice;

public class Lotto {
	public static void main(String[] args) {
		// 로또 번호 추출 프로그램

		int[] lotto = new int[6]; // index값 6인 배열
		for (int i = 0; i < lotto.length; i++) {
			int number = (int)(Math.random() * 47 + 1); // 1 ~ 46까지 난수
			for (int j = 0; j < lotto.length; j++) {
				if (number == lotto[j]) {
//					i -= 1;
					continue;
				}
				lotto[i] = number;
			}
			System.out.print(lotto[i] + " ");
		}
	}
}
