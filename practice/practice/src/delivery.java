import java.util.Scanner;

public class delivery {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("주문 금액을 입력하세요: ");
		int order = sc.nextInt();
		
		do {
			System.out.println("주문금액은" + order + "원입니다");
			System.out.println("배달을 완료했습니다");
			System.out.print("다음 배달금액을 입력하세요: ");
			order = sc.nextInt();
		} while (order >= 15000);
		System.out.println("금액이 모자라 배달 서비스가 종료됩니다");
		sc.close();
		
		
	}//end main
}//end class
