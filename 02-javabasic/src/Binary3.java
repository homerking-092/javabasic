
public class Binary3 {
	public static void main(String[] args) {
		// 5 => 0000000000 00000000 00000000 00000101
		// 3 => 0000000000 00000000 00000000 00000011
		// 비트 연산자는 비트행 위 아래를 따져서
		// &는 위 아래가 모두 1인 경우만 1	=> and
		// |은 위 아래가 모두 0인 경우만 0	=> or
		// ^은 위 아래가 다를때만 1을 부여	=> not and
		System.out.println(5 & 3);	//1
		System.out.println(5 | 3);	//7
		System.out.println(5 ^ 3);	//6
	}
}
