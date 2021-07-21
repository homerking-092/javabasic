package string1;

import java.util.Scanner;

public class String5 {
	public static void main(String[] args) {
		// .length()와 chartAt()을 활용해 입력된 전체 문자열을
		// 한 글자씩을 한줄씩 출력하는 로직 작성
		// 문자열은 Scanner로 입력 받는다
		Scanner scan = new Scanner(System.in);
		System.out.print("문자열을 입력하세요: ");
		String munja = scan.nextLine();

		for (int i = 0; i < munja.length(); i++) {
//			char get = munja.charAt(i);
//			System.out.println(get);
			System.out.println(munja.charAt(i));
		}

	}
}
