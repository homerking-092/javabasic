package exception2;

import java.util.Scanner;

public class ifElse {
	//int a, b에 스캐너로 각각 정수 입력을 받고
	//a / b의 결과를 콘솔창에 띄워주되
	//if ~ else문을 이용해 0으로 나누는 에러 발생이 일어나기 전에
	//나누는 수에는 0을 입력할 수 없다
	//라고 경고만 띄우도록 처리 ㄱㄱ
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("정수를 입력하세요: ");
		int a = scan.nextInt();
		System.out.print("정수를 하나 더 입력하세요: ");
		int b = scan.nextInt();
		
		
		if (b == 0) {	///로직 짜기 전 검사부터하면 유비무환이다	
			System.out.println("나누는 수에는 0을 입력할 수 없습니다");
		} else {
			System.out.println(a / b);
		}
	}
}
