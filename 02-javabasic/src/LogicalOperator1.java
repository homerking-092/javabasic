
public class LogicalOperator1 {
	public static void main(String[] args) {
		//논리연산자는 둘 이상이 논리식을 병렬형태로 제시한다
		//논리식1 &(and) 논리식2의 경우는 양쪽 논리식이 다 true인 경우
		//논리식1 |(or) 논리식2의 경우는 한쪽이상이 true인 경우
		//최종 조건식을 true로 판단한다
		System.out.println((100 > 50) & (30 > 50));
		System.out.println(100 > 50 | 30 > 50);
	}
}
