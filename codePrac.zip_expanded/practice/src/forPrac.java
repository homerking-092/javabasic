import java.util.Scanner;

public class forPrac {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	//스캐너 쓰려면 1빠따로 써라
		/*System.out.print("반복할 횟수: ");
		int cnt = sc.nextInt();
		
		for (int i = 1; i <= cnt; i++) {
			System.out.println(i + "번)");
			System.out.println("Hello Java");
		}
		*/
		/////////////////////////////////////////////////////////////////////////
		//구구단
		System.out.println("<<<<<<<<구구단>>>>>>>>>");
		System.out.print("양의 정수 하나 입력: ");
		int num = sc.nextInt();
		
		if (num >= 1 && num <= 9) {
			for (int i = 1; i < 10; i++) {
				System.out.println(num + " * " + i + " = " + num * i);
			}
		} else {
			System.out.println("1 ~ 9 사이의 양의 정수를 입력하세요^^");
		}
		
		System.out.println("<2단 ~ 9단>");
		for (int i = 1; i <= 9; i++) {
			for (int j = 2; j <= 9; j++) {
				System.out.printf("%d * %d = %d\t", j, i, j * i);
			}
			System.out.println();
		}
		
	}
}
