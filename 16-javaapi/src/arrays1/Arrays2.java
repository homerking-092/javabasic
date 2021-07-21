package arrays1;

import java.util.Arrays;

public class Arrays2 {
	public static void main(String[] args) {
		// Arrays.copyOf()는 특정 배열을 시작부터 n개만 짤라서 복사한다
		int[] arr = { 1, 2, 3, 4, 5 };

		int[] arrCopy = Arrays.copyOf(arr, 3); // 인덱스 3번 직전까지
		System.out.println(Arrays.toString(arrCopy));

		// 만약 원본보다 길게 복사하면 나머지는 0으로 채워진다
		int[] arrCopy2 = Arrays.copyOf(arr, 10);
		System.out.println(Arrays.toString(arrCopy2));
	}
}
