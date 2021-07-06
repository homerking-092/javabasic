package example;

import java.util.Scanner;

public class MultiFor {
	public static void main(String[] args) {
		//양의 정수 2개를 입력받아라
		//두수 사이의 합
		Scanner scan = new Scanner(System.in);
//		System.out.print("숫자 입력: ");
//		int num1 = scan.nextInt();
//		System.out.print("하나 더 입력: ");
//		int num2 = scan.nextInt();
//		int total = 0;
//		for (int i = num1; i <= num2; i++) {
//			total += i;
//		}
//		System.out.printf("%d부터 %d까지의 합: %d", num1, num2, total);
		
		//숫자 하나를 입력받아 그 숫자까지의 팩토리얼
		//단, 1 ~ n을 곱하지 않고 n ~ 1을 곱하는 방식으로
//		System.out.print("양의 정수 입력: ");
//		int number = scan.nextInt();
//		int facto = 1;
//		
//		for (int i = number; i >= 1; i--) {
//			facto *= i;
//		}
//		System.out.printf("1부터 %d까지의 팩토리얼: %d", number, facto);
		
		// 1 ~ 20의 짝수의 합
		
//		int total = 0;
//		for (int i = 1; i <= 20; i++) {
//			if (i % 2 == 0) {
//				total += i;
//			}
//		}
//		System.out.println("1 ~ 20 사이 짝수의 합: " + total);
//		System.out.println("--------------");
		
		//33 ~ 45까지의 숫자와 그 숫자의 짝수 여부
//		for (int i = 33; i <= 45; i++) {
//			if (i % 2 ==0) {
//				System.out.println(i + "는 짝수입니다");
//			}else {
//				System.out.println(i + "는 홀수입니다");
//			}
//		}
		// 1 ~ 100까지 숫자 중 3과 5의 배수를 출력하고 그 합
		int total = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				total += i;
				System.out.print(i + " ");
				System.out.println();
			}
		}
		System.out.println("배수의 합: " + total);
		System.out.println("------------");
		//정수를 입력받아 그 정수의 배수를 10개 구하라
//		System.out.print("양의 정수 하나를 입력하시오: ");
//		int num = scan.nextInt();
//		for (int i = 1; i <= 10; i++) {
//			System.out.println(i * num);
//		}
		
		//양의 정수를 입력받아 그 정수의 약수를 구하라
		//각 숫자 사이에 콤마를 삽입하고 마지막 숫자에는 콤마를 넣지 않는다
		
		System.out.print("양의 정수 입력: ");
		int num = scan.nextInt();
		System.out.println(num + "의 약수");
		
		for (int i = 1; i <= num; i++) {
			if (num % i ==0) {
				if (num == i) {
					System.out.println(i + " ");
					break;
				}
				System.out.print(i + ",");
			}
		}
		
		
		
		
		
		
		
		
		
		
		
	}//end main
}//end class
