import java.util.Scanner;

public class Continue2 {
	public static void main(String[] args) {
		//1부터 n까지 총합을 구하되 홀수끼리만 더한 총합을 구하는 구문 작성
		//continue문은 반드시 사용하는 로직으로 작성
		//n은 스캐너로 입력받는다
		
		Scanner scan = new Scanner(System.in);
		System.out.print("목표 정수를 입력 : ");
		int n = scan.nextInt();
		int sum = 0;
		int num = 0;
		int count =0;
		System.out.println("<for문>");
		for (int i = 1; i < n; i++) {
			count += 1;
			if (count % 2 == 0) {		//짝수인 경우 continue로 스킵
				continue;
			}
			sum += count;			//홀수인 경우 총합 더하기
			
			System.out.println("현재 1부터" + count + "까지 더했습니다");
			System.out.println("총합은" + sum + "입니다");
		}
		
		System.out.println("<while문>");
		while (count < n) {
			count += 1;
			if (count % 2 == 0) {
				continue;
			}
			sum += count;
			
			System.out.println("현재 1부터" + count + "까지 더했습니다");
			System.out.println("총합은" + sum + "입니다");
		}
		
	}//end main
}//end class
