package example;

import java.util.Scanner;

public class Example2 {
	public static void main(String[] args) {
		// 두 수를 직접 입력받아 그 사이의 합을 구하라
		// 단, 3의 배수는 제회하고 3의 배수이면서
		// 5의 배수는 제외하지 않는 조건
		Scanner scan = new Scanner(System.in);
		System.out.print("정수를 입력: ");
		int num = scan.nextInt();
		System.out.print("하나 더 입력: ");
		int num2 = scan.nextInt();
		
		int total = 0;
		for (int i = num; i <= num2; i++) {
			if (i % 3 == 0 && i % 5 != 0) {
				continue;
			}else {
				total += i;
			}
		}
		System.out.printf("%d부터 %d까지의 합: %d ", num, num2, total);

	}
}
