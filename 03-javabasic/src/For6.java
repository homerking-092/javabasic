import java.util.Scanner;

public class For6 {
	public static void main(String[] args) {
		//Scanner로 정수를 입력받게 해 주세요
		//입력받은 정수의 제곱 형태의 직사각형이 찍히도록
		//중첩 반복문을 작성하시오
		//ex)3 입력시
		//***
		//***
		//***
		
		Scanner scan = new Scanner(System.in);
		System.out.print("한 변의 너비를 입력해 주세요 : ");
		int number = scan.nextInt();
		
		for (int i = 1; i <= number; i++) {
			for (int j = 1; j <= number; j++) {
				System.out.print("*");
				
			}
			System.out.println();
		}
		
	}//end main
}//end class
