package example;

import java.util.Scanner;

public class Example {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

//		int total = 0;
//		for (int i = 0; i < 5; i++) {
//			System.out.print("양의 정수를 차례로 5개 입력하세요: ");
//			int number = scan.nextInt();
//			total += number;
//			System.out.println("합계: " + total);
//		}
		
		//0부터 20까지 짝수만 출력 ㄱㄱ
//		for (int i = 0; i < 20; i++) {
//			if (i % 2 == 0) {
//				System.out.println(i);
//			}
//		}
		System.out.print("정수를 하나 입력하세요: ");
		int num = scan.nextInt();
		
		int total = 0;
		for (int i = 1; i <= num; i++) {
			total += i;
		}
		System.out.printf("1부터 %d까지의 합: %d", num, total);
	}
}
