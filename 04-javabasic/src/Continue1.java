
public class Continue1 {
	public static void main(String[] args) {
		//continue문은 스킵기능과 유사
		//돌던 바퀴를 즉시 종료하고, 다음 바퀴를 이어서 실행한다
		//전체 반복문을 종료시키는 break과 헷갈리지 않도록 주의
		
		for (int i = 1; i < 10; i++) {
			System.out.print(i + ")");
			if (i == 6 || i == 8) {
				System.out.println("출력되지 않는 숫자입니다");
				System.out.println("-------------");
				continue;
			}
			System.out.println("이번 숫자는" + i + "입니다");
			System.out.println("---------------");
		}
	}//end main
}//end class
