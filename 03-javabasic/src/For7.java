
public class For7 {
	public static void main(String[] args) {
		// 피라미드형 별을 찍어보겠습니다
		// 아래와 같은 별을 찍을 수 있도록 코드를 작성
		// *
		// **
		// ***
		// ****
		// 중첩 반복문의 어느곳이 세로, 가로를 담당하는지 생각해라

		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		for (int i = 4; i >= 1; i--) {
			for (int j = i; j >= 1; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		

	}// end main

}// end class
