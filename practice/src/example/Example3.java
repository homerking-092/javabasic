package example;

import java.util.Scanner;

public class Example3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//		System.out.print("숫자 하나를 입력하세요: ");
//		int num = scan.nextInt();
//		if (num % 5 == 0) {
//			System.out.printf("%d은 5의 배수입니다", num);
//		}else {
//			System.out.printf("입력하신 %d은 5의 배수가 아닙니다", num);
//			System.out.println();
//			System.out.println("다음 기회에...");
//		}
		
//		int snak = 2000;
//		System.out.print("과자의 갯수를 입력 하세요: ");
//		int cnt = scan.nextInt();
//		if (cnt > 10) {
//			snak -= 500;
//		}
//		System.out.println("과자 갯수: " + cnt);
//		System.out.println("과자 개당 금액: " + snak);
//		System.out.println("총 금액: " + snak * cnt);
		
		System.out.print("날짜를 입력하세요: ");
		int date = scan.nextInt();
		switch (date % 7) {
		case 1:System.out.println(date + "일일은 월요일입니다");break;
		case 2:System.out.println(date + "일일은 화요일입니다");break;
		case 3:System.out.println(date + "일일은 수요일입니다");break;
		case 4:System.out.println(date + "일일은 목요일입니다");break;
		case 5:System.out.println(date + "일일은 금요일입니다");break;
		case 6:System.out.println(date + "일일은 토요일입니다");break;
		case 7:System.out.println(date + "일일은 일요일입니다");break;

		default:System.out.println("그런 날은 없어");	break;
		}
	}
}
