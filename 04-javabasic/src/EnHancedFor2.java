
public class EnHancedFor2 {
	public static void main(String[] args) {
		//다음은 학생들의 과목별 성적이다
		//math =  96, 23, 52, 82, 72, 31, 58
		//eng = 62, 42, 68, 31, 80, 77, 45
		//com = 10, 28, 39, 74, 65, 90, 98
		//위 3개의 명칭으로 array를 만들어 담은 다음
		//과목별 평균점수를 enhanced for문을 이용해 구한 다음
		//콘솔창에 출력
		int[] math = {96, 23, 52, 82, 72, 31, 58};
		int[] eng = {62, 42, 68, 31, 80, 77, 45};
		int[] com = {10, 28, 39, 74, 65, 90, 98};
		
		double total = 0;
		for(int score : math) {
			total += score;
		}
//		System.out.println("수학평균: " + total/7);
		System.out.println("수학평균: " + total/math.length);
		
		total = 0;
		for(int score : eng) {
			total += score;
		}
//		System.out.println("영어평균: " + total/7);
		System.out.println("영어평균: " + total/eng.length);
		
		total = 0;
		for(int score : com) {
			total += score;
		}
//		System.out.println("컴퓨터평균 :" + total/7);
		System.out.println("컴퓨터평균 :" + total/com.length);
		System.out.println("----------------------------------------");
		//과목별 평균을 구하되
		//영어는 일반for문 컴퓨터는 향상된 for문을 이용해 총합을 구한뒤 평균을 구해라
		int sum = 0;
		for (int i = 0; i < eng.length; i++) {
			sum += eng[i];
		}
		System.out.println("영어평균 : " + sum/eng.length);
		
		sum = 0;
		for(int i : com) {
			sum += i;
		}
		System.out.println("컴퓨터평균: " + sum/com.length);
	}
}
