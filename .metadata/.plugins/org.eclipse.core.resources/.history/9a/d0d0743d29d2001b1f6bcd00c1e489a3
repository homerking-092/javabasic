import java.util.Scanner;

public class sum {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//		System.out.print("수의 총합이 몇 이상이 되면 종료하시겠습니까: ");
//		int num = scan.nextInt();
//		int cnt = 0;
//		int sum = 0;
//		while (true) {
//			cnt += 1;
//			sum += cnt;
//			System.out.println("1부터" + cnt + "까지의 총합은: " + sum + "입니다");
//			if (sum >= num) {
//				System.out.println("목표 값: " + num);
//				System.out.println("총합: " + sum);
//				System.out.println("몇까지 더했나: " + cnt);
//				break;
//			}
//		}
		
		for (int i = 1; i < 11; i++) {
			if (i == 6 || i == 8) {
				System.out.println("출력되지 않는 숫자입니다");
				continue;
			}
			System.out.println("이번 숫자는" + i + "입니다");
		}
		System.out.println("================");
		System.out.print("목표 정수를 입력하세요: ");
		int num = scan.nextInt();
		int sum = 0;
		int cnt = 0;
		
		while (cnt < num) {
			cnt += 1;
			if (cnt % 2 == 0) {
				continue;
			}
			sum += cnt;
			
			System.out.println("현재 1부터" + cnt + "까지 더했습니다");
			System.out.println("총합은" + sum + "입니다");
		}
	}//end main
}//end class
