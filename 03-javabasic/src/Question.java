
public class Question {
	public static void main(String[] args) {
		//중첩 반복문을 이용해서 다음 방정식의 양의 정수의 해를 모두 구하시오
		
		//x, y의 값이 방정식의 해 60을 넘지 않게 
		for (int x = 1; x <= 15; x++) {
			for (int y = 1; y <= 12; y++) {
				if (4 * x + 5 * y == 60) {
					System.out.println("x의 해: " +x);
					System.out.println("y의 해: " + y);
					System.out.println("---------------");
				}
			}
		}
	}//end main
}//end class
