package system1;

import java.util.Scanner;

public class TimeCheck2 {
	public static void main(String[] args) {
		// tryCatch 구문의 소요시간을 구해라
		// 직접 원하는 종류의 예외를 발생
		Scanner scan = new Scanner(System.in);
		System.out.print("시작 : ");
		int start = scan.nextInt();
		System.out.print("끝: ");
		int end = scan.nextInt();
//		long start = System.currentTimeMillis();
		try {
			throw new ArithmeticException();
//			System.out.println("시작: " + start);
//			long all = 0;
//
//			for (int i = 0; i < 10; i++) {
//				all += i;
//			}
		} catch (Exception e) {
			System.out.println("범위 수가 아닙니다");
			e.printStackTrace();
		}

		// 끝나는 시점
//		long end = System.currentTimeMillis();
		System.out.println("시작: " + start);
		System.out.println("끝: " + end);
		// 소요 시간 측정
		System.out.println("경과 시간: " + (end - start));
	}
}
