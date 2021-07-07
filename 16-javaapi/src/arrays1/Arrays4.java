package arrays1;

import java.util.Arrays;

public class Arrays4 {
	public static void main(String[] args) {
		// Arrays.sort(배열); 은 배열 내부 순서를
		// 작은 숫자일수록 0번 인덱스에 가깝게
		// 큰 숫자일수록 마지막 인덱스에 가깝게 배치한다

		int[] arr = { 21, 60, 32, 44, 1, 59, 99, 89, 36 };
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
	}
}
