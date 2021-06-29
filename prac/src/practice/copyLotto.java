package practice;

import java.util.Arrays;

public class copyLotto {
	public static void main(String[] args) {
		int lotto[] = new int[6];						// 배열 생성

		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = (int) (Math.random() * 45) + 1; 	// 랜덤 값 반환
			for (int j = 0; j < i; j++) {
				if (lotto[i] == lotto[j]) { 			// 중복 값 제거
					i--;
					break;		//continue 반복문 제어
				}
			}
		}
		for (int i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i] + " ");
		}
		
//		Arrays.sort(lotto);
//		for (int i = 0; i < lotto.length; i++) {
//			System.out.println(i + 1);
//		}
	}
}
