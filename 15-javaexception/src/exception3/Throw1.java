package exception3;

public class Throw1 {
	public static void main(String[] args) {
		// throw는 예외상황이 아니지만 예외를 강제로 발생시킨다
		int i = (int) (Math.random() * 10);

		try {
			if (i > 3) {
				throw new ArrayIndexOutOfBoundsException();
			} else {
				System.out.println("정상 범위 난수 발생");
			}
		} catch (Exception e) {
			System.out.println("없는 예외를 만들었습니다");
			e.printStackTrace();
		} finally {
			System.out.println("코드는 여기서 멈춥니다");
		}
	}//end main
}//end class
