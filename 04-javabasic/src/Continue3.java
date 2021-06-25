
public class Continue3 {
	public static void main(String[] args) {
		//다음은 학생들의 과목별 성적입니다
		//math = 96,23,52,82,72,31,58
		//eng = 62,42,68,31,80,77,45
		//com = 10,28,39,74,65,90,98
		//각 과목별 합격자 평균만 출력 ㄱㄱ
		//합격점수는 60점 이상
		
		int[] math = {96,23,52,82,72,31,58};
		int[] eng = {62,42,68,31,80,77,45};
		int[] com = {10,28,39,74,65,90,98};
												
		int sum = 0;								//총점 변수와 
		int win = 0;								//합격자수 변수 생성
		
		System.out.println("<합격자 평균점수>");
		for(int score : math) {						//반복문 실행
			if (score < 60) {						//검사해서 60점 미만이면
				continue;							//continue
			}
													//60점 이상이면 
			win += 1;	  //win++;					//합격자수 + 1
			sum += score;							//총점에 합격점수 더하기
		}
		System.out.println("수학평균: " + sum/win);	//다 돌고 나오면 총점/합격자수로 합격자평균 내기
		
		sum = 0;
		win = 0;
		for(int score : eng) {
			if (score < 60) {
				continue;
			}
			win += 1;
			sum += score;
		}
		System.out.println("영어평균: " + sum / win);
		
		sum = 0;
		win = 0;
		for(int score : com) {
			if (score < 60) {
				continue;
			}
			win += 1;
			sum += score;
		}
		System.out.println("컴퓨터평균: " + sum / win);
		
	}//end main()
}//end class
