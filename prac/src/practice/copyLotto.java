package practice;

import java.util.Arrays;

public class copyLotto {
	// 만약 중첩 반복문(이중 for문)일 경우에
	// break를 사용할 경우에는
	// 현재 위치한 가장 안쪽의(j) 반복문에서 빠져나오고 다시 제일
	// 바깥쪽의 반복문(i)을 실행하게 됩니다.

	public static void main(String[] args) {
		int lotto[] = new int[6]; // 배열 생성

		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = (int) (Math.random() * 45) + 1; // 랜덤 값 반환
			for (int j = 0; j < i; j++) {
				if (lotto[i] == lotto[j]) { // 중복 값 제거
					i--;
					break; // continue, break
							// 가까운 반복문 제어
				}
			}
		}
		for (int i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i] + " ");
		}

		/// 배열의 값을 작은 순으로 나열
//		Arrays.sort(lotto);
//		for (int i = 0; i <= lotto.length; i++) {
//			System.out.println(i);
//		}
	}
}
