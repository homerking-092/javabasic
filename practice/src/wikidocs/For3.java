package wikidocs;

import java.util.Scanner;

public class For3 {
	public static void main(String[] args) {
		//for문을 이용하여 1부터 10까지 출력
//		for (int i = 1; i <= 10; i++) {
//			System.out.println(i);
//		}
//		System.out.println("--------------------------------------------");
//		//for문을 활용해서 21부터 57까지 홀수만 출력 
//		for (int i = 21; i < 58; i++) {
//			if (i % 2 != 0) {
//				System.out.println(i);
//			}
//		}
		
//		int total = 0;
//		// 1 ~ 100까지 숫자 중 3과 5의 배수를 출력하고 그 합을 구하시오
//		for (int i = 1; i <= 100; i++) {
//			if (i % 3 == 0 && i % 5 == 0 ) {
//				System.out.println(i);
//				total += i;
//			}
//		}
//		System.out.println("합계: " + total);

		//정수를 입력받아 그 정수의 배수를 10개 구하시오
		Scanner scan = new Scanner(System.in);
//		System.out.print("정수를 하나 입력하세요: ");
//		int number = scan.nextInt();
//		for (int i = 1; i <= 10; i++) {
//			System.out.println(number * i);
//		}
		
		//하나의 정수를 입력받아 그 정수의 약수를 구하라
		//각 숫자 사이에 콤마를 삽십하고 마지막 숫자에는 콤마(,)를 넣지 않는다
		System.out.print("정수를 하나 입력하세요: ");
		int number = scan.nextInt();
		for (int i = 1; i <= number; i++) {
			if (number % i == 0) {
				if (number == i) {
					System.out.println(i);
					break;
				}
				System.out.print(i + ",");
			}
		}
		
		
	}//end main
}//end class
