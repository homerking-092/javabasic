package exception3;

public class Exception4 {
	public static void main(String[] args) {
		int[] number = {1, 2, 3, 4, 5, 0};
		
		try {
			for (int i = 0; i < 3; i++) {
				System.out.println(number[i]);
			}
			System.out.println(number[4] / number[5]);
		} catch (ArrayIndexOutOfBoundsException | ArithmeticException a) {
			System.out.println("범위를 벗어난 인덱스 번호를 입력했거나");
			System.out.println("0으로 나누었습니다");
		} catch (Exception e) {
			System.out.println("이외의 다른 에러가 발생했습니다");
		}
	}//end class
}//end main
