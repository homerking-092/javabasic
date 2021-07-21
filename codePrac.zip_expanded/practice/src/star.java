import java.util.Scanner;

public class star {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		System.out.print("정수 입력: ");
//		int num = sc.nextInt();
		
//		for (int i = 0; i < num; i++) {
//			for (int j = 0; j < num; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		/*
		 * ****
		 * ***
		 * **
		 * *
		 */
		System.out.println("--------------------");
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4 - i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("------------------");
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4 - i; j++) {
				System.out.print(" ");
			}
			for (int s = 0; s <= i; s++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("------------");
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < i ; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < 4 - i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
