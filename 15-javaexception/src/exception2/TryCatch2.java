package exception2;

import java.util.Scanner;

public class TryCatch2 {
	public static void main(String[] args) {
		//아까 exception1 패키지 내부의 여러 예외 유형 중
		//하나를 골라서 예외가 발생할 수 있는 코드를 작성 ㄱㄱ
		//발생할 예외에 대한 처리는 try ~ catch 블럭을 활용 
		Scanner scan = new Scanner(System.in);
		System.out.print("배열의 인덱스값 입력: ");
		
		int[] arr = new int[6];
		try {
			int a = scan.nextInt();
				System.out.println(a + "번째 인덱스: " + arr[a]);
		} catch (Exception e) {
			System.out.println("배열의 길이를 넘어간 인덱스 값을 넣을 수 없습니다");
		}
	}//end main
}//end class
