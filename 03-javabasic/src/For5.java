
public class For5 {
	public static void main(String[] args) {
		// 2 ~ 9단까지 구구단을 출력하는 코드를 작성해라
		// 중첩 반복문을 이용해서
		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + " * " + j + " = " + i * j);

			}
		}

		System.out.println("-------------------------------------------------------");
		for (int i = 1; i <= 9; i++) {
			for (int j = 2; j <= 9; j++) {
				System.out.printf("%d * %d = %d\t", j, i, j * i);
			}
			System.out.println();
		}
	}// end main
}// end class
