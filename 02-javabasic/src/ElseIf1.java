import java.util.Scanner;

public class ElseIf1 {

	public static void main(String[] args) {
		// else if는 if로 달린 조건 이외에 추가조건을 달때 씁니다.
		// if문 다음에 작성하고, else문 전에 작성합니다.
		// else if문은 else와 달리 조건식을 기입해야합니다.
		// else if문은 몇 개라도 작성할 수 있습니다.
		Scanner scan = new Scanner(System.in);
		
		System.out.println("정수를 입력해주세요.");
		int num = scan.nextInt();
		
		if(num > 0) {
			System.out.println("양수입니다.");
		}else if(num == 0) {
			System.out.println("0입니다.");
		}else {
			System.out.println("음수입니다.");
		}
		scan.close();
	}

}
