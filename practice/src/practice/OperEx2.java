package practice;

public class OperEx2 {
	public static void main(String[] args) {
		short a, b;		//데이터 타입이 short인 변수 a, b 선언
		a = b = 10;
		
		short c = (short) (a + b);
		System.out.println("c의 갑: " + c);
	}
}
