import java.util.Scanner;

public class Break4 {
	public static void main(String[] args) {
		// Scanner로 정수를 입력받는다
		// 1 ~ n까지 차곡차곡 순서대로 더해나갔을때
		// 1부터 몇까지 더해야 입력된 정수를 초과하는지 계산해주는
		// 프로그램 작성

		Scanner scan = new Scanner(System.in);
		System.out.print("수의 총 합이 몇 이상이 되면 종료하시겠습니까 :");
		int num = scan.nextInt();

		int sum = 0;
		int count = 1;
		while (true) {
			sum += count;
			System.out.println("1부터" + count + "까지의 총합은: " + sum + "입니다");
			if (sum >= num) {
				System.out.println("목표값 :" + num);
				System.out.println("총합: " + sum);
				System.out.println("몇 까지 더했나? : " + count);
				break;	//제일 가까운 반복문 담군다
			}
			count++;//???

		}
		System.out.println("--------------");
		System.out.println("<while 대신 for>");
		for (int i = 1; i < num; i++) {
			sum += 1;
		}
		System.out.println("1부터" + num + "까지의 총합은: " + sum + "입니다");
		
		
	}
}
