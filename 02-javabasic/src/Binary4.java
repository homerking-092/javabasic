
public class Binary4 {
	public static void main(String[] args) {
		//비트 이동 연산자는 숫자 >>(<<) 자리수 문법으로
		//꺽쇠의 방향이 <<인 경우는 왼쪽으로 입력도니 자리수 만큼 밀어준다
		//이때 정수 숫자는 2의 자리수 제곱만큼 증가
		//반대방향인 경우는 2의 자리수 제곱만큼 크기가 줄어든다
		int a = 80;
		System.out.println(a >> 3);
		System.out.println(a << 3);
	}
}
