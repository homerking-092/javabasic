package arrays1;

import java.util.Arrays;

public class Arrays6 {
	public static void main(String[] args) {
		// 한글은 유니코드 체게를 따라서 값이 배정되어 있다
		// 유니코드는 아스키코드의 범위(대략 세자릿수)를 넘어서는 범위의
		// 문자를 표현하기 위해 나온 체계이다
		String[] arr = { "손흥민", "비닐신", "람반장", "음바페", "angel", "Henry" };
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
	}
}
