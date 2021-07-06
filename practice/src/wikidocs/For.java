package wikidocs;

public class For {
	public static void main(String[] args) {
		String[] numbers = { "one", "two", "three" };
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		System.out.println("---------------------------------");
		int[] score = { 90, 25, 67, 45, 80 };
		for (int i = 0; i < score.length; i++) {
			if (score[i] >= 60) {
				System.out.println(i + 1 + "번 학생은 합격입니다");
			} else {
				System.out.println(i + 1 + "번 학생은 불합격입니다");
			}
		}
		System.out.println("-------------------------------------");
		for (int i = 0; i < score.length; i++) {
			if (score[i] < 60) {
				continue;
			} 
			System.out.println(i + 1 + "번 학생 축하합니다~ 합격입니다");
		}
		System.out.println("-------------------------------------");
		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.print(i + "*" + j + "=" + i * j + " ");
			}
			System.out.println();
		}

	}// end main
}// end class
