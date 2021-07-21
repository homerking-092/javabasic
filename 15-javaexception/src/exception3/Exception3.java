package exception3;

public class Exception3 {
	public static void main(String[] args) {
	// 다중 catch는 블럭 내부에서 여러 유형의 예외가 발생할 수 있을때
	// 각각 예외유형을 다르게 처리할 때 사용한다
	// 이 때 catch 구문을 여러 번 사용할 수 있다
		int[] number = { 1, 2, 3, 4, 5, 0 };

		try {
			for (int i = 0; i < 6; i++) {
				System.out.println(number[i]);
			}
			System.out.println(number[4] / number[5]);
		} catch (ArrayIndexOutOfBoundsException a) {			//밑으로 갈 수록 우선순위가 낮아짐
			System.out.println("범위를 벗어난 인덱스 번호를 입력했습니다");//catch구문 뿐만 아니라 모든 코드
		} catch (ArithmeticException ae) {
			System.out.println("0으로 나눌 수 없습니다");
		} catch (Exception e) {
			System.out.println("이외의 예외가 발생했습니다");
		}
	}//end main
}//end class
