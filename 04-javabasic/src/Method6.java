
public class Method6 {
	//mul 메서드를 선언해라
	//이 메서드는 여러분들이 임의로 이름붙인 정수 변수 3개를 입력받아
	//변수 3개를 곱한 값을 return해준다
	public static int mul(int a, int b, int c) {
		return a * b * c ;
	}
	
	//info 메서드를 선언해라 void 리턴자료형
	//이 메서드는 내부에서
	//"안녕하세요"
	//"자바 메서드 학습중입니다
	//"3줄을 한번의 호출로 적습니다" 라는 문장을 출력해준다
	public static void info() {
//		System.out.println("안녕하세요");
//		System.out.println("자바 메서드 학습중입니다");
//		System.out.println("3줄을 한번의 호출로 적습니다\n");
		System.out.print("안녕하세요\n자바 메서드 학습중입니다\n3줄을 한번의 호출로 적습니다\n\n");
	}
	
	public static void main(String[] args) {
		//mul을 호출해 결과값을 int result에 저장하기
		//저장된 값 콘솔창에 출력해 확인하기
		int result = mul(2, 3, 4);
		System.out.println("결과값: " + result);
		
		System.out.println("-------------------");
		//info 메서드 반복문으로 3번 호출하기
		for (int i = 1; i <= 3; i++) {
			System.out.println(i + "번");
			info();
		}
		
	}//end main
}//end class
