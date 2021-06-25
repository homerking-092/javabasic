
public class DoWhile1 {
	public static void main(String[] args) {
		//do~while문은 while문과 기본적으로 똑같다
		//다느 첫 번째 바퀴만큼은 조건비교 없이 바로 실행하고
		//이후 두 번쨰 바퀴부터는 각 바퀴마다 비교를 통해
		//추가 실행여부를 결정한다
		int a = 1;
		
		do {					//do구문이 먼저 써진다
			a += 2;
			System.out.println("a는 5보다 작다???");
		} while (a < 1);		//일반 while문과는 달리 마지막에 ;이 붙는다
	}
}
