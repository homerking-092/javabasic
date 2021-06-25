
public class While1 {
	public static void main(String[] args) {
		//while문은 타겟이 되는 실행문을 반복해서 실행하는 구문
		//while문은 실행여부를 조건식 비교를 통해 결정한다
		//한번 실행하기로 결정되면 모든 타겟 실행문을 실행한다
		//실행이 끝나면 다시 while구문으로 복귀한다
		//추가 비교를 통해 실행/탈출 여부가 결정된다
		
		int a = 0;
		while (a < 2) {
			a += 1;
			System.out.println(a + "번째 실행");
		}//end while
	}//
}//
