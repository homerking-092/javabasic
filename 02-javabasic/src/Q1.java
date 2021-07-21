
public class Q1 {
	public static void main(String[] args) {
		//다음 조직대로 전위, 후위수식을 이용해 코드를 작성하고
		//전위, 후위수식 코드는
		//Unary01.java에서 그랬듯
		//두 단계 주석으로 풀어서 설명
		
		//1.a에 15를 선언 및 초기화
		int a = 15;
		
		//2. a를 후위수식 감소시키면서 콘솔에 출력
		System.out.println(a--);
		//1) System.out.println(a(15));
		//2) a = a(15) - 1;
		
		//3. a를 콘솔에 출력
		System.out.println(a);
		
		//4. a를 전위수식 감소시키면서 콘솔에 출력
		System.out.println(--a);
		//1) a = a(14) - 1;
		//2) System.out.println(a(13));
		
		//5. a를 콘솔에 출력
		System.out.println(a);
		
	}
}
