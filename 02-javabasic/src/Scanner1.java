import java.util.Scanner;

public class Scanner1 {
	public static void main(String[] args) {
		//코드 실행 줄 사용자의 입력을 받는 경우 스캐너 기능을 사용한다
		//Scanner 부분에 마우스를 갖다대고 import를 한다
		Scanner scan = new Scanner(System.in);
		
		//정수 하나를 입력받음
		int a = scan.nextInt();
		
		//입력받은 정수를 출력
		System.out.println(a);
		
		//메모리 절약을 위해 다 쓴 scan변수는 닫는다
		scan.close();
	}//end main
}//end class
