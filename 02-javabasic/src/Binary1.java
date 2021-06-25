
public class Binary1 {
	public static void main(String[] args) {
		//이항 연산자는 양변에 피연산자를 하나씩 취한다
		//산술 연산자는 우리가 잘 알고 있는 사칙연산 등을
		//활용하기 위한 연산자이며 연산 우선순위도 그대로 계승
		//단, % 연산자의 우선순위는 *, /와 동일
		//+, -, *
		System.out.println(3 + 5);
		System.out.println(17 - 21);
		System.out.println(2 * 3);
		System.out.println("---------------------");
		// /는 왼쪽 수를 오른쪽 수로 나눠 몫을 구한다
		//정수/정수 = 정수
		System.out.println(7 / 2);
		System.out.println(7.0 / 2);
		
		// %는 정수 최대 몫을 구하고 남은 값(나머지)을 출력
		System.out.println(10 % 4);
		
		//연산 우선순위는 그대로 존재
		System.out.println(10 + 6 / 4);
		System.out.println(10 + 6 / 4.0);
		System.out.println((10 + 6) % 4);
	}
}
