package wikidocs;

import java.util.Scanner;

public class For2 {
	public static void main(String[] args) {
		// 1 ~ 5까지의 합을 구하시오
		int total = 0;
		for (int i = 1; i <= 5; i++) {
			total += i;
		}
		System.out.println("1 ~ 5까지의 합: " + total);

		/*
		 * 사용자에게 숫자를 받아 그 숫자까지의 팩토리얼을 구하세요
		 * 단, 1 ~ n을 곱하지 않고 n ~ 1을 곱하는 방식으로 합니다
		 */
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자 하나를 입력하세요: ");
		int num = scan.nextInt();
		
		int sum = 1;
		for (int i = num; i >= 1; i--) {
			sum *= i;
		}
		System.out.println(sum);
		
		total = 0;
		// 1 ~ 20의 짝수의 합을 구하라
		for (int i = 1; i <= 20; i++) {
			if (i % 2 == 0) {
				total += i;
			}
		}
		System.out.println("1 ~ 20까지의 합: " + total);
		
	}//end main
}//end class
