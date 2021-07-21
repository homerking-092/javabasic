import java.util.Scanner;

public class Scanner3 {
	public static void main(String[] args) {
		//환율 계산기
		Scanner sc = new Scanner(System.in);
		//네이버 검색해서 원하는 국가 화폐의 환율을 rate 변수에 저장
		double rate = 1117.4;
		
		//스캐너를 이용해서 won 변수에 원화 금액을 입력
		System.out.println("달러 환율은 " + rate + "입니다");
		System.out.println("원화를 입력해 주세요");
		int won = sc.nextInt(); 
		
		//원화와 환율을 이용해서
		//원화 XXXX원을 환전시 XXXX(화폐)입니다로 결과물 출력
		System.out.println("원화 " + won +"원을 달러로 환전시");
//		System.out.println(Math.round(won / rate) + "달러입니다");
		System.out.printf("%.4f달러입니다", won / rate);
		sc.close();
	}
}
