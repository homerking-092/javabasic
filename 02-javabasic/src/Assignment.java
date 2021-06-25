
public class Assignment {
	public static void main(String[] args) {
		//대입 연산자란 특정 변수 값을 연산자 우측에 입력한 값으로
		//계산한 결과값을 저장해주는 기능을 가진다
		//단순 연산자인 =가 있으며
		//추가로 확정된 복합대입연산자로는
		// +=, -=, *=, /=, %=이 있다
		//대입 연산자를 사용하는 경우만 예외적으로
		//코드의 실행방향이 오른쪽에서 왼쪽으로 실행된다
		int a  = 10;
		System.out.println(a);
		
		a += 10;	//a = a + 10;
		System.out.println(a);
		
		a -= 5; 	//a = a - 5;
		System.out.println(a);
		
		a *= 3;		//a = a * 3;
		System.out.println(a);
		
		a /= 4;		//a = a / 4;
		System.out.println(a);
		
		a %= 12;	//a = a % 12;
		System.out.println(a);
	}
}
