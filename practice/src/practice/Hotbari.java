package practice;

import java.util.Scanner;

public class Hotbari {
	public static void main(String[] args) {
		// 두개의 주사위를 던졌을 때, 눈의 합이 6이 되는 모든 경우의 수를
		// 출력하는 프로그램 작성 ㄱㄱ
//		for (int i = 1; i <= 6; i++) {
//			for (int j = 1; j <= 6; j++) {
//				if (i + j == 6) {
//					System.out.printf("%d와 %d\n", i, j, i, j);
//				}
//			}
//		}
//		
//		
//		//방정식 2x + 4y = 10의 모든 해를 구하라
//		//단, x와 y는 정수이고 각각의 범위는 0 <= x <= 10, 0<= y <= 10
//		for (int x = 0; x <= 10; x++) {
//			for (int y = 0; y <= 10; y++) {
//				if (2 * x + 4 * y == 10) {
//					System.out.printf("x = %d일 때\ny = %d\n", x, y);
//				}
//			}
//		}
//		
//		//사용자로부터 두개의 정수(시작, 끝)를 입력받아 시작부터 끝까지의 곱을
//		//출력하는 프로그램 작성 ㄱㄱ
//		Scanner scan = new Scanner(System.in);
//		System.out.print("정수를 하나 입력하세요: ");
//		int start = scan.nextInt();
//		System.out.print("하나 더 입력하세요: ");
//		int end = scan.nextInt();
//		
//		int total = 1; 
//		
//		if (start < end) {	//시작 값보다 끝 값이 클 경우
//			for (int i = start; i <= end; i++) {
//				total *= i;
//			}
//		}else if (start > end) {	//시작값이 더 클 경우
//			for (int i = end; i <= start; i++) {
//				total *= i;
//			}
//		}
//		System.out.printf("%d부터 %d까지의 곱은?\n%d", start, end, total);
		
		// 1 + (-2) + 3 = (-4) + ...과 같은 식으로 계속 더해갔을 떄,
		//몇까지 더해야 총합이 100 이상 되는지 구하라
		int sum = 0;
		int number = 0;
		boolean bl = true;
		while (bl) {
			number++;
			if (number % 2 == 0) {
				sum -= number;
			}else if (bl) {
				sum += number;
			}
			if (sum >= 100) {
				break;
			}
			
		}
		System.out.println(number);
		
	}//end main
}//end class
