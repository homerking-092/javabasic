package example;

import java.util.Scanner;

public class Dia {
	public static void main(String[] args) {
		// 홀수를 입력하면 그에 맞는 마름모 모양의 별이 나오는 로직 ㄱㄱ
		Scanner sc = new Scanner(System.in);
		System.out.print("홀수를 입력해주세요: ");
		int num = sc.nextInt();
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				if (i <= num / 2)// 위쪽 영역
				{
					if (i + j <= num / 2 - 1)// 왼쪽 위 공백찍기
						System.out.print(" ");
					else if (j - i >= num / 2 + 1) // 오른쪽 위 공백찍기
						System.out.print(" ");
					else
						System.out.print("*");// *찍기
				} else if (i > num / 2) // 아래쪽 영역
				{
					if (i - j >= num / 2 + 1) // 왼쪽 밑 공백
						System.out.print(" ");
					else if (i + j >= num / 2 * 3 + 1)// 오른쪽 밑 공백
						System.out.print(" ");
					else
						System.out.print("*"); // *찍기
				}
			}
			System.out.println();// 줄바꿈
		}

	}// end main
}// end class
