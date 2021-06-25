
public class Score {
	public static void main(String[] args) {
		Array ar = new Array();
		
		int sum = 0;
		int winner = 0;
		
		for (int score : ar.math) {
			if (score < 60) {
				continue;
			}
			winner++;
			sum += score;
		}
		System.out.println("수학 합격자평균: " + sum/winner);
		
	}
}
