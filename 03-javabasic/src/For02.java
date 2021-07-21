import java.util.Scanner;

public class For02 {
	public static void main(String[] args) {
		//Hello Java를 입력한 횟수만큼 출력하는 구문을 작성
		//입력은 Scanner로 받는다
		
		Scanner scan = new Scanner(System.in);
		System.out.print("횟수를 입력하세요 : ");
		int count = scan.nextInt();
		
		for (int i = 0; i < count; i++) {
			System.out.println("Hello Java " + (i + 1));
		}//end for()
		scan.close();
	}//end main
}//end class
