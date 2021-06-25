package practice;

public class Question {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		System.out.println(++a);
		// a = 11
		//다음에 출력
		
		System.out.println(++a + b++);
		// a = 12	b = 20
		//다음에 출력
		//  b= 21
		
		System.out.println((++a%3) + (a*++b));
		// 1 + (13*22)
	}
}
