package practice;

public class WhileEx {
	public static void main(String[] args) {		
		int sum = 0;
		int num = 0;
		
		while (num <= 100) {
			sum += num;
			num++;
		}
		System.out.println("1 ~ 100까지의 합: " + sum);
		
		System.out.println("-----------------doWhile()------------------------");
		num = 5;
		String str = "Java DoublePlus";
		
		do {
			System.out.println(str);
		} while (num --> 10);
		
	}//end main
}//end class
