package practice;

public class SevenTwenty {
	public static void main(String[] args) {
//		int i = 0;
		int sum = 0;
		
		for (int i = 1; i <= 10; i++) {
			sum += i;
		}
		System.out.println("1부터 10까지의 합: " + sum);
		
		sum = 0;
		for (int i = 1; i <= 10; i++) {
			if (i % 2 != 0) {
				sum += i;
			}
		}
		System.out.println("1 ~ 10 홀수 합: " + sum);
		
		sum = 0;
		for (int i = 1; i <= 10; i++) {
			if (i % 2==0) {
				sum += i;
			}
		}
		System.out.println("1 ~ 10 짝수 합: " + sum);
		
		for (int i = 1; i < args.length; i++) {
			
		}
	}//end main
}//end class
