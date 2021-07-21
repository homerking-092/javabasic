package practice;

public class ArrayPrac {
	public static void main(String[] args) {
		int[] odds = { 1, 3, 5, 7, 9 };

		String[] weeks = { "월", "화", "수", "목", "금", "토", "일" };
		
		String[] newWeeks = new String[7];
		newWeeks[0] = "월";
		newWeeks[1] = "화";
		newWeeks[2] = "수";
		newWeeks[3] = "목";
		newWeeks[4] = "금";
		newWeeks[5] = "토";
		newWeeks[6] = "일";
		
		System.out.println(weeks[0]);
		System.out.println(newWeeks[1]);
		
		System.out.println("--------------------------------------");
		
		for (int i = 0; i < newWeeks.length; i++) {
			System.out.print(newWeeks[i]);
		}

	}
}
