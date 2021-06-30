package system1;

public class TimeCheck1 {
	public static void main(String[] args) {
		//currentTimemills의 자료는 long형에 저장한다
		//시작 지점
		long start = System.currentTimeMillis();
		System.out.println(start);
		long all = 0;
		
		for (int i = 0; i < 2000000000; i++) {
			all += i;
		}
		
		//끝나는 시점
		long end = System.currentTimeMillis();
		System.out.println(end);
		//소요 시간 측정
		System.out.println(end - start);
	}
}
