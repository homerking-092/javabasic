package practice;

import java.util.Scanner;

public class forEx {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
//			System.out.println(i + "번째 수행");
		}
		
		Scanner scan = new Scanner(System.in);
		System.out.print("인수를 입력해라: ");
		int num = scan.nextInt();
		System.out.println(num + "단");
		System.out.println("----------------------------");
		for (int i = 1; i <= 9; i++) {
			System.out.println(num + " * " + i + " = " + num * i);
		}
		
		char ch = 65;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(ch++ + " ");
			}
			System.out.println();
		}
	}
}
