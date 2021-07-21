
public class Binary2 {
	public static void main(String[] args) {
		//비교연산자는 크게 대소비교와 단순비교로 나뉜다
		//단순비교는 ==, !=이며 모든 자료형간 비교가 가능
		//대소비교는 >, <, >=, <=이며 숫자끼리만 비교가 가능
		//컴퓨터는 비교연산자를 명제로 인식하며
		//참(true), 거짓(false)를 판단해 결과로 보여준다
		System.out.println(3 > 5);
		System.out.println(12 <= 12);
		System.out.println('a' <= 12);		//숫자와 문자는 비교가 불가하지만
											//a는 아스키코드로서 숫자로 인식
											//""는 아스키코드로 변환 ㄴㄴ
		
		System.out.println("a" != "b");
		System.out.println("a" == "a");
		System.out.println(5 == 5.0);		//자료형 변환이 가능하면 비교 가능
	}
}
